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

public class DwAfxptoseisListDto implements Serializable {
  private static final long serialVersionUID = 161647059641349770L;

  /** Description: onom. */
  private java.lang.String onom;

  /** Description: gen. */
  private java.lang.String gen;

  /** Description: ait. */
  private java.lang.String ait;

  public DwAfxptoseisListDto() {}

  public DwAfxptoseisListDto(java.lang.String onom, java.lang.String gen, java.lang.String ait) {
    this.onom = onom;
    this.gen = gen;
    this.ait = ait;
  }

  public java.lang.String getOnom() {
    return this.onom;
  }

  public java.lang.String getGen() {
    return this.gen;
  }

  public java.lang.String getAit() {
    return this.ait;
  }

  public void setOnom(java.lang.String onom) {
    this.onom = onom;
  }

  public void setGen(java.lang.String gen) {
    this.gen = gen;
  }

  public void setAit(java.lang.String ait) {
    this.ait = ait;
  }
}
