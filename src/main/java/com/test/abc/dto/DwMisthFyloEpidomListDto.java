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

public class DwMisthFyloEpidomListDto implements Serializable {
  private static final long serialVersionUID = 161371648907284935L;

  /** Description: kodfylo. */
  private java.lang.String kodfylo;

  /** Description: kodepidom. */
  private java.lang.String kodepidom;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: expr. */
  private java.lang.String expr;

  /** Description: aa. */
  private java.lang.Float aa;

  /** Description: notes. */
  private java.lang.String notes;

  public DwMisthFyloEpidomListDto() {}

  public DwMisthFyloEpidomListDto(
      java.lang.String kodfylo,
      java.lang.String kodepidom,
      java.lang.String kodxrisi,
      java.lang.String expr,
      java.lang.Float aa,
      java.lang.String notes) {
    this.kodfylo = kodfylo;
    this.kodepidom = kodepidom;
    this.kodxrisi = kodxrisi;
    this.expr = expr;
    this.aa = aa;
    this.notes = notes;
  }

  public java.lang.String getKodfylo() {
    return this.kodfylo;
  }

  public java.lang.String getKodepidom() {
    return this.kodepidom;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public void setKodfylo(java.lang.String kodfylo) {
    this.kodfylo = kodfylo;
  }

  public void setKodepidom(java.lang.String kodepidom) {
    this.kodepidom = kodepidom;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }
}
