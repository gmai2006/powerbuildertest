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
import com.test.abc.entity.MisthYpal;
import com.test.abc.entity.MisthFyloYpal;
import com.test.abc.dto.PickMisthYpalXrisiDto;
import com.test.abc.dto.DwMisthYpalFormJobDto;
import com.test.abc.dto.DwMisthFyloYpalListDto;
import com.test.abc.dto.DwMisthYpalFormPersonalDto;
import com.test.abc.dto.DwMisthYpalFormGeneralDto;
import com.test.abc.dto.PrnYpalNewklimakioDto;
import com.test.abc.dto.DwMisthYpalNewklimakioDto;
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

public class MisthYpalDaoDtoTest {
  static MisthYpalDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthYpalInputFile = "MisthYpal.json";
  static final String misthFyloYpalInputFile = "MisthFyloYpal.json";
  static MisthYpalDao misthYpalDao;
  private static MisthYpal[] misthYpalRecords;
  static MisthFyloYpalDao misthFyloYpalDao;
  private static MisthFyloYpal[] misthFyloYpalRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthYpalDao = new DefaultMisthYpalDao(jpa);
    misthFyloYpalDao = new DefaultMisthFyloYpalDao(jpa);
    dtoDao = new DefaultMisthYpalDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(misthYpalInputFile, Charset.defaultCharset());
      misthYpalRecords = gson.fromJson(json, MisthYpal[].class);
      json =
          FileUtils.readFileFromResource2String(misthFyloYpalInputFile, Charset.defaultCharset());
      misthFyloYpalRecords = gson.fromJson(json, MisthFyloYpal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testpickMisthYpalXrisi() {
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<PickMisthYpalXrisiDto> testResult =
        dtoDao.pickMisthYpalXrisi(misthYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthYpalRecords[1].getKodxrisi(),
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

  @Test
  public void testdwMisthYpalFormJob() {
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<DwMisthYpalFormJobDto> testResult =
        dtoDao.dwMisthYpalFormJob(
            misthYpalRecords[1].getKodypal(), misthYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthYpalRecords[1].getKodxrisi(),
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
        "expect equals adt ", misthYpalRecords[1].getAdt(), testResult.get(0).getAdt());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", misthYpalRecords[1].getMitroo(), testResult.get(0).getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals afm ", misthYpalRecords[1].getAfm(), testResult.get(0).getAfm());
    org.junit.Assert.assertEquals(
        "expect equals doy ", misthYpalRecords[1].getDoy(), testResult.get(0).getDoy());
    org.junit.Assert.assertEquals(
        "expect equals homephone ",
        misthYpalRecords[1].getHomephone(),
        testResult.get(0).getHomephone());
    org.junit.Assert.assertEquals(
        "expect equals mobilphone ",
        misthYpalRecords[1].getMobilphone(),
        testResult.get(0).getMobilphone());
    org.junit.Assert.assertEquals(
        "expect equals sex ", misthYpalRecords[1].getSex(), testResult.get(0).getSex());
    org.junit.Assert.assertEquals(
        "expect equals spouse ", misthYpalRecords[1].getSpouse(), testResult.get(0).getSpouse());
    org.junit.Assert.assertEquals(
        "expect equals childs ",
        misthYpalRecords[1].getChilds(),
        testResult.get(0).getChilds(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ",
        misthYpalRecords[1].getProstmeli(),
        testResult.get(0).getProstmeli(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals city ", misthYpalRecords[1].getCity(), testResult.get(0).getCity());
    org.junit.Assert.assertEquals(
        "expect equals area ", misthYpalRecords[1].getArea(), testResult.get(0).getArea());
    org.junit.Assert.assertEquals(
        "expect equals address ", misthYpalRecords[1].getAddress(), testResult.get(0).getAddress());
    org.junit.Assert.assertEquals(
        "expect equals tk ", misthYpalRecords[1].getTk(), testResult.get(0).getTk());
    org.junit.Assert.assertEquals(
        "expect equals email ", misthYpalRecords[1].getEmail(), testResult.get(0).getEmail());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ",
        misthYpalRecords[1].getKodtmima(),
        testResult.get(0).getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals kodidikot ",
        misthYpalRecords[1].getKodidikot(),
        testResult.get(0).getKodidikot());
    org.junit.Assert.assertEquals(
        "expect equals jobtitle ",
        misthYpalRecords[1].getJobtitle(),
        testResult.get(0).getJobtitle());
    org.junit.Assert.assertEquals(
        "expect equals termreason ",
        misthYpalRecords[1].getTermreason(),
        testResult.get(0).getTermreason());
    org.junit.Assert.assertEquals(
        "expect equals jobphone ",
        misthYpalRecords[1].getJobphone(),
        testResult.get(0).getJobphone());
    org.junit.Assert.assertEquals(
        "expect equals intphone ",
        misthYpalRecords[1].getIntphone(),
        testResult.get(0).getIntphone());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", misthYpalRecords[1].getBathmos(), testResult.get(0).getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klados ", misthYpalRecords[1].getKlados(), testResult.get(0).getKlados());
    org.junit.Assert.assertEquals(
        "expect equals bank ", misthYpalRecords[1].getBank(), testResult.get(0).getBank());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", misthYpalRecords[1].getBankno(), testResult.get(0).getBankno());
    org.junit.Assert.assertEquals(
        "expect equals kodthesi ",
        misthYpalRecords[1].getKodthesi(),
        testResult.get(0).getKodthesi());
    org.junit.Assert.assertEquals(
        "expect equals kodoikog ",
        misthYpalRecords[1].getKodoikog(),
        testResult.get(0).getKodoikog());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ",
        misthYpalRecords[1].getKodtamio(),
        testResult.get(0).getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals mothername ",
        misthYpalRecords[1].getMothername(),
        testResult.get(0).getMothername());
  }

  @Test
  public void testdwMisthFyloYpalList() {
    misthYpalDao.create(misthYpalRecords[1]);
    misthFyloYpalDao.create(misthFyloYpalRecords[1]);
    ;
    java.util.List<DwMisthFyloYpalListDto> testResult =
        dtoDao.dwMisthFyloYpalList(
            misthFyloYpalRecords[1].getKodfylo(), misthFyloYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfylo ",
        misthFyloYpalRecords[1].getKodfylo(),
        testResult.get(0).getKodfylo());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthFyloYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFyloYpalRecords[1].getKodxrisi(),
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

  @Test
  public void testdwMisthYpalFormPersonal() {
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<DwMisthYpalFormPersonalDto> testResult =
        dtoDao.dwMisthYpalFormPersonal(
            misthYpalRecords[1].getKodypal(), misthYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthYpalRecords[1].getKodxrisi(),
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
        "expect equals adt ", misthYpalRecords[1].getAdt(), testResult.get(0).getAdt());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", misthYpalRecords[1].getMitroo(), testResult.get(0).getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals afm ", misthYpalRecords[1].getAfm(), testResult.get(0).getAfm());
    org.junit.Assert.assertEquals(
        "expect equals doy ", misthYpalRecords[1].getDoy(), testResult.get(0).getDoy());
    org.junit.Assert.assertEquals(
        "expect equals homephone ",
        misthYpalRecords[1].getHomephone(),
        testResult.get(0).getHomephone());
    org.junit.Assert.assertEquals(
        "expect equals mobilphone ",
        misthYpalRecords[1].getMobilphone(),
        testResult.get(0).getMobilphone());
    org.junit.Assert.assertEquals(
        "expect equals sex ", misthYpalRecords[1].getSex(), testResult.get(0).getSex());
    org.junit.Assert.assertEquals(
        "expect equals spouse ", misthYpalRecords[1].getSpouse(), testResult.get(0).getSpouse());
    org.junit.Assert.assertEquals(
        "expect equals childs ",
        misthYpalRecords[1].getChilds(),
        testResult.get(0).getChilds(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ",
        misthYpalRecords[1].getProstmeli(),
        testResult.get(0).getProstmeli(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals city ", misthYpalRecords[1].getCity(), testResult.get(0).getCity());
    org.junit.Assert.assertEquals(
        "expect equals area ", misthYpalRecords[1].getArea(), testResult.get(0).getArea());
    org.junit.Assert.assertEquals(
        "expect equals address ", misthYpalRecords[1].getAddress(), testResult.get(0).getAddress());
    org.junit.Assert.assertEquals(
        "expect equals tk ", misthYpalRecords[1].getTk(), testResult.get(0).getTk());
    org.junit.Assert.assertEquals(
        "expect equals email ", misthYpalRecords[1].getEmail(), testResult.get(0).getEmail());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ",
        misthYpalRecords[1].getKodtmima(),
        testResult.get(0).getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals kodidikot ",
        misthYpalRecords[1].getKodidikot(),
        testResult.get(0).getKodidikot());
    org.junit.Assert.assertEquals(
        "expect equals jobtitle ",
        misthYpalRecords[1].getJobtitle(),
        testResult.get(0).getJobtitle());
    org.junit.Assert.assertEquals(
        "expect equals termreason ",
        misthYpalRecords[1].getTermreason(),
        testResult.get(0).getTermreason());
    org.junit.Assert.assertEquals(
        "expect equals jobphone ",
        misthYpalRecords[1].getJobphone(),
        testResult.get(0).getJobphone());
    org.junit.Assert.assertEquals(
        "expect equals intphone ",
        misthYpalRecords[1].getIntphone(),
        testResult.get(0).getIntphone());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", misthYpalRecords[1].getBathmos(), testResult.get(0).getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klados ", misthYpalRecords[1].getKlados(), testResult.get(0).getKlados());
    org.junit.Assert.assertEquals(
        "expect equals bank ", misthYpalRecords[1].getBank(), testResult.get(0).getBank());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", misthYpalRecords[1].getBankno(), testResult.get(0).getBankno());
    org.junit.Assert.assertEquals(
        "expect equals kodthesi ",
        misthYpalRecords[1].getKodthesi(),
        testResult.get(0).getKodthesi());
    org.junit.Assert.assertEquals(
        "expect equals kodoikog ",
        misthYpalRecords[1].getKodoikog(),
        testResult.get(0).getKodoikog());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ",
        misthYpalRecords[1].getKodtamio(),
        testResult.get(0).getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals mothername ",
        misthYpalRecords[1].getMothername(),
        testResult.get(0).getMothername());
  }

  @Test
  public void testdwMisthYpalFormGeneral() {
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<DwMisthYpalFormGeneralDto> testResult =
        dtoDao.dwMisthYpalFormGeneral(
            misthYpalRecords[1].getKodypal(), misthYpalRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthYpalRecords[1].getKodxrisi(),
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
        "expect equals adt ", misthYpalRecords[1].getAdt(), testResult.get(0).getAdt());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", misthYpalRecords[1].getMitroo(), testResult.get(0).getMitroo());
    org.junit.Assert.assertEquals(
        "expect equals afm ", misthYpalRecords[1].getAfm(), testResult.get(0).getAfm());
    org.junit.Assert.assertEquals(
        "expect equals doy ", misthYpalRecords[1].getDoy(), testResult.get(0).getDoy());
    org.junit.Assert.assertEquals(
        "expect equals homephone ",
        misthYpalRecords[1].getHomephone(),
        testResult.get(0).getHomephone());
    org.junit.Assert.assertEquals(
        "expect equals mobilphone ",
        misthYpalRecords[1].getMobilphone(),
        testResult.get(0).getMobilphone());
    org.junit.Assert.assertEquals(
        "expect equals sex ", misthYpalRecords[1].getSex(), testResult.get(0).getSex());
    org.junit.Assert.assertEquals(
        "expect equals spouse ", misthYpalRecords[1].getSpouse(), testResult.get(0).getSpouse());
    org.junit.Assert.assertEquals(
        "expect equals childs ",
        misthYpalRecords[1].getChilds(),
        testResult.get(0).getChilds(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ",
        misthYpalRecords[1].getProstmeli(),
        testResult.get(0).getProstmeli(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals city ", misthYpalRecords[1].getCity(), testResult.get(0).getCity());
    org.junit.Assert.assertEquals(
        "expect equals area ", misthYpalRecords[1].getArea(), testResult.get(0).getArea());
    org.junit.Assert.assertEquals(
        "expect equals address ", misthYpalRecords[1].getAddress(), testResult.get(0).getAddress());
    org.junit.Assert.assertEquals(
        "expect equals tk ", misthYpalRecords[1].getTk(), testResult.get(0).getTk());
    org.junit.Assert.assertEquals(
        "expect equals email ", misthYpalRecords[1].getEmail(), testResult.get(0).getEmail());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ",
        misthYpalRecords[1].getKodtmima(),
        testResult.get(0).getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals kodidikot ",
        misthYpalRecords[1].getKodidikot(),
        testResult.get(0).getKodidikot());
    org.junit.Assert.assertEquals(
        "expect equals jobtitle ",
        misthYpalRecords[1].getJobtitle(),
        testResult.get(0).getJobtitle());
    org.junit.Assert.assertEquals(
        "expect equals termreason ",
        misthYpalRecords[1].getTermreason(),
        testResult.get(0).getTermreason());
    org.junit.Assert.assertEquals(
        "expect equals jobphone ",
        misthYpalRecords[1].getJobphone(),
        testResult.get(0).getJobphone());
    org.junit.Assert.assertEquals(
        "expect equals intphone ",
        misthYpalRecords[1].getIntphone(),
        testResult.get(0).getIntphone());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", misthYpalRecords[1].getBathmos(), testResult.get(0).getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klados ", misthYpalRecords[1].getKlados(), testResult.get(0).getKlados());
    org.junit.Assert.assertEquals(
        "expect equals bank ", misthYpalRecords[1].getBank(), testResult.get(0).getBank());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", misthYpalRecords[1].getBankno(), testResult.get(0).getBankno());
    org.junit.Assert.assertEquals(
        "expect equals kodthesi ",
        misthYpalRecords[1].getKodthesi(),
        testResult.get(0).getKodthesi());
    org.junit.Assert.assertEquals(
        "expect equals kodoikog ",
        misthYpalRecords[1].getKodoikog(),
        testResult.get(0).getKodoikog());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ",
        misthYpalRecords[1].getKodtamio(),
        testResult.get(0).getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals mothername ",
        misthYpalRecords[1].getMothername(),
        testResult.get(0).getMothername());
  }

  @Test
  public void testprnYpalNewklimakio() {
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<PrnYpalNewklimakioDto> testResult =
        dtoDao.prnYpalNewklimakio(
            misthYpalRecords[1].getKodxrisi(), misthYpalRecords[1].getNewexeldate());
    org.junit.Assert.assertFalse(testResult.isEmpty());
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
    org.junit.Assert.assertEquals(
        "expect equals klados ", misthYpalRecords[1].getKlados(), testResult.get(0).getKlados());
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", misthYpalRecords[1].getBathmos(), testResult.get(0).getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
  }

  @Test
  public void testdwMisthYpalNewklimakio() {
    misthYpalDao.create(misthYpalRecords[1]);
    ;
    java.util.List<DwMisthYpalNewklimakioDto> testResult =
        dtoDao.dwMisthYpalNewklimakio(
            misthYpalRecords[1].getKodxrisi(), misthYpalRecords[1].getExeldate());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodypal ",
        misthYpalRecords[1].getKodypal(),
        testResult.get(0).getKodypal(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthYpalRecords[1].getKodxrisi(),
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
        "expect equals klimakio ",
        misthYpalRecords[1].getKlimakio(),
        testResult.get(0).getKlimakio(),
        0.001);
  }
}
