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

public class DwUsractionsListDto implements Serializable {
  private static final long serialVersionUID = 161647059617981016L;

  /** Description: kodaction. */
  private java.lang.String kodaction;

  /** Description: kodapp. */
  private java.lang.String kodapp;

  /** Description: descaction. */
  private java.lang.String descaction;

  /** Description: descapp. */
  private java.lang.String descapp;

  public DwUsractionsListDto() {}

  public DwUsractionsListDto(
      java.lang.String kodaction,
      java.lang.String kodapp,
      java.lang.String descaction,
      java.lang.String descapp) {
    this.kodaction = kodaction;
    this.kodapp = kodapp;
    this.descaction = descaction;
    this.descapp = descapp;
  }

  public java.lang.String getKodaction() {
    return this.kodaction;
  }

  public java.lang.String getKodapp() {
    return this.kodapp;
  }

  public java.lang.String getDescaction() {
    return this.descaction;
  }

  public java.lang.String getDescapp() {
    return this.descapp;
  }

  public void setKodaction(java.lang.String kodaction) {
    this.kodaction = kodaction;
  }

  public void setKodapp(java.lang.String kodapp) {
    this.kodapp = kodapp;
  }

  public void setDescaction(java.lang.String descaction) {
    this.descaction = descaction;
  }

  public void setDescapp(java.lang.String descapp) {
    this.descapp = descapp;
  }
}
