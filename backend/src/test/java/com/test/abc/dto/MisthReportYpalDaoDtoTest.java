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
import com.test.abc.entity.MisthReport;
import com.test.abc.entity.MisthReportYpal;
import com.test.abc.entity.MisthYpal;
import com.test.abc.dto.SprnReport2Dto;
import com.test.abc.dto.SprnReportDto;
import com.test.abc.dto.PickMisthReportYpalDto;
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

public class MisthReportYpalDaoDtoTest {
  static MisthReportYpalDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthReportInputFile = "MisthReport.json";
  static final String misthReportYpalInputFile = "MisthReportYpal.json";
  static final String misthYpalInputFile = "MisthYpal.json";
  static MisthReportDao misthReportDao;
  private static MisthReport[] misthReportRecords;
  static MisthReportYpalDao misthReportYpalDao;
  private static MisthReportYpal[] misthReportYpalRecords;
  static MisthYpalDao misthYpalDao;
  private static MisthYpal[] misthYpalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthReportDao = new DefaultMisthReportDao(jpa);
    misthReportYpalDao = new DefaultMisthReportYpalDao(jpa);
    misthYpalDao = new DefaultMisthYpalDao(jpa);
    dtoDao = new DefaultMisthReportYpalDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(misthReportInputFile, Charset.defaultCharset());
      misthReportRecords = gson.fromJson(json, MisthReport[].class);
      json =
          FileUtils.readFileFromResource2String(misthReportYpalInputFile, Charset.defaultCharset());
      misthReportYpalRecords = gson.fromJson(json, MisthReportYpal[].class);
      json = FileUtils.readFileFromResource2String(misthYpalInputFile, Charset.defaultCharset());
      misthYpalRecords = gson.fromJson(json, MisthYpal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testsprnReport2() {
    misthReportDao.create(misthReportRecords[1]);
    misthReportYpalDao.create(misthReportYpalRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<SprnReport2Dto> testResult =
        dtoDao.sprnReport2(
            misthReportYpalRecords[1].getKodreport(), misthReportYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportYpalRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthReportYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportYpalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals surname ", misthYpalRecords[1].getSurname(), testResult.get(0).getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", misthYpalRecords[1].getName(), testResult.get(0).getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ",
        misthYpalRecords[1].getFathername(),
        testResult.get(0).getFathername());
    org.junit.Assert.assertEquals(
        "expect equals subtitle ",
        misthReportRecords[1].getSubtitle(),
        testResult.get(0).getSubtitle());
    org.junit.Assert.assertEquals(
        "expect equals prn_notes1 ",
        misthReportRecords[1].getPrnNotes1(),
        testResult.get(0).getPrnNotes1());
    org.junit.Assert.assertEquals(
        "expect equals prn_notes2 ",
        misthReportRecords[1].getPrnNotes2(),
        testResult.get(0).getPrnNotes2());
  }

  @Test
  public void testsprnReport() {
    misthReportYpalDao.create(misthReportYpalRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<SprnReportDto> testResult =
        dtoDao.sprnReport(
            misthReportYpalRecords[1].getKodreport(), misthReportYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportYpalRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthReportYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportYpalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
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
  }

  @Test
  public void testpickMisthReportYpal() {
    misthReportYpalDao.create(misthReportYpalRecords[1]);
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<PickMisthReportYpalDto> testResult =
        dtoDao.pickMisthReportYpal(
            misthReportYpalRecords[1].getKodreport(), misthReportYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportYpalRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthReportYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportYpalRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals surname ", misthYpalRecords[1].getSurname(), testResult.get(0).getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", misthYpalRecords[1].getName(), testResult.get(0).getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ",
        misthYpalRecords[1].getFathername(),
        testResult.get(0).getFathername());
  }
}
