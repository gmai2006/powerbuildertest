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

import com.test.abc.entity.MisthReportCols;
import com.test.abc.dao.JpaDao;
import com.test.abc.dao.StandaloneJpaDao;
import com.test.abc.dao.DefaultMisthReportColsDao;
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

public class MisthReportColsHandlerTest {
  static final String inputFile = "MisthReportCols.json";
  static MisthReportColsHandler handler;
  private JpaDao jpa;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private MisthReportCols[] records;

  /** Run before the test. */
  @Before
  public void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("localpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MisthReportColsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MisthReportCols[].class);
    assertEquals("match count", count, records.length);
    MisthReportCols testResult = jpa.find(MisthReportCols.class, records[0].getId());
    assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals kodcol ", this.records[0].getKodcol(), testResult.getKodcol());
    assertEquals("expect equals expr ", this.records[0].getExpr(), testResult.getExpr());
    assertEquals(
        "expect equals headerText ", this.records[0].getHeaderText(), testResult.getHeaderText());
    org.junit.Assert.assertEquals(
        "expect equals width ", this.records[0].getWidth(), testResult.getWidth());
    org.junit.Assert.assertEquals("expect equals aa ", this.records[0].getAa(), testResult.getAa());
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
      final MisthReportCols[] records = gson.fromJson(json, MisthReportCols[].class);
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

  private String createCsvRecord(final MisthReportCols record) {
    return TestUtils.getObject(record.getId())
        + ","
        + TestUtils.getObject(record.getKodxrisi())
        + ","
        + TestUtils.getObject(record.getKodcol())
        + ","
        + TestUtils.getObject(record.getExpr())
        + ","
        + TestUtils.getObject(record.getHeaderText())
        + ","
        + TestUtils.getObject(record.getWidth())
        + ","
        + TestUtils.getObject(record.getAa());
  }

  private String createHeader(String headerfile) throws IOException {
    String json = FileUtils.readFileFromResource2String(headerfile, Charset.defaultCharset());
    JsonParser parser = new JsonParser();
    JsonObject jsonObject = parser.parse(json).getAsJsonObject();
    return jsonObject.get("header").getAsString();
  }
}