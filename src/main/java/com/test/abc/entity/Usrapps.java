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
@Table(name = "usrapps")
public class Usrapps implements Serializable {
  private static final long serialVersionUID = 16164705914926964L;
  /** Description: kodapp. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodapp")
  private java.lang.String kodapp;
  /** Description: descapp. */
  @Basic
  @Column(name = "descapp", length = 100)
  private java.lang.String descapp;

  public Usrapps() {}

  public java.lang.String getKodapp() {
    return this.kodapp;
  }

  public void setKodapp(java.lang.String kodapp) {
    this.kodapp = kodapp;
  }

  public java.lang.String getDescapp() {
    return this.descapp;
  }

  public void setDescapp(java.lang.String descapp) {
    this.descapp = descapp;
  }
}
