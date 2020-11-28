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
  private static final long serialVersionUID = 160532722795640356L;
  /** Description: kodreport. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodreport\"")
  private String id;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private String kodxrisi;
  /** Description: descreport. */
  @Basic
  @Column(name = "descreport")
  private String descreport;
  /** Description: print_margin_top. */
  @Basic
  @Column(name = "print_margin_top")
  private Integer printMarginTop;
  /** Description: print_margin_bottom. */
  @Basic
  @Column(name = "print_margin_bottom")
  private Integer printMarginBottom;
  /** Description: print_margin_left. */
  @Basic
  @Column(name = "print_margin_left")
  private Integer printMarginLeft;
  /** Description: print_margin_right. */
  @Basic
  @Column(name = "print_margin_right")
  private Integer printMarginRight;
  /** Description: print_orientation. */
  @Basic
  @Column(name = "print_orientation")
  private Integer printOrientation;
  /** Description: print_paper_size. */
  @Basic
  @Column(name = "print_paper_size")
  private Integer printPaperSize;
  /** Description: print_scale. */
  @Basic
  @Column(name = "print_scale")
  private Integer printScale;
  /** Description: subtitle. */
  @Basic
  @Column(name = "subtitle")
  private String subtitle;
  /** Description: prn_notes1. */
  @Basic
  @Column(name = "prn_notes1")
  private String prnNotes1;
  /** Description: prn_notes2. */
  @Basic
  @Column(name = "prn_notes2")
  private String prnNotes2;

  public MisthReport() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKodxrisi() {
    return this.kodxrisi;
  }

  public String getDescreport() {
    return this.descreport;
  }

  public Integer getPrintMarginTop() {
    return this.printMarginTop;
  }

  public Integer getPrintMarginBottom() {
    return this.printMarginBottom;
  }

  public Integer getPrintMarginLeft() {
    return this.printMarginLeft;
  }

  public Integer getPrintMarginRight() {
    return this.printMarginRight;
  }

  public Integer getPrintOrientation() {
    return this.printOrientation;
  }

  public Integer getPrintPaperSize() {
    return this.printPaperSize;
  }

  public Integer getPrintScale() {
    return this.printScale;
  }

  public String getSubtitle() {
    return this.subtitle;
  }

  public String getPrnNotes1() {
    return this.prnNotes1;
  }

  public String getPrnNotes2() {
    return this.prnNotes2;
  }

  public void setKodxrisi(String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setDescreport(String descreport) {
    this.descreport = descreport;
  }

  public void setPrintMarginTop(Integer printMarginTop) {
    this.printMarginTop = printMarginTop;
  }

  public void setPrintMarginBottom(Integer printMarginBottom) {
    this.printMarginBottom = printMarginBottom;
  }

  public void setPrintMarginLeft(Integer printMarginLeft) {
    this.printMarginLeft = printMarginLeft;
  }

  public void setPrintMarginRight(Integer printMarginRight) {
    this.printMarginRight = printMarginRight;
  }

  public void setPrintOrientation(Integer printOrientation) {
    this.printOrientation = printOrientation;
  }

  public void setPrintPaperSize(Integer printPaperSize) {
    this.printPaperSize = printPaperSize;
  }

  public void setPrintScale(Integer printScale) {
    this.printScale = printScale;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public void setPrnNotes1(String prnNotes1) {
    this.prnNotes1 = prnNotes1;
  }

  public void setPrnNotes2(String prnNotes2) {
    this.prnNotes2 = prnNotes2;
  }
}
