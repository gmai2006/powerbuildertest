/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.test.abc.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.abc.entity.Usrusers;
import com.test.abc.utils.FileUtils;

/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

public class UsrusersDaoTest {
  static final String inputFile = "Usrusers.json";
  static UsrusersDao dao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private Usrusers[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("localpersistence");
    JpaDao jpa = new DefaultJpaDao(factory.createEntityManager());
    dao = new DefaultUsrusersDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Usrusers[].class);
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testSelect() {
    Usrusers testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals username ", this.records[1].getUsername(), testResult.getUsername());
    org.junit.Assert.assertEquals(
        "expect equals fullname ", this.records[1].getFullname(), testResult.getFullname());
    org.junit.Assert.assertEquals(
        "expect equals password ", this.records[1].getPassword(), testResult.getPassword());
    org.junit.Assert.assertTrue(
        "expect equals isactive ", this.records[1].getIsactive() == testResult.getIsactive());
    org.junit.Assert.assertEquals(
        "expect equals tomeas ", this.records[1].getTomeas(), testResult.getTomeas());
    org.junit.Assert.assertEquals(
        "expect equals idiotita ", this.records[1].getIdiotita(), testResult.getIdiotita());
  }
}
