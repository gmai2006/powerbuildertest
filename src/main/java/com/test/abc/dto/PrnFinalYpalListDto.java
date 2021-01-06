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

public class PrnFinalYpalListDto implements Serializable {
  private static final long serialVersionUID = 160992137677990878L;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  /** Description: kodypal. */
  private java.lang.Float kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: title. */
  private java.lang.String title;

  /** Description: mitroo. */
  private java.lang.String mitroo;

  /** Description: aa. */
  private java.lang.Float aa;

  /** Description: kodfinal. */
  private java.lang.Float kodfinal;

  /** Description: kodfinal1. */
  private java.lang.Float kodfinal1;

  public PrnFinalYpalListDto() {}

  public PrnFinalYpalListDto(
      java.lang.String descfinal,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.util.Date datefinal,
      java.util.Date plirdate,
      java.lang.Float kodypal,
      java.lang.String kodxrisi,
      java.lang.String title,
      java.lang.String mitroo,
      java.lang.Float aa,
      java.lang.Float kodfinal,
      java.lang.Float kodfinal1) {
    this.descfinal = descfinal;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.datefinal = datefinal;
    this.plirdate = plirdate;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.title = title;
    this.mitroo = mitroo;
    this.aa = aa;
    this.kodfinal = kodfinal;
    this.kodfinal1 = kodfinal1;
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

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.util.Date getPlirdate() {
    return this.plirdate;
  }

  public java.lang.Float getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getMitroo() {
    return this.mitroo;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.Float getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.Float getKodfinal1() {
    return this.kodfinal1;
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

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }

  public void setKodypal(java.lang.Float kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setMitroo(java.lang.String mitroo) {
    this.mitroo = mitroo;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setKodfinal(java.lang.Float kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodfinal1(java.lang.Float kodfinal1) {
    this.kodfinal1 = kodfinal1;
  }
}
