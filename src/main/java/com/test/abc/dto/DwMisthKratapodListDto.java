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

public class DwMisthKratapodListDto implements Serializable {
  private static final long serialVersionUID = 161647059685987365L;

  /** Description: kodkratapod. */
  private java.lang.Float kodkratapod;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: desckratapod. */
  private java.lang.String desckratapod;

  /** Description: apoddate. */
  private java.util.Date apoddate;

  public DwMisthKratapodListDto() {}

  public DwMisthKratapodListDto(
      java.lang.Float kodkratapod,
      java.lang.String kodxrisi,
      java.lang.String desckratapod,
      java.util.Date apoddate) {
    this.kodkratapod = kodkratapod;
    this.kodxrisi = kodxrisi;
    this.desckratapod = desckratapod;
    this.apoddate = apoddate;
  }

  public java.lang.Float getKodkratapod() {
    return this.kodkratapod;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesckratapod() {
    return this.desckratapod;
  }

  public java.util.Date getApoddate() {
    return this.apoddate;
  }

  public void setKodkratapod(java.lang.Float kodkratapod) {
    this.kodkratapod = kodkratapod;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesckratapod(java.lang.String desckratapod) {
    this.desckratapod = desckratapod;
  }

  public void setApoddate(java.util.Date apoddate) {
    this.apoddate = apoddate;
  }
}
