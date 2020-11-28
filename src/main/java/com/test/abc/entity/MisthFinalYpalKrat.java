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
  private static final long serialVersionUID = 16053272281839036L;
  /** Description: kodkrat. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodkrat\"")
  private String id;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private String kodxrisi;
  /** Description: kodfinal. */
  @Basic
  @Column(name = "kodfinal")
  private Float kodfinal;
  /** Description: kodypal. */
  @Basic
  @Column(name = "kodypal")
  private Float kodypal;
  /** Description: poso. */
  @Basic
  @Column(name = "poso")
  private Integer poso;
  /** Description: notes. */
  @Basic
  @Column(name = "notes")
  private String notes;
  /** Description: kodkratapod. */
  @Basic
  @Column(name = "kodkratapod")
  private Float kodkratapod;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private Integer aa;

  public MisthFinalYpalKrat() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKodxrisi() {
    return this.kodxrisi;
  }

  public Float getKodfinal() {
    return this.kodfinal;
  }

  public Float getKodypal() {
    return this.kodypal;
  }

  public Integer getPoso() {
    return this.poso;
  }

  public String getNotes() {
    return this.notes;
  }

  public Float getKodkratapod() {
    return this.kodkratapod;
  }

  public Integer getAa() {
    return this.aa;
  }

  public void setKodxrisi(String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodfinal(Float kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodypal(Float kodypal) {
    this.kodypal = kodypal;
  }

  public void setPoso(Integer poso) {
    this.poso = poso;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void setKodkratapod(Float kodkratapod) {
    this.kodkratapod = kodkratapod;
  }

  public void setAa(Integer aa) {
    this.aa = aa;
  }
}
