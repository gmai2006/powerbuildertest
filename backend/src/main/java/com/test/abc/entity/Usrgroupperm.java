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
@Table(name = "usrgroupperm")
public class Usrgroupperm implements Serializable {
  private static final long serialVersionUID = 161096103736560500L;
  /** Description: kodgroup. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodgroup")
  private java.lang.Integer kodgroup;
  /** Description: openlist. */
  @Basic
  @Column(name = "openlist")
  private java.lang.Integer openlist;
  /** Description: editrec. */
  @Basic
  @Column(name = "editrec")
  private java.lang.Integer editrec;
  /** Description: addrec. */
  @Basic
  @Column(name = "addrec")
  private java.lang.Integer addrec;
  /** Description: delrec. */
  @Basic
  @Column(name = "delrec")
  private java.lang.Integer delrec;
  /** Description: kodaction. */
  @Basic
  @Column(name = "kodaction", length = 64)
  private java.lang.String kodaction;
  /** Description: openform. */
  @Basic
  @Column(name = "openform")
  private java.lang.Integer openform;

  public Usrgroupperm() {}

  public java.lang.Integer getKodgroup() {
    return this.kodgroup;
  }

  public void setKodgroup(java.lang.Integer kodgroup) {
    this.kodgroup = kodgroup;
  }

  public java.lang.Integer getOpenlist() {
    return this.openlist;
  }

  public java.lang.Integer getEditrec() {
    return this.editrec;
  }

  public java.lang.Integer getAddrec() {
    return this.addrec;
  }

  public java.lang.Integer getDelrec() {
    return this.delrec;
  }

  public java.lang.String getKodaction() {
    return this.kodaction;
  }

  public java.lang.Integer getOpenform() {
    return this.openform;
  }

  public void setOpenlist(java.lang.Integer openlist) {
    this.openlist = openlist;
  }

  public void setEditrec(java.lang.Integer editrec) {
    this.editrec = editrec;
  }

  public void setAddrec(java.lang.Integer addrec) {
    this.addrec = addrec;
  }

  public void setDelrec(java.lang.Integer delrec) {
    this.delrec = delrec;
  }

  public void setKodaction(java.lang.String kodaction) {
    this.kodaction = kodaction;
  }

  public void setOpenform(java.lang.Integer openform) {
    this.openform = openform;
  }
}
