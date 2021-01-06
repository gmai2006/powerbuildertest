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

import com.test.abc.entity.MisthFinal;
import com.test.abc.dao.JpaDao;
import com.test.abc.dao.StandaloneJpaDao;
import com.test.abc.dao.DefaultMisthFinalDao;
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

public class MisthFinalHandlerTest {
  static final String inputFile = "MisthFinal.json";
  static MisthFinalHandler handler;
  private JpaDao jpa;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private MisthFinal[] records;

  /** Run before the test. */
  @Before
  public void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("localpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MisthFinalHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MisthFinal[].class);
    assertEquals("match count", count, records.length);
    MisthFinal testResult = jpa.find(MisthFinal.class, records[0].getKodfinal());
    assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
    assertEquals("expect equals kodkat ", this.records[0].getKodkat(), testResult.getKodkat());
    assertEquals(
        "expect equals kodperiod ", this.records[0].getKodperiod(), testResult.getKodperiod());
    org.junit.Assert.assertEquals("expect equals aa ", this.records[0].getAa(), testResult.getAa());
    assertEquals(
        "expect equals descfinal ", this.records[0].getDescfinal(), testResult.getDescfinal());
    org.junit.Assert.assertEquals(
        "expect equals datefinal ",
        this.records[0].getDatefinal().getTime(),
        testResult.getDatefinal().getTime());
    assertEquals("expect equals title ", this.records[0].getTitle(), testResult.getTitle());
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
      final MisthFinal[] records = gson.fromJson(json, MisthFinal[].class);
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

  private String createCsvRecord(final MisthFinal record) {
    return TestUtils.getObject(record.getKodfinal())
        + ","
        + TestUtils.getObject(record.getKodxrisi())
        + ","
        + TestUtils.getObject(record.getKodkat())
        + ","
        + TestUtils.getObject(record.getKodperiod())
        + ","
        + TestUtils.getObject(record.getAa())
        + ","
        + TestUtils.getObject(record.getDescfinal())
        + ","
        + TestUtils.getDateObject(record.getDatefinal())
        + ","
        + TestUtils.getObject(record.getTitle());
  }

  private String createHeader(String headerfile) throws IOException {
    String json = FileUtils.readFileFromResource2String(headerfile, Charset.defaultCharset());
    JsonParser parser = new JsonParser();
    JsonObject jsonObject = parser.parse(json).getAsJsonObject();
    return jsonObject.get("header").getAsString();
  }
}
