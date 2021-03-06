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

public class SelMisthZpperiodXrisiDto implements Serializable {
  private static final long serialVersionUID = 161647059604539060L;

  /** Description: kodperiod. */
  private java.lang.String kodperiod;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descperiod. */
  private java.lang.String descperiod;

  /** Description: issel. */
  private java.lang.Integer issel;

  public SelMisthZpperiodXrisiDto() {}

  public SelMisthZpperiodXrisiDto(
      java.lang.String kodperiod,
      java.lang.String kodxrisi,
      java.lang.String descperiod,
      java.lang.Integer issel) {
    this.kodperiod = kodperiod;
    this.kodxrisi = kodxrisi;
    this.descperiod = descperiod;
    this.issel = issel;
  }

  public java.lang.String getKodperiod() {
    return this.kodperiod;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescperiod() {
    return this.descperiod;
  }

  public java.lang.Integer getIssel() {
    return this.issel;
  }

  public void setKodperiod(java.lang.String kodperiod) {
    this.kodperiod = kodperiod;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescperiod(java.lang.String descperiod) {
    this.descperiod = descperiod;
  }

  public void setIssel(java.lang.Integer issel) {
    this.issel = issel;
  }
}
