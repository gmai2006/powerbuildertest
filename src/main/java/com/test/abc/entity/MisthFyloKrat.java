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
@Table(name = "misth_fylo_krat")
public class MisthFyloKrat implements Serializable {
  private static final long serialVersionUID = 160992137259728481L;
  /** Description: kodkrat. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodkrat")
  private java.lang.String kodkrat;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: kodfylo. */
  @Basic
  @Column(name = "kodfylo")
  private java.lang.String kodfylo;
  /** Description: expr. */
  @Basic
  @Column(name = "expr")
  private java.lang.String expr;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Integer aa;
  /** Description: notes. */
  @Basic
  @Column(name = "notes")
  private java.lang.String notes;

  public MisthFyloKrat() {}

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodfylo() {
    return this.kodfylo;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public java.lang.Integer getAa() {
    return this.aa;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodfylo(java.lang.String kodfylo) {
    this.kodfylo = kodfylo;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }

  public void setAa(java.lang.Integer aa) {
    this.aa = aa;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }
}
