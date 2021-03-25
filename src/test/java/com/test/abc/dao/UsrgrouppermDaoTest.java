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
import com.test.abc.entity.Usrgroupperm;
import com.test.abc.utils.FileUtils;

public class UsrgrouppermDaoTest {
  static final String inputFile = "Usrgroupperm.json";
  static UsrgrouppermDao dao;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();
  private Usrgroupperm[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultUsrgrouppermDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Usrgroupperm[].class);
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testSelect() {
    Usrgroupperm testResult = dao.find(records[1].getKodgroup());
    java.util.List<Usrgroupperm> all = dao.selectAll();
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertFalse(all.isEmpty());
    org.junit.Assert.assertTrue(
        "expect equals openlist ", this.records[1].getOpenlist() == testResult.getOpenlist());
    org.junit.Assert.assertTrue(
        "expect equals editrec ", this.records[1].getEditrec() == testResult.getEditrec());
    org.junit.Assert.assertTrue(
        "expect equals addrec ", this.records[1].getAddrec() == testResult.getAddrec());
    org.junit.Assert.assertTrue(
        "expect equals delrec ", this.records[1].getDelrec() == testResult.getDelrec());
    org.junit.Assert.assertEquals(
        "expect equals kodaction ", this.records[1].getKodaction(), testResult.getKodaction());
    org.junit.Assert.assertTrue(
        "expect equals openform ", this.records[1].getOpenform() == testResult.getOpenform());
  }
}
