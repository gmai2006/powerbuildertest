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
@Table(name = "usrusers")
public class Usrusers implements Serializable {
  private static final long serialVersionUID = 160532722819910881L;
  /** Description: koduser. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"koduser\"")
  private Float id;
  /** Description: username. */
  @Basic
  @Column(name = "username")
  private String username;
  /** Description: fullname. */
  @Basic
  @Column(name = "fullname")
  private String fullname;
  /** Description: password. */
  @Basic
  @Column(name = "password")
  private String password;
  /** Description: isactive. */
  @Basic
  @Column(name = "isactive")
  private Integer isactive;
  /** Description: tomeas. */
  @Basic
  @Column(name = "tomeas")
  private String tomeas;
  /** Description: idiotita. */
  @Basic
  @Column(name = "idiotita")
  private String idiotita;

  public Usrusers() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public String getFullname() {
    return this.fullname;
  }

  public String getPassword() {
    return this.password;
  }

  public Integer getIsactive() {
    return this.isactive;
  }

  public String getTomeas() {
    return this.tomeas;
  }

  public String getIdiotita() {
    return this.idiotita;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setIsactive(Integer isactive) {
    this.isactive = isactive;
  }

  public void setTomeas(String tomeas) {
    this.tomeas = tomeas;
  }

  public void setIdiotita(String idiotita) {
    this.idiotita = idiotita;
  }
}
