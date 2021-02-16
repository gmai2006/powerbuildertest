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
@Table(name = "usractions")
public class Usractions implements Serializable {
  private static final long serialVersionUID = 161096103751442631L;
  /** Description: kodapp. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodapp")
  private java.lang.String kodapp;
  /** Description: descaction. */
  @Basic
  @Column(name = "descaction", length = 100)
  private java.lang.String descaction;
  /** Description: kodaction. */
  @Basic
  @Column(name = "kodaction", length = 64)
  private java.lang.String kodaction;

  public Usractions() {}

  public java.lang.String getKodapp() {
    return this.kodapp;
  }

  public void setKodapp(java.lang.String kodapp) {
    this.kodapp = kodapp;
  }

  public java.lang.String getDescaction() {
    return this.descaction;
  }

  public java.lang.String getKodaction() {
    return this.kodaction;
  }

  public void setDescaction(java.lang.String descaction) {
    this.descaction = descaction;
  }

  public void setKodaction(java.lang.String kodaction) {
    this.kodaction = kodaction;
  }
}
