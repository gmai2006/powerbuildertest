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

public class PickMisthZpthesiXrisiDto implements Serializable {
  private static final long serialVersionUID = 161647059617280543L;

  /** Description: kodthesi. */
  private java.lang.String kodthesi;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descthesi. */
  private java.lang.String descthesi;

  public PickMisthZpthesiXrisiDto() {}

  public PickMisthZpthesiXrisiDto(
      java.lang.String kodthesi, java.lang.String kodxrisi, java.lang.String descthesi) {
    this.kodthesi = kodthesi;
    this.kodxrisi = kodxrisi;
    this.descthesi = descthesi;
  }

  public java.lang.String getKodthesi() {
    return this.kodthesi;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescthesi() {
    return this.descthesi;
  }

  public void setKodthesi(java.lang.String kodthesi) {
    this.kodthesi = kodthesi;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescthesi(java.lang.String descthesi) {
    this.descthesi = descthesi;
  }
}
