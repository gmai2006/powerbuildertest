/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.test.abc.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class DwUsrusersListDto implements Serializable {
  private static final long serialVersionUID = 161647059665849572L;

  /** Description: username. */
  private java.lang.String username;

  /** Description: fullname. */
  private java.lang.String fullname;

  /** Description: isactive. */
  private java.lang.Integer isactive;

  /** Description: koduser. */
  private java.lang.Integer koduser;

  /** Description: password. */
  private java.lang.String password;

  /** Description: tomeas. */
  private java.lang.String tomeas;

  /** Description: idiotita. */
  private java.lang.String idiotita;

  public DwUsrusersListDto() {}

  public DwUsrusersListDto(
      java.lang.String username,
      java.lang.String fullname,
      java.lang.Integer isactive,
      java.lang.Integer koduser,
      java.lang.String password,
      java.lang.String tomeas,
      java.lang.String idiotita) {
    this.username = username;
    this.fullname = fullname;
    this.isactive = isactive;
    this.koduser = koduser;
    this.password = password;
    this.tomeas = tomeas;
    this.idiotita = idiotita;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public java.lang.String getFullname() {
    return this.fullname;
  }

  public java.lang.Integer getIsactive() {
    return this.isactive;
  }

  public java.lang.Integer getKoduser() {
    return this.koduser;
  }

  public java.lang.String getPassword() {
    return this.password;
  }

  public java.lang.String getTomeas() {
    return this.tomeas;
  }

  public java.lang.String getIdiotita() {
    return this.idiotita;
  }

  public void setUsername(java.lang.String username) {
    this.username = username;
  }

  public void setFullname(java.lang.String fullname) {
    this.fullname = fullname;
  }

  public void setIsactive(java.lang.Integer isactive) {
    this.isactive = isactive;
  }

  public void setKoduser(java.lang.Integer koduser) {
    this.koduser = koduser;
  }

  public void setPassword(java.lang.String password) {
    this.password = password;
  }

  public void setTomeas(java.lang.String tomeas) {
    this.tomeas = tomeas;
  }

  public void setIdiotita(java.lang.String idiotita) {
    this.idiotita = idiotita;
  }
}
