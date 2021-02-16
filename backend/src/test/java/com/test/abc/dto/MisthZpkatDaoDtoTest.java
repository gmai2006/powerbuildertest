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
import com.test.abc.entity.MisthZpkat;
import com.test.abc.entity.MisthZpperiod;
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthFinal;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.dto.DwMisthFinalListDto;
import com.test.abc.dto.DwMisthFinalDetailsListDto;
import com.test.abc.dto.PickMisthZpkatXrisiDto;
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

public class MisthZpkatDaoDtoTest {
  static MisthZpkatDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZpkatInputFile = "MisthZpkat.json";
  static final String misthZpperiodInputFile = "MisthZpperiod.json";
  static final String misthYpalInputFile = "MisthYpal.json";
  static final String misthFinalInputFile = "MisthFinal.json";
  static final String misthFinalYpalInputFile = "MisthFinalYpal.json";
  static MisthZpkatDao misthZpkatDao;
  private static MisthZpkat[] misthZpkatRecords;
  static MisthZpperiodDao misthZpperiodDao;
  private static MisthZpperiod[] misthZpperiodRecords;
  static MisthYpalDao misthYpalDao;
  private static MisthYpal[] misthYpalRecords;
  static MisthFinalDao misthFinalDao;
  private static MisthFinal[] misthFinalRecords;
  static MisthFinalYpalDao misthFinalYpalDao;
  private static MisthFinalYpal[] misthFinalYpalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZpkatDao = new DefaultMisthZpkatDao(jpa);
    misthZpperiodDao = new DefaultMisthZpperiodDao(jpa);
    misthYpalDao = new DefaultMisthYpalDao(jpa);
    misthFinalDao = new DefaultMisthFinalDao(jpa);
    misthFinalYpalDao = new DefaultMisthFinalYpalDao(jpa);
    dtoDao = new DefaultMisthZpkatDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(misthZpkatInputFile, Charset.defaultCharset());
      misthZpkatRecords = gson.fromJson(json, MisthZpkat[].class);
      json =
          FileUtils.readFileFromResource2String(misthZpperiodInputFile, Charset.defaultCharset());
      misthZpperiodRecords = gson.fromJson(json, MisthZpperiod[].class);
      json = FileUtils.readFileFromResource2String(misthYpalInputFile, Charset.defaultCharset());
      misthYpalRecords = gson.fromJson(json, MisthYpal[].class);
      json = FileUtils.readFileFromResource2String(misthFinalInputFile, Charset.defaultCharset());
      misthFinalRecords = gson.fromJson(json, MisthFinal[].class);
      json =
          FileUtils.readFileFromResource2String(misthFinalYpalInputFile, Charset.defaultCharset());
      misthFinalYpalRecords = gson.fromJson(json, MisthFinalYpal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthFinalList() {
    misthZpkatDao.create(misthZpkatRecords[1]);
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    ;
    java.util.List<DwMisthFinalListDto> testResult =
        dtoDao.dwMisthFinalList(misthFinalRecords[1].getKodxrisi());
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
        "expect equals desckat ",
        misthZpkatRecords[1].getDesckat(),
        testResult.get(0).getDesckat());
    org.junit.Assert.assertEquals(
        "expect equals kodperiod ",
        misthFinalRecords[1].getKodperiod(),
        testResult.get(0).getKodperiod());
    org.junit.Assert.assertEquals(
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testdwMisthFinalDetailsList() {
    misthZpkatDao.create(misthZpkatRecords[1]);
    misthZpperiodDao.create(misthZpperiodRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    misthFinalYpalDao.create(misthFinalYpalRecords[1]);
    misthFinalDao.create(misthFinalRecords[1]);
    ;
    java.util.List<DwMisthFinalDetailsListDto> testResult =
        dtoDao.dwMisthFinalDetailsList(misthFinalYpalRecords[1].getKodxrisi());
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
        testResult.get(0).getKodfinal1(),
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
        "expect equals desckat ",
        misthZpkatRecords[1].getDesckat(),
        testResult.get(0).getDesckat());
    org.junit.Assert.assertEquals(
        "expect equals descperiod ",
        misthZpperiodRecords[1].getDescperiod(),
        testResult.get(0).getDescperiod());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }

  @Test
  public void testpickMisthZpkatXrisi() {
    misthZpkatDao.create(misthZpkatRecords[1]);
    ;
    java.util.List<PickMisthZpkatXrisiDto> testResult =
        dtoDao.pickMisthZpkatXrisi(misthZpkatRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodkat ", misthZpkatRecords[1].getKodkat(), testResult.get(0).getKodkat());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpkatRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desckat ",
        misthZpkatRecords[1].getDesckat(),
        testResult.get(0).getDesckat());
  }
}
