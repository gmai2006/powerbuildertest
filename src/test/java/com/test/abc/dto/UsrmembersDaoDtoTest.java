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
import com.test.abc.entity.Usrmembers;
import com.test.abc.entity.Usrgroups;
import com.test.abc.dto.DwUsrmembersUserListDto;
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

public class UsrmembersDaoDtoTest {
  static UsrmembersDtoDao dtoDao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  static final String usrmembersInputFile = "Usrmembers.json";
  static final String usrgroupsInputFile = "Usrgroups.json";
  static UsrmembersDao usrmembersDao;
  private static Usrmembers[] usrmembersRecords;
  static UsrgroupsDao usrgroupsDao;
  private static Usrgroups[] usrgroupsRecords;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    usrmembersDao = new DefaultUsrmembersDao(jpa);
    usrgroupsDao = new DefaultUsrgroupsDao(jpa);
    dtoDao = new DefaultUsrmembersDtoDao(jpa);
    try {
      String json = null;
      json = FileUtils.readFileFromResource2String(usrmembersInputFile, Charset.defaultCharset());
      usrmembersRecords = gson.fromJson(json, Usrmembers[].class);
      json = FileUtils.readFileFromResource2String(usrgroupsInputFile, Charset.defaultCharset());
      usrgroupsRecords = gson.fromJson(json, Usrgroups[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testdwUsrmembersUserList() {
    usrmembersDao.create(usrmembersRecords[1]);
    usrgroupsDao.create(usrgroupsRecords[1]);
    ;
    java.util.List<DwUsrmembersUserListDto> testResult =
        dtoDao.dwUsrmembersUserList(usrmembersRecords[1].getKoduser());
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
        "expect equals descgroup ",
        usrgroupsRecords[1].getDescgroup(),
        testResult.get(0).getDescgroup());
  }
}
