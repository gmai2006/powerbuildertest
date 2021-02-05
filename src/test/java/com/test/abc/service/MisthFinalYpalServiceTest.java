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

import com.test.abc.entity.MisthFinalYpal;
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

public class MisthFinalYpalServiceTest {
  private static DefaultMisthFinalYpalService serviceMock;
  private static MisthFinalYpal[] records;
  static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMisthFinalYpalService.class);
    String inputFile = "MisthFinalYpal.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthFinalYpal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getKodypal())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    MisthFinalYpal testResult = serviceMock.find(records[0].getKodypal());
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals plirdate ",
        this.records[0].getPlirdate().getTime(),
        testResult.getPlirdate().getTime());
    org.junit.Assert.assertTrue(
        "expect equals kodfinal ", this.records[0].getKodfinal() == testResult.getKodfinal());
    org.junit.Assert.assertEquals(
        "expect equals kodxrisi ", this.records[0].getKodxrisi(), testResult.getKodxrisi());
  }
}
