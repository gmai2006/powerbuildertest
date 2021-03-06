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
@Table(name = "misth_zptmima")
public class MisthZptmima implements Serializable {
  private static final long serialVersionUID = 161647059129741745L;
  /** Description: kodtmima. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodtmima")
  private java.lang.String kodtmima;
  /** Description: desctmima. */
  @Basic
  @Column(name = "desctmima", length = 50)
  private java.lang.String desctmima;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi", length = 64)
  private java.lang.String kodxrisi;

  public MisthZptmima() {}

  public java.lang.String getKodtmima() {
    return this.kodtmima;
  }

  public void setKodtmima(java.lang.String kodtmima) {
    this.kodtmima = kodtmima;
  }

  public java.lang.String getDesctmima() {
    return this.desctmima;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setDesctmima(java.lang.String desctmima) {
    this.desctmima = desctmima;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }
}
