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
@Table(name = "misth_zpkat")
public class MisthZpkat implements Serializable {
  private static final long serialVersionUID = 161647059143199059L;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: desckat. */
  @Basic
  @Column(name = "desckat", length = 50)
  private java.lang.String desckat;
  /** Description: kodkat. */
  @Basic
  @Column(name = "kodkat", length = 64)
  private java.lang.String kodkat;

  public MisthZpkat() {}

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getDesckat() {
    return this.desckat;
  }

  public java.lang.String getKodkat() {
    return this.kodkat;
  }

  public void setDesckat(java.lang.String desckat) {
    this.desckat = desckat;
  }

  public void setKodkat(java.lang.String kodkat) {
    this.kodkat = kodkat;
  }
}
