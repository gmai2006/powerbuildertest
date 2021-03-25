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

public class DwAfxfilterdListDto implements Serializable {
  private static final long serialVersionUID = 161647059622373201L;

  /** Description: kodfilterd. */
  private java.lang.Float kodfilterd;

  /** Description: kodfilter. */
  private java.lang.Float kodfilter;

  /** Description: pedio. */
  private java.lang.String pedio;

  /** Description: telestis. */
  private java.lang.String telestis;

  /** Description: timi. */
  private java.lang.String timi;

  /** Description: joint. */
  private java.lang.String joint;

  public DwAfxfilterdListDto() {}

  public DwAfxfilterdListDto(
      java.lang.Float kodfilterd,
      java.lang.Float kodfilter,
      java.lang.String pedio,
      java.lang.String telestis,
      java.lang.String timi,
      java.lang.String joint) {
    this.kodfilterd = kodfilterd;
    this.kodfilter = kodfilter;
    this.pedio = pedio;
    this.telestis = telestis;
    this.timi = timi;
    this.joint = joint;
  }

  public java.lang.Float getKodfilterd() {
    return this.kodfilterd;
  }

  public java.lang.Float getKodfilter() {
    return this.kodfilter;
  }

  public java.lang.String getPedio() {
    return this.pedio;
  }

  public java.lang.String getTelestis() {
    return this.telestis;
  }

  public java.lang.String getTimi() {
    return this.timi;
  }

  public java.lang.String getJoint() {
    return this.joint;
  }

  public void setKodfilterd(java.lang.Float kodfilterd) {
    this.kodfilterd = kodfilterd;
  }

  public void setKodfilter(java.lang.Float kodfilter) {
    this.kodfilter = kodfilter;
  }

  public void setPedio(java.lang.String pedio) {
    this.pedio = pedio;
  }

  public void setTelestis(java.lang.String telestis) {
    this.telestis = telestis;
  }

  public void setTimi(java.lang.String timi) {
    this.timi = timi;
  }

  public void setJoint(java.lang.String joint) {
    this.joint = joint;
  }
}
