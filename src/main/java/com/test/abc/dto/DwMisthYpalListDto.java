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

public class DwMisthYpalListDto implements Serializable {
  private static final long serialVersionUID = 161371648928724953L;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: mitroo. */
  private java.lang.String mitroo;

  /** Description: klimakio. */
  private java.lang.Integer klimakio;

  /** Description: klados. */
  private java.lang.String klados;

  /** Description: bathmos. */
  private java.lang.String bathmos;

  /** Description: descidikot. */
  private java.lang.String descidikot;

  public DwMisthYpalListDto() {}

  public DwMisthYpalListDto(
      java.lang.Integer kodypal,
      java.lang.String kodxrisi,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String mitroo,
      java.lang.Integer klimakio,
      java.lang.String klados,
      java.lang.String bathmos,
      java.lang.String descidikot) {
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.surname = surname;
    this.name = name;
    this.mitroo = mitroo;
    this.klimakio = klimakio;
    this.klados = klados;
    this.bathmos = bathmos;
    this.descidikot = descidikot;
  }

  public java.lang.Integer getKodypal() {
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

  public java.lang.String getMitroo() {
    return this.mitroo;
  }

  public java.lang.Integer getKlimakio() {
    return this.klimakio;
  }

  public java.lang.String getKlados() {
    return this.klados;
  }

  public java.lang.String getBathmos() {
    return this.bathmos;
  }

  public java.lang.String getDescidikot() {
    return this.descidikot;
  }

  public void setKodypal(java.lang.Integer kodypal) {
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

  public void setMitroo(java.lang.String mitroo) {
    this.mitroo = mitroo;
  }

  public void setKlimakio(java.lang.Integer klimakio) {
    this.klimakio = klimakio;
  }

  public void setKlados(java.lang.String klados) {
    this.klados = klados;
  }

  public void setBathmos(java.lang.String bathmos) {
    this.bathmos = bathmos;
  }

  public void setDescidikot(java.lang.String descidikot) {
    this.descidikot = descidikot;
  }
}
