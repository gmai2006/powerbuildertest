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
import com.test.abc.entity.Usrgroups;
import com.test.abc.dto.DwUsrgroupsListDto;
import com.test.abc.dto.PickUsrgroupsDto;
import com.test.abc.dto.DwUsrgroupsFormDto;
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

public class UsrgroupsDaoDtoTest {
  static UsrgroupsDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String usrgroupsInputFile = "Usrgroups.json";
  static UsrgroupsDao usrgroupsDao;
  private static Usrgroups[] usrgroupsRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    usrgroupsDao = new DefaultUsrgroupsDao(jpa);
    dtoDao = new DefaultUsrgroupsDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(usrgroupsInputFile, Charset.defaultCharset());
      usrgroupsRecords = gson.fromJson(json, Usrgroups[].class);
      Arrays.stream(usrgroupsRecords).skip(1).forEach(o -> usrgroupsDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwUsrgroupsList() {
    java.util.List<DwUsrgroupsListDto> testResult = dtoDao.dwUsrgroupsList();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodgroup ",
        usrgroupsRecords[1].getKodgroup(),
        testResult.get(0).getKodgroup(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descgroup ",
        usrgroupsRecords[1].getDescgroup(),
        testResult.get(0).getDescgroup());
  }

  @Test
  public void testpickUsrgroups() {
    java.util.List<PickUsrgroupsDto> testResult = dtoDao.pickUsrgroups();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodgroup ",
        usrgroupsRecords[1].getKodgroup(),
        testResult.get(0).getKodgroup(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descgroup ",
        usrgroupsRecords[1].getDescgroup(),
        testResult.get(0).getDescgroup());
  }

  @Test
  public void testdwUsrgroupsForm() {
    java.util.List<DwUsrgroupsFormDto> testResult =
        dtoDao.dwUsrgroupsForm(usrgroupsRecords[1].getKodgroup());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodgroup ",
        usrgroupsRecords[1].getKodgroup(),
        testResult.get(0).getKodgroup(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descgroup ",
        usrgroupsRecords[1].getDescgroup(),
        testResult.get(0).getDescgroup());
  }
}
