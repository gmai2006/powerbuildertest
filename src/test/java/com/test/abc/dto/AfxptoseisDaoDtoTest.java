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
import com.test.abc.dao.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.test.abc.entity.Afxptoseis;
import com.test.abc.dto.DwAfxptoseisFormDto;
import com.test.abc.dto.DwAfxptoseisListDto;
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

public class AfxptoseisDaoDtoTest {
  static AfxptoseisDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String afxptoseisInputFile = "Afxptoseis.json";
  static AfxptoseisDao afxptoseisDao;
  private static Afxptoseis[] afxptoseisRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    afxptoseisDao = new DefaultAfxptoseisDao(jpa);
    dtoDao = new DefaultAfxptoseisDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(afxptoseisInputFile, Charset.defaultCharset());
      afxptoseisRecords = gson.fromJson(json, Afxptoseis[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwAfxptoseisForm() {
    afxptoseisDao.create(afxptoseisRecords[1]);
    ;
    java.util.List<DwAfxptoseisFormDto> testResult =
        dtoDao.dwAfxptoseisForm(afxptoseisRecords[1].getOnom());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals onom ", afxptoseisRecords[1].getOnom(), testResult.get(0).getOnom());
    org.junit.Assert.assertEquals(
        "expect equals gen ", afxptoseisRecords[1].getGen(), testResult.get(0).getGen());
    org.junit.Assert.assertEquals(
        "expect equals ait ", afxptoseisRecords[1].getAit(), testResult.get(0).getAit());
  }

  @Test
  public void testdwAfxptoseisList() {
    afxptoseisDao.create(afxptoseisRecords[1]);
    ;
    java.util.List<DwAfxptoseisListDto> testResult = dtoDao.dwAfxptoseisList();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals onom ", afxptoseisRecords[1].getOnom(), testResult.get(0).getOnom());
    org.junit.Assert.assertEquals(
        "expect equals gen ", afxptoseisRecords[1].getGen(), testResult.get(0).getGen());
    org.junit.Assert.assertEquals(
        "expect equals ait ", afxptoseisRecords[1].getAit(), testResult.get(0).getAit());
  }
}
