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

public class SprnReport2Dto implements Serializable {
  private static final long serialVersionUID = 161647059581782648L;

  /** Description: kodreport. */
  private java.lang.String kodreport;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: surname. */
  private java.lang.String surname;

  /** Description: name. */
  private java.lang.String name;

  /** Description: fathername. */
  private java.lang.String fathername;

  /** Description: subtitle. */
  private java.lang.String subtitle;

  /** Description: prn_notes1. */
  private java.lang.String prnNotes1;

  /** Description: prn_notes2. */
  private java.lang.String prnNotes2;

  public SprnReport2Dto() {}

  public SprnReport2Dto(
      java.lang.String kodreport,
      java.lang.Integer kodypal,
      java.lang.String kodxrisi,
      java.lang.String surname,
      java.lang.String name,
      java.lang.String fathername,
      java.lang.String subtitle,
      java.lang.String prnNotes1,
      java.lang.String prnNotes2) {
    this.kodreport = kodreport;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.surname = surname;
    this.name = name;
    this.fathername = fathername;
    this.subtitle = subtitle;
    this.prnNotes1 = prnNotes1;
    this.prnNotes2 = prnNotes2;
  }

  public java.lang.String getKodreport() {
    return this.kodreport;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getSurname() {
    return this.surname;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getFathername() {
    return this.fathername;
  }

  public java.lang.String getSubtitle() {
    return this.subtitle;
  }

  public java.lang.String getPrnNotes1() {
    return this.prnNotes1;
  }

  public java.lang.String getPrnNotes2() {
    return this.prnNotes2;
  }

  public void setKodreport(java.lang.String kodreport) {
    this.kodreport = kodreport;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setSurname(java.lang.String surname) {
    this.surname = surname;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setFathername(java.lang.String fathername) {
    this.fathername = fathername;
  }

  public void setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
  }

  public void setPrnNotes1(java.lang.String prnNotes1) {
    this.prnNotes1 = prnNotes1;
  }

  public void setPrnNotes2(java.lang.String prnNotes2) {
    this.prnNotes2 = prnNotes2;
  }
}
