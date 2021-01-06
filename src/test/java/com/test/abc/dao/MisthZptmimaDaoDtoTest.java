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
import com.test.abc.entity.MisthZptmima;
import com.test.abc.dto.DwMisthZptmimaListDto;
import com.test.abc.dto.PickMisthZptmimaXrisiDto;
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

public class MisthZptmimaDaoDtoTest {
  static MisthZptmimaDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZptmimaInputFile = "MisthZptmima.json";
  static MisthZptmimaDao misthZptmimaDao;
  private static MisthZptmima[] misthZptmimaRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZptmimaDao = new DefaultMisthZptmimaDao(jpa);
    dtoDao = new DefaultMisthZptmimaDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(misthZptmimaInputFile, Charset.defaultCharset());
      misthZptmimaRecords = gson.fromJson(json, MisthZptmima[].class);
      Arrays.stream(misthZptmimaRecords).skip(1).forEach(o -> misthZptmimaDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthZptmimaList() {
    java.util.List<DwMisthZptmimaListDto> testResult =
        dtoDao.dwMisthZptmimaList(misthZptmimaRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ",
        misthZptmimaRecords[1].getKodtmima(),
        testResult.get(0).getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZptmimaRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desctmima ",
        misthZptmimaRecords[1].getDesctmima(),
        testResult.get(0).getDesctmima());
  }

  @Test
  public void testpickMisthZptmimaXrisi() {
    java.util.List<PickMisthZptmimaXrisiDto> testResult =
        dtoDao.pickMisthZptmimaXrisi(misthZptmimaRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ",
        misthZptmimaRecords[1].getKodtmima(),
        testResult.get(0).getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZptmimaRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desctmima ",
        misthZptmimaRecords[1].getDesctmima(),
        testResult.get(0).getDesctmima());
  }
}
