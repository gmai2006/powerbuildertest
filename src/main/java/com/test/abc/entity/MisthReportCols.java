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

package com.test.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

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

@Entity
@Table(name = "misth_report_cols")
public class MisthReportCols implements Serializable {
  private static final long serialVersionUID = 160532722791221849L;
  /** Description: kodreport. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodreport\"")
  private String id;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private String kodxrisi;
  /** Description: kodcol. */
  @Basic
  @Column(name = "kodcol")
  private Integer kodcol;
  /** Description: expr. */
  @Basic
  @Column(name = "expr")
  private String expr;
  /** Description: header_text. */
  @Basic
  @Column(name = "header_text")
  private String headerText;
  /** Description: width. */
  @Basic
  @Column(name = "width")
  private Integer width;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private Integer aa;

  public MisthReportCols() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKodxrisi() {
    return this.kodxrisi;
  }

  public Integer getKodcol() {
    return this.kodcol;
  }

  public String getExpr() {
    return this.expr;
  }

  public String getHeaderText() {
    return this.headerText;
  }

  public Integer getWidth() {
    return this.width;
  }

  public Integer getAa() {
    return this.aa;
  }

  public void setKodxrisi(String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodcol(Integer kodcol) {
    this.kodcol = kodcol;
  }

  public void setExpr(String expr) {
    this.expr = expr;
  }

  public void setHeaderText(String headerText) {
    this.headerText = headerText;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public void setAa(Integer aa) {
    this.aa = aa;
  }
}
