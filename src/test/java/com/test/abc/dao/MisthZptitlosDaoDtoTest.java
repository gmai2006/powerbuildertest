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
import com.test.abc.entity.MisthZptitlos;
import com.test.abc.dto.PickMisthZptitlosXrisiDto;
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

public class MisthZptitlosDaoDtoTest {
  static MisthZptitlosDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZptitlosInputFile = "MisthZptitlos.json";
  static MisthZptitlosDao misthZptitlosDao;
  private static MisthZptitlos[] misthZptitlosRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZptitlosDao = new DefaultMisthZptitlosDao(jpa);
    dtoDao = new DefaultMisthZptitlosDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(misthZptitlosInputFile, Charset.defaultCharset());
      misthZptitlosRecords = gson.fromJson(json, MisthZptitlos[].class);
      Arrays.stream(misthZptitlosRecords).skip(1).forEach(o -> misthZptitlosDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testpickMisthZptitlosXrisi() {
    java.util.List<PickMisthZptitlosXrisiDto> testResult =
        dtoDao.pickMisthZptitlosXrisi(misthZptitlosRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodtitlos ",
        misthZptitlosRecords[1].getKodtitlos(),
        testResult.get(0).getKodtitlos());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZptitlosRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals desctitlos ",
        misthZptitlosRecords[1].getDesctitlos(),
        testResult.get(0).getDesctitlos());
  }
}
