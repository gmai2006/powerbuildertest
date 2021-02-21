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
@Table(name = "misth_zpperiod")
public class MisthZpperiod implements Serializable {
  private static final long serialVersionUID = 161371648627736003L;
  /** Description: kodperiod. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodperiod")
  private java.lang.String kodperiod;
  /** Description: descperiod. */
  @Basic
  @Column(name = "descperiod", length = 50)
  private java.lang.String descperiod;
  /** Description: orderno. */
  @Basic
  @Column(name = "orderno")
  private java.lang.Integer orderno;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;

  public MisthZpperiod() {}

  public java.lang.String getKodperiod() {
    return this.kodperiod;
  }

  public void setKodperiod(java.lang.String kodperiod) {
    this.kodperiod = kodperiod;
  }

  public java.lang.String getDescperiod() {
    return this.descperiod;
  }

  public java.lang.Integer getOrderno() {
    return this.orderno;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setDescperiod(java.lang.String descperiod) {
    this.descperiod = descperiod;
  }

  public void setOrderno(java.lang.Integer orderno) {
    this.orderno = orderno;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }
}
