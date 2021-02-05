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
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
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
  private static JpaDao jpa;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private MisthYpal[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
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
    MisthYpal testResult = jpa.find(MisthYpal.class, records[0].getKodoikog());
    assertEquals("expect equals bathmos ", this.records[0].getBathmos(), testResult.getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals birthdate ",
        this.records[0].getBirthdate().getTime(),
        testResult.getBirthdate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ", this.records[0].getKlimakio(), testResult.getKlimakio());
    org.junit.Assert.assertEquals(
        "expect equals childs ", this.records[0].getChilds(), testResult.getChilds());
    assertEquals("expect equals spouse ", this.records[0].getSpouse(), testResult.getSpouse());
    assertEquals(
        "expect equals kodtmima ", this.records[0].getKodtmima(), testResult.getKodtmima());
    assertEquals("expect equals bank ", this.records[0].getBank(), testResult.getBank());
    assertEquals(
        "expect equals mobilphone ", this.records[0].getMobilphone(), testResult.getMobilphone());
    org.junit.Assert.assertEquals(
        "expect equals hireddate ",
        this.records[0].getHireddate().getTime(),
        testResult.getHireddate().getTime());
    assertEquals(
        "expect equals kodthesi ", this.records[0].getKodthesi(), testResult.getKodthesi());
    assertEquals("expect equals bankno ", this.records[0].getBankno(), testResult.getBankno());
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ", this.records[0].getProstmeli(), testResult.getProstmeli());
    org.junit.Assert.assertEquals(
        "expect equals rehireddate ",
        this.records[0].getRehireddate().getTime(),
        testResult.getRehireddate().getTime());
    assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
    assertEquals(
        "expect equals intphone ", this.records[0].getIntphone(), testResult.getIntphone());
    assertEquals("expect equals doy ", this.records[0].getDoy(), testResult.getDoy());
    assertEquals("expect equals surname ", this.records[0].getSurname(), testResult.getSurname());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ", this.records[0].getKodypal(), testResult.getKodypal());
    assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
    assertEquals(
        "expect equals kodtamio ", this.records[0].getKodtamio(), testResult.getKodtamio());
    assertEquals("expect equals address ", this.records[0].getAddress(), testResult.getAddress());
    assertEquals(
        "expect equals jobtitle ", this.records[0].getJobtitle(), testResult.getJobtitle());
    assertEquals("expect equals sex ", this.records[0].getSex(), testResult.getSex());
    assertEquals(
        "expect equals termreason ", this.records[0].getTermreason(), testResult.getTermreason());
    assertEquals(
        "expect equals fathername ", this.records[0].getFathername(), testResult.getFathername());
    org.junit.Assert.assertEquals(
        "expect equals exeldate ",
        this.records[0].getExeldate().getTime(),
        testResult.getExeldate().getTime());
    assertEquals("expect equals tk ", this.records[0].getTk(), testResult.getTk());
    assertEquals(
        "expect equals jobphone ", this.records[0].getJobphone(), testResult.getJobphone());
    assertEquals("expect equals mitroo ", this.records[0].getMitroo(), testResult.getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals termdate ",
        this.records[0].getTermdate().getTime(),
        testResult.getTermdate().getTime());
    assertEquals(
        "expect equals mothername ", this.records[0].getMothername(), testResult.getMothername());
    assertEquals("expect equals klados ", this.records[0].getKlados(), testResult.getKlados());
    assertEquals("expect equals area ", this.records[0].getArea(), testResult.getArea());
    org.junit.Assert.assertEquals(
        "expect equals newexeldate ",
        this.records[0].getNewexeldate().getTime(),
        testResult.getNewexeldate().getTime());
    assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
    assertEquals(
        "expect equals kodidikot ", this.records[0].getKodidikot(), testResult.getKodidikot());
    assertEquals("expect equals adt ", this.records[0].getAdt(), testResult.getAdt());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals(
        "expect equals homephone ", this.records[0].getHomephone(), testResult.getHomephone());
    assertEquals("expect equals afm ", this.records[0].getAfm(), testResult.getAfm());
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
      JSONArray docs = new JSONArray(json);
      String csv = CDL.toString(docs);
      org.apache.commons.io.FileUtils.writeStringToFile(tempFile, csv, Charset.defaultCharset());
      return tempFile;
    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
