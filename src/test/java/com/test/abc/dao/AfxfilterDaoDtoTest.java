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
import com.test.abc.entity.Afxfilter;
import com.test.abc.dto.DwAfxfilterListDto;
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

public class AfxfilterDaoDtoTest {
  static AfxfilterDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String afxfilterInputFile = "Afxfilter.json";
  static AfxfilterDao afxfilterDao;
  private static Afxfilter[] afxfilterRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    afxfilterDao = new DefaultAfxfilterDao(jpa);
    dtoDao = new DefaultAfxfilterDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(afxfilterInputFile, Charset.defaultCharset());
      afxfilterRecords = gson.fromJson(json, Afxfilter[].class);
      Arrays.stream(afxfilterRecords).skip(1).forEach(o -> afxfilterDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwAfxfilterList() {
    java.util.List<DwAfxfilterListDto> testResult =
        dtoDao.dwAfxfilterList(afxfilterRecords[1].getTablename());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfilter ",
        afxfilterRecords[1].getKodfilter(),
        testResult.get(0).getKodfilter(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descfilter ",
        afxfilterRecords[1].getDescfilter(),
        testResult.get(0).getDescfilter());
    org.junit.Assert.assertEquals(
        "expect equals tablename ",
        afxfilterRecords[1].getTablename(),
        testResult.get(0).getTablename());
  }
}
