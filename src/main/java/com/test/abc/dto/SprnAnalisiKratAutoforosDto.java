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

public class SprnAnalisiKratAutoforosDto implements Serializable {
  private static final long serialVersionUID = 16137164892972326L;

  /** Description: desckrat. */
  private java.lang.String desckrat;

  /** Description: kodkrat. */
  private java.lang.String kodkrat;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: poso. */
  private java.lang.Integer poso;

  /** Description: sum. */
  private java.lang.Integer sum;

  public SprnAnalisiKratAutoforosDto() {}

  public SprnAnalisiKratAutoforosDto(
      java.lang.String desckrat,
      java.lang.String kodkrat,
      java.lang.String kodxrisi,
      java.lang.Integer poso,
      java.lang.Integer sum) {
    this.desckrat = desckrat;
    this.kodkrat = kodkrat;
    this.kodxrisi = kodxrisi;
    this.poso = poso;
    this.sum = sum;
  }

  public java.lang.String getDesckrat() {
    return this.desckrat;
  }

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public java.lang.Integer getSum() {
    return this.sum;
  }

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }

  public void setSum(java.lang.Integer sum) {
    this.sum = sum;
  }
}
