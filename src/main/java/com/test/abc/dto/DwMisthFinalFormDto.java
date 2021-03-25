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

public class DwMisthFinalFormDto implements Serializable {
  private static final long serialVersionUID = 161647059662085799L;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: title. */
  private java.lang.String title;

  /** Description: kodkat. */
  private java.lang.String kodkat;

  /** Description: kodperiod. */
  private java.lang.String kodperiod;

  /** Description: aa. */
  private java.lang.Float aa;

  public DwMisthFinalFormDto() {}

  public DwMisthFinalFormDto(
      java.lang.Integer kodfinal,
      java.lang.String kodxrisi,
      java.lang.String descfinal,
      java.util.Date datefinal,
      java.lang.String title,
      java.lang.String kodkat,
      java.lang.String kodperiod,
      java.lang.Float aa) {
    this.kodfinal = kodfinal;
    this.kodxrisi = kodxrisi;
    this.descfinal = descfinal;
    this.datefinal = datefinal;
    this.title = title;
    this.kodkat = kodkat;
    this.kodperiod = kodperiod;
    this.aa = aa;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getKodkat() {
    return this.kodkat;
  }

  public java.lang.String getKodperiod() {
    return this.kodperiod;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setKodkat(java.lang.String kodkat) {
    this.kodkat = kodkat;
  }

  public void setKodperiod(java.lang.String kodperiod) {
    this.kodperiod = kodperiod;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
