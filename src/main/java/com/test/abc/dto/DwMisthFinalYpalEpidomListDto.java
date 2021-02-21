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

public class DwMisthFinalYpalEpidomListDto implements Serializable {
  private static final long serialVersionUID = 161371648902058224L;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodepidom. */
  private java.lang.String kodepidom;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: poso. */
  private java.lang.Integer poso;

  /** Description: aa. */
  private java.lang.Float aa;

  /** Description: notes. */
  private java.lang.String notes;

  public DwMisthFinalYpalEpidomListDto() {}

  public DwMisthFinalYpalEpidomListDto(
      java.lang.Integer kodfinal,
      java.lang.Integer kodypal,
      java.lang.String kodepidom,
      java.lang.String kodxrisi,
      java.lang.Integer poso,
      java.lang.Float aa,
      java.lang.String notes) {
    this.kodfinal = kodfinal;
    this.kodypal = kodypal;
    this.kodepidom = kodepidom;
    this.kodxrisi = kodxrisi;
    this.poso = poso;
    this.aa = aa;
    this.notes = notes;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodepidom() {
    return this.kodepidom;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodepidom(java.lang.String kodepidom) {
    this.kodepidom = kodepidom;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }
}
