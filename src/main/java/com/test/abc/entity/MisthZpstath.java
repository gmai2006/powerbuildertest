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
@Table(name = "misth_zpstath")
public class MisthZpstath implements Serializable {
  private static final long serialVersionUID = 161371648614288023L;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: kodstath. */
  @Basic
  @Column(name = "kodstath", length = 20)
  private java.lang.String kodstath;
  /** Description: poso. */
  @Basic
  @Column(name = "poso")
  private java.lang.Integer poso;
  /** Description: descstath. */
  @Basic
  @Column(name = "descstath", length = 50)
  private java.lang.String descstath;

  public MisthZpstath() {}

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getKodstath() {
    return this.kodstath;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public java.lang.String getDescstath() {
    return this.descstath;
  }

  public void setKodstath(java.lang.String kodstath) {
    this.kodstath = kodstath;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }

  public void setDescstath(java.lang.String descstath) {
    this.descstath = descstath;
  }
}