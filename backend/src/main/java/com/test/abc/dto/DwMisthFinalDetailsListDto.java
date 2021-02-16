/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.test.abc.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

public class DwMisthFinalDetailsListDto implements Serializable {
  private static final long serialVersionUID = 161096104234792129L;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: kodfinal1. */
  private java.lang.Integer kodfinal1;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: desckat. */
  private java.lang.String desckat;

  /** Description: descperiod. */
  private java.lang.String descperiod;

  /** Description: aa. */
  private java.lang.Float aa;

  public DwMisthFinalDetailsListDto() {}

  public DwMisthFinalDetailsListDto(
      java.util.Date datefinal,
      java.lang.String descfinal,
      java.lang.Integer kodfinal,
      java.util.Date plirdate,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.Integer kodfinal1,
      java.lang.Integer kodypal,
      java.lang.String kodxrisi,
      java.lang.String desckat,
      java.lang.String descperiod,
      java.lang.Float aa) {
    this.datefinal = datefinal;
    this.descfinal = descfinal;
    this.kodfinal = kodfinal;
    this.plirdate = plirdate;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.kodfinal1 = kodfinal1;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.desckat = desckat;
    this.descperiod = descperiod;
    this.aa = aa;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.util.Date getPlirdate() {
    return this.plirdate;
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

  public java.lang.Integer getKodfinal1() {
    return this.kodfinal1;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesckat() {
    return this.desckat;
  }

  public java.lang.String getDescperiod() {
    return this.descperiod;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
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

  public void setKodfinal1(java.lang.Integer kodfinal1) {
    this.kodfinal1 = kodfinal1;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesckat(java.lang.String desckat) {
    this.desckat = desckat;
  }

  public void setDescperiod(java.lang.String descperiod) {
    this.descperiod = descperiod;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
