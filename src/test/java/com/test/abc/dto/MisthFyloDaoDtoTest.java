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
import com.test.abc.entity.MisthFylo;
import com.test.abc.dto.DwMisthFyloFormDto;
import com.test.abc.dto.PickMisthFyloXrisiDto;
import com.test.abc.dto.DwMisthFyloListDto;
import com.test.abc.dto.PickMisthFyloXrisiCheckDto;
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

public class MisthFyloDaoDtoTest {
  static MisthFyloDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthFyloInputFile = "MisthFylo.json";
  static MisthFyloDao misthFyloDao;
  private static MisthFylo[] misthFyloRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthFyloDao = new DefaultMisthFyloDao(jpa);
    dtoDao = new DefaultMisthFyloDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(misthFyloInputFile, Charset.defaultCharset());
      misthFyloRecords = gson.fromJson(json, MisthFylo[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwMisthFyloForm() {
    misthFyloDao.create(misthFyloRecords[1]);
    ;
    java.util.List<DwMisthFyloFormDto> testResult =
        dtoDao.dwMisthFyloForm(misthFyloRecords[1].getKodfylo(), misthFyloRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfylo ", misthFyloRecords[1].getKodfylo(), testResult.get(0).getKodfylo());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFyloRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descfylo ",
        misthFyloRecords[1].getDescfylo(),
        testResult.get(0).getDescfylo());
  }

  @Test
  public void testpickMisthFyloXrisi() {
    misthFyloDao.create(misthFyloRecords[1]);
    ;
    java.util.List<PickMisthFyloXrisiDto> testResult =
        dtoDao.pickMisthFyloXrisi(misthFyloRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfylo ", misthFyloRecords[1].getKodfylo(), testResult.get(0).getKodfylo());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFyloRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descfylo ",
        misthFyloRecords[1].getDescfylo(),
        testResult.get(0).getDescfylo());
  }

  @Test
  public void testdwMisthFyloList() {
    misthFyloDao.create(misthFyloRecords[1]);
    ;
    java.util.List<DwMisthFyloListDto> testResult =
        dtoDao.dwMisthFyloList(misthFyloRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfylo ", misthFyloRecords[1].getKodfylo(), testResult.get(0).getKodfylo());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFyloRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descfylo ",
        misthFyloRecords[1].getDescfylo(),
        testResult.get(0).getDescfylo());
  }

  @Test
  public void testpickMisthFyloXrisiCheck() {
    misthFyloDao.create(misthFyloRecords[1]);
    ;
    java.util.List<PickMisthFyloXrisiCheckDto> testResult =
        dtoDao.pickMisthFyloXrisiCheck(misthFyloRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodfylo ", misthFyloRecords[1].getKodfylo(), testResult.get(0).getKodfylo());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthFyloRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descfylo ",
        misthFyloRecords[1].getDescfylo(),
        testResult.get(0).getDescfylo());
  }
}
