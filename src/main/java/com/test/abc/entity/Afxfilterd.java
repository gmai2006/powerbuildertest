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
@Table(name = "afxfilterd")
public class Afxfilterd implements Serializable {
  private static final long serialVersionUID = 161647059150715506L;
  /** Description: kodfilterd. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodfilterd")
  private java.lang.Float kodfilterd;
  /** Description: telestis. */
  @Basic
  @Column(name = "telestis", length = 20)
  private java.lang.String telestis;
  /** Description: pedio. */
  @Basic
  @Column(name = "pedio", length = 50)
  private java.lang.String pedio;
  /** Description: joint. */
  @Basic
  @Column(name = "joint", length = 10)
  private java.lang.String joint;
  /** Description: kodfilter. */
  @Basic
  @Column(name = "kodfilter")
  private java.lang.Float kodfilter;
  /** Description: timi. */
  @Basic
  @Column(name = "timi", length = 50)
  private java.lang.String timi;

  public Afxfilterd() {}

  public java.lang.Float getKodfilterd() {
    return this.kodfilterd;
  }

  public void setKodfilterd(java.lang.Float kodfilterd) {
    this.kodfilterd = kodfilterd;
  }

  public java.lang.String getTelestis() {
    return this.telestis;
  }

  public java.lang.String getPedio() {
    return this.pedio;
  }

  public java.lang.String getJoint() {
    return this.joint;
  }

  public java.lang.Float getKodfilter() {
    return this.kodfilter;
  }

  public java.lang.String getTimi() {
    return this.timi;
  }

  public void setTelestis(java.lang.String telestis) {
    this.telestis = telestis;
  }

  public void setPedio(java.lang.String pedio) {
    this.pedio = pedio;
  }

  public void setJoint(java.lang.String joint) {
    this.joint = joint;
  }

  public void setKodfilter(java.lang.Float kodfilter) {
    this.kodfilter = kodfilter;
  }

  public void setTimi(java.lang.String timi) {
    this.timi = timi;
  }
}
