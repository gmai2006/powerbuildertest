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
import com.test.abc.entity.MisthYpal;
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

public class MisthYpalDaoTest {
  static final String inputFile = "MisthYpal.json";
  static MisthYpalDao dao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private MisthYpal[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultMisthYpalDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthYpal[].class);
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testSelect() {
    MisthYpal testResult = dao.find(records[1].getKodypal());
    java.util.List<MisthYpal> all = dao.selectAll();
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertFalse(all.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ", this.records[1].getKodxrisi(), testResult.getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ", this.records[1].getKodtmima(), testResult.getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals kodidikot ", this.records[1].getKodidikot(), testResult.getKodidikot());
    org.junit.Assert.assertEquals(
        "expect equals kodthesi ", this.records[1].getKodthesi(), testResult.getKodthesi());
    org.junit.Assert.assertEquals(
        "expect equals kodoikog ", this.records[1].getKodoikog(), testResult.getKodoikog());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ", this.records[1].getKodtamio(), testResult.getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals surname ", this.records[1].getSurname(), testResult.getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", this.records[1].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ", this.records[1].getFathername(), testResult.getFathername());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", this.records[1].getMitroo(), testResult.getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals adt ", this.records[1].getAdt(), testResult.getAdt());
    org.junit.Assert.assertEquals(
        "expect equals afm ", this.records[1].getAfm(), testResult.getAfm());
    org.junit.Assert.assertEquals(
        "expect equals doy ", this.records[1].getDoy(), testResult.getDoy());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", this.records[1].getBankno(), testResult.getBankno());
    org.junit.Assert.assertEquals(
        "expect equals bank ", this.records[1].getBank(), testResult.getBank());
    org.junit.Assert.assertTrue(
        "expect equals childs ", this.records[1].getChilds() == testResult.getChilds());
    org.junit.Assert.assertTrue(
        "expect equals prostmeli ", this.records[1].getProstmeli() == testResult.getProstmeli());
    org.junit.Assert.assertTrue(
        "expect equals klimakio ", this.records[1].getKlimakio() == testResult.getKlimakio());
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", this.records[1].getBathmos(), testResult.getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klados ", this.records[1].getKlados(), testResult.getKlados());
    org.junit.Assert.assertTrue(
        "expect equals birthdate ",
        this.records[1].getBirthdate().getTime() == testResult.getBirthdate().getTime());
    org.junit.Assert.assertTrue(
        "expect equals hireddate ",
        this.records[1].getHireddate().getTime() == testResult.getHireddate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals homephone ", this.records[1].getHomephone(), testResult.getHomephone());
    org.junit.Assert.assertEquals(
        "expect equals mobilphone ", this.records[1].getMobilphone(), testResult.getMobilphone());
    org.junit.Assert.assertEquals(
        "expect equals sex ", this.records[1].getSex(), testResult.getSex());
    org.junit.Assert.assertEquals(
        "expect equals spouse ", this.records[1].getSpouse(), testResult.getSpouse());
    org.junit.Assert.assertEquals(
        "expect equals city ", this.records[1].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals area ", this.records[1].getArea(), testResult.getArea());
    org.junit.Assert.assertEquals(
        "expect equals address ", this.records[1].getAddress(), testResult.getAddress());
    org.junit.Assert.assertEquals("expect equals tk ", this.records[1].getTk(), testResult.getTk());
    org.junit.Assert.assertEquals(
        "expect equals email ", this.records[1].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals jobtitle ", this.records[1].getJobtitle(), testResult.getJobtitle());
    org.junit.Assert.assertTrue(
        "expect equals rehireddate ",
        this.records[1].getRehireddate().getTime() == testResult.getRehireddate().getTime());
    org.junit.Assert.assertTrue(
        "expect equals termdate ",
        this.records[1].getTermdate().getTime() == testResult.getTermdate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals termreason ", this.records[1].getTermreason(), testResult.getTermreason());
    org.junit.Assert.assertEquals(
        "expect equals jobphone ", this.records[1].getJobphone(), testResult.getJobphone());
    org.junit.Assert.assertEquals(
        "expect equals intphone ", this.records[1].getIntphone(), testResult.getIntphone());
    org.junit.Assert.assertTrue(
        "expect equals exeldate ",
        this.records[1].getExeldate().getTime() == testResult.getExeldate().getTime());
    org.junit.Assert.assertEquals(
        "expect equals mothername ", this.records[1].getMothername(), testResult.getMothername());
    org.junit.Assert.assertTrue(
        "expect equals newexeldate ",
        this.records[1].getNewexeldate().getTime() == testResult.getNewexeldate().getTime());
  }
}
