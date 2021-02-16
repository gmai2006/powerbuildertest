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

public class PickMisthZpkatXrisiDto implements Serializable {
  private static final long serialVersionUID = 161096104246943945L;

  /** Description: kodkat. */
  private java.lang.String kodkat;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: desckat. */
  private java.lang.String desckat;

  public PickMisthZpkatXrisiDto() {}

  public PickMisthZpkatXrisiDto(
      java.lang.String kodkat, java.lang.String kodxrisi, java.lang.String desckat) {
    this.kodkat = kodkat;
    this.kodxrisi = kodxrisi;
    this.desckat = desckat;
  }

  public java.lang.String getKodkat() {
    return this.kodkat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDesckat() {
    return this.desckat;
  }

  public void setKodkat(java.lang.String kodkat) {
    this.kodkat = kodkat;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDesckat(java.lang.String desckat) {
    this.desckat = desckat;
  }
}
