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
@Table(name = "misth_final")
public class MisthFinal implements Serializable {
  private static final long serialVersionUID = 161096103750787095L;
  /** Description: kodperiod. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodperiod")
  private java.lang.String kodperiod;
  /** Description: datefinal. */
  @Basic
  @Column(name = "datefinal")
  private java.util.Date datefinal;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Float aa;
  /** Description: descfinal. */
  @Basic
  @Column(name = "descfinal", length = 100)
  private java.lang.String descfinal;
  /** Description: kodfinal. */
  @Basic
  @Column(name = "kodfinal")
  private java.lang.Integer kodfinal;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;
  /** Description: kodkat. */
  @Basic
  @Column(name = "kodkat", length = 64)
  private java.lang.String kodkat;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 32766)
  private java.lang.String title;

  public MisthFinal() {}

  public java.lang.String getKodperiod() {
    return this.kodperiod;
  }

  public void setKodperiod(java.lang.String kodperiod) {
    this.kodperiod = kodperiod;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodkat() {
    return this.kodkat;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodkat(java.lang.String kodkat) {
    this.kodkat = kodkat;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }
}
