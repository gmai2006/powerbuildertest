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

public class DwStepKratapodMisthselectDto implements Serializable {
  private static final long serialVersionUID = 161371648936085607L;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: desckrat. */
  private java.lang.String desckrat;

  /** Description: poso. */
  private java.lang.Integer poso;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodkrat. */
  private java.lang.String kodkrat;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: aa. */
  private java.lang.Float aa;

  /** Description: notes. */
  private java.lang.String notes;

  /** Description: kodkratapod. */
  private java.lang.Float kodkratapod;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  /** Description: cm_sel. */
  private java.lang.Integer cmSel;

  public DwStepKratapodMisthselectDto() {}

  public DwStepKratapodMisthselectDto(
      java.lang.String descfinal,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.String desckrat,
      java.lang.Integer poso,
      java.lang.Integer kodfinal,
      java.lang.Integer kodypal,
      java.lang.String kodkrat,
      java.lang.String kodxrisi,
      java.lang.Float aa,
      java.lang.String notes,
      java.lang.Float kodkratapod,
      java.util.Date datefinal,
      java.util.Date plirdate,
      java.lang.Integer cmSel) {
    this.descfinal = descfinal;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.desckrat = desckrat;
    this.poso = poso;
    this.kodfinal = kodfinal;
    this.kodypal = kodypal;
    this.kodkrat = kodkrat;
    this.kodxrisi = kodxrisi;
    this.aa = aa;
    this.notes = notes;
    this.kodkratapod = kodkratapod;
    this.datefinal = datefinal;
    this.plirdate = plirdate;
    this.cmSel = cmSel;
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

  public java.lang.String getDesckrat() {
    return this.desckrat;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public java.lang.Float getKodkratapod() {
    return this.kodkratapod;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.util.Date getPlirdate() {
    return this.plirdate;
  }

  public java.lang.Integer getCmSel() {
    return this.cmSel;
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

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }

  public void setKodkratapod(java.lang.Float kodkratapod) {
    this.kodkratapod = kodkratapod;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }

  public void setCmSel(java.lang.Integer cmSel) {
    this.cmSel = cmSel;
  }
}
