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
@Table(name = "misth_zptamio")
public class MisthZptamio implements Serializable {
  private static final long serialVersionUID = 161647059154514283L;
  /** Description: kodtamio. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodtamio")
  private java.lang.String kodtamio;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;
  /** Description: desctamio. */
  @Basic
  @Column(name = "desctamio", length = 50)
  private java.lang.String desctamio;

  public MisthZptamio() {}

  public java.lang.String getKodtamio() {
    return this.kodtamio;
  }

  public void setKodtamio(java.lang.String kodtamio) {
    this.kodtamio = kodtamio;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesctamio() {
    return this.desctamio;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesctamio(java.lang.String desctamio) {
    this.desctamio = desctamio;
  }
}
