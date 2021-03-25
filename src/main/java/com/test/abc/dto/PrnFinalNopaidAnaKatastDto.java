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

public class PrnFinalNopaidAnaKatastDto implements Serializable {
  private static final long serialVersionUID = 161647059618655549L;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: kodfinal1. */
  private java.lang.Integer kodfinal1;

  /** Description: descperiod. */
  private java.lang.String descperiod;

  /** Description: aa. */
  private java.lang.Float aa;

  public PrnFinalNopaidAnaKatastDto() {}

  public PrnFinalNopaidAnaKatastDto(
      java.lang.String descfinal,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.Integer kodfinal,
      java.util.Date datefinal,
      java.util.Date plirdate,
      java.lang.Integer kodypal,
      java.lang.String kodxrisi,
      java.lang.Integer kodfinal1,
      java.lang.String descperiod,
      java.lang.Float aa) {
    this.descfinal = descfinal;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.kodfinal = kodfinal;
    this.datefinal = datefinal;
    this.plirdate = plirdate;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.kodfinal1 = kodfinal1;
    this.descperiod = descperiod;
    this.aa = aa;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.lang.String getSurname() {
    return this.surname;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getFathername() {
    return this.fathername;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.util.Date getPlirdate() {
    return this.plirdate;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getKodfinal1() {
    return this.kodfinal1;
  }

  public java.lang.String getDescperiod() {
    return this.descperiod;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setSurname(java.lang.String surname) {
    this.surname = surname;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setFathername(java.lang.String fathername) {
    this.fathername = fathername;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodfinal1(java.lang.Integer kodfinal1) {
    this.kodfinal1 = kodfinal1;
  }

  public void setDescperiod(java.lang.String descperiod) {
    this.descperiod = descperiod;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
