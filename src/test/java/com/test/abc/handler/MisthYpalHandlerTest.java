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

import com.test.abc.entity.MisthYpal;
import com.test.abc.dao.JpaDao;
import com.test.abc.dao.StandaloneJpaDao;
import com.test.abc.dao.DefaultMisthYpalDao;
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

public class MisthYpalHandlerTest {
  static final String inputFile = "MisthYpal.json";
  static MisthYpalHandler handler;
  private JpaDao jpa;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private MisthYpal[] records;

  /** Run before the test. */
  @Before
  public void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("localpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MisthYpalHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MisthYpal[].class);
    assertEquals("match count", count, records.length);
    MisthYpal testResult = jpa.find(MisthYpal.class, records[0].getKodypal());
    assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
    assertEquals(
        "expect equals kodtmima ", this.records[0].getKodtmima(), testResult.getKodtmima());
    assertEquals(
        "expect equals kodidikot ", this.records[0].getKodidikot(), testResult.getKodidikot());
    assertEquals(
        "expect equals kodthesi ", this.records[0].getKodthesi(), testResult.getKodthesi());
    assertEquals(
        "expect equals kodoikog ", this.records[0].getKodoikog(), testResult.getKodoikog());
    assertEquals(
        "expect equals kodtamio ", this.records[0].getKodtamio(), testResult.getKodtamio());
    assertEquals("expect equals surname ", this.records[0].getSurname(), testResult.getSurname());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals(
        "expect equals fathername ", this.records[0].getFathername(), testResult.getFathername());
    assertEquals("expect equals mitroo ", this.records[0].getMitroo(), testResult.getMitroo());
    assertEquals("expect equals adt ", this.records[0].getAdt(), testResult.getAdt());
    assertEquals("expect equals afm ", this.records[0].getAfm(), testResult.getAfm());
    assertEquals("expect equals doy ", this.records[0].getDoy(), testResult.getDoy());
    assertEquals("expect equals bankno ", this.records[0].getBankno(), testResult.getBankno());
    assertEquals("expect equals bank ", this.records[0].getBank(), testResult.getBank());
    org.junit.Assert.assertEquals(
        "expect equals childs ", this.records[0].getChilds(), testResult.getChilds());
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ", this.records[0].getProstmeli(), testResult.getProstmeli());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ", this.records[0].getKlimakio(), testResult.getKlimakio());
    assertEquals("expect equals bathmos ", this.records[0].getBathmos(), testResult.getBathmos());
    assertEquals("expect equals klados ", this.records[0].getKlados(), testResult.getKlados());
    org.junit.Assert.assertEquals(
        "expect equals birthdate ",
        this.records[0].getBirthdate().getTime(),
        testResult.getBirthdate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals hireddate ",
        this.records[0].getHireddate().getTime(),
        testResult.getHireddate().getTime());
    assertEquals(
        "expect equals homephone ", this.records[0].getHomephone(), testResult.getHomephone());
    assertEquals(
        "expect equals mobilphone ", this.records[0].getMobilphone(), testResult.getMobilphone());
    assertEquals("expect equals sex ", this.records[0].getSex(), testResult.getSex());
    assertEquals("expect equals spouse ", this.records[0].getSpouse(), testResult.getSpouse());
    assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
    assertEquals("expect equals area ", this.records[0].getArea(), testResult.getArea());
    assertEquals("expect equals address ", this.records[0].getAddress(), testResult.getAddress());
    assertEquals("expect equals tk ", this.records[0].getTk(), testResult.getTk());
    assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
    assertEquals(
        "expect equals jobtitle ", this.records[0].getJobtitle(), testResult.getJobtitle());
    org.junit.Assert.assertEquals(
        "expect equals rehireddate ",
        this.records[0].getRehireddate().getTime(),
        testResult.getRehireddate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals termdate ",
        this.records[0].getTermdate().getTime(),
        testResult.getTermdate().getTime());
    assertEquals(
        "expect equals termreason ", this.records[0].getTermreason(), testResult.getTermreason());
    assertEquals(
        "expect equals jobphone ", this.records[0].getJobphone(), testResult.getJobphone());
    assertEquals(
        "expect equals intphone ", this.records[0].getIntphone(), testResult.getIntphone());
    org.junit.Assert.assertEquals(
        "expect equals exeldate ",
        this.records[0].getExeldate().getTime(),
        testResult.getExeldate().getTime());
    assertEquals(
        "expect equals mothername ", this.records[0].getMothername(), testResult.getMothername());
    org.junit.Assert.assertEquals(
        "expect equals newexeldate ",
        this.records[0].getNewexeldate().getTime(),
        testResult.getNewexeldate().getTime());
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
      final MisthYpal[] records = gson.fromJson(json, MisthYpal[].class);
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

  private String createCsvRecord(final MisthYpal record) {
    return TestUtils.getObject(record.getKodypal())
        + ","
        + TestUtils.getObject(record.getKodxrisi())
        + ","
        + TestUtils.getObject(record.getKodtmima())
        + ","
        + TestUtils.getObject(record.getKodidikot())
        + ","
        + TestUtils.getObject(record.getKodthesi())
        + ","
        + TestUtils.getObject(record.getKodoikog())
        + ","
        + TestUtils.getObject(record.getKodtamio())
        + ","
        + TestUtils.getObject(record.getSurname())
        + ","
        + TestUtils.getObject(record.getName())
        + ","
        + TestUtils.getObject(record.getFathername())
        + ","
        + TestUtils.getObject(record.getMitroo())
        + ","
        + TestUtils.getObject(record.getAdt())
        + ","
        + TestUtils.getObject(record.getAfm())
        + ","
        + TestUtils.getObject(record.getDoy())
        + ","
        + TestUtils.getObject(record.getBankno())
        + ","
        + TestUtils.getObject(record.getBank())
        + ","
        + TestUtils.getObject(record.getChilds())
        + ","
        + TestUtils.getObject(record.getProstmeli())
        + ","
        + TestUtils.getObject(record.getKlimakio())
        + ","
        + TestUtils.getObject(record.getBathmos())
        + ","
        + TestUtils.getObject(record.getKlados())
        + ","
        + TestUtils.getDateObject(record.getBirthdate())
        + ","
        + TestUtils.getDateObject(record.getHireddate())
        + ","
        + TestUtils.getObject(record.getHomephone())
        + ","
        + TestUtils.getObject(record.getMobilphone())
        + ","
        + TestUtils.getObject(record.getSex())
        + ","
        + TestUtils.getObject(record.getSpouse())
        + ","
        + TestUtils.getObject(record.getCity())
        + ","
        + TestUtils.getObject(record.getArea())
        + ","
        + TestUtils.getObject(record.getAddress())
        + ","
        + TestUtils.getObject(record.getTk())
        + ","
        + TestUtils.getObject(record.getEmail())
        + ","
        + TestUtils.getObject(record.getJobtitle())
        + ","
        + TestUtils.getDateObject(record.getRehireddate())
        + ","
        + TestUtils.getDateObject(record.getTermdate())
        + ","
        + TestUtils.getObject(record.getTermreason())
        + ","
        + TestUtils.getObject(record.getJobphone())
        + ","
        + TestUtils.getObject(record.getIntphone())
        + ","
        + TestUtils.getDateObject(record.getExeldate())
        + ","
        + TestUtils.getObject(record.getMothername())
        + ","
        + TestUtils.getDateObject(record.getNewexeldate());
  }

  private String createHeader(String headerfile) throws IOException {
    String json = FileUtils.readFileFromResource2String(headerfile, Charset.defaultCharset());
    JsonParser parser = new JsonParser();
    JsonObject jsonObject = parser.parse(json).getAsJsonObject();
    return jsonObject.get("header").getAsString();
  }
}
