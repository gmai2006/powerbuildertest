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

package com.test.abc.dto;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.abc.dao.AfxfilterDao;
import com.test.abc.dao.DefaultAfxfilterDao;
import com.test.abc.dao.DefaultJpaDao;
import com.test.abc.dao.JpaDao;
import com.test.abc.dao.StandaloneJpaDao;
import com.test.abc.entity.Afxfilter;
import com.test.abc.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

public class AfxfilterDtoTest {
  static final String inputFile = "Afxfilter.json";
  static AfxfilterDao dao;
  static StandaloneJpaDao jpa;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private Afxfilter[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("localpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultAfxfilterDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Afxfilter[].class);
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testSelect() {
    List<TestDto> postDTOs = jpa.getEntityManager().createNamedQuery("test", TestDto.class).getResultList();
    assertFalse("expect result", postDTOs.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals descfilter ", this.records[1].getDescfilter(), postDTOs.get(0).getDescfilter());
    org.junit.Assert.assertEquals(
        "expect equals tablename ", this.records[1].getTablename(), postDTOs.get(0).getTablename());
  }
}
