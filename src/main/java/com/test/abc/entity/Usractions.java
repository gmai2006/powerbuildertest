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
  private static final long serialVersionUID = 160532722829717904L;
  /** Description: kodaction. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodaction\"")
  private String id;
  /** Description: kodapp. */
  @Basic
  @Column(name = "kodapp")
  private String kodapp;
  /** Description: descaction. */
  @Basic
  @Column(name = "descaction")
  private String descaction;

  public Usractions() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKodapp() {
    return this.kodapp;
  }

  public String getDescaction() {
    return this.descaction;
  }

  public void setKodapp(String kodapp) {
    this.kodapp = kodapp;
  }

  public void setDescaction(String descaction) {
    this.descaction = descaction;
  }
}
