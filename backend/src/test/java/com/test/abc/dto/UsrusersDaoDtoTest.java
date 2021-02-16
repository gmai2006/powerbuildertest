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
import com.test.abc.entity.Usrusers;
import com.test.abc.entity.Usrmembers;
import com.test.abc.dto.PickUsrusersDto;
import com.test.abc.dto.DwUsrusersFormDto;
import com.test.abc.dto.DwUsrmembersGroupListDto;
import com.test.abc.dto.PickUsrusersWithadminDto;
import com.test.abc.dto.DwUsrusersListDto;
import com.test.abc.dto.DwUsrusersAdminFormDto;
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

public class UsrusersDaoDtoTest {
  static UsrusersDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String usrusersInputFile = "Usrusers.json";
  static final String usrmembersInputFile = "Usrmembers.json";
  static UsrusersDao usrusersDao;
  private static Usrusers[] usrusersRecords;
  static UsrmembersDao usrmembersDao;
  private static Usrmembers[] usrmembersRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    usrusersDao = new DefaultUsrusersDao(jpa);
    usrmembersDao = new DefaultUsrmembersDao(jpa);
    dtoDao = new DefaultUsrusersDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(usrusersInputFile, Charset.defaultCharset());
      usrusersRecords = gson.fromJson(json, Usrusers[].class);
      json = FileUtils.readFileFromResource2String(usrmembersInputFile, Charset.defaultCharset());
      usrmembersRecords = gson.fromJson(json, Usrmembers[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testpickUsrusers() {
    usrusersDao.create(usrusersRecords[1]);
    ;
    java.util.List<PickUsrusersDto> testResult = dtoDao.pickUsrusers();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals koduser ",
        usrusersRecords[1].getKoduser(),
        testResult.get(0).getKoduser(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals username ",
        usrusersRecords[1].getUsername(),
        testResult.get(0).getUsername());
  }

  @Test
  public void testdwUsrusersForm() {
    usrusersDao.create(usrusersRecords[1]);
    ;
    java.util.List<DwUsrusersFormDto> testResult =
        dtoDao.dwUsrusersForm(usrusersRecords[1].getKoduser());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals koduser ",
        usrusersRecords[1].getKoduser(),
        testResult.get(0).getKoduser(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals username ",
        usrusersRecords[1].getUsername(),
        testResult.get(0).getUsername());
    org.junit.Assert.assertEquals(
        "expect equals fullname ",
        usrusersRecords[1].getFullname(),
        testResult.get(0).getFullname());
    org.junit.Assert.assertEquals(
        "expect equals password ",
        usrusersRecords[1].getPassword(),
        testResult.get(0).getPassword());
    org.junit.Assert.assertEquals(
        "expect equals isactive ",
        usrusersRecords[1].getIsactive(),
        testResult.get(0).getIsactive(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals tomeas ", usrusersRecords[1].getTomeas(), testResult.get(0).getTomeas());
    org.junit.Assert.assertEquals(
        "expect equals idiotita ",
        usrusersRecords[1].getIdiotita(),
        testResult.get(0).getIdiotita());
  }

  @Test
  public void testdwUsrmembersGroupList() {
    usrusersDao.create(usrusersRecords[1]);
    usrmembersDao.create(usrmembersRecords[1]);
    ;
    java.util.List<DwUsrmembersGroupListDto> testResult =
        dtoDao.dwUsrmembersGroupList(usrmembersRecords[1].getKodgroup());
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals kodgroup ",
        usrmembersRecords[1].getKodgroup(),
        testResult.get(0).getKodgroup(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals koduser ",
        usrmembersRecords[1].getKoduser(),
        testResult.get(0).getKoduser(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals username ",
        usrusersRecords[1].getUsername(),
        testResult.get(0).getUsername());
    org.junit.Assert.assertEquals(
        "expect equals fullname ",
        usrusersRecords[1].getFullname(),
        testResult.get(0).getFullname());
    org.junit.Assert.assertEquals(
        "expect equals isactive ",
        usrusersRecords[1].getIsactive(),
        testResult.get(0).getIsactive(),
        0.001);
  }

  @Test
  public void testpickUsrusersWithadmin() {
    usrusersDao.create(usrusersRecords[1]);
    ;
    java.util.List<PickUsrusersWithadminDto> testResult = dtoDao.pickUsrusersWithadmin();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals koduser ",
        usrusersRecords[1].getKoduser(),
        testResult.get(0).getKoduser(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals username ",
        usrusersRecords[1].getUsername(),
        testResult.get(0).getUsername());
  }

  @Test
  public void testdwUsrusersList() {
    usrusersDao.create(usrusersRecords[1]);
    ;
    java.util.List<DwUsrusersListDto> testResult = dtoDao.dwUsrusersList();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals username ",
        usrusersRecords[1].getUsername(),
        testResult.get(0).getUsername());
    org.junit.Assert.assertEquals(
        "expect equals fullname ",
        usrusersRecords[1].getFullname(),
        testResult.get(0).getFullname());
    org.junit.Assert.assertEquals(
        "expect equals isactive ",
        usrusersRecords[1].getIsactive(),
        testResult.get(0).getIsactive(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals koduser ",
        usrusersRecords[1].getKoduser(),
        testResult.get(0).getKoduser(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals password ",
        usrusersRecords[1].getPassword(),
        testResult.get(0).getPassword());
    org.junit.Assert.assertEquals(
        "expect equals tomeas ", usrusersRecords[1].getTomeas(), testResult.get(0).getTomeas());
    org.junit.Assert.assertEquals(
        "expect equals idiotita ",
        usrusersRecords[1].getIdiotita(),
        testResult.get(0).getIdiotita());
  }

  @Test
  public void testdwUsrusersAdminForm() {
    usrusersDao.create(usrusersRecords[1]);
    ;
    java.util.List<DwUsrusersAdminFormDto> testResult = dtoDao.dwUsrusersAdminForm();
    org.junit.Assert.assertFalse(testResult.isEmpty());
    org.junit.Assert.assertEquals(
        "expect equals koduser ",
        usrusersRecords[1].getKoduser(),
        testResult.get(0).getKoduser(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals username ",
        usrusersRecords[1].getUsername(),
        testResult.get(0).getUsername());
    org.junit.Assert.assertEquals(
        "expect equals fullname ",
        usrusersRecords[1].getFullname(),
        testResult.get(0).getFullname());
    org.junit.Assert.assertEquals(
        "expect equals password ",
        usrusersRecords[1].getPassword(),
        testResult.get(0).getPassword());
    org.junit.Assert.assertEquals(
        "expect equals isactive ",
        usrusersRecords[1].getIsactive(),
        testResult.get(0).getIsactive(),
        0.001);
    org.junit.Assert.assertEquals(
        "expect equals tomeas ", usrusersRecords[1].getTomeas(), testResult.get(0).getTomeas());
    org.junit.Assert.assertEquals(
        "expect equals idiotita ",
        usrusersRecords[1].getIdiotita(),
        testResult.get(0).getIdiotita());
  }
}
