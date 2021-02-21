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

package com.test.abc.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

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

public class DwUsrusersAdminFormDto implements Serializable {
  private static final long serialVersionUID = 161371648979029709L;

  /** Description: koduser. */
  private java.lang.Integer koduser;

  /** Description: username. */
  private java.lang.String username;

  /** Description: fullname. */
  private java.lang.String fullname;

  /** Description: password. */
  private java.lang.String password;

  /** Description: isactive. */
  private java.lang.Integer isactive;

  /** Description: tomeas. */
  private java.lang.String tomeas;

  /** Description: idiotita. */
  private java.lang.String idiotita;

  public DwUsrusersAdminFormDto() {}

  public DwUsrusersAdminFormDto(
      java.lang.Integer koduser,
      java.lang.String username,
      java.lang.String fullname,
      java.lang.String password,
      java.lang.Integer isactive,
      java.lang.String tomeas,
      java.lang.String idiotita) {
    this.koduser = koduser;
    this.username = username;
    this.fullname = fullname;
    this.password = password;
    this.isactive = isactive;
    this.tomeas = tomeas;
    this.idiotita = idiotita;
  }

  public java.lang.Integer getKoduser() {
    return this.koduser;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public java.lang.String getFullname() {
    return this.fullname;
  }

  public java.lang.String getPassword() {
    return this.password;
  }

  public java.lang.Integer getIsactive() {
    return this.isactive;
  }

  public java.lang.String getTomeas() {
    return this.tomeas;
  }

  public java.lang.String getIdiotita() {
    return this.idiotita;
  }

  public void setKoduser(java.lang.Integer koduser) {
    this.koduser = koduser;
  }

  public void setUsername(java.lang.String username) {
    this.username = username;
  }

  public void setFullname(java.lang.String fullname) {
    this.fullname = fullname;
  }

  public void setPassword(java.lang.String password) {
    this.password = password;
  }

  public void setIsactive(java.lang.Integer isactive) {
    this.isactive = isactive;
  }

  public void setTomeas(java.lang.String tomeas) {
    this.tomeas = tomeas;
  }

  public void setIdiotita(java.lang.String idiotita) {
    this.idiotita = idiotita;
  }
}
