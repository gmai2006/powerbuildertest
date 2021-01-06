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

public class DwMisthFinalListDto implements Serializable {
  private static final long serialVersionUID = 160992137657830110L;

  /** Description: kodfinal. */
  private java.lang.Float kodfinal;

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

  /** Description: desckat. */
  private java.lang.String desckat;

  /** Description: kodperiod. */
  private java.lang.String kodperiod;

  /** Description: descperiod. */
  private java.lang.String descperiod;

  /** Description: aa. */
  private java.lang.Float aa;

  public DwMisthFinalListDto() {}

  public DwMisthFinalListDto(
      java.lang.Float kodfinal,
      java.lang.String kodxrisi,
      java.lang.String descfinal,
      java.util.Date datefinal,
      java.lang.String title,
      java.lang.String kodkat,
      java.lang.String desckat,
      java.lang.String kodperiod,
      java.lang.String descperiod,
      java.lang.Float aa) {
    this.kodfinal = kodfinal;
    this.kodxrisi = kodxrisi;
    this.descfinal = descfinal;
    this.datefinal = datefinal;
    this.title = title;
    this.kodkat = kodkat;
    this.desckat = desckat;
    this.kodperiod = kodperiod;
    this.descperiod = descperiod;
    this.aa = aa;
  }

  public java.lang.Float getKodfinal() {
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

  public java.lang.String getDesckat() {
    return this.desckat;
  }

  public java.lang.String getKodperiod() {
    return this.kodperiod;
  }

  public java.lang.String getDescperiod() {
    return this.descperiod;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setKodfinal(java.lang.Float kodfinal) {
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

  public void setDesckat(java.lang.String desckat) {
    this.desckat = desckat;
  }

  public void setKodperiod(java.lang.String kodperiod) {
    this.kodperiod = kodperiod;
  }

  public void setDescperiod(java.lang.String descperiod) {
    this.descperiod = descperiod;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
