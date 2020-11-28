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

import com.test.abc.entity.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Objects;

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

public class JsonHelper {
  static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthKratapod.
   */
  public static MisthKratapod fromJson2MisthKratapod(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthKratapod.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpstath.
   */
  public static MisthZpstath fromJson2MisthZpstath(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpstath.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthYpalYvar.
   */
  public static MisthYpalYvar fromJson2MisthYpalYvar(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthYpalYvar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZptmima.
   */
  public static MisthZptmima fromJson2MisthZptmima(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZptmima.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthYpal.
   */
  public static MisthYpal fromJson2MisthYpal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthYpal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFyloYpal.
   */
  public static MisthFyloYpal fromJson2MisthFyloYpal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFyloYpal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthReportCols.
   */
  public static MisthReportCols fromJson2MisthReportCols(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthReportCols.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthReport.
   */
  public static MisthReport fromJson2MisthReport(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthReport.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Usrgroupperm.
   */
  public static Usrgroupperm fromJson2Usrgroupperm(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Usrgroupperm.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpoikog.
   */
  public static MisthZpoikog fromJson2MisthZpoikog(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpoikog.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpyvar.
   */
  public static MisthZpyvar fromJson2MisthZpyvar(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpyvar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthReportYpal.
   */
  public static MisthReportYpal fromJson2MisthReportYpal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthReportYpal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpepidom.
   */
  public static MisthZpepidom fromJson2MisthZpepidom(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpepidom.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Usrgroups.
   */
  public static Usrgroups fromJson2Usrgroups(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Usrgroups.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpkat.
   */
  public static MisthZpkat fromJson2MisthZpkat(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpkat.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpkrat.
   */
  public static MisthZpkrat fromJson2MisthZpkrat(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpkrat.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFyloEpidom.
   */
  public static MisthFyloEpidom fromJson2MisthFyloEpidom(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFyloEpidom.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Usrmembers.
   */
  public static Usrmembers fromJson2Usrmembers(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Usrmembers.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Usruserperm.
   */
  public static Usruserperm fromJson2Usruserperm(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Usruserperm.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpperiod.
   */
  public static MisthZpperiod fromJson2MisthZpperiod(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpperiod.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFinalYpal.
   */
  public static MisthFinalYpal fromJson2MisthFinalYpal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFinalYpal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Afxfilterd.
   */
  public static Afxfilterd fromJson2Afxfilterd(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Afxfilterd.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Usrapps.
   */
  public static Usrapps fromJson2Usrapps(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Usrapps.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpthesi.
   */
  public static MisthZpthesi fromJson2MisthZpthesi(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpthesi.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFinalYpalKrat.
   */
  public static MisthFinalYpalKrat fromJson2MisthFinalYpalKrat(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFinalYpalKrat.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Afxfilter.
   */
  public static Afxfilter fromJson2Afxfilter(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Afxfilter.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Usrusers.
   */
  public static Usrusers fromJson2Usrusers(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Usrusers.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpidikot.
   */
  public static MisthZpidikot fromJson2MisthZpidikot(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpidikot.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZptamio.
   */
  public static MisthZptamio fromJson2MisthZptamio(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZptamio.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZptitlos.
   */
  public static MisthZptitlos fromJson2MisthZptitlos(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZptitlos.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFinalYpalEpidom.
   */
  public static MisthFinalYpalEpidom fromJson2MisthFinalYpalEpidom(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFinalYpalEpidom.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthZpxrisi.
   */
  public static MisthZpxrisi fromJson2MisthZpxrisi(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthZpxrisi.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Afxptoseis.
   */
  public static Afxptoseis fromJson2Afxptoseis(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Afxptoseis.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFylo.
   */
  public static MisthFylo fromJson2MisthFylo(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFylo.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFinal.
   */
  public static MisthFinal fromJson2MisthFinal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFinal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MisthFyloKrat.
   */
  public static MisthFyloKrat fromJson2MisthFyloKrat(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MisthFyloKrat.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Usractions.
   */
  public static Usractions fromJson2Usractions(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Usractions.class);
  }

  /**
   * Helper function that converts JSON to an JSON array.
   *
   * @param json The JSON string.
   * @return an JSON array.
   */
  public static JsonArray fromJson2Arr(String json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, JsonArray.class);
  }
}
