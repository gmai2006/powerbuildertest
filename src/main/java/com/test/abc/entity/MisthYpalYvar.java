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
@Table(name = "misth_ypal_yvar")
public class MisthYpalYvar implements Serializable {
  private static final long serialVersionUID = 161371648614711811L;
  /** Description: kodypal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodypal")
  private java.lang.Integer kodypal;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Float aa;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;
  /** Description: kodyvar. */
  @Basic
  @Column(name = "kodyvar", length = 20)
  private java.lang.String kodyvar;
  /** Description: expr. */
  @Basic
  @Column(name = "expr", length = 32766)
  private java.lang.String expr;

  public MisthYpalYvar() {}

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodyvar() {
    return this.kodyvar;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodyvar(java.lang.String kodyvar) {
    this.kodyvar = kodyvar;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }
}
