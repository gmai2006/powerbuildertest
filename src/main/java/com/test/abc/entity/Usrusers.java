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
package com.test.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "usrusers")
public class Usrusers implements Serializable {
  private static final long serialVersionUID = 16164705915341898L;
  /** Description: koduser. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "koduser")
  private java.lang.Integer koduser;
  /** Description: password. */
  @Basic
  @Column(name = "password", length = 100)
  private java.lang.String password;
  /** Description: isactive. */
  @Basic
  @Column(name = "isactive")
  private java.lang.Integer isactive;
  /** Description: idiotita. */
  @Basic
  @Column(name = "idiotita", length = 100)
  private java.lang.String idiotita;
  /** Description: tomeas. */
  @Basic
  @Column(name = "tomeas", length = 100)
  private java.lang.String tomeas;
  /** Description: fullname. */
  @Basic
  @Column(name = "fullname", length = 100)
  private java.lang.String fullname;
  /** Description: username. */
  @Basic
  @Column(name = "username", length = 20)
  private java.lang.String username;

  public Usrusers() {}

  public java.lang.Integer getKoduser() {
    return this.koduser;
  }

  public void setKoduser(java.lang.Integer koduser) {
    this.koduser = koduser;
  }

  public java.lang.String getPassword() {
    return this.password;
  }

  public java.lang.Integer getIsactive() {
    return this.isactive;
  }

  public java.lang.String getIdiotita() {
    return this.idiotita;
  }

  public java.lang.String getTomeas() {
    return this.tomeas;
  }

  public java.lang.String getFullname() {
    return this.fullname;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public void setPassword(java.lang.String password) {
    this.password = password;
  }

  public void setIsactive(java.lang.Integer isactive) {
    this.isactive = isactive;
  }

  public void setIdiotita(java.lang.String idiotita) {
    this.idiotita = idiotita;
  }

  public void setTomeas(java.lang.String tomeas) {
    this.tomeas = tomeas;
  }

  public void setFullname(java.lang.String fullname) {
    this.fullname = fullname;
  }

  public void setUsername(java.lang.String username) {
    this.username = username;
  }
}
