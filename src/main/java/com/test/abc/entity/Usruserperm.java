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
@Table(name = "usruserperm")
public class Usruserperm implements Serializable {
  private static final long serialVersionUID = 161096103741691125L;
  /** Description: koduser. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "koduser")
  private java.lang.Integer koduser;
  /** Description: enable. */
  @Basic
  @Column(name = "enable")
  private java.lang.Integer enable;
  /** Description: kodapp. */
  @Basic
  @Column(name = "kodapp", length = 64)
  private java.lang.String kodapp;

  public Usruserperm() {}

  public java.lang.Integer getKoduser() {
    return this.koduser;
  }

  public void setKoduser(java.lang.Integer koduser) {
    this.koduser = koduser;
  }

  public java.lang.Integer getEnable() {
    return this.enable;
  }

  public java.lang.String getKodapp() {
    return this.kodapp;
  }

  public void setEnable(java.lang.Integer enable) {
    this.enable = enable;
  }

  public void setKodapp(java.lang.String kodapp) {
    this.kodapp = kodapp;
  }
}
