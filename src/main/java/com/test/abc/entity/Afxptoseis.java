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
@Table(name = "afxptoseis")
public class Afxptoseis implements Serializable {
  private static final long serialVersionUID = 161371648635463631L;
  /** Description: ait. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "ait")
  private java.lang.String ait;
  /** Description: gen. */
  @Basic
  @Column(name = "gen", length = 50)
  private java.lang.String gen;
  /** Description: onom. */
  @Basic
  @Column(name = "onom", length = 50)
  private java.lang.String onom;

  public Afxptoseis() {}

  public java.lang.String getAit() {
    return this.ait;
  }

  public void setAit(java.lang.String ait) {
    this.ait = ait;
  }

  public java.lang.String getGen() {
    return this.gen;
  }

  public java.lang.String getOnom() {
    return this.onom;
  }

  public void setGen(java.lang.String gen) {
    this.gen = gen;
  }

  public void setOnom(java.lang.String onom) {
    this.onom = onom;
  }
}
