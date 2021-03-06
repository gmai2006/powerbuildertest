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
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.MisthFinal;
import com.test.abc.dto.SprnReport3Dto;
import com.test.abc.dto.DwMisthFinalYpalPrildateDto;
import com.test.abc.dto.PrnFinalYpalListDto;
import com.test.abc.dto.DwMisthFinalYpalPlirdateListDto;
import com.test.abc.dto.DwMisthFinalYpalListDto;
import com.test.abc.dto.PickMisthFinalYpalDto;
import com.test.abc.utils.FileUtils;

public class MisthFinalYpalDaoDtoTest {
  static MisthFinalYpalDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthYpalInputFile = "MisthYpal.json";
  static final String misthFinalYpalInputFile = "MisthFinalYpal.json";
  static final String misthFinalInputFile = "MisthFinal.json";
  static MisthYpalDao misthYpalDao;
  private static MisthYpal[] misthYpalRecords;
  static MisthFinalYpalDao misthFinalYpalDao;
  private static MisthFinalYpal[] misthFinalYpalRecords;
  static MisthFinalDao misthFinalDao;
  private static MisthFinal[] misthFinalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthYpalDao = new DefaultMisthYpalDao(jpa);
    misthFinalYpalDao = new DefaultMisthFinalYpalDao(jpa);
    misthFinalDao = new DefaultMisthFinalDao(jpa);
    dtoDao = new DefaultMisthFinalYpalDtoDao(jpa);
    try {
      String json;
      json = FileUtils.readFileFromResource2String(misthYpalInputFile, Charset.defaultCharset());
      misthYpalRecords = gson.fromJson(json, MisthYpal[].class);
      json =
          FileUtils.readFileFromResource2String(misthFinalYpalInputFile, Charset.defaultCharset());
      misthFinalYpalRecords = gson.fromJson(json, MisthFinalYpal[].class);
      json = FileUtils.readFileFromResource2String(misthFinalInputFile, Charset.defaultCharset());
      misthFinalRecords = gson.fromJson(json, MisthFinal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testsprnReport3() {
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<SprnReport3Dto> testResult =
        dtoDao.sprnReport3(
            misthFinalYpalRecords[1].getKodfinal(), misthFinalYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals surname ", misthYpalRecords[1].getSurname(), testResult.get(0).getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", misthYpalRecords[1].getName(), testResult.get(0).getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ",
        misthYpalRecords[1].getFathername(),
        testResult.get(0).getFathername());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals title ", misthFinalRecords[1].getTitle(), testResult.get(0).getTitle());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
  }

  @Test
  public void testdwMisthFinalYpalPrildate() {
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    java.util.List<DwMisthFinalYpalPrildateDto> testResult =
        dtoDao.dwMisthFinalYpalPrildate(
            misthFinalYpalRecords[1].getKodfinal(), misthFinalYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalYpalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
  }

  @Test
  public void testprnFinalYpalList() {
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<PrnFinalYpalListDto> testResult =
        dtoDao.prnFinalYpalList(
            misthFinalRecords[1].getKodfinal(), misthFinalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals descfinal ",
        misthFinalRecords[1].getDescfinal(),
        testResult.get(0).getDescfinal());
    org.junit.Assert.assertEquals(
        "expect equals surname ", misthYpalRecords[1].getSurname(), testResult.get(0).getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", misthYpalRecords[1].getName(), testResult.get(0).getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ",
        misthYpalRecords[1].getFathername(),
        testResult.get(0).getFathername());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalYpalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal1(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals title ", misthFinalRecords[1].getTitle(), testResult.get(0).getTitle());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", misthYpalRecords[1].getMitroo(), testResult.get(0).getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testdwMisthFinalYpalPlirdateList() {
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    java.util.List<DwMisthFinalYpalPlirdateListDto> testResult =
        dtoDao.dwMisthFinalYpalPlirdateList(
            misthFinalYpalRecords[1].getKodfinal(), misthFinalYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals surname ", misthYpalRecords[1].getSurname(), testResult.get(0).getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", misthYpalRecords[1].getName(), testResult.get(0).getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ",
        misthYpalRecords[1].getFathername(),
        testResult.get(0).getFathername());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalYpalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
  }

  @Test
  public void testpickMisthFinalYpal() {
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    java.util.List<PickMisthFinalYpalDto> testResult =
        dtoDao.pickMisthFinalYpal(
            misthFinalYpalRecords[1].getKodfinal(), misthFinalYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals surname ", misthYpalRecords[1].getSurname(), testResult.get(0).getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", misthYpalRecords[1].getName(), testResult.get(0).getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ",
        misthYpalRecords[1].getFathername(),
        testResult.get(0).getFathername());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
  }
}
