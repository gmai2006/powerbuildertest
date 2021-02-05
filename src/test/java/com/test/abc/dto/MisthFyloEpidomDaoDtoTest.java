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
import com.test.abc.entity.MisthFyloEpidom;
import com.test.abc.dto.DwMisthFyloEpidomListDto;
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

public class MisthFyloEpidomDaoDtoTest {
  static MisthFyloEpidomDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthFyloEpidomInputFile = "MisthFyloEpidom.json";
  static MisthFyloEpidomDao misthFyloEpidomDao;
  private static MisthFyloEpidom[] misthFyloEpidomRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthFyloEpidomDao = new DefaultMisthFyloEpidomDao(jpa);
    dtoDao = new DefaultMisthFyloEpidomDtoDao(jpa);
    try {
      String json = null;
      json =
          FileUtils.readFileFromResource2String(misthFyloEpidomInputFile, Charset.defaultCharset());
      misthFyloEpidomRecords = gson.fromJson(json, MisthFyloEpidom[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthFyloEpidomList() {
    misthFyloEpidomDao.create(misthFyloEpidomRecords[1]);
    ;
    java.util.List<DwMisthFyloEpidomListDto> testResult =
        dtoDao.dwMisthFyloEpidomList(
            misthFyloEpidomRecords[1].getKodfylo(), misthFyloEpidomRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfylo ",
        misthFyloEpidomRecords[1].getKodfylo(),
        testResult.get(0).getKodfylo());
    org.junit.Assert.assertEquals(
        "expect equals kodepidom ",
        misthFyloEpidomRecords[1].getKodepidom(),
        testResult.get(0).getKodepidom());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFyloEpidomRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals expr ", misthFyloEpidomRecords[1].getExpr(), testResult.get(0).getExpr());
    org.junit.Assert.assertEquals(
        "expect equals aa ", misthFyloEpidomRecords[1].getAa(), testResult.get(0).getAa(), 0.001);
    org.junit.Assert.assertEquals(
        "expect equals notes ", misthFyloEpidomRecords[1].getNotes(), testResult.get(0).getNotes());
  }
}
