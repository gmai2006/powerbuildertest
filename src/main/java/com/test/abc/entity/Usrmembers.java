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
@Table(name = "usrmembers")
public class Usrmembers implements Serializable {
  private static final long serialVersionUID = 161096103741277341L;
  /** Description: koduser. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "koduser")
  private java.lang.Integer koduser;
  /** Description: kodgroup. */
  @Basic
  @Column(name = "kodgroup")
  private java.lang.Integer kodgroup;

  public Usrmembers() {}

  public java.lang.Integer getKoduser() {
    return this.koduser;
  }

  public void setKoduser(java.lang.Integer koduser) {
    this.koduser = koduser;
  }

  public java.lang.Integer getKodgroup() {
    return this.kodgroup;
  }

  public void setKodgroup(java.lang.Integer kodgroup) {
    this.kodgroup = kodgroup;
  }
}
