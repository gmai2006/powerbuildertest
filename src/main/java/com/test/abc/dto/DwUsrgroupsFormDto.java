/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.test.abc.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class DwUsrgroupsFormDto implements Serializable {
  private static final long serialVersionUID = 161647059676543129L;

  /** Description: kodgroup. */
  private java.lang.Integer kodgroup;

  /** Description: descgroup. */
  private java.lang.String descgroup;

  public DwUsrgroupsFormDto() {}

  public DwUsrgroupsFormDto(java.lang.Integer kodgroup, java.lang.String descgroup) {
    this.kodgroup = kodgroup;
    this.descgroup = descgroup;
  }

  public java.lang.Integer getKodgroup() {
    return this.kodgroup;
  }

  public java.lang.String getDescgroup() {
    return this.descgroup;
  }

  public void setKodgroup(java.lang.Integer kodgroup) {
    this.kodgroup = kodgroup;
  }

  public void setDescgroup(java.lang.String descgroup) {
    this.descgroup = descgroup;
  }
}
