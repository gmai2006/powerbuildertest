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
import com.test.abc.entity.MisthZpoikog;
import com.test.abc.entity.MisthZptmima;
import com.test.abc.entity.MisthZpthesi;
import com.test.abc.entity.MisthZpidikot;
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthZptamio;
import com.test.abc.entity.MisthFinalYpal;
import com.test.abc.entity.MisthFinal;
import com.test.abc.dto.DwMisthYpalListDto;
import com.test.abc.dto.PickMisthZpidikotXrisiDto;
import com.test.abc.dto.PrnFinalAtomikiMisthDto;
import com.test.abc.dto.PrnFinalAtomikiMisthArgDto;
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

public class MisthZpidikotDaoDtoTest {
  static MisthZpidikotDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZpoikogInputFile = "MisthZpoikog.json";
  static final String misthZptmimaInputFile = "MisthZptmima.json";
  static final String misthZpthesiInputFile = "MisthZpthesi.json";
  static final String misthZpidikotInputFile = "MisthZpidikot.json";
  static final String misthYpalInputFile = "MisthYpal.json";
  static final String misthZptamioInputFile = "MisthZptamio.json";
  static final String misthFinalYpalInputFile = "MisthFinalYpal.json";
  static final String misthFinalInputFile = "MisthFinal.json";
  static MisthZpoikogDao misthZpoikogDao;
  private static MisthZpoikog[] misthZpoikogRecords;
  static MisthZptmimaDao misthZptmimaDao;
  private static MisthZptmima[] misthZptmimaRecords;
  static MisthZpthesiDao misthZpthesiDao;
  private static MisthZpthesi[] misthZpthesiRecords;
  static MisthZpidikotDao misthZpidikotDao;
  private static MisthZpidikot[] misthZpidikotRecords;
  static MisthYpalDao misthYpalDao;
  private static MisthYpal[] misthYpalRecords;
  static MisthZptamioDao misthZptamioDao;
  private static MisthZptamio[] misthZptamioRecords;
  static MisthFinalYpalDao misthFinalYpalDao;
  private static MisthFinalYpal[] misthFinalYpalRecords;
  static MisthFinalDao misthFinalDao;
  private static MisthFinal[] misthFinalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZpoikogDao = new DefaultMisthZpoikogDao(jpa);
    misthZptmimaDao = new DefaultMisthZptmimaDao(jpa);
    misthZpthesiDao = new DefaultMisthZpthesiDao(jpa);
    misthZpidikotDao = new DefaultMisthZpidikotDao(jpa);
    misthYpalDao = new DefaultMisthYpalDao(jpa);
    misthZptamioDao = new DefaultMisthZptamioDao(jpa);
    misthFinalYpalDao = new DefaultMisthFinalYpalDao(jpa);
    misthFinalDao = new DefaultMisthFinalDao(jpa);
    dtoDao = new DefaultMisthZpidikotDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(misthZpoikogInputFile, Charset.defaultCharset());
      misthZpoikogRecords = gson.fromJson(json, MisthZpoikog[].class);
      Arrays.stream(misthZpoikogRecords).skip(1).forEach(o -> misthZpoikogDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthZptmimaInputFile, Charset.defaultCharset());
      misthZptmimaRecords = gson.fromJson(json, MisthZptmima[].class);
      Arrays.stream(misthZptmimaRecords).skip(1).forEach(o -> misthZptmimaDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthZpthesiInputFile, Charset.defaultCharset());
      misthZpthesiRecords = gson.fromJson(json, MisthZpthesi[].class);
      Arrays.stream(misthZpthesiRecords).skip(1).forEach(o -> misthZpthesiDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(misthZpidikotInputFile, Charset.defaultCharset());
      misthZpidikotRecords = gson.fromJson(json, MisthZpidikot[].class);
      Arrays.stream(misthZpidikotRecords).skip(1).forEach(o -> misthZpidikotDao.create(o));
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
          FileUtils.readFileFromResource2String(misthZptamioInputFile, Charset.defaultCharset());
      misthZptamioRecords = gson.fromJson(json, MisthZptamio[].class);
      Arrays.stream(misthZptamioRecords).skip(1).forEach(o -> misthZptamioDao.create(o));
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
  public void testdwMisthYpalList() {
    java.util.List<DwMisthYpalListDto> testResult =
        dtoDao.dwMisthYpalList(misthYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthYpalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals surname ", misthYpalRecords[1].getSurname(), testResult.get(0).getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", misthYpalRecords[1].getName(), testResult.get(0).getName());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", misthYpalRecords[1].getMitroo(), testResult.get(0).getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals klados ", misthYpalRecords[1].getKlados(), testResult.get(0).getKlados());
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", misthYpalRecords[1].getBathmos(), testResult.get(0).getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals descidikot ",
        misthZpidikotRecords[1].getDescidikot(),
        testResult.get(0).getDescidikot());
  }

  @Test
  public void testpickMisthZpidikotXrisi() {
    java.util.List<PickMisthZpidikotXrisiDto> testResult =
        dtoDao.pickMisthZpidikotXrisi(misthZpidikotRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodidikot ",
        misthZpidikotRecords[1].getKodidikot(),
        testResult.get(0).getKodidikot());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpidikotRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descidikot ",
        misthZpidikotRecords[1].getDescidikot(),
        testResult.get(0).getDescidikot());
  }

  @Test
  public void testprnFinalAtomikiMisth() {
    java.util.List<PrnFinalAtomikiMisthDto> testResult =
        dtoDao.prnFinalAtomikiMisth(
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
        "expect equals mitroo ", misthYpalRecords[1].getMitroo(), testResult.get(0).getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals adt ", misthYpalRecords[1].getAdt(), testResult.get(0).getAdt());
    org.junit.Assert.assertEquals(
        "expect equals afm ", misthYpalRecords[1].getAfm(), testResult.get(0).getAfm());
    org.junit.Assert.assertEquals(
        "expect equals doy ", misthYpalRecords[1].getDoy(), testResult.get(0).getDoy());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", misthYpalRecords[1].getBankno(), testResult.get(0).getBankno());
    org.junit.Assert.assertEquals(
        "expect equals bank ", misthYpalRecords[1].getBank(), testResult.get(0).getBank());
    org.junit.Assert.assertEquals(
        "expect equals childs ",
        misthYpalRecords[1].getChilds(),
        testResult.get(0).getChilds(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ",
        misthYpalRecords[1].getProstmeli(),
        testResult.get(0).getProstmeli(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", misthYpalRecords[1].getBathmos(), testResult.get(0).getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klados ", misthYpalRecords[1].getKlados(), testResult.get(0).getKlados());
    org.junit.Assert.assertTrue(
        "expect equals birthdate ",
        misthYpalRecords[1].getBirthdate().getTime() == testResult.get(0).getBirthdate().getTime());
    org.junit.Assert.assertTrue(
        "expect equals hireddate ",
        misthYpalRecords[1].getHireddate().getTime() == testResult.get(0).getHireddate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals descoikog ",
        misthZpoikogRecords[1].getDescoikog(),
        testResult.get(0).getDescoikog());
    org.junit.Assert.assertEquals(
        "expect equals descidikot ",
        misthZpidikotRecords[1].getDescidikot(),
        testResult.get(0).getDescidikot());
    org.junit.Assert.assertEquals(
        "expect equals descthesi ",
        misthZpthesiRecords[1].getDescthesi(),
        testResult.get(0).getDescthesi());
    org.junit.Assert.assertEquals(
        "expect equals desctmima ",
        misthZptmimaRecords[1].getDesctmima(),
        testResult.get(0).getDesctmima());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
    org.junit.Assert.assertEquals(
        "expect equals descfinal ",
        misthFinalRecords[1].getDescfinal(),
        testResult.get(0).getDescfinal());
    org.junit.Assert.assertTrue(
        "expect equals datefinal ",
        misthFinalRecords[1].getDatefinal().getTime()
            == testResult.get(0).getDatefinal().getTime());
    org.junit.Assert.assertEquals(
        "expect equals title ", misthFinalRecords[1].getTitle(), testResult.get(0).getTitle());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals desctamio ",
        misthZptamioRecords[1].getDesctamio(),
        testResult.get(0).getDesctamio());
  }

  @Test
  public void testprnFinalAtomikiMisthArg() {
    java.util.List<PrnFinalAtomikiMisthArgDto> testResult =
        dtoDao.prnFinalAtomikiMisthArg(
            misthFinalYpalRecords[1].getKodypal(),
            misthFinalYpalRecords[1].getKodfinal(),
            misthFinalYpalRecords[1].getKodxrisi());
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
        "expect equals mitroo ", misthYpalRecords[1].getMitroo(), testResult.get(0).getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals adt ", misthYpalRecords[1].getAdt(), testResult.get(0).getAdt());
    org.junit.Assert.assertEquals(
        "expect equals afm ", misthYpalRecords[1].getAfm(), testResult.get(0).getAfm());
    org.junit.Assert.assertEquals(
        "expect equals doy ", misthYpalRecords[1].getDoy(), testResult.get(0).getDoy());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", misthYpalRecords[1].getBankno(), testResult.get(0).getBankno());
    org.junit.Assert.assertEquals(
        "expect equals bank ", misthYpalRecords[1].getBank(), testResult.get(0).getBank());
    org.junit.Assert.assertEquals(
        "expect equals childs ",
        misthYpalRecords[1].getChilds(),
        testResult.get(0).getChilds(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ",
        misthYpalRecords[1].getProstmeli(),
        testResult.get(0).getProstmeli(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", misthYpalRecords[1].getBathmos(), testResult.get(0).getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klados ", misthYpalRecords[1].getKlados(), testResult.get(0).getKlados());
    org.junit.Assert.assertTrue(
        "expect equals birthdate ",
        misthYpalRecords[1].getBirthdate().getTime() == testResult.get(0).getBirthdate().getTime());
    org.junit.Assert.assertTrue(
        "expect equals hireddate ",
        misthYpalRecords[1].getHireddate().getTime() == testResult.get(0).getHireddate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals descoikog ",
        misthZpoikogRecords[1].getDescoikog(),
        testResult.get(0).getDescoikog());
    org.junit.Assert.assertEquals(
        "expect equals descidikot ",
        misthZpidikotRecords[1].getDescidikot(),
        testResult.get(0).getDescidikot());
    org.junit.Assert.assertEquals(
        "expect equals descthesi ",
        misthZpthesiRecords[1].getDescthesi(),
        testResult.get(0).getDescthesi());
    org.junit.Assert.assertEquals(
        "expect equals desctmima ",
        misthZptmimaRecords[1].getDesctmima(),
        testResult.get(0).getDesctmima());
    org.junit.Assert.assertEquals(
        "expect equals kodfinal ",
        misthFinalRecords[1].getKodfinal(),
        testResult.get(0).getKodfinal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFinalRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
    org.junit.Assert.assertEquals(
        "expect equals descfinal ",
        misthFinalRecords[1].getDescfinal(),
        testResult.get(0).getDescfinal());
    org.junit.Assert.assertTrue(
        "expect equals datefinal ",
        misthFinalRecords[1].getDatefinal().getTime()
            == testResult.get(0).getDatefinal().getTime());
    org.junit.Assert.assertEquals(
        "expect equals title ", misthFinalRecords[1].getTitle(), testResult.get(0).getTitle());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFinalYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals desctamio ",
        misthZptamioRecords[1].getDesctamio(),
        testResult.get(0).getDesctamio());
  }
}
