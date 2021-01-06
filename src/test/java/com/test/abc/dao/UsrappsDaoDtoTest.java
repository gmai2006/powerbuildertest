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
import com.test.abc.entity.Usrapps;
import com.test.abc.entity.Usractions;
import com.test.abc.dto.DwUsrappsListDto;
import com.test.abc.dto.DwUsractionsListDto;
import com.test.abc.dto.PickUsrappsDto;
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

public class UsrappsDaoDtoTest {
  static UsrappsDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String usrappsInputFile = "Usrapps.json";
  static final String usractionsInputFile = "Usractions.json";
  static UsrappsDao usrappsDao;
  private static Usrapps[] usrappsRecords;
  static UsractionsDao usractionsDao;
  private static Usractions[] usractionsRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    usrappsDao = new DefaultUsrappsDao(jpa);
    usractionsDao = new DefaultUsractionsDao(jpa);
    dtoDao = new DefaultUsrappsDtoDao(jpa);

    try {
      String json =
          FileUtils.readFileFromResource2String(usrappsInputFile, Charset.defaultCharset());
      usrappsRecords = gson.fromJson(json, Usrapps[].class);
      Arrays.stream(usrappsRecords).skip(1).forEach(o -> usrappsDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    try {
      String json =
          FileUtils.readFileFromResource2String(usractionsInputFile, Charset.defaultCharset());
      usractionsRecords = gson.fromJson(json, Usractions[].class);
      Arrays.stream(usractionsRecords).skip(1).forEach(o -> usractionsDao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwUsrappsList() {
    java.util.List<DwUsrappsListDto> testResult = dtoDao.dwUsrappsList();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodapp ", usrappsRecords[1].getKodapp(), testResult.get(0).getKodapp());
    org.junit.Assert.assertEquals(
        "expect equals descapp ", usrappsRecords[1].getDescapp(), testResult.get(0).getDescapp());
  }

  @Test
  public void testdwUsractionsList() {
    java.util.List<DwUsractionsListDto> testResult = dtoDao.dwUsractionsList();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodaction ",
        usractionsRecords[1].getKodaction(),
        testResult.get(0).getKodaction());
    org.junit.Assert.assertEquals(
        "expect equals kodapp ", usractionsRecords[1].getKodapp(), testResult.get(0).getKodapp());
    org.junit.Assert.assertEquals(
        "expect equals descaction ",
        usractionsRecords[1].getDescaction(),
        testResult.get(0).getDescaction());
    org.junit.Assert.assertEquals(
        "expect equals descapp ", usrappsRecords[1].getDescapp(), testResult.get(0).getDescapp());
  }

  @Test
  public void testpickUsrapps() {
    java.util.List<PickUsrappsDto> testResult = dtoDao.pickUsrapps();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodapp ", usrappsRecords[1].getKodapp(), testResult.get(0).getKodapp());
    org.junit.Assert.assertEquals(
        "expect equals descapp ", usrappsRecords[1].getDescapp(), testResult.get(0).getDescapp());
  }
}
