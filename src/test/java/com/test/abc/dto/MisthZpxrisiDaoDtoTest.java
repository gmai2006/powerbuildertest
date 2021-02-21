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
import com.test.abc.entity.MisthZpxrisi;
import com.test.abc.dto.PickZpxrisiNocurrentDto;
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

public class MisthZpxrisiDaoDtoTest {
  static MisthZpxrisiDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String misthZpxrisiInputFile = "MisthZpxrisi.json";
  static MisthZpxrisiDao misthZpxrisiDao;
  private static MisthZpxrisi[] misthZpxrisiRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    misthZpxrisiDao = new DefaultMisthZpxrisiDao(jpa);
    dtoDao = new DefaultMisthZpxrisiDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(misthZpxrisiInputFile, Charset.defaultCharset());
      misthZpxrisiRecords = gson.fromJson(json, MisthZpxrisi[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testpickZpxrisiNocurrent() {
    misthZpxrisiDao.create(misthZpxrisiRecords[1]);
    ;
    java.util.List<PickZpxrisiNocurrentDto> testResult =
        dtoDao.pickZpxrisiNocurrent(misthZpxrisiRecords[1].getKodxrisi());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ",
        misthZpxrisiRecords[1].getKodxrisi(),
        testResult.get(0).getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals descxrisi ",
        misthZpxrisiRecords[1].getDescxrisi(),
        testResult.get(0).getDescxrisi());
  }
}
