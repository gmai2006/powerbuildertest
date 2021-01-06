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
import com.test.abc.entity.Usruserperm;
import com.test.abc.entity.Usrapps;
import com.test.abc.dto.DwUsruserpermListDto;
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

public class UsruserpermDaoDtoTest {
  static UsruserpermDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String usruserpermInputFile = "Usruserperm.json";
  static final String usrappsInputFile = "Usrapps.json";
  static UsruserpermDao usruserpermDao;
  private static Usruserperm[] usruserpermRecords;
  static UsrappsDao usrappsDao;
  private static Usrapps[] usrappsRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    usruserpermDao = new DefaultUsruserpermDao(jpa);
    usrappsDao = new DefaultUsrappsDao(jpa);
    dtoDao = new DefaultUsruserpermDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(usruserpermInputFile, Charset.defaultCharset());
      usruserpermRecords = gson.fromJson(json, Usruserperm[].class);
      Arrays.stream(usruserpermRecords).skip(1).forEach(o -> usruserpermDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(usrappsInputFile, Charset.defaultCharset());
      usrappsRecords = gson.fromJson(json, Usrapps[].class);
      Arrays.stream(usrappsRecords).skip(1).forEach(o -> usrappsDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwUsruserpermList() {
    java.util.List<DwUsruserpermListDto> testResult =
        dtoDao.dwUsruserpermList(usruserpermRecords[1].getKoduser());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodapp ", usruserpermRecords[1].getKodapp(), testResult.get(0).getKodapp());
    org.junit.Assert.assertEquals(
        "expect equals koduser ",
        usruserpermRecords[1].getKoduser(),
        testResult.get(0).getKoduser(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals enable ",
        usruserpermRecords[1].getEnable(),
        testResult.get(0).getEnable(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descapp ", usrappsRecords[1].getDescapp(), testResult.get(0).getDescapp());
  }
}
