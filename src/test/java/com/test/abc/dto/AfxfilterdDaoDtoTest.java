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
import com.test.abc.entity.Afxfilterd;
import com.test.abc.dto.DwAfxfilterdListDto;
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

public class AfxfilterdDaoDtoTest {
  static AfxfilterdDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String afxfilterdInputFile = "Afxfilterd.json";
  static AfxfilterdDao afxfilterdDao;
  private static Afxfilterd[] afxfilterdRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    afxfilterdDao = new DefaultAfxfilterdDao(jpa);
    dtoDao = new DefaultAfxfilterdDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(afxfilterdInputFile, Charset.defaultCharset());
      afxfilterdRecords = gson.fromJson(json, Afxfilterd[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwAfxfilterdList() {
    afxfilterdDao.create(afxfilterdRecords[1]);
    ;
    java.util.List<DwAfxfilterdListDto> testResult =
        dtoDao.dwAfxfilterdList(afxfilterdRecords[1].getKodfilter());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfilterd ",
        afxfilterdRecords[1].getKodfilterd(),
        testResult.get(0).getKodfilterd(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodfilter ",
        afxfilterdRecords[1].getKodfilter(),
        testResult.get(0).getKodfilter(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals pedio ", afxfilterdRecords[1].getPedio(), testResult.get(0).getPedio());
    org.junit.Assert.assertEquals(
        "expect equals telestis ",
        afxfilterdRecords[1].getTelestis(),
        testResult.get(0).getTelestis());
    org.junit.Assert.assertEquals(
        "expect equals timi ", afxfilterdRecords[1].getTimi(), testResult.get(0).getTimi());
    org.junit.Assert.assertEquals(
        "expect equals joint ", afxfilterdRecords[1].getJoint(), testResult.get(0).getJoint());
  }
}
