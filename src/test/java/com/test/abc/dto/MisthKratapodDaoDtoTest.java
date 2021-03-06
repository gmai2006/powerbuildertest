/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
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
import com.test.abc.entity.MisthKratapod;
import com.test.abc.dto.DwMisthKratapodListDto;
import com.test.abc.utils.FileUtils;

public class MisthKratapodDaoDtoTest {
  static MisthKratapodDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthKratapodInputFile = "MisthKratapod.json";
  static MisthKratapodDao misthKratapodDao;
  private static MisthKratapod[] misthKratapodRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthKratapodDao = new DefaultMisthKratapodDao(jpa);
    dtoDao = new DefaultMisthKratapodDtoDao(jpa);
    try {
      String json;
      json =
          FileUtils.readFileFromResource2String(misthKratapodInputFile, Charset.defaultCharset());
      misthKratapodRecords = gson.fromJson(json, MisthKratapod[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthKratapodList() {
    misthKratapodDao.create(misthKratapodRecords[1]);
    java.util.List<DwMisthKratapodListDto> testResult =
        dtoDao.dwMisthKratapodList(misthKratapodRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodkratapod ",
        misthKratapodRecords[1].getKodkratapod(),
        testResult.get(0).getKodkratapod(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthKratapodRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desckratapod ",
        misthKratapodRecords[1].getDesckratapod(),
        testResult.get(0).getDesckratapod());
  }
}
