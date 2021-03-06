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

public class DwMisthZpyvarFormDto implements Serializable {
  private static final long serialVersionUID = 161647059615351738L;

  /** Description: kodyvar. */
  private java.lang.String kodyvar;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descyvar. */
  private java.lang.String descyvar;

  /** Description: expr. */
  private java.lang.String expr;

  public DwMisthZpyvarFormDto() {}

  public DwMisthZpyvarFormDto(
      java.lang.String kodyvar,
      java.lang.String kodxrisi,
      java.lang.String descyvar,
      java.lang.String expr) {
    this.kodyvar = kodyvar;
    this.kodxrisi = kodxrisi;
    this.descyvar = descyvar;
    this.expr = expr;
  }

  public java.lang.String getKodyvar() {
    return this.kodyvar;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescyvar() {
    return this.descyvar;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public void setKodyvar(java.lang.String kodyvar) {
    this.kodyvar = kodyvar;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescyvar(java.lang.String descyvar) {
    this.descyvar = descyvar;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }
}
