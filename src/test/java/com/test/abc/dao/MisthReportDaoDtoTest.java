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
import com.test.abc.entity.MisthReport;
import com.test.abc.dto.DwMisthReportFormNotesDto;
import com.test.abc.dto.DwMisthReportListDto;
import com.test.abc.dto.DwMisthReportFormDto;
import com.test.abc.dto.PickMisthReportXrisiDto;
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

public class MisthReportDaoDtoTest {
  static MisthReportDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthReportInputFile = "MisthReport.json";
  static MisthReportDao misthReportDao;
  private static MisthReport[] misthReportRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthReportDao = new DefaultMisthReportDao(jpa);
    dtoDao = new DefaultMisthReportDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(misthReportInputFile, Charset.defaultCharset());
      misthReportRecords = gson.fromJson(json, MisthReport[].class);
      Arrays.stream(misthReportRecords).skip(1).forEach(o -> misthReportDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthReportFormNotes() {
    java.util.List<DwMisthReportFormNotesDto> testResult =
        dtoDao.dwMisthReportFormNotes(
            misthReportRecords[1].getKodreport(), misthReportRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descreport ",
        misthReportRecords[1].getDescreport(),
        testResult.get(0).getDescreport());
    org.junit.Assert.assertEquals(
        "expect equals print_margin_top ",
        misthReportRecords[1].getPrintMarginTop(),
        testResult.get(0).getPrintMarginTop(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_bottom ",
        misthReportRecords[1].getPrintMarginBottom(),
        testResult.get(0).getPrintMarginBottom(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_left ",
        misthReportRecords[1].getPrintMarginLeft(),
        testResult.get(0).getPrintMarginLeft(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_right ",
        misthReportRecords[1].getPrintMarginRight(),
        testResult.get(0).getPrintMarginRight(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_orientation ",
        misthReportRecords[1].getPrintOrientation(),
        testResult.get(0).getPrintOrientation(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_paper_size ",
        misthReportRecords[1].getPrintPaperSize(),
        testResult.get(0).getPrintPaperSize(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_scale ",
        misthReportRecords[1].getPrintScale(),
        testResult.get(0).getPrintScale(),
        0.001);
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
  public void testdwMisthReportList() {
    java.util.List<DwMisthReportListDto> testResult =
        dtoDao.dwMisthReportList(misthReportRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descreport ",
        misthReportRecords[1].getDescreport(),
        testResult.get(0).getDescreport());
    org.junit.Assert.assertEquals(
        "expect equals print_margin_top ",
        misthReportRecords[1].getPrintMarginTop(),
        testResult.get(0).getPrintMarginTop(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_bottom ",
        misthReportRecords[1].getPrintMarginBottom(),
        testResult.get(0).getPrintMarginBottom(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_left ",
        misthReportRecords[1].getPrintMarginLeft(),
        testResult.get(0).getPrintMarginLeft(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_right ",
        misthReportRecords[1].getPrintMarginRight(),
        testResult.get(0).getPrintMarginRight(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_orientation ",
        misthReportRecords[1].getPrintOrientation(),
        testResult.get(0).getPrintOrientation(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_paper_size ",
        misthReportRecords[1].getPrintPaperSize(),
        testResult.get(0).getPrintPaperSize(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_scale ",
        misthReportRecords[1].getPrintScale(),
        testResult.get(0).getPrintScale(),
        0.001);
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
  public void testdwMisthReportForm() {
    java.util.List<DwMisthReportFormDto> testResult =
        dtoDao.dwMisthReportForm(
            misthReportRecords[1].getKodreport(), misthReportRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descreport ",
        misthReportRecords[1].getDescreport(),
        testResult.get(0).getDescreport());
    org.junit.Assert.assertEquals(
        "expect equals print_margin_top ",
        misthReportRecords[1].getPrintMarginTop(),
        testResult.get(0).getPrintMarginTop(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_bottom ",
        misthReportRecords[1].getPrintMarginBottom(),
        testResult.get(0).getPrintMarginBottom(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_left ",
        misthReportRecords[1].getPrintMarginLeft(),
        testResult.get(0).getPrintMarginLeft(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_margin_right ",
        misthReportRecords[1].getPrintMarginRight(),
        testResult.get(0).getPrintMarginRight(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_orientation ",
        misthReportRecords[1].getPrintOrientation(),
        testResult.get(0).getPrintOrientation(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_paper_size ",
        misthReportRecords[1].getPrintPaperSize(),
        testResult.get(0).getPrintPaperSize(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals print_scale ",
        misthReportRecords[1].getPrintScale(),
        testResult.get(0).getPrintScale(),
        0.001);
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
  public void testpickMisthReportXrisi() {
    java.util.List<PickMisthReportXrisiDto> testResult =
        dtoDao.pickMisthReportXrisi(misthReportRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals descreport ",
        misthReportRecords[1].getDescreport(),
        testResult.get(0).getDescreport());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
  }
}
