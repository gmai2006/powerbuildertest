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
import com.test.abc.entity.MisthZptamio;
import com.test.abc.dto.PickMisthZptamioXrisiDto;
import com.test.abc.dto.DwMisthZptamioListDto;
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

public class MisthZptamioDaoDtoTest {
  static MisthZptamioDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZptamioInputFile = "MisthZptamio.json";
  static MisthZptamioDao misthZptamioDao;
  private static MisthZptamio[] misthZptamioRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZptamioDao = new DefaultMisthZptamioDao(jpa);
    dtoDao = new DefaultMisthZptamioDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(misthZptamioInputFile, Charset.defaultCharset());
      misthZptamioRecords = gson.fromJson(json, MisthZptamio[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testpickMisthZptamioXrisi() {
    misthZptamioDao.create(misthZptamioRecords[1]);
    ;
    java.util.List<PickMisthZptamioXrisiDto> testResult =
        dtoDao.pickMisthZptamioXrisi(misthZptamioRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ",
        misthZptamioRecords[1].getKodtamio(),
        testResult.get(0).getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZptamioRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desctamio ",
        misthZptamioRecords[1].getDesctamio(),
        testResult.get(0).getDesctamio());
  }

  @Test
  public void testdwMisthZptamioList() {
    misthZptamioDao.create(misthZptamioRecords[1]);
    ;
    java.util.List<DwMisthZptamioListDto> testResult =
        dtoDao.dwMisthZptamioList(misthZptamioRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ",
        misthZptamioRecords[1].getKodtamio(),
        testResult.get(0).getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZptamioRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desctamio ",
        misthZptamioRecords[1].getDesctamio(),
        testResult.get(0).getDesctamio());
  }
}
