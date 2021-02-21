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

public class DwMisthFinalYpalPlirdateListDto implements Serializable {
  private static final long serialVersionUID = 161371648948279436L;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  public DwMisthFinalYpalPlirdateListDto() {}

  public DwMisthFinalYpalPlirdateListDto(
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.util.Date plirdate,
      java.lang.Integer kodfinal,
      java.lang.Integer kodypal,
      java.lang.String kodxrisi) {
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.plirdate = plirdate;
    this.kodfinal = kodfinal;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
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

  public java.util.Date getPlirdate() {
    return this.plirdate;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
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

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }
}
