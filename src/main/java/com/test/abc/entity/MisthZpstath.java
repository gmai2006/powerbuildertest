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
@Table(name = "misth_zpstath")
public class MisthZpstath implements Serializable {
  private static final long serialVersionUID = 160532722771227009L;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodxrisi\"")
  private String id;
  /** Description: kodstath. */
  @Basic
  @Column(name = "kodstath")
  private String kodstath;
  /** Description: descstath. */
  @Basic
  @Column(name = "descstath")
  private String descstath;
  /** Description: poso. */
  @Basic
  @Column(name = "poso")
  private Integer poso;

  public MisthZpstath() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKodstath() {
    return this.kodstath;
  }

  public String getDescstath() {
    return this.descstath;
  }

  public Integer getPoso() {
    return this.poso;
  }

  public void setKodstath(String kodstath) {
    this.kodstath = kodstath;
  }

  public void setDescstath(String descstath) {
    this.descstath = descstath;
  }

  public void setPoso(Integer poso) {
    this.poso = poso;
  }
}
