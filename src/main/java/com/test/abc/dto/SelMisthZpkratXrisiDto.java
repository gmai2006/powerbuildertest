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

public class SelMisthZpkratXrisiDto implements Serializable {
  private static final long serialVersionUID = 161371648904525954L;

  /** Description: kodkrat. */
  private java.lang.String kodkrat;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: desckrat. */
  private java.lang.String desckrat;

  /** Description: issel. */
  private java.lang.Integer issel;

  public SelMisthZpkratXrisiDto() {}

  public SelMisthZpkratXrisiDto(
      java.lang.String kodkrat,
      java.lang.String kodxrisi,
      java.lang.String desckrat,
      java.lang.Integer issel) {
    this.kodkrat = kodkrat;
    this.kodxrisi = kodxrisi;
    this.desckrat = desckrat;
    this.issel = issel;
  }

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesckrat() {
    return this.desckrat;
  }

  public java.lang.Integer getIssel() {
    return this.issel;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
  }

  public void setIssel(java.lang.Integer issel) {
    this.issel = issel;
  }
}
