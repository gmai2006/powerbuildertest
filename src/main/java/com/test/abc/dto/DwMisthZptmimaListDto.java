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

public class DwMisthZptmimaListDto implements Serializable {
  private static final long serialVersionUID = 161096104217186186L;

  /** Description: kodtmima. */
  private java.lang.String kodtmima;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: desctmima. */
  private java.lang.String desctmima;

  public DwMisthZptmimaListDto() {}

  public DwMisthZptmimaListDto(
      java.lang.String kodtmima, java.lang.String kodxrisi, java.lang.String desctmima) {
    this.kodtmima = kodtmima;
    this.kodxrisi = kodxrisi;
    this.desctmima = desctmima;
  }

  public java.lang.String getKodtmima() {
    return this.kodtmima;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesctmima() {
    return this.desctmima;
  }

  public void setKodtmima(java.lang.String kodtmima) {
    this.kodtmima = kodtmima;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesctmima(java.lang.String desctmima) {
    this.desctmima = desctmima;
  }
}
