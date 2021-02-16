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
@Table(name = "misth_zpoikog")
public class MisthZpoikog implements Serializable {
  private static final long serialVersionUID = 161096103737132562L;
  /** Description: kodoikog. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodoikog")
  private java.lang.String kodoikog;
  /** Description: descoikog. */
  @Basic
  @Column(name = "descoikog", length = 50)
  private java.lang.String descoikog;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;

  public MisthZpoikog() {}

  public java.lang.String getKodoikog() {
    return this.kodoikog;
  }

  public void setKodoikog(java.lang.String kodoikog) {
    this.kodoikog = kodoikog;
  }

  public java.lang.String getDescoikog() {
    return this.descoikog;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setDescoikog(java.lang.String descoikog) {
    this.descoikog = descoikog;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }
}