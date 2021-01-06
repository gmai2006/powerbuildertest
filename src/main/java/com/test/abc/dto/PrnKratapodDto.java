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

public class PrnKratapodDto implements Serializable {
  private static final long serialVersionUID = 160992137701596082L;

  /** Description: kodkrat. */
  private java.lang.String kodkrat;

  /** Description: desckrat. */
  private java.lang.String desckrat;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: kodfinal. */
  private java.lang.Float kodfinal;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: poso. */
  private java.lang.Integer poso;

  /** Description: kodkratapod. */
  private java.lang.Float kodkratapod;

  /** Description: aa. */
  private java.lang.Float aa;

  public PrnKratapodDto() {}

  public PrnKratapodDto(
      java.lang.String kodkrat,
      java.lang.String desckrat,
      java.lang.String descfinal,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.Float kodfinal,
      java.util.Date datefinal,
      java.lang.String kodxrisi,
      java.lang.Integer poso,
      java.lang.Float kodkratapod,
      java.lang.Float aa) {
    this.kodkrat = kodkrat;
    this.desckrat = desckrat;
    this.descfinal = descfinal;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.kodfinal = kodfinal;
    this.datefinal = datefinal;
    this.kodxrisi = kodxrisi;
    this.poso = poso;
    this.kodkratapod = kodkratapod;
    this.aa = aa;
  }

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public java.lang.String getDesckrat() {
    return this.desckrat;
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

  public java.lang.Float getKodfinal() {
    return this.kodfinal;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public java.lang.Float getKodkratapod() {
    return this.kodkratapod;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
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

  public void setKodfinal(java.lang.Float kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }

  public void setKodkratapod(java.lang.Float kodkratapod) {
    this.kodkratapod = kodkratapod;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
