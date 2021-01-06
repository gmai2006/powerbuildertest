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

public class PickMisthReportXrisiDto implements Serializable {
  private static final long serialVersionUID = 160992137743928588L;

  /** Description: kodreport. */
  private java.lang.String kodreport;

  /** Description: descreport. */
  private java.lang.String descreport;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  public PickMisthReportXrisiDto() {}

  public PickMisthReportXrisiDto(
      java.lang.String kodreport, java.lang.String descreport, java.lang.String kodxrisi) {
    this.kodreport = kodreport;
    this.descreport = descreport;
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getKodreport() {
    return this.kodreport;
  }

  public java.lang.String getDescreport() {
    return this.descreport;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodreport(java.lang.String kodreport) {
    this.kodreport = kodreport;
  }

  public void setDescreport(java.lang.String descreport) {
    this.descreport = descreport;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }
}
