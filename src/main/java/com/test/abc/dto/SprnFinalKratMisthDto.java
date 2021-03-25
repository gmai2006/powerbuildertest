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

public class SprnFinalKratMisthDto implements Serializable {
  private static final long serialVersionUID = 16164705962167591L;

  /** Description: desckrat. */
  private java.lang.String desckrat;

  /** Description: sum_poso. */
  private java.lang.Integer sumPoso;

  public SprnFinalKratMisthDto() {}

  public SprnFinalKratMisthDto(java.lang.String desckrat, java.lang.Integer sumPoso) {
    this.desckrat = desckrat;
    this.sumPoso = sumPoso;
  }

  public java.lang.String getDesckrat() {
    return this.desckrat;
  }

  public java.lang.Integer getSumPoso() {
    return this.sumPoso;
  }

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
  }

  public void setSumPoso(java.lang.Integer sumPoso) {
    this.sumPoso = sumPoso;
  }
}
