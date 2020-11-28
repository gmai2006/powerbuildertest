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
  private static final long serialVersionUID = 160532722827259174L;
  /** Description: kodfinal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodfinal\"")
  private Float id;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private String kodxrisi;
  /** Description: kodkat. */
  @Basic
  @Column(name = "kodkat")
  private String kodkat;
  /** Description: kodperiod. */
  @Basic
  @Column(name = "kodperiod")
  private String kodperiod;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private Float aa;
  /** Description: descfinal. */
  @Basic
  @Column(name = "descfinal")
  private String descfinal;
  /** Description: datefinal. */
  @Basic
  @Column(name = "datefinal")
  private java.util.Date datefinal;
  /** Description: title. */
  @Basic
  @Column(name = "title")
  private String title;

  public MisthFinal() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public String getKodxrisi() {
    return this.kodxrisi;
  }

  public String getKodkat() {
    return this.kodkat;
  }

  public String getKodperiod() {
    return this.kodperiod;
  }

  public Float getAa() {
    return this.aa;
  }

  public String getDescfinal() {
    return this.descfinal;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public String getTitle() {
    return this.title;
  }

  public void setKodxrisi(String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodkat(String kodkat) {
    this.kodkat = kodkat;
  }

  public void setKodperiod(String kodperiod) {
    this.kodperiod = kodperiod;
  }

  public void setAa(Float aa) {
    this.aa = aa;
  }

  public void setDescfinal(String descfinal) {
    this.descfinal = descfinal;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
