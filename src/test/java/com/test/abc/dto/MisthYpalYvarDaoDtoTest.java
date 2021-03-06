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
import com.test.abc.entity.MisthYpalYvar;
import com.test.abc.dto.DwMisthYpalYvarListDto;
import com.test.abc.utils.FileUtils;

public class MisthYpalYvarDaoDtoTest {
  static MisthYpalYvarDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthYpalYvarInputFile = "MisthYpalYvar.json";
  static MisthYpalYvarDao misthYpalYvarDao;
  private static MisthYpalYvar[] misthYpalYvarRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthYpalYvarDao = new DefaultMisthYpalYvarDao(jpa);
    dtoDao = new DefaultMisthYpalYvarDtoDao(jpa);
    try {
      String json;
      json =
          FileUtils.readFileFromResource2String(misthYpalYvarInputFile, Charset.defaultCharset());
      misthYpalYvarRecords = gson.fromJson(json, MisthYpalYvar[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthYpalYvarList() {
    misthYpalYvarDao.create(misthYpalYvarRecords[1]);
    java.util.List<DwMisthYpalYvarListDto> testResult =
        dtoDao.dwMisthYpalYvarList(
            misthYpalYvarRecords[1].getKodypal(), misthYpalYvarRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalYvarRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodyvar ",
        misthYpalYvarRecords[1].getKodyvar(),
        testResult.get(0).getKodyvar());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthYpalYvarRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthYpalYvarRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
    org.junit.Assert.assertEquals(
        "expect equals expr ", misthYpalYvarRecords[1].getExpr(), testResult.get(0).getExpr());
  }
}
