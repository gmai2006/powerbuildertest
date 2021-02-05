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

public class DwMisthZptamioListDto implements Serializable {
  private static final long serialVersionUID = 161096104233580024L;

  /** Description: kodtamio. */
  private java.lang.String kodtamio;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: desctamio. */
  private java.lang.String desctamio;

  public DwMisthZptamioListDto() {}

  public DwMisthZptamioListDto(
      java.lang.String kodtamio, java.lang.String kodxrisi, java.lang.String desctamio) {
    this.kodtamio = kodtamio;
    this.kodxrisi = kodxrisi;
    this.desctamio = desctamio;
  }

  public java.lang.String getKodtamio() {
    return this.kodtamio;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesctamio() {
    return this.desctamio;
  }

  public void setKodtamio(java.lang.String kodtamio) {
    this.kodtamio = kodtamio;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesctamio(java.lang.String desctamio) {
    this.desctamio = desctamio;
  }
}
