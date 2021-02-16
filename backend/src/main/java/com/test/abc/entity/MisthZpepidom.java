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
@Table(name = "misth_zpepidom")
public class MisthZpepidom implements Serializable {
  private static final long serialVersionUID = 161096103738862062L;
  /** Description: kodepidom. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodepidom")
  private java.lang.String kodepidom;
  /** Description: autoforos. */
  @Basic
  @Column(name = "autoforos")
  private java.lang.Integer autoforos;
  /** Description: descepidom. */
  @Basic
  @Column(name = "descepidom", length = 50)
  private java.lang.String descepidom;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;
  /** Description: hasforo. */
  @Basic
  @Column(name = "hasforo")
  private java.lang.Integer hasforo;
  /** Description: isasf. */
  @Basic
  @Column(name = "isasf")
  private java.lang.Integer isasf;

  public MisthZpepidom() {}

  public java.lang.String getKodepidom() {
    return this.kodepidom;
  }

  public void setKodepidom(java.lang.String kodepidom) {
    this.kodepidom = kodepidom;
  }

  public java.lang.Integer getAutoforos() {
    return this.autoforos;
  }

  public java.lang.String getDescepidom() {
    return this.descepidom;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getHasforo() {
    return this.hasforo;
  }

  public java.lang.Integer getIsasf() {
    return this.isasf;
  }

  public void setAutoforos(java.lang.Integer autoforos) {
    this.autoforos = autoforos;
  }

  public void setDescepidom(java.lang.String descepidom) {
    this.descepidom = descepidom;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setHasforo(java.lang.Integer hasforo) {
    this.hasforo = hasforo;
  }

  public void setIsasf(java.lang.Integer isasf) {
    this.isasf = isasf;
  }
}
