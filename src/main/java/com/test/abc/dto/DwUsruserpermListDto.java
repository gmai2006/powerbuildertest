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

public class DwUsruserpermListDto implements Serializable {
  private static final long serialVersionUID = 161647059654224563L;

  /** Description: kodapp. */
  private java.lang.String kodapp;

  /** Description: koduser. */
  private java.lang.Integer koduser;

  /** Description: enable. */
  private java.lang.Integer enable;

  /** Description: descapp. */
  private java.lang.String descapp;

  public DwUsruserpermListDto() {}

  public DwUsruserpermListDto(
      java.lang.String kodapp,
      java.lang.Integer koduser,
      java.lang.Integer enable,
      java.lang.String descapp) {
    this.kodapp = kodapp;
    this.koduser = koduser;
    this.enable = enable;
    this.descapp = descapp;
  }

  public java.lang.String getKodapp() {
    return this.kodapp;
  }

  public java.lang.Integer getKoduser() {
    return this.koduser;
  }

  public java.lang.Integer getEnable() {
    return this.enable;
  }

  public java.lang.String getDescapp() {
    return this.descapp;
  }

  public void setKodapp(java.lang.String kodapp) {
    this.kodapp = kodapp;
  }

  public void setKoduser(java.lang.Integer koduser) {
    this.koduser = koduser;
  }

  public void setEnable(java.lang.Integer enable) {
    this.enable = enable;
  }

  public void setDescapp(java.lang.String descapp) {
    this.descapp = descapp;
  }
}
