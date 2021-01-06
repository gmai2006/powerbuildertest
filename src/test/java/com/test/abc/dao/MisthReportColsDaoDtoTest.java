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
import com.test.abc.entity.MisthReportCols;
import com.test.abc.dto.DwMisthReportColsListDto;
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

public class MisthReportColsDaoDtoTest {
  static MisthReportColsDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthReportColsInputFile = "MisthReportCols.json";
  static MisthReportColsDao misthReportColsDao;
  private static MisthReportCols[] misthReportColsRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthReportColsDao = new DefaultMisthReportColsDao(jpa);
    dtoDao = new DefaultMisthReportColsDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(misthReportColsInputFile, Charset.defaultCharset());
      misthReportColsRecords = gson.fromJson(json, MisthReportCols[].class);
      Arrays.stream(misthReportColsRecords).skip(1).forEach(o -> misthReportColsDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthReportColsList() {
    java.util.List<DwMisthReportColsListDto> testResult =
        dtoDao.dwMisthReportColsList(
            misthReportColsRecords[1].getKodreport(), misthReportColsRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodcol ",
        misthReportColsRecords[1].getKodcol(),
        testResult.get(0).getKodcol(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodreport ",
        misthReportColsRecords[1].getKodreport(),
        testResult.get(0).getKodreport());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthReportColsRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals expr ", misthReportColsRecords[1].getExpr(), testResult.get(0).getExpr());
    org.junit.Assert.assertEquals(
        "expect equals header_text ",
        misthReportColsRecords[1].getHeaderText(),
        testResult.get(0).getHeaderText());
    org.junit.Assert.assertEquals(
        "expect equals width ",
        misthReportColsRecords[1].getWidth(),
        testResult.get(0).getWidth(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthReportColsRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
  }
}
