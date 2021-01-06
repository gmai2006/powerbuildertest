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
import com.test.abc.entity.MisthZpoikog;
import com.test.abc.dto.DwMisthZpoikogListDto;
import com.test.abc.dto.PickMisthZpoikogXrisiDto;
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

public class MisthZpoikogDaoDtoTest {
  static MisthZpoikogDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZpoikogInputFile = "MisthZpoikog.json";
  static MisthZpoikogDao misthZpoikogDao;
  private static MisthZpoikog[] misthZpoikogRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZpoikogDao = new DefaultMisthZpoikogDao(jpa);
    dtoDao = new DefaultMisthZpoikogDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(misthZpoikogInputFile, Charset.defaultCharset());
      misthZpoikogRecords = gson.fromJson(json, MisthZpoikog[].class);
      Arrays.stream(misthZpoikogRecords).skip(1).forEach(o -> misthZpoikogDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthZpoikogList() {
    java.util.List<DwMisthZpoikogListDto> testResult =
        dtoDao.dwMisthZpoikogList(misthZpoikogRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodoikog ",
        misthZpoikogRecords[1].getKodoikog(),
        testResult.get(0).getKodoikog());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpoikogRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descoikog ",
        misthZpoikogRecords[1].getDescoikog(),
        testResult.get(0).getDescoikog());
  }

  @Test
  public void testpickMisthZpoikogXrisi() {
    java.util.List<PickMisthZpoikogXrisiDto> testResult =
        dtoDao.pickMisthZpoikogXrisi(misthZpoikogRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodoikog ",
        misthZpoikogRecords[1].getKodoikog(),
        testResult.get(0).getKodoikog());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpoikogRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descoikog ",
        misthZpoikogRecords[1].getDescoikog(),
        testResult.get(0).getDescoikog());
  }
}
