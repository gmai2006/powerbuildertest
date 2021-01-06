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

package com.test.abc.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.test.abc.entity.*;

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

public class JsonParserTest {
  @Test
  public void testParsingMisthKratapod() throws IOException {
    String inputFile = "MisthKratapod.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthKratapod> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthKratapod(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodkratapod ",
          o.get("kodkratapod").getAsFloat(),
          result.get(i).getKodkratapod(),
          0.001);

      assertEquals(
          "expect equals desckratapod ",
          o.get("desckratapod").getAsString(),
          result.get(i).getDesckratapod());
    }
  }

  @Test
  public void testParsingMisthZpstath() throws IOException {
    String inputFile = "MisthZpstath.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpstath> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpstath(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodstath ", o.get("kodstath").getAsString(), result.get(i).getKodstath());

      assertEquals(
          "expect equals descstath ",
          o.get("descstath").getAsString(),
          result.get(i).getDescstath());

      assertEquals(
          "expect equals poso ", o.get("poso").getAsInt(), result.get(i).getPoso(), 0.0001);
    }
  }

  @Test
  public void testParsingMisthYpalYvar() throws IOException {
    String inputFile = "MisthYpalYvar.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthYpalYvar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthYpalYvar(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodypal ",
          o.get("kodypal").getAsFloat(),
          result.get(i).getKodypal(),
          0.001);
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodyvar ", o.get("kodyvar").getAsString(), result.get(i).getKodyvar());

      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);

      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
    }
  }

  @Test
  public void testParsingMisthZptmima() throws IOException {
    String inputFile = "MisthZptmima.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZptmima> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZptmima(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodtmima ", o.get("kodtmima").getAsString(), result.get(i).getKodtmima());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals desctmima ",
          o.get("desctmima").getAsString(),
          result.get(i).getDesctmima());
    }
  }

  @Test
  public void testParsingMisthYpal() throws IOException {
    String inputFile = "MisthYpal.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthYpal(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodypal ",
          o.get("kodypal").getAsFloat(),
          result.get(i).getKodypal(),
          0.001);
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodtmima ", o.get("kodtmima").getAsString(), result.get(i).getKodtmima());

      assertEquals(
          "expect equals kodidikot ",
          o.get("kodidikot").getAsString(),
          result.get(i).getKodidikot());

      assertEquals(
          "expect equals kodthesi ", o.get("kodthesi").getAsString(), result.get(i).getKodthesi());

      assertEquals(
          "expect equals kodoikog ", o.get("kodoikog").getAsString(), result.get(i).getKodoikog());

      assertEquals(
          "expect equals kodtamio ", o.get("kodtamio").getAsString(), result.get(i).getKodtamio());

      assertEquals(
          "expect equals surname ", o.get("surname").getAsString(), result.get(i).getSurname());

      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());

      assertEquals(
          "expect equals fathername ",
          o.get("fathername").getAsString(),
          result.get(i).getFathername());

      assertEquals(
          "expect equals mitroo ", o.get("mitroo").getAsString(), result.get(i).getMitroo());

      assertEquals("expect equals adt ", o.get("adt").getAsString(), result.get(i).getAdt());

      assertEquals("expect equals afm ", o.get("afm").getAsString(), result.get(i).getAfm());

      assertEquals("expect equals doy ", o.get("doy").getAsString(), result.get(i).getDoy());

      assertEquals(
          "expect equals bankno ", o.get("bankno").getAsString(), result.get(i).getBankno());

      assertEquals("expect equals bank ", o.get("bank").getAsString(), result.get(i).getBank());

      assertEquals(
          "expect equals childs ", o.get("childs").getAsInt(), result.get(i).getChilds(), 0.0001);

      assertEquals(
          "expect equals prostmeli ",
          o.get("prostmeli").getAsInt(),
          result.get(i).getProstmeli(),
          0.0001);

      assertEquals(
          "expect equals klimakio ",
          o.get("klimakio").getAsInt(),
          result.get(i).getKlimakio(),
          0.0001);

      assertEquals(
          "expect equals bathmos ", o.get("bathmos").getAsString(), result.get(i).getBathmos());

      assertEquals(
          "expect equals klados ", o.get("klados").getAsString(), result.get(i).getKlados());

      assertEquals(
          "expect equals homephone ",
          o.get("homephone").getAsString(),
          result.get(i).getHomephone());

      assertEquals(
          "expect equals mobilphone ",
          o.get("mobilphone").getAsString(),
          result.get(i).getMobilphone());

      assertEquals("expect equals sex ", o.get("sex").getAsString(), result.get(i).getSex());

      assertEquals(
          "expect equals spouse ", o.get("spouse").getAsString(), result.get(i).getSpouse());

      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());

      assertEquals("expect equals area ", o.get("area").getAsString(), result.get(i).getArea());

      assertEquals(
          "expect equals address ", o.get("address").getAsString(), result.get(i).getAddress());

      assertEquals("expect equals tk ", o.get("tk").getAsString(), result.get(i).getTk());

      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());

      assertEquals(
          "expect equals jobtitle ", o.get("jobtitle").getAsString(), result.get(i).getJobtitle());

      assertEquals(
          "expect equals termreason ",
          o.get("termreason").getAsString(),
          result.get(i).getTermreason());

      assertEquals(
          "expect equals jobphone ", o.get("jobphone").getAsString(), result.get(i).getJobphone());

      assertEquals(
          "expect equals intphone ", o.get("intphone").getAsString(), result.get(i).getIntphone());

      assertEquals(
          "expect equals mothername ",
          o.get("mothername").getAsString(),
          result.get(i).getMothername());
    }
  }

  @Test
  public void testParsingMisthFyloYpal() throws IOException {
    String inputFile = "MisthFyloYpal.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFyloYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFyloYpal(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodypal ",
          o.get("kodypal").getAsFloat(),
          result.get(i).getKodypal(),
          0.001);
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());
    }
  }

  @Test
  public void testParsingMisthReportCols() throws IOException {
    String inputFile = "MisthReportCols.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthReportCols> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthReportCols(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodreport ",
          o.get("kodreport").getAsString(),
          result.get(i).getKodreport());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodcol ", o.get("kodcol").getAsInt(), result.get(i).getKodcol(), 0.0001);

      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());

      assertEquals(
          "expect equals headerText ",
          o.get("headerText").getAsString(),
          result.get(i).getHeaderText());

      assertEquals(
          "expect equals width ", o.get("width").getAsInt(), result.get(i).getWidth(), 0.0001);

      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
    }
  }

  @Test
  public void testParsingMisthReport() throws IOException {
    String inputFile = "MisthReport.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthReport> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthReport(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodreport ",
          o.get("kodreport").getAsString(),
          result.get(i).getKodreport());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals descreport ",
          o.get("descreport").getAsString(),
          result.get(i).getDescreport());

      assertEquals(
          "expect equals printMarginTop ",
          o.get("printMarginTop").getAsInt(),
          result.get(i).getPrintMarginTop(),
          0.0001);

      assertEquals(
          "expect equals printMarginBottom ",
          o.get("printMarginBottom").getAsInt(),
          result.get(i).getPrintMarginBottom(),
          0.0001);

      assertEquals(
          "expect equals printMarginLeft ",
          o.get("printMarginLeft").getAsInt(),
          result.get(i).getPrintMarginLeft(),
          0.0001);

      assertEquals(
          "expect equals printMarginRight ",
          o.get("printMarginRight").getAsInt(),
          result.get(i).getPrintMarginRight(),
          0.0001);

      assertEquals(
          "expect equals printOrientation ",
          o.get("printOrientation").getAsInt(),
          result.get(i).getPrintOrientation(),
          0.0001);

      assertEquals(
          "expect equals printPaperSize ",
          o.get("printPaperSize").getAsInt(),
          result.get(i).getPrintPaperSize(),
          0.0001);

      assertEquals(
          "expect equals printScale ",
          o.get("printScale").getAsInt(),
          result.get(i).getPrintScale(),
          0.0001);

      assertEquals(
          "expect equals subtitle ", o.get("subtitle").getAsString(), result.get(i).getSubtitle());

      assertEquals(
          "expect equals prnNotes1 ",
          o.get("prnNotes1").getAsString(),
          result.get(i).getPrnNotes1());

      assertEquals(
          "expect equals prnNotes2 ",
          o.get("prnNotes2").getAsString(),
          result.get(i).getPrnNotes2());
    }
  }

  @Test
  public void testParsingUsrgroupperm() throws IOException {
    String inputFile = "Usrgroupperm.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Usrgroupperm> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Usrgroupperm(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodgroup ",
          o.get("kodgroup").getAsFloat(),
          result.get(i).getKodgroup(),
          0.001);
      assertEquals(
          "expect equals kodaction ",
          o.get("kodaction").getAsString(),
          result.get(i).getKodaction());

      assertEquals(
          "expect equals editrec ",
          o.get("editrec").getAsInt(),
          result.get(i).getEditrec(),
          0.0001);

      assertEquals(
          "expect equals addrec ", o.get("addrec").getAsInt(), result.get(i).getAddrec(), 0.0001);

      assertEquals(
          "expect equals delrec ", o.get("delrec").getAsInt(), result.get(i).getDelrec(), 0.0001);

      assertEquals(
          "expect equals openlist ",
          o.get("openlist").getAsInt(),
          result.get(i).getOpenlist(),
          0.0001);

      assertEquals(
          "expect equals openform ",
          o.get("openform").getAsInt(),
          result.get(i).getOpenform(),
          0.0001);
    }
  }

  @Test
  public void testParsingMisthZpoikog() throws IOException {
    String inputFile = "MisthZpoikog.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpoikog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpoikog(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodoikog ", o.get("kodoikog").getAsString(), result.get(i).getKodoikog());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals descoikog ",
          o.get("descoikog").getAsString(),
          result.get(i).getDescoikog());
    }
  }

  @Test
  public void testParsingMisthZpyvar() throws IOException {
    String inputFile = "MisthZpyvar.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpyvar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpyvar(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodyvar ", o.get("kodyvar").getAsString(), result.get(i).getKodyvar());

      assertEquals(
          "expect equals descyvar ", o.get("descyvar").getAsString(), result.get(i).getDescyvar());

      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
    }
  }

  @Test
  public void testParsingMisthReportYpal() throws IOException {
    String inputFile = "MisthReportYpal.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthReportYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthReportYpal(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodreport ",
          o.get("kodreport").getAsFloat(),
          result.get(i).getKodreport(),
          0.001);
      assertEquals(
          "expect equals kodypal ",
          o.get("kodypal").getAsFloat(),
          result.get(i).getKodypal(),
          0.001);

      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
    }
  }

  @Test
  public void testParsingMisthZpepidom() throws IOException {
    String inputFile = "MisthZpepidom.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpepidom> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpepidom(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodepidom ",
          o.get("kodepidom").getAsString(),
          result.get(i).getKodepidom());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals descepidom ",
          o.get("descepidom").getAsString(),
          result.get(i).getDescepidom());
    }
  }

  @Test
  public void testParsingUsrgroups() throws IOException {
    String inputFile = "Usrgroups.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Usrgroups> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Usrgroups(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodgroup ",
          o.get("kodgroup").getAsFloat(),
          result.get(i).getKodgroup(),
          0.001);
      assertEquals(
          "expect equals descgroup ",
          o.get("descgroup").getAsString(),
          result.get(i).getDescgroup());
    }
  }

  @Test
  public void testParsingMisthZpkat() throws IOException {
    String inputFile = "MisthZpkat.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpkat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpkat(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodkat ", o.get("kodkat").getAsString(), result.get(i).getKodkat());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals desckat ", o.get("desckat").getAsString(), result.get(i).getDesckat());
    }
  }

  @Test
  public void testParsingMisthZpkrat() throws IOException {
    String inputFile = "MisthZpkrat.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpkrat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpkrat(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodkrat ", o.get("kodkrat").getAsString(), result.get(i).getKodkrat());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals desckrat ", o.get("desckrat").getAsString(), result.get(i).getDesckrat());
    }
  }

  @Test
  public void testParsingMisthFyloEpidom() throws IOException {
    String inputFile = "MisthFyloEpidom.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFyloEpidom> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFyloEpidom(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodepidom ",
          o.get("kodepidom").getAsString(),
          result.get(i).getKodepidom());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());

      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());

      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);

      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());
    }
  }

  @Test
  public void testParsingUsrmembers() throws IOException {
    String inputFile = "Usrmembers.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Usrmembers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Usrmembers(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodgroup ",
          o.get("kodgroup").getAsFloat(),
          result.get(i).getKodgroup(),
          0.001);
      assertEquals(
          "expect equals koduser ",
          o.get("koduser").getAsFloat(),
          result.get(i).getKoduser(),
          0.001);
    }
  }

  @Test
  public void testParsingUsruserperm() throws IOException {
    String inputFile = "Usruserperm.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Usruserperm> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Usruserperm(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodapp ", o.get("kodapp").getAsString(), result.get(i).getKodapp());
      assertEquals(
          "expect equals koduser ",
          o.get("koduser").getAsFloat(),
          result.get(i).getKoduser(),
          0.001);

      assertEquals(
          "expect equals enable ", o.get("enable").getAsInt(), result.get(i).getEnable(), 0.0001);
    }
  }

  @Test
  public void testParsingMisthZpperiod() throws IOException {
    String inputFile = "MisthZpperiod.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpperiod> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpperiod(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodperiod ",
          o.get("kodperiod").getAsString(),
          result.get(i).getKodperiod());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals descperiod ",
          o.get("descperiod").getAsString(),
          result.get(i).getDescperiod());

      assertEquals(
          "expect equals orderno ",
          o.get("orderno").getAsInt(),
          result.get(i).getOrderno(),
          0.0001);
    }
  }

  @Test
  public void testParsingMisthFinalYpal() throws IOException {
    String inputFile = "MisthFinalYpal.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFinalYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinalYpal(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodypal ",
          o.get("kodypal").getAsFloat(),
          result.get(i).getKodypal(),
          0.001);
      assertEquals(
          "expect equals kodfinal ",
          o.get("kodfinal").getAsFloat(),
          result.get(i).getKodfinal(),
          0.001);

      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
    }
  }

  @Test
  public void testParsingAfxfilterd() throws IOException {
    String inputFile = "Afxfilterd.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Afxfilterd> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxfilterd(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodfilterd ",
          o.get("kodfilterd").getAsFloat(),
          result.get(i).getKodfilterd(),
          0.001);
      assertEquals(
          "expect equals kodfilter ",
          o.get("kodfilter").getAsFloat(),
          result.get(i).getKodfilter(),
          0.001);

      assertEquals("expect equals pedio ", o.get("pedio").getAsString(), result.get(i).getPedio());

      assertEquals(
          "expect equals telestis ", o.get("telestis").getAsString(), result.get(i).getTelestis());

      assertEquals("expect equals timi ", o.get("timi").getAsString(), result.get(i).getTimi());

      assertEquals("expect equals joint ", o.get("joint").getAsString(), result.get(i).getJoint());
    }
  }

  @Test
  public void testParsingUsrapps() throws IOException {
    String inputFile = "Usrapps.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Usrapps> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Usrapps(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodapp ", o.get("kodapp").getAsString(), result.get(i).getKodapp());
      assertEquals(
          "expect equals descapp ", o.get("descapp").getAsString(), result.get(i).getDescapp());
    }
  }

  @Test
  public void testParsingMisthZpthesi() throws IOException {
    String inputFile = "MisthZpthesi.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpthesi> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpthesi(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodthesi ", o.get("kodthesi").getAsString(), result.get(i).getKodthesi());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals descthesi ",
          o.get("descthesi").getAsString(),
          result.get(i).getDescthesi());
    }
  }

  @Test
  public void testParsingMisthFinalYpalKrat() throws IOException {
    String inputFile = "MisthFinalYpalKrat.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFinalYpalKrat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinalYpalKrat(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodkrat ", o.get("kodkrat").getAsString(), result.get(i).getKodkrat());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodfinal ",
          o.get("kodfinal").getAsFloat(),
          result.get(i).getKodfinal(),
          0.001);

      assertEquals(
          "expect equals kodypal ",
          o.get("kodypal").getAsFloat(),
          result.get(i).getKodypal(),
          0.001);

      assertEquals(
          "expect equals poso ", o.get("poso").getAsInt(), result.get(i).getPoso(), 0.0001);

      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());

      assertEquals(
          "expect equals kodkratapod ",
          o.get("kodkratapod").getAsFloat(),
          result.get(i).getKodkratapod(),
          0.001);

      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
    }
  }

  @Test
  public void testParsingAfxfilter() throws IOException {
    String inputFile = "Afxfilter.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Afxfilter> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxfilter(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodfilter ",
          o.get("kodfilter").getAsFloat(),
          result.get(i).getKodfilter(),
          0.001);
      assertEquals(
          "expect equals descfilter ",
          o.get("descfilter").getAsString(),
          result.get(i).getDescfilter());

      assertEquals(
          "expect equals tablename ",
          o.get("tablename").getAsString(),
          result.get(i).getTablename());
    }
  }

  @Test
  public void testParsingUsrusers() throws IOException {
    String inputFile = "Usrusers.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Usrusers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Usrusers(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals koduser ",
          o.get("koduser").getAsFloat(),
          result.get(i).getKoduser(),
          0.001);
      assertEquals(
          "expect equals username ", o.get("username").getAsString(), result.get(i).getUsername());

      assertEquals(
          "expect equals fullname ", o.get("fullname").getAsString(), result.get(i).getFullname());

      assertEquals(
          "expect equals password ", o.get("password").getAsString(), result.get(i).getPassword());

      assertEquals(
          "expect equals isactive ",
          o.get("isactive").getAsInt(),
          result.get(i).getIsactive(),
          0.0001);

      assertEquals(
          "expect equals tomeas ", o.get("tomeas").getAsString(), result.get(i).getTomeas());

      assertEquals(
          "expect equals idiotita ", o.get("idiotita").getAsString(), result.get(i).getIdiotita());
    }
  }

  @Test
  public void testParsingMisthZpidikot() throws IOException {
    String inputFile = "MisthZpidikot.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpidikot> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpidikot(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodidikot ",
          o.get("kodidikot").getAsString(),
          result.get(i).getKodidikot());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals descidikot ",
          o.get("descidikot").getAsString(),
          result.get(i).getDescidikot());
    }
  }

  @Test
  public void testParsingMisthZptamio() throws IOException {
    String inputFile = "MisthZptamio.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZptamio> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZptamio(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodtamio ", o.get("kodtamio").getAsString(), result.get(i).getKodtamio());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals desctamio ",
          o.get("desctamio").getAsString(),
          result.get(i).getDesctamio());
    }
  }

  @Test
  public void testParsingMisthZptitlos() throws IOException {
    String inputFile = "MisthZptitlos.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZptitlos> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZptitlos(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodtitlos ",
          o.get("kodtitlos").getAsString(),
          result.get(i).getKodtitlos());

      assertEquals(
          "expect equals desctitlos ",
          o.get("desctitlos").getAsString(),
          result.get(i).getDesctitlos());
    }
  }

  @Test
  public void testParsingMisthFinalYpalEpidom() throws IOException {
    String inputFile = "MisthFinalYpalEpidom.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFinalYpalEpidom> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinalYpalEpidom(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodepidom ",
          o.get("kodepidom").getAsString(),
          result.get(i).getKodepidom());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodfinal ",
          o.get("kodfinal").getAsFloat(),
          result.get(i).getKodfinal(),
          0.001);

      assertEquals(
          "expect equals kodypal ",
          o.get("kodypal").getAsFloat(),
          result.get(i).getKodypal(),
          0.001);

      assertEquals(
          "expect equals poso ", o.get("poso").getAsInt(), result.get(i).getPoso(), 0.0001);

      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());

      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
    }
  }

  @Test
  public void testParsingMisthZpxrisi() throws IOException {
    String inputFile = "MisthZpxrisi.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthZpxrisi> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpxrisi(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals descxrisi ",
          o.get("descxrisi").getAsString(),
          result.get(i).getDescxrisi());
    }
  }

  @Test
  public void testParsingAfxptoseis() throws IOException {
    String inputFile = "Afxptoseis.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Afxptoseis> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxptoseis(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals onom ", o.get("onom").getAsString(), result.get(i).getOnom());
      assertEquals("expect equals gen ", o.get("gen").getAsString(), result.get(i).getGen());

      assertEquals("expect equals ait ", o.get("ait").getAsString(), result.get(i).getAit());
    }
  }

  @Test
  public void testParsingMisthFylo() throws IOException {
    String inputFile = "MisthFylo.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFylo> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFylo(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());

      assertEquals(
          "expect equals descfylo ", o.get("descfylo").getAsString(), result.get(i).getDescfylo());
    }
  }

  @Test
  public void testParsingMisthFinal() throws IOException {
    String inputFile = "MisthFinal.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFinal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinal(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodfinal ",
          o.get("kodfinal").getAsFloat(),
          result.get(i).getKodfinal(),
          0.001);
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodkat ", o.get("kodkat").getAsString(), result.get(i).getKodkat());

      assertEquals(
          "expect equals kodperiod ",
          o.get("kodperiod").getAsString(),
          result.get(i).getKodperiod());

      assertEquals("expect equals aa ", o.get("aa").getAsFloat(), result.get(i).getAa(), 0.001);

      assertEquals(
          "expect equals descfinal ",
          o.get("descfinal").getAsString(),
          result.get(i).getDescfinal());

      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
    }
  }

  @Test
  public void testParsingMisthFyloKrat() throws IOException {
    String inputFile = "MisthFyloKrat.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<MisthFyloKrat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFyloKrat(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodkrat ", o.get("kodkrat").getAsString(), result.get(i).getKodkrat());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());

      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());

      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());

      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);

      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());
    }
  }

  @Test
  public void testParsingUsractions() throws IOException {
    String inputFile = "Usractions.json";
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    List<Usractions> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Usractions(o)));

    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodaction ",
          o.get("kodaction").getAsString(),
          result.get(i).getKodaction());
      assertEquals(
          "expect equals kodapp ", o.get("kodapp").getAsString(), result.get(i).getKodapp());

      assertEquals(
          "expect equals descaction ",
          o.get("descaction").getAsString(),
          result.get(i).getDescaction());
    }
  }
}
