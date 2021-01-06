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
import com.test.abc.entity.MisthFinalYpalEpidom;
import com.test.abc.entity.MisthZpepidom;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.MisthFinal;
import com.test.abc.dto.SprnYpalPeriodEpidomDto;
import com.test.abc.dto.SprnAnalisiEpidomAsfDto;
import com.test.abc.dto.SprnFinalEpidomYpalDto;
import com.test.abc.dto.DwMisthFinalYpalEpidomListDto;
import com.test.abc.dto.SprnFinalEpidomMisthDto;
import com.test.abc.dto.SprnAnalisiEpidomNoforosDto;
import com.test.abc.dto.SprnAnalisiEpidomForosDto;
import com.test.abc.dto.SprnAnalisiEpidomAutoforosDto;
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

public class MisthFinalYpalEpidomDaoDtoTest {
  static MisthFinalYpalEpidomDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthFinalYpalEpidomInputFile = "MisthFinalYpalEpidom.json";
  static final String misthZpepidomInputFile = "MisthZpepidom.json";
  static final String misthFinalYpalInputFile = "MisthFinalYpal.json";
  static final String misthFinalInputFile = "MisthFinal.json";
  static MisthFinalYpalEpidomDao misthFinalYpalEpidomDao;
  private static MisthFinalYpalEpidom[] misthFinalYpalEpidomRecords;
  static MisthZpepidomDao misthZpepidomDao;
  private static MisthZpepidom[] misthZpepidomRecords;
  static MisthFinalYpalDao misthFinalYpalDao;
  private static MisthFinalYpal[] misthFinalYpalRecords;
  static MisthFinalDao misthFinalDao;
  private static MisthFinal[] misthFinalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthFinalYpalEpidomDao = new DefaultMisthFinalYpalEpidomDao(jpa);
    misthZpepidomDao = new DefaultMisthZpepidomDao(jpa);
    misthFinalYpalDao = new DefaultMisthFinalYpalDao(jpa);
    misthFinalDao = new DefaultMisthFinalDao(jpa);
    dtoDao = new DefaultMisthFinalYpalEpidomDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(
              misthFinalYpalEpidomInputFile, Charset.defaultCharset());
      misthFinalYpalEpidomRecords = gson.fromJson(json, MisthFinalYpalEpidom[].class);
      Arrays.stream(misthFinalYpalEpidomRecords)
          .skip(1)
          .forEach(o -> misthFinalYpalEpidomDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthZpepidomInputFile, Charset.defaultCharset());
      misthZpepidomRecords = gson.fromJson(json, MisthZpepidom[].class);
      Arrays.stream(misthZpepidomRecords).skip(1).forEach(o -> misthZpepidomDao.create(o));
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
  public void testsprnYpalPeriodEpidom() {
    java.util.List<SprnYpalPeriodEpidomDto> testResult =
        dtoDao.sprnYpalPeriodEpidom(
            misthFinalYpalEpidomRecords[1].getKodxrisi(),
            misthFinalYpalEpidomRecords[1].getKodypal(),
            misthFinalYpalRecords[1].getPlirdate(),
            misthFinalYpalRecords[1].getPlirdate());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals descepidom ",
        misthZpepidomRecords[1].getDescepidom(),
        testResult.get(0).getDescepidom());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalEpidomRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ",
        misthFinalYpalEpidomRecords[1].getNotes(),
        testResult.get(0).getNotes());
  }

  @Test
  public void testsprnAnalisiEpidomAsf() {
    java.util.List<SprnAnalisiEpidomAsfDto> testResult =
        dtoDao.sprnAnalisiEpidomAsf(
            misthFinalYpalEpidomRecords[1].getKodxrisi(),
            misthFinalYpalEpidomRecords[1].getKodypal());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalEpidomRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descepidom ",
        misthZpepidomRecords[1].getDescepidom(),
        testResult.get(0).getDescepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodepidom ",
        misthFinalYpalEpidomRecords[1].getKodepidom(),
        testResult.get(0).getKodepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalEpidomRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
  }

  @Test
  public void testsprnFinalEpidomYpal() {
    java.util.List<SprnFinalEpidomYpalDto> testResult =
        dtoDao.sprnFinalEpidomYpal(
            misthFinalYpalEpidomRecords[1].getKodfinal(),
            misthFinalYpalEpidomRecords[1].getKodypal(),
            misthFinalYpalEpidomRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals descepidom ",
        misthZpepidomRecords[1].getDescepidom(),
        testResult.get(0).getDescepidom());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalEpidomRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ",
        misthFinalYpalEpidomRecords[1].getNotes(),
        testResult.get(0).getNotes());
  }

  @Test
  public void testdwMisthFinalYpalEpidomList() {
    java.util.List<DwMisthFinalYpalEpidomListDto> testResult =
        dtoDao.dwMisthFinalYpalEpidomList(
            misthFinalYpalEpidomRecords[1].getKodfinal(),
            misthFinalYpalEpidomRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalYpalEpidomRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalEpidomRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodepidom ",
        misthFinalYpalEpidomRecords[1].getKodepidom(),
        testResult.get(0).getKodepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalEpidomRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalEpidomRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals aa ",
        misthFinalYpalEpidomRecords[1].getAa(),
        testResult.get(0).getAa(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ",
        misthFinalYpalEpidomRecords[1].getNotes(),
        testResult.get(0).getNotes());
  }

  @Test
  public void testsprnFinalEpidomMisth() {
    java.util.List<SprnFinalEpidomMisthDto> testResult =
        dtoDao.sprnFinalEpidomMisth(
            misthFinalYpalEpidomRecords[1].getKodfinal(),
            misthFinalYpalEpidomRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals descepidom ",
        misthZpepidomRecords[1].getDescepidom(),
        testResult.get(0).getDescepidom());
  }

  @Test
  public void testsprnAnalisiEpidomNoforos() {
    java.util.List<SprnAnalisiEpidomNoforosDto> testResult =
        dtoDao.sprnAnalisiEpidomNoforos(
            misthFinalYpalEpidomRecords[1].getKodxrisi(),
            misthFinalYpalEpidomRecords[1].getKodypal());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalEpidomRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descepidom ",
        misthZpepidomRecords[1].getDescepidom(),
        testResult.get(0).getDescepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodepidom ",
        misthFinalYpalEpidomRecords[1].getKodepidom(),
        testResult.get(0).getKodepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalEpidomRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
  }

  @Test
  public void testsprnAnalisiEpidomForos() {
    java.util.List<SprnAnalisiEpidomForosDto> testResult =
        dtoDao.sprnAnalisiEpidomForos(
            misthFinalYpalEpidomRecords[1].getKodxrisi(),
            misthFinalYpalEpidomRecords[1].getKodypal());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalEpidomRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descepidom ",
        misthZpepidomRecords[1].getDescepidom(),
        testResult.get(0).getDescepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodepidom ",
        misthFinalYpalEpidomRecords[1].getKodepidom(),
        testResult.get(0).getKodepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalEpidomRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
  }

  @Test
  public void testsprnAnalisiEpidomAutoforos() {
    java.util.List<SprnAnalisiEpidomAutoforosDto> testResult =
        dtoDao.sprnAnalisiEpidomAutoforos(
            misthFinalYpalEpidomRecords[1].getKodxrisi(),
            misthFinalYpalEpidomRecords[1].getKodypal());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals poso ",
        misthFinalYpalEpidomRecords[1].getPoso(),
        testResult.get(0).getPoso(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descepidom ",
        misthZpepidomRecords[1].getDescepidom(),
        testResult.get(0).getDescepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodepidom ",
        misthFinalYpalEpidomRecords[1].getKodepidom(),
        testResult.get(0).getKodepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFinalYpalEpidomRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
  }
}
