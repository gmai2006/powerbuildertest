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

public class SprnAnalisiEpidomAsfDto implements Serializable {
  private static final long serialVersionUID = 161647059588329719L;

  /** Description: poso. */
  private java.lang.Integer poso;

  /** Description: descepidom. */
  private java.lang.String descepidom;

  /** Description: kodepidom. */
  private java.lang.String kodepidom;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: cm_sumposo. */
  private java.lang.Integer cmSumposo;

  public SprnAnalisiEpidomAsfDto() {}

  public SprnAnalisiEpidomAsfDto(
      java.lang.Integer poso,
      java.lang.String descepidom,
      java.lang.String kodepidom,
      java.lang.String kodxrisi,
      java.lang.Integer cmSumposo) {
    this.poso = poso;
    this.descepidom = descepidom;
    this.kodepidom = kodepidom;
    this.kodxrisi = kodxrisi;
    this.cmSumposo = cmSumposo;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public java.lang.String getDescepidom() {
    return this.descepidom;
  }

  public java.lang.String getKodepidom() {
    return this.kodepidom;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getCmSumposo() {
    return this.cmSumposo;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }

  public void setDescepidom(java.lang.String descepidom) {
    this.descepidom = descepidom;
  }

  public void setKodepidom(java.lang.String kodepidom) {
    this.kodepidom = kodepidom;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setCmSumposo(java.lang.Integer cmSumposo) {
    this.cmSumposo = cmSumposo;
  }
}
