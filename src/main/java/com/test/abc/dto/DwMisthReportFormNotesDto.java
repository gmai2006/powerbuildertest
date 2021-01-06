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

public class DwMisthReportFormNotesDto implements Serializable {
  private static final long serialVersionUID = 160992137643053474L;

  /** Description: kodreport. */
  private java.lang.String kodreport;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: descreport. */
  private java.lang.String descreport;

  /** Description: print_margin_top. */
  private java.lang.Integer printMarginTop;

  /** Description: print_margin_bottom. */
  private java.lang.Integer printMarginBottom;

  /** Description: print_margin_left. */
  private java.lang.Integer printMarginLeft;

  /** Description: print_margin_right. */
  private java.lang.Integer printMarginRight;

  /** Description: print_orientation. */
  private java.lang.Integer printOrientation;

  /** Description: print_paper_size. */
  private java.lang.Integer printPaperSize;

  /** Description: print_scale. */
  private java.lang.Integer printScale;

  /** Description: subtitle. */
  private java.lang.String subtitle;

  /** Description: prn_notes1. */
  private java.lang.String prnNotes1;

  /** Description: prn_notes2. */
  private java.lang.String prnNotes2;

  public DwMisthReportFormNotesDto() {}

  public DwMisthReportFormNotesDto(
      java.lang.String kodreport,
      java.lang.String kodxrisi,
      java.lang.String descreport,
      java.lang.Integer printMarginTop,
      java.lang.Integer printMarginBottom,
      java.lang.Integer printMarginLeft,
      java.lang.Integer printMarginRight,
      java.lang.Integer printOrientation,
      java.lang.Integer printPaperSize,
      java.lang.Integer printScale,
      java.lang.String subtitle,
      java.lang.String prnNotes1,
      java.lang.String prnNotes2) {
    this.kodreport = kodreport;
    this.kodxrisi = kodxrisi;
    this.descreport = descreport;
    this.printMarginTop = printMarginTop;
    this.printMarginBottom = printMarginBottom;
    this.printMarginLeft = printMarginLeft;
    this.printMarginRight = printMarginRight;
    this.printOrientation = printOrientation;
    this.printPaperSize = printPaperSize;
    this.printScale = printScale;
    this.subtitle = subtitle;
    this.prnNotes1 = prnNotes1;
    this.prnNotes2 = prnNotes2;
  }

  public java.lang.String getKodreport() {
    return this.kodreport;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getDescreport() {
    return this.descreport;
  }

  public java.lang.Integer getPrintMarginTop() {
    return this.printMarginTop;
  }

  public java.lang.Integer getPrintMarginBottom() {
    return this.printMarginBottom;
  }

  public java.lang.Integer getPrintMarginLeft() {
    return this.printMarginLeft;
  }

  public java.lang.Integer getPrintMarginRight() {
    return this.printMarginRight;
  }

  public java.lang.Integer getPrintOrientation() {
    return this.printOrientation;
  }

  public java.lang.Integer getPrintPaperSize() {
    return this.printPaperSize;
  }

  public java.lang.Integer getPrintScale() {
    return this.printScale;
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

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescreport(java.lang.String descreport) {
    this.descreport = descreport;
  }

  public void setPrintMarginTop(java.lang.Integer printMarginTop) {
    this.printMarginTop = printMarginTop;
  }

  public void setPrintMarginBottom(java.lang.Integer printMarginBottom) {
    this.printMarginBottom = printMarginBottom;
  }

  public void setPrintMarginLeft(java.lang.Integer printMarginLeft) {
    this.printMarginLeft = printMarginLeft;
  }

  public void setPrintMarginRight(java.lang.Integer printMarginRight) {
    this.printMarginRight = printMarginRight;
  }

  public void setPrintOrientation(java.lang.Integer printOrientation) {
    this.printOrientation = printOrientation;
  }

  public void setPrintPaperSize(java.lang.Integer printPaperSize) {
    this.printPaperSize = printPaperSize;
  }

  public void setPrintScale(java.lang.Integer printScale) {
    this.printScale = printScale;
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
