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

package com.test.abc.handler;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Set;

import com.test.abc.entity.MisthReport;
import com.test.abc.dao.JpaDao;
import com.test.abc.dao.StandaloneJpaDao;
import com.test.abc.dao.DefaultMisthReportDao;
import com.test.abc.utils.DelimiterParser;
import com.test.abc.utils.FileUtils;
import com.test.abc.utils.TestUtils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

public class MisthReportHandlerTest {
  static final String inputFile = "MisthReport.json";
  static MisthReportHandler handler;
  private JpaDao jpa;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private MisthReport[] records;

  /** Run before the test. */
  @Before
  public void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("localpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MisthReportHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MisthReport[].class);
    assertEquals("match count", count, records.length);
    MisthReport testResult = jpa.find(MisthReport.class, records[0].getKodreport());
    assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
    assertEquals(
        "expect equals descreport ", this.records[0].getDescreport(), testResult.getDescreport());
    org.junit.Assert.assertEquals(
        "expect equals printMarginTop ",
        this.records[0].getPrintMarginTop(),
        testResult.getPrintMarginTop());
    org.junit.Assert.assertEquals(
        "expect equals printMarginBottom ",
        this.records[0].getPrintMarginBottom(),
        testResult.getPrintMarginBottom());
    org.junit.Assert.assertEquals(
        "expect equals printMarginLeft ",
        this.records[0].getPrintMarginLeft(),
        testResult.getPrintMarginLeft());
    org.junit.Assert.assertEquals(
        "expect equals printMarginRight ",
        this.records[0].getPrintMarginRight(),
        testResult.getPrintMarginRight());
    org.junit.Assert.assertEquals(
        "expect equals printOrientation ",
        this.records[0].getPrintOrientation(),
        testResult.getPrintOrientation());
    org.junit.Assert.assertEquals(
        "expect equals printPaperSize ",
        this.records[0].getPrintPaperSize(),
        testResult.getPrintPaperSize());
    org.junit.Assert.assertEquals(
        "expect equals printScale ", this.records[0].getPrintScale(), testResult.getPrintScale());
    assertEquals(
        "expect equals subtitle ", this.records[0].getSubtitle(), testResult.getSubtitle());
    assertEquals(
        "expect equals prnNotes1 ", this.records[0].getPrnNotes1(), testResult.getPrnNotes1());
    assertEquals(
        "expect equals prnNotes2 ", this.records[0].getPrnNotes2(), testResult.getPrnNotes2());
  }

  /**
   * Construct a delimiter file from a json file.
   *
   * @param inputFile the json file.
   * @param charset default charset.
   * @return
   */
  private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
    try {
      final File tempFile = File.createTempFile(inputFile, ".txt");
      tempFile.deleteOnExit();
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      final MisthReport[] records = gson.fromJson(json, MisthReport[].class);
      String header =
          createHeader(
              Paths.get(inputFile.substring(0, inputFile.length() - 5) + "header.json").toString());
      final List<String> result = new ArrayList<>();
      result.add(header);

      final List<String> data =
          Arrays.stream(records)
              .map(record -> createCsvRecord(record))
              .collect(Collectors.toList());

      result.addAll(data);
      FileUtils.writeListOfStringToFile(tempFile, result);
      return tempFile;
    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }
  }

  private String createCsvRecord(final MisthReport record) {
    return TestUtils.getObject(record.getKodreport())
        + ","
        + TestUtils.getObject(record.getKodxrisi())
        + ","
        + TestUtils.getObject(record.getDescreport())
        + ","
        + TestUtils.getObject(record.getPrintMarginTop())
        + ","
        + TestUtils.getObject(record.getPrintMarginBottom())
        + ","
        + TestUtils.getObject(record.getPrintMarginLeft())
        + ","
        + TestUtils.getObject(record.getPrintMarginRight())
        + ","
        + TestUtils.getObject(record.getPrintOrientation())
        + ","
        + TestUtils.getObject(record.getPrintPaperSize())
        + ","
        + TestUtils.getObject(record.getPrintScale())
        + ","
        + TestUtils.getObject(record.getSubtitle())
        + ","
        + TestUtils.getObject(record.getPrnNotes1())
        + ","
        + TestUtils.getObject(record.getPrnNotes2());
  }

  private String createHeader(String headerfile) throws IOException {
    String json = FileUtils.readFileFromResource2String(headerfile, Charset.defaultCharset());
    JsonParser parser = new JsonParser();
    JsonObject jsonObject = parser.parse(json).getAsJsonObject();
    return jsonObject.get("header").getAsString();
  }
}
