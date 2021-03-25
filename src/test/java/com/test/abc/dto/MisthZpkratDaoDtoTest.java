/*
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
import com.test.abc.dao.DefaultMisthFinalYpalDao;
import com.test.abc.dao.DefaultMisthFinalYpalKratDao;
import com.test.abc.dao.DefaultMisthYpalDao;
import com.test.abc.dao.DefaultMisthZpkratDao;
import com.test.abc.dao.DefaultMisthZpkratDtoDao;
import com.test.abc.dao.DefaultMisthZpperiodDao;
import com.test.abc.dao.JpaDao;
import com.test.abc.dao.MisthFinalDao;
import com.test.abc.dao.MisthFinalYpalDao;
import com.test.abc.dao.MisthFinalYpalKratDao;
import com.test.abc.dao.MisthYpalDao;
import com.test.abc.dao.MisthZpkratDao;
import com.test.abc.dao.MisthZpkratDtoDao;
import com.test.abc.dao.MisthZpperiodDao;
import com.test.abc.dao.StandaloneJpaDao;
import com.test.abc.entity.MisthFinal;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.MisthFinalYpalKrat;
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthZpkrat;
import com.test.abc.entity.MisthZpperiod;
import com.test.abc.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.BeforeClass;
import org.junit.Test;

public class MisthZpkratDaoDtoTest {
  static MisthZpkratDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZpkratInputFile = "MisthZpkrat.json";
  static final String misthFinalYpalKratInputFile = "MisthFinalYpalKrat.json";
  static final String misthYpalInputFile = "MisthYpal.json";
  static final String misthZpperiodInputFile = "MisthZpperiod.json";
  static final String misthFinalYpalInputFile = "MisthFinalYpal.json";
  static final String misthFinalInputFile = "MisthFinal.json";
  static MisthZpkratDao misthZpkratDao;
  private static MisthZpkrat[] misthZpkratRecords;
  static MisthFinalYpalKratDao misthFinalYpalKratDao;
  private static MisthFinalYpalKrat[] misthFinalYpalKratRecords;
  static MisthYpalDao misthYpalDao;
  private static MisthYpal[] misthYpalRecords;
  static MisthZpperiodDao misthZpperiodDao;
  private static MisthZpperiod[] misthZpperiodRecords;
  static MisthFinalYpalDao misthFinalYpalDao;
  private static MisthFinalYpal[] misthFinalYpalRecords;
  static MisthFinalDao misthFinalDao;
  private static MisthFinal[] misthFinalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZpkratDao = new DefaultMisthZpkratDao(jpa);
    misthFinalYpalKratDao = new DefaultMisthFinalYpalKratDao(jpa);
    misthYpalDao = new DefaultMisthYpalDao(jpa);
    misthZpperiodDao = new DefaultMisthZpperiodDao(jpa);
    misthFinalYpalDao = new DefaultMisthFinalYpalDao(jpa);
    misthFinalDao = new DefaultMisthFinalDao(jpa);
    dtoDao = new DefaultMisthZpkratDtoDao(jpa);
    try {
      String json;
      json = FileUtils.readFileFromResource2String(misthZpkratInputFile, Charset.defaultCharset());
      misthZpkratRecords = gson.fromJson(json, MisthZpkrat[].class);
      json =
          FileUtils.readFileFromResource2String(
              misthFinalYpalKratInputFile, Charset.defaultCharset());
      misthFinalYpalKratRecords = gson.fromJson(json, MisthFinalYpalKrat[].class);
      json = FileUtils.readFileFromResource2String(misthYpalInputFile, Charset.defaultCharset());
      misthYpalRecords = gson.fromJson(json, MisthYpal[].class);
      json =
          FileUtils.readFileFromResource2String(misthZpperiodInputFile, Charset.defaultCharset());
      misthZpperiodRecords = gson.fromJson(json, MisthZpperiod[].class);
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
  public void testpickMisthZpkratXrisi() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    java.util.List<PickMisthZpkratXrisiDto> testResult =
        dtoDao.pickMisthZpkratXrisi(misthZpkratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodkrat ",
        misthZpkratRecords[1].getKodkrat(),
        testResult.get(0).getKodkrat());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpkratRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
  }

  @Test
  public void testselMisthZpkratXrisi() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    java.util.List<SelMisthZpkratXrisiDto> testResult =
        dtoDao.selMisthZpkratXrisi(misthZpkratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodkrat ",
        misthZpkratRecords[1].getKodkrat(),
        testResult.get(0).getKodkrat());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpkratRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
  }

  @Test
  public void testsprnYpalPeriodKrat() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<SprnYpalPeriodKratDto> testResult =
        dtoDao.sprnYpalPeriodKrat(
            misthFinalYpalKratRecords[1].getKodxrisi(),
            misthFinalYpalKratRecords[1].getKodypal(),
            misthFinalYpalRecords[1].getPlirdate(),
            misthFinalYpalRecords[1].getPlirdate());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ",
        misthFinalYpalKratRecords[1].getNotes(),
        testResult.get(0).getNotes());
  }

  @Test
  public void testsprnAnalisiKratForos() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    java.util.List<SprnAnalisiKratForosDto> testResult =
        dtoDao.sprnAnalisiKratForos(
            misthFinalYpalKratRecords[1].getKodypal(), misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
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
  }

  @Test
  public void testsprnFinalKratMisth() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    java.util.List<SprnFinalKratMisthDto> testResult =
        dtoDao.sprnFinalKratMisth(
            misthFinalYpalKratRecords[1].getKodfinal(), misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
  }

  @Test
  public void testsprnAnalisiKratAutoforos() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    java.util.List<SprnAnalisiKratAutoforosDto> testResult =
        dtoDao.sprnAnalisiKratAutoforos(
            misthFinalYpalKratRecords[1].getKodypal(), misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
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
  }

  @Test
  public void testdwStepKratapodMisthselect() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<DwStepKratapodMisthselectDto> testResult =
        dtoDao.dwStepKratapodMisthselect(misthFinalYpalKratRecords[1].getKodxrisi());
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
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
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
        "expect equals aa ",
        misthFinalYpalKratRecords[1].getAa(),
        testResult.get(0).getAa(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ",
        misthFinalYpalKratRecords[1].getNotes(),
        testResult.get(0).getNotes());
    org.junit.Assert.assertEquals(
        "expect equals kodkratapod ",
        misthFinalYpalKratRecords[1].getKodkratapod(),
        testResult.get(0).getKodkratapod(),
        0.001);
  }

  @Test
  public void testprnKratapod() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<PrnKratapodDto> testResult =
        dtoDao.prnKratapod(
            misthFinalYpalKratRecords[1].getKodxrisi(),
            misthFinalYpalKratRecords[1].getKodkratapod());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodkrat ",
        misthFinalYpalKratRecords[1].getKodkrat(),
        testResult.get(0).getKodkrat());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
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
        "expect equals kodxrisi ",
        misthFinalYpalKratRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodkratapod ",
        misthFinalYpalKratRecords[1].getKodkratapod(),
        testResult.get(0).getKodkratapod(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testsprnAnalisiKratLoipa() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    java.util.List<SprnAnalisiKratLoipaDto> testResult =
        dtoDao.sprnAnalisiKratLoipa(
            misthFinalYpalKratRecords[1].getKodypal(), misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
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
  }

  @Test
  public void testsprnAnalisiKratAsf() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    java.util.List<SprnAnalisiKratAsfDto> testResult =
        dtoDao.sprnAnalisiKratAsf(
            misthFinalYpalKratRecords[1].getKodypal(), misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
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
  }

  @Test
  public void testprnKratNoapod() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<PrnKratNoapodDto> testResult =
        dtoDao.prnKratNoapod(misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodkrat ",
        misthFinalYpalKratRecords[1].getKodkrat(),
        testResult.get(0).getKodkrat());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
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
        "expect equals kodxrisi ",
        misthFinalYpalKratRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodkratapod ",
        misthFinalYpalKratRecords[1].getKodkratapod(),
        testResult.get(0).getKodkratapod(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testprnKratTotal() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    java.util.List<PrnKratTotalDto> testResult =
        dtoDao.prnKratTotal(misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodkrat ",
        misthFinalYpalKratRecords[1].getKodkrat(),
        testResult.get(0).getKodkrat());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
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
        "expect equals kodxrisi ",
        misthFinalYpalKratRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testsprnFinalKratYpal() {
    misthZpkratDao.create(misthZpkratRecords[1]);
    misthFinalYpalKratDao.create(misthFinalYpalKratRecords[1]);
    java.util.List<SprnFinalKratYpalDto> testResult =
        dtoDao.sprnFinalKratYpal(
            misthFinalYpalKratRecords[1].getKodfinal(),
            misthFinalYpalKratRecords[1].getKodypal(),
            misthFinalYpalKratRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals desckrat ",
        misthZpkratRecords[1].getDesckrat(),
        testResult.get(0).getDesckrat());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ",
        misthFinalYpalKratRecords[1].getNotes(),
        testResult.get(0).getNotes());
  }
}
