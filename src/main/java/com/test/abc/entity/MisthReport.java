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

package com.test.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

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

@Entity
@Table(name = "misth_report")
public class MisthReport implements Serializable {
  private static final long serialVersionUID = 160992137245384550L;
  /** Description: kodreport. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodreport")
  private java.lang.String kodreport;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: descreport. */
  @Basic
  @Column(name = "descreport")
  private java.lang.String descreport;
  /** Description: print_margin_top. */
  @Basic
  @Column(name = "print_margin_top")
  private java.lang.Integer printMarginTop;
  /** Description: print_margin_bottom. */
  @Basic
  @Column(name = "print_margin_bottom")
  private java.lang.Integer printMarginBottom;
  /** Description: print_margin_left. */
  @Basic
  @Column(name = "print_margin_left")
  private java.lang.Integer printMarginLeft;
  /** Description: print_margin_right. */
  @Basic
  @Column(name = "print_margin_right")
  private java.lang.Integer printMarginRight;
  /** Description: print_orientation. */
  @Basic
  @Column(name = "print_orientation")
  private java.lang.Integer printOrientation;
  /** Description: print_paper_size. */
  @Basic
  @Column(name = "print_paper_size")
  private java.lang.Integer printPaperSize;
  /** Description: print_scale. */
  @Basic
  @Column(name = "print_scale")
  private java.lang.Integer printScale;
  /** Description: subtitle. */
  @Basic
  @Column(name = "subtitle")
  private java.lang.String subtitle;
  /** Description: prn_notes1. */
  @Basic
  @Column(name = "prn_notes1")
  private java.lang.String prnNotes1;
  /** Description: prn_notes2. */
  @Basic
  @Column(name = "prn_notes2")
  private java.lang.String prnNotes2;

  public MisthReport() {}

  public java.lang.String getKodreport() {
    return this.kodreport;
  }

  public void setKodreport(java.lang.String kodreport) {
    this.kodreport = kodreport;
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
