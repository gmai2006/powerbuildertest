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

public class PickMisthZpepidomXrisiDto implements Serializable {
  private static final long serialVersionUID = 161371648889997598L;

  /** Description: kodepidom. */
  private java.lang.String kodepidom;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descepidom. */
  private java.lang.String descepidom;

  public PickMisthZpepidomXrisiDto() {}

  public PickMisthZpepidomXrisiDto(
      java.lang.String kodepidom, java.lang.String kodxrisi, java.lang.String descepidom) {
    this.kodepidom = kodepidom;
    this.kodxrisi = kodxrisi;
    this.descepidom = descepidom;
  }

  public java.lang.String getKodepidom() {
    return this.kodepidom;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescepidom() {
    return this.descepidom;
  }

  public void setKodepidom(java.lang.String kodepidom) {
    this.kodepidom = kodepidom;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescepidom(java.lang.String descepidom) {
    this.descepidom = descepidom;
  }
}
