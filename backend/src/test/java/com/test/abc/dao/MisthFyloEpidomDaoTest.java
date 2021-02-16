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
import com.test.abc.entity.MisthFyloEpidom;
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

public class MisthFyloEpidomDaoTest {
  static final String inputFile = "MisthFyloEpidom.json";
  static MisthFyloEpidomDao dao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private MisthFyloEpidom[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultMisthFyloEpidomDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthFyloEpidom[].class);
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testSelect() {
    MisthFyloEpidom testResult = dao.find(records[1].getKodepidom());
    java.util.List<MisthFyloEpidom> all = dao.selectAll();
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertFalse(all.isEmpty());
    org.junit.Assert.assertTrue("expect equals aa ", this.records[1].getAa() == testResult.getAa());
    org.junit.Assert.assertEquals(
        "expect equals kodfylo ", this.records[1].getKodfylo(), testResult.getKodfylo());
    org.junit.Assert.assertEquals(
        "expect equals notes ", this.records[1].getNotes(), testResult.getNotes());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ", this.records[1].getKodxrisi(), testResult.getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals expr ", this.records[1].getExpr(), testResult.getExpr());
  }
}