/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
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
import com.test.abc.entity.Usruserperm;
import com.test.abc.entity.Usrapps;
import com.test.abc.dto.DwUsruserpermListDto;
import com.test.abc.utils.FileUtils;

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
      String json;
      json = FileUtils.readFileFromResource2String(usruserpermInputFile, Charset.defaultCharset());
      usruserpermRecords = gson.fromJson(json, Usruserperm[].class);
      json = FileUtils.readFileFromResource2String(usrappsInputFile, Charset.defaultCharset());
      usrappsRecords = gson.fromJson(json, Usrapps[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwUsruserpermList() {
    usruserpermDao.create(usruserpermRecords[1]);
    usrappsDao.create(usrappsRecords[1]);
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
