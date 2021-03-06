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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.abc.dao.DefaultMisthFinalDao;
import com.test.abc.dao.DefaultMisthFinalDtoDao;
import com.test.abc.dao.JpaDao;
import com.test.abc.dao.MisthFinalDao;
import com.test.abc.dao.MisthFinalDtoDao;
import com.test.abc.dao.StandaloneJpaDao;
import com.test.abc.entity.MisthFinal;
import com.test.abc.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.BeforeClass;
import org.junit.Test;

public class MisthFinalDaoDtoTest {
  static MisthFinalDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthFinalInputFile = "MisthFinal.json";
  static MisthFinalDao misthFinalDao;
  private static MisthFinal[] misthFinalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthFinalDao = new DefaultMisthFinalDao(jpa);
    dtoDao = new DefaultMisthFinalDtoDao(jpa);
    try {
      String json;
      json = FileUtils.readFileFromResource2String(misthFinalInputFile, Charset.defaultCharset());
      misthFinalRecords = gson.fromJson(json, MisthFinal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthFinalForm() {
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<DwMisthFinalFormDto> testResult =
        dtoDao.dwMisthFinalForm(
            misthFinalRecords[1].getKodfinal(), misthFinalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descfinal ",
        misthFinalRecords[1].getDescfinal(),
        testResult.get(0).getDescfinal());
    org.junit.Assert.assertEquals(
        "expect equals title ", misthFinalRecords[1].getTitle(), testResult.get(0).getTitle());
    org.junit.Assert.assertEquals(
        "expect equals kodkat ", misthFinalRecords[1].getKodkat(), testResult.get(0).getKodkat());
    org.junit.Assert.assertEquals(
        "expect equals kodperiod ",
        misthFinalRecords[1].getKodperiod(),
        testResult.get(0).getKodperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testprnFinalTotalMisth() {
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<PrnFinalTotalMisthDto> testResult =
        dtoDao.prnFinalTotalMisth(
            misthFinalRecords[1].getKodfinal(), misthFinalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descfinal ",
        misthFinalRecords[1].getDescfinal(),
        testResult.get(0).getDescfinal());
    org.junit.Assert.assertEquals(
        "expect equals title ", misthFinalRecords[1].getTitle(), testResult.get(0).getTitle());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }
}
