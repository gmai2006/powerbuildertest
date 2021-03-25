/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.test.abc.service;

import com.test.abc.entity.MisthYpal;
import com.test.abc.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MisthYpalServiceTest {
  private static DefaultMisthYpalService serviceMock;
  private static MisthYpal[] records;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMisthYpalService.class);
    String inputFile = "MisthYpal.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthYpal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getKodoikog())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    MisthYpal testResult = serviceMock.find(records[0].getKodoikog());
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", this.records[0].getBathmos(), testResult.getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals birthdate ",
        this.records[0].getBirthdate().getTime(),
        testResult.getBirthdate().getTime());
    org.junit.Assert.assertTrue(
        "expect equals klimakio ", this.records[0].getKlimakio() == testResult.getKlimakio());
    org.junit.Assert.assertTrue(
        "expect equals childs ", this.records[0].getChilds() == testResult.getChilds());
    org.junit.Assert.assertEquals(
        "expect equals spouse ", this.records[0].getSpouse(), testResult.getSpouse());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ", this.records[0].getKodtmima(), testResult.getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals bank ", this.records[0].getBank(), testResult.getBank());
    org.junit.Assert.assertEquals(
        "expect equals mobilphone ", this.records[0].getMobilphone(), testResult.getMobilphone());
    org.junit.Assert.assertEquals(
        "expect equals hireddate ",
        this.records[0].getHireddate().getTime(),
        testResult.getHireddate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals kodthesi ", this.records[0].getKodthesi(), testResult.getKodthesi());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", this.records[0].getBankno(), testResult.getBankno());
    org.junit.Assert.assertTrue(
        "expect equals prostmeli ", this.records[0].getProstmeli() == testResult.getProstmeli());
    org.junit.Assert.assertEquals(
        "expect equals rehireddate ",
        this.records[0].getRehireddate().getTime(),
        testResult.getRehireddate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals city ", this.records[0].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals intphone ", this.records[0].getIntphone(), testResult.getIntphone());
    org.junit.Assert.assertEquals(
        "expect equals doy ", this.records[0].getDoy(), testResult.getDoy());
    org.junit.Assert.assertEquals(
        "expect equals surname ", this.records[0].getSurname(), testResult.getSurname());
    org.junit.Assert.assertTrue(
        "expect equals kodypal ", this.records[0].getKodypal() == testResult.getKodypal());
    org.junit.Assert.assertEquals(
        "expect equals email ", this.records[0].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ", this.records[0].getKodtamio(), testResult.getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals address ", this.records[0].getAddress(), testResult.getAddress());
    org.junit.Assert.assertEquals(
        "expect equals jobtitle ", this.records[0].getJobtitle(), testResult.getJobtitle());
    org.junit.Assert.assertEquals(
        "expect equals sex ", this.records[0].getSex(), testResult.getSex());
    org.junit.Assert.assertEquals(
        "expect equals termreason ", this.records[0].getTermreason(), testResult.getTermreason());
    org.junit.Assert.assertEquals(
        "expect equals fathername ", this.records[0].getFathername(), testResult.getFathername());
    org.junit.Assert.assertEquals(
        "expect equals exeldate ",
        this.records[0].getExeldate().getTime(),
        testResult.getExeldate().getTime());
    org.junit.Assert.assertEquals("expect equals tk ", this.records[0].getTk(), testResult.getTk());
    org.junit.Assert.assertEquals(
        "expect equals jobphone ", this.records[0].getJobphone(), testResult.getJobphone());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", this.records[0].getMitroo(), testResult.getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals termdate ",
        this.records[0].getTermdate().getTime(),
        testResult.getTermdate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals mothername ", this.records[0].getMothername(), testResult.getMothername());
    org.junit.Assert.assertEquals(
        "expect equals klados ", this.records[0].getKlados(), testResult.getKlados());
    org.junit.Assert.assertEquals(
        "expect equals area ", this.records[0].getArea(), testResult.getArea());
    org.junit.Assert.assertEquals(
        "expect equals newexeldate ",
        this.records[0].getNewexeldate().getTime(),
        testResult.getNewexeldate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals kodidikot ", this.records[0].getKodidikot(), testResult.getKodidikot());
    org.junit.Assert.assertEquals(
        "expect equals adt ", this.records[0].getAdt(), testResult.getAdt());
    org.junit.Assert.assertEquals(
        "expect equals name ", this.records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals homephone ", this.records[0].getHomephone(), testResult.getHomephone());
    org.junit.Assert.assertEquals(
        "expect equals afm ", this.records[0].getAfm(), testResult.getAfm());
  }
}
