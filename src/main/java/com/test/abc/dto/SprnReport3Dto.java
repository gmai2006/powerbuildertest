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

public class SprnReport3Dto implements Serializable {
  private static final long serialVersionUID = 161096104201762591L;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: aa. */
  private java.lang.Float aa;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: title. */
  private java.lang.String title;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  public SprnReport3Dto() {}

  public SprnReport3Dto(
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.Float aa,
      java.util.Date datefinal,
      java.lang.Integer kodypal,
      java.lang.String title,
      java.lang.Integer kodfinal) {
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.aa = aa;
    this.datefinal = datefinal;
    this.kodypal = kodypal;
    this.title = title;
    this.kodfinal = kodfinal;
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

  public java.lang.Float getAa() {
    return this.aa;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
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

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }
}
