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
  private static final long serialVersionUID = 160532722812561210L;
  /** Description: kodgroup. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodgroup\"")
  private Float id;
  /** Description: koduser. */
  @Basic
  @Column(name = "koduser")
  private Float koduser;

  public Usrmembers() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public Float getKoduser() {
    return this.koduser;
  }

  public void setKoduser(Float koduser) {
    this.koduser = koduser;
  }
}
