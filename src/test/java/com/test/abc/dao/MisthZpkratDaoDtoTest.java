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
import com.test.abc.entity.MisthZpkrat;
import com.test.abc.entity.MisthFinalYpalKrat;
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthZpperiod;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.MisthFinal;
import com.test.abc.dto.PickMisthZpkratXrisiDto;
import com.test.abc.dto.SelMisthZpkratXrisiDto;
import com.test.abc.dto.SprnYpalPeriodKratDto;
import com.test.abc.dto.SprnAnalisiKratForosDto;
import com.test.abc.dto.SprnFinalKratMisthDto;
import com.test.abc.dto.SprnAnalisiKratAutoforosDto;
import com.test.abc.dto.DwStepKratapodMisthselectDto;
import com.test.abc.dto.PrnKratapodDto;
import com.test.abc.dto.SprnAnalisiKratLoipaDto;
import com.test.abc.dto.SprnAnalisiKratAsfDto;
import com.test.abc.dto.PrnKratNoapodDto;
import com.test.abc.dto.PrnKratTotalDto;
import com.test.abc.dto.SprnFinalKratYpalDto;
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
      String json =
          FileUtils.readFileFromResource2String(misthZpkratInputFile, Charset.defaultCharset());
      misthZpkratRecords = gson.fromJson(json, MisthZpkrat[].class);
      Arrays.stream(misthZpkratRecords).skip(1).forEach(o -> misthZpkratDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(
              misthFinalYpalKratInputFile, Charset.defaultCharset());
      misthFinalYpalKratRecords = gson.fromJson(json, MisthFinalYpalKrat[].class);
      Arrays.stream(misthFinalYpalKratRecords)
          .skip(1)
          .forEach(o -> misthFinalYpalKratDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthYpalInputFile, Charset.defaultCharset());
      misthYpalRecords = gson.fromJson(json, MisthYpal[].class);
      Arrays.stream(misthYpalRecords).skip(1).forEach(o -> misthYpalDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthZpperiodInputFile, Charset.defaultCharset());
      misthZpperiodRecords = gson.fromJson(json, MisthZpperiod[].class);
      Arrays.stream(misthZpperiodRecords).skip(1).forEach(o -> misthZpperiodDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthFinalYpalInputFile, Charset.defaultCharset());
      misthFinalYpalRecords = gson.fromJson(json, MisthFinalYpal[].class);
      Arrays.stream(misthFinalYpalRecords).skip(1).forEach(o -> misthFinalYpalDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthFinalInputFile, Charset.defaultCharset());
      misthFinalRecords = gson.fromJson(json, MisthFinal[].class);
      Arrays.stream(misthFinalRecords).skip(1).forEach(o -> misthFinalDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testpickMisthZpkratXrisi() {
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
    org.junit.Assert.assertTrue(
        "expect equals datefinal ",
        misthFinalRecords[1].getDatefinal().getTime()
            == testResult.get(0).getDatefinal().getTime());
    org.junit.Assert.assertTrue(
        "expect equals plirdate ",
        misthFinalYpalRecords[1].getPlirdate().getTime()
            == testResult.get(0).getPlirdate().getTime());
  }

  @Test
  public void testprnKratapod() {
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
    org.junit.Assert.assertTrue(
        "expect equals datefinal ",
        misthFinalRecords[1].getDatefinal().getTime()
            == testResult.get(0).getDatefinal().getTime());
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
    org.junit.Assert.assertTrue(
        "expect equals datefinal ",
        misthFinalRecords[1].getDatefinal().getTime()
            == testResult.get(0).getDatefinal().getTime());
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
    org.junit.Assert.assertTrue(
        "expect equals plirdate ",
        misthFinalYpalRecords[1].getPlirdate().getTime()
            == testResult.get(0).getPlirdate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testprnKratTotal() {
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
    org.junit.Assert.assertTrue(
        "expect equals datefinal ",
        misthFinalRecords[1].getDatefinal().getTime()
            == testResult.get(0).getDatefinal().getTime());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalKratRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalKratRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertTrue(
        "expect equals plirdate ",
        misthFinalYpalRecords[1].getPlirdate().getTime()
            == testResult.get(0).getPlirdate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testsprnFinalKratYpal() {
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
