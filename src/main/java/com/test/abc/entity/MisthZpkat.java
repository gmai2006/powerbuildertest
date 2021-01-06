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
@Table(name = "misth_zpkat")
public class MisthZpkat implements Serializable {
  private static final long serialVersionUID = 160992137249246498L;
  /** Description: kodkat. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodkat")
  private java.lang.String kodkat;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: desckat. */
  @Basic
  @Column(name = "desckat")
  private java.lang.String desckat;

  public MisthZpkat() {}

  public java.lang.String getKodkat() {
    return this.kodkat;
  }

  public void setKodkat(java.lang.String kodkat) {
    this.kodkat = kodkat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesckat() {
    return this.desckat;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesckat(java.lang.String desckat) {
    this.desckat = desckat;
  }
}
