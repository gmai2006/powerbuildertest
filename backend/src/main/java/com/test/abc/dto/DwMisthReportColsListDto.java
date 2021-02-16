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

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

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

public class DwMisthReportColsListDto implements Serializable {
  private static final long serialVersionUID = 161096104250245669L;

  /** Description: kodcol. */
  private java.lang.Integer kodcol;

  /** Description: kodreport. */
  private java.lang.String kodreport;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: expr. */
  private java.lang.String expr;

  /** Description: header_text. */
  private java.lang.String headerText;

  /** Description: width. */
  private java.lang.Integer width;

  /** Description: aa. */
  private java.lang.Float aa;

  public DwMisthReportColsListDto() {}

  public DwMisthReportColsListDto(
      java.lang.Integer kodcol,
      java.lang.String kodreport,
      java.lang.String kodxrisi,
      java.lang.String expr,
      java.lang.String headerText,
      java.lang.Integer width,
      java.lang.Float aa) {
    this.kodcol = kodcol;
    this.kodreport = kodreport;
    this.kodxrisi = kodxrisi;
    this.expr = expr;
    this.headerText = headerText;
    this.width = width;
    this.aa = aa;
  }

  public java.lang.Integer getKodcol() {
    return this.kodcol;
  }

  public java.lang.String getKodreport() {
    return this.kodreport;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public java.lang.String getHeaderText() {
    return this.headerText;
  }

  public java.lang.Integer getWidth() {
    return this.width;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setKodcol(java.lang.Integer kodcol) {
    this.kodcol = kodcol;
  }

  public void setKodreport(java.lang.String kodreport) {
    this.kodreport = kodreport;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }

  public void setHeaderText(java.lang.String headerText) {
    this.headerText = headerText;
  }

  public void setWidth(java.lang.Integer width) {
    this.width = width;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
