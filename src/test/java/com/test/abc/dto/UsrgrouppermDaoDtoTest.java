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
import com.test.abc.entity.Usrgroupperm;
import com.test.abc.entity.Usrapps;
import com.test.abc.entity.Usractions;
import com.test.abc.dto.DwUsrgrouppermListDto;
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

public class UsrgrouppermDaoDtoTest {
  static UsrgrouppermDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String usrgrouppermInputFile = "Usrgroupperm.json";
  static final String usrappsInputFile = "Usrapps.json";
  static final String usractionsInputFile = "Usractions.json";
  static UsrgrouppermDao usrgrouppermDao;
  private static Usrgroupperm[] usrgrouppermRecords;
  static UsrappsDao usrappsDao;
  private static Usrapps[] usrappsRecords;
  static UsractionsDao usractionsDao;
  private static Usractions[] usractionsRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    usrgrouppermDao = new DefaultUsrgrouppermDao(jpa);
    usrappsDao = new DefaultUsrappsDao(jpa);
    usractionsDao = new DefaultUsractionsDao(jpa);
    dtoDao = new DefaultUsrgrouppermDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(usrgrouppermInputFile, Charset.defaultCharset());
      usrgrouppermRecords = gson.fromJson(json, Usrgroupperm[].class);
      json = FileUtils.readFileFromResource2String(usrappsInputFile, Charset.defaultCharset());
      usrappsRecords = gson.fromJson(json, Usrapps[].class);
      json = FileUtils.readFileFromResource2String(usractionsInputFile, Charset.defaultCharset());
      usractionsRecords = gson.fromJson(json, Usractions[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwUsrgrouppermList() {
    usrgrouppermDao.create(usrgrouppermRecords[1]);
    usrappsDao.create(usrappsRecords[1]);
    usractionsDao.create(usractionsRecords[1]);
    ;
    java.util.List<DwUsrgrouppermListDto> testResult =
        dtoDao.dwUsrgrouppermList(usrgrouppermRecords[1].getKodgroup());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodgroup ",
        usrgrouppermRecords[1].getKodgroup(),
        testResult.get(0).getKodgroup(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals kodaction ",
        usrgrouppermRecords[1].getKodaction(),
        testResult.get(0).getKodaction());
    org.junit.Assert.assertEquals(
        "expect equals editrec ",
        usrgrouppermRecords[1].getEditrec(),
        testResult.get(0).getEditrec(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals addrec ",
        usrgrouppermRecords[1].getAddrec(),
        testResult.get(0).getAddrec(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals delrec ",
        usrgrouppermRecords[1].getDelrec(),
        testResult.get(0).getDelrec(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals openlist ",
        usrgrouppermRecords[1].getOpenlist(),
        testResult.get(0).getOpenlist(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals openform ",
        usrgrouppermRecords[1].getOpenform(),
        testResult.get(0).getOpenform(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals descapp ", usrappsRecords[1].getDescapp(), testResult.get(0).getDescapp());
    org.junit.Assert.assertEquals(
        "expect equals descaction ",
        usractionsRecords[1].getDescaction(),
        testResult.get(0).getDescaction());
  }
}
