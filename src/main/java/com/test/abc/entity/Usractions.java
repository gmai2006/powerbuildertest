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
  private static final long serialVersionUID = 160992137260395093L;
  /** Description: kodaction. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodaction")
  private java.lang.String kodaction;
  /** Description: kodapp. */
  @Basic
  @Column(name = "kodapp")
  private java.lang.String kodapp;
  /** Description: descaction. */
  @Basic
  @Column(name = "descaction")
  private java.lang.String descaction;

  public Usractions() {}

  public java.lang.String getKodaction() {
    return this.kodaction;
  }

  public void setKodaction(java.lang.String kodaction) {
    this.kodaction = kodaction;
  }

  public java.lang.String getKodapp() {
    return this.kodapp;
  }

  public java.lang.String getDescaction() {
    return this.descaction;
  }

  public void setKodapp(java.lang.String kodapp) {
    this.kodapp = kodapp;
  }

  public void setDescaction(java.lang.String descaction) {
    this.descaction = descaction;
  }
}
