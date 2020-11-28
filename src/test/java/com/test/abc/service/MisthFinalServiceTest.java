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

package com.test.abc.service;

import com.test.abc.entity.MisthFinal;
import com.test.abc.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MisthFinalServiceTest {
  private static DefaultMisthFinalService serviceMock;
  private static MisthFinal[] records;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMisthFinalService.class);
    String inputFile = "MisthFinal.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthFinal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    MisthFinal testResult = serviceMock.find(records[0].getId());
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
    org.junit.Assert.assertEquals(
        "expect equals kodkat ", this.records[0].getKodkat(), testResult.getKodkat());
    org.junit.Assert.assertEquals(
        "expect equals kodperiod ", this.records[0].getKodperiod(), testResult.getKodperiod());
    org.junit.Assert.assertTrue("expect equals aa ", this.records[0].getAa() == testResult.getAa());
    org.junit.Assert.assertEquals(
        "expect equals descfinal ", this.records[0].getDescfinal(), testResult.getDescfinal());
    org.junit.Assert.assertEquals(
        "expect equals datefinal ",
        this.records[0].getDatefinal().getTime(),
        testResult.getDatefinal().getTime());
    org.junit.Assert.assertEquals(
        "expect equals title ", this.records[0].getTitle(), testResult.getTitle());
  }
}
