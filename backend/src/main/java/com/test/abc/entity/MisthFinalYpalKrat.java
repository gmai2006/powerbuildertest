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
@Table(name = "misth_final_ypal_krat")
public class MisthFinalYpalKrat implements Serializable {
  private static final long serialVersionUID = 161096103744772464L;
  /** Description: kodkrat. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodkrat")
  private java.lang.String kodkrat;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Float aa;
  /** Description: kodypal. */
  @Basic
  @Column(name = "kodypal")
  private java.lang.Integer kodypal;
  /** Description: kodkratapod. */
  @Basic
  @Column(name = "kodkratapod")
  private java.lang.Float kodkratapod;
  /** Description: notes. */
  @Basic
  @Column(name = "notes", length = 32766)
  private java.lang.String notes;
  /** Description: kodfinal. */
  @Basic
  @Column(name = "kodfinal")
  private java.lang.Integer kodfinal;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;
  /** Description: poso. */
  @Basic
  @Column(name = "poso")
  private java.lang.Integer poso;

  public MisthFinalYpalKrat() {}

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.Float getKodkratapod() {
    return this.kodkratapod;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodkratapod(java.lang.Float kodkratapod) {
    this.kodkratapod = kodkratapod;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }
}
