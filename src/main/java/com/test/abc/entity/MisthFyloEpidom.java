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
package com.test.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "misth_fylo_epidom")
public class MisthFyloEpidom implements Serializable {
  private static final long serialVersionUID = 161647059145058682L;
  /** Description: kodepidom. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodepidom")
  private java.lang.String kodepidom;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Float aa;
  /** Description: kodfylo. */
  @Basic
  @Column(name = "kodfylo", length = 4)
  private java.lang.String kodfylo;
  /** Description: notes. */
  @Basic
  @Column(name = "notes", length = 32766)
  private java.lang.String notes;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;
  /** Description: expr. */
  @Basic
  @Column(name = "expr", length = 32766)
  private java.lang.String expr;

  public MisthFyloEpidom() {}

  public java.lang.String getKodepidom() {
    return this.kodepidom;
  }

  public void setKodepidom(java.lang.String kodepidom) {
    this.kodepidom = kodepidom;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.String getKodfylo() {
    return this.kodfylo;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setKodfylo(java.lang.String kodfylo) {
    this.kodfylo = kodfylo;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }
}
