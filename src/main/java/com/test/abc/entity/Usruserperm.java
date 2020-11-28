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
  private static final long serialVersionUID = 160532722813084909L;
  /** Description: kodapp. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodapp\"")
  private String id;
  /** Description: koduser. */
  @Basic
  @Column(name = "koduser")
  private Float koduser;
  /** Description: enable. */
  @Basic
  @Column(name = "enable")
  private Integer enable;

  public Usruserperm() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Float getKoduser() {
    return this.koduser;
  }

  public Integer getEnable() {
    return this.enable;
  }

  public void setKoduser(Float koduser) {
    this.koduser = koduser;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }
}
