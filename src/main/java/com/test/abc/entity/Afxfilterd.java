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
@Table(name = "afxfilterd")
public class Afxfilterd implements Serializable {
  private static final long serialVersionUID = 160532722815770766L;
  /** Description: kodfilterd. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodfilterd\"")
  private Float id;
  /** Description: kodfilter. */
  @Basic
  @Column(name = "kodfilter")
  private Float kodfilter;
  /** Description: pedio. */
  @Basic
  @Column(name = "pedio")
  private String pedio;
  /** Description: telestis. */
  @Basic
  @Column(name = "telestis")
  private String telestis;
  /** Description: timi. */
  @Basic
  @Column(name = "timi")
  private String timi;
  /** Description: joint. */
  @Basic
  @Column(name = "joint")
  private String joint;

  public Afxfilterd() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public Float getKodfilter() {
    return this.kodfilter;
  }

  public String getPedio() {
    return this.pedio;
  }

  public String getTelestis() {
    return this.telestis;
  }

  public String getTimi() {
    return this.timi;
  }

  public String getJoint() {
    return this.joint;
  }

  public void setKodfilter(Float kodfilter) {
    this.kodfilter = kodfilter;
  }

  public void setPedio(String pedio) {
    this.pedio = pedio;
  }

  public void setTelestis(String telestis) {
    this.telestis = telestis;
  }

  public void setTimi(String timi) {
    this.timi = timi;
  }

  public void setJoint(String joint) {
    this.joint = joint;
  }
}
