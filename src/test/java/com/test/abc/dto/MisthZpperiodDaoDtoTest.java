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
import com.test.abc.entity.MisthZpperiod;
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.MisthFinal;
import com.test.abc.dto.DwMisthZpperiodListDto;
import com.test.abc.dto.SelMisthZpperiodXrisiDto;
import com.test.abc.dto.PickMisthZpperiodXrisiDto;
import com.test.abc.dto.PrnFinalNopaidAnaKatastDto;
import com.test.abc.dto.PrnFinalNopaidAnaYpalDto;
import com.test.abc.dto.SprnYpalFinalDto;
import com.test.abc.utils.FileUtils;

public class MisthZpperiodDaoDtoTest {
  static MisthZpperiodDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZpperiodInputFile = "MisthZpperiod.json";
  static final String misthYpalInputFile = "MisthYpal.json";
  static final String misthFinalYpalInputFile = "MisthFinalYpal.json";
  static final String misthFinalInputFile = "MisthFinal.json";
  static MisthZpperiodDao misthZpperiodDao;
  private static MisthZpperiod[] misthZpperiodRecords;
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
    misthZpperiodDao = new DefaultMisthZpperiodDao(jpa);
    misthYpalDao = new DefaultMisthYpalDao(jpa);
    misthFinalYpalDao = new DefaultMisthFinalYpalDao(jpa);
    misthFinalDao = new DefaultMisthFinalDao(jpa);
    dtoDao = new DefaultMisthZpperiodDtoDao(jpa);
    try {
      String json;
      json =
          FileUtils.readFileFromResource2String(misthZpperiodInputFile, Charset.defaultCharset());
      misthZpperiodRecords = gson.fromJson(json, MisthZpperiod[].class);
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
  public void testdwMisthZpperiodList() {
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    java.util.List<DwMisthZpperiodListDto> testResult =
        dtoDao.dwMisthZpperiodList(misthZpperiodRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodperiod ",
        misthZpperiodRecords[1].getKodperiod(),
        testResult.get(0).getKodperiod());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpperiodRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals orderno ",
        misthZpperiodRecords[1].getOrderno(),
        testResult.get(0).getOrderno(),
        0.001);
  }

  @Test
  public void testselMisthZpperiodXrisi() {
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    java.util.List<SelMisthZpperiodXrisiDto> testResult =
        dtoDao.selMisthZpperiodXrisi(misthZpperiodRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodperiod ",
        misthZpperiodRecords[1].getKodperiod(),
        testResult.get(0).getKodperiod());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpperiodRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
  }

  @Test
  public void testpickMisthZpperiodXrisi() {
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    java.util.List<PickMisthZpperiodXrisiDto> testResult =
        dtoDao.pickMisthZpperiodXrisi(misthZpperiodRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodperiod ",
        misthZpperiodRecords[1].getKodperiod(),
        testResult.get(0).getKodperiod());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpperiodRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
  }

  @Test
  public void testprnFinalNopaidAnaKatast() {
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<PrnFinalNopaidAnaKatastDto> testResult =
        dtoDao.prnFinalNopaidAnaKatast(misthFinalRecords[1].getKodxrisi());
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
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testprnFinalNopaidAnaYpal() {
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<PrnFinalNopaidAnaYpalDto> testResult =
        dtoDao.prnFinalNopaidAnaYpal(misthFinalRecords[1].getKodxrisi());
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
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testsprnYpalFinal() {
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<SprnYpalFinalDto> testResult =
        dtoDao.sprnYpalFinal(
            misthFinalYpalRecords[1].getKodypal(), misthFinalYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals descfinal ",
        misthFinalRecords[1].getDescfinal(),
        testResult.get(0).getDescfinal());
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
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }
}
