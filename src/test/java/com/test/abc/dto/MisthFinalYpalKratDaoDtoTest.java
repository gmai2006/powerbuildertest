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
import com.test.abc.entity.MisthFinalYpalKrat;
import com.test.abc.dto.DwMisthFinalYpalKratListDto;
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

public class MisthFinalYpalKratDaoDtoTest {
  static MisthFinalYpalKratDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthFinalYpalKratInputFile = "MisthFinalYpalKrat.json";
  static MisthFinalYpalKratDao misthFinalYpalKratDao;
  private static MisthFinalYpalKrat[] misthFinalYpalKratRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthFinalYpalKratDao = new DefaultMisthFinalYpalKratDao(jpa);
    dtoDao = new DefaultMisthFinalYpalKratDtoDao(jpa);
    try {
      String json = null;
      json =
          FileUtils.readFileFromResource2String(
              misthFinalYpalKratInputFile, Charset.defaultCharset());
      misthFinalYpalKratRecords = gson.fromJson(json, MisthFinalYpalKrat[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthFinalYpalKratList() {
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    ;
    java.util.List<DwMisthFinalYpalKratListDto> testResult =
        dtoDao.dwMisthFinalYpalKratList(
            misthFinalYpalKratRecords[1].getKodfinal(), misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalYpalKratRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalKratRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodkrat ",
        misthFinalYpalKratRecords[1].getKodkrat(),
        testResult.get(0).getKodkrat());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalKratRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals aa ",
        misthFinalYpalKratRecords[1].getAa(),
        testResult.get(0).getAa(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ",
        misthFinalYpalKratRecords[1].getNotes(),
        testResult.get(0).getNotes());
  }
}
