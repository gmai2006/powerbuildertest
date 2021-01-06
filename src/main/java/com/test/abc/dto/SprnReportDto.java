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

public class SprnReportDto implements Serializable {
  private static final long serialVersionUID = 160992137676225777L;

  /** Description: kodreport. */
  private java.lang.Float kodreport;

  /** Description: kodypal. */
  private java.lang.Float kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: mitroo. */
  private java.lang.String mitroo;

  public SprnReportDto() {}

  public SprnReportDto(
      java.lang.Float kodreport,
      java.lang.Float kodypal,
      java.lang.String kodxrisi,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.String mitroo) {
    this.kodreport = kodreport;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.mitroo = mitroo;
  }

  public java.lang.Float getKodreport() {
    return this.kodreport;
  }

  public java.lang.Float getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
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

  public java.lang.String getMitroo() {
    return this.mitroo;
  }

  public void setKodreport(java.lang.Float kodreport) {
    this.kodreport = kodreport;
  }

  public void setKodypal(java.lang.Float kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
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

  public void setMitroo(java.lang.String mitroo) {
    this.mitroo = mitroo;
  }
}
