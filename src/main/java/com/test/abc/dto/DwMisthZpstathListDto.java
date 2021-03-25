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

public class DwMisthZpstathListDto implements Serializable {
  private static final long serialVersionUID = 161647059680655952L;

  /** Description: kodstath. */
  private java.lang.String kodstath;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descstath. */
  private java.lang.String descstath;

  /** Description: poso. */
  private java.lang.Integer poso;

  public DwMisthZpstathListDto() {}

  public DwMisthZpstathListDto(
      java.lang.String kodstath,
      java.lang.String kodxrisi,
      java.lang.String descstath,
      java.lang.Integer poso) {
    this.kodstath = kodstath;
    this.kodxrisi = kodxrisi;
    this.descstath = descstath;
    this.poso = poso;
  }

  public java.lang.String getKodstath() {
    return this.kodstath;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescstath() {
    return this.descstath;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public void setKodstath(java.lang.String kodstath) {
    this.kodstath = kodstath;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescstath(java.lang.String descstath) {
    this.descstath = descstath;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }
}
