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
  private static final long serialVersionUID = 160532722797151632L;
  /** Description: kodgroup. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodgroup\"")
  private Float id;
  /** Description: kodaction. */
  @Basic
  @Column(name = "kodaction")
  private String kodaction;
  /** Description: editrec. */
  @Basic
  @Column(name = "editrec")
  private Integer editrec;
  /** Description: addrec. */
  @Basic
  @Column(name = "addrec")
  private Integer addrec;
  /** Description: delrec. */
  @Basic
  @Column(name = "delrec")
  private Integer delrec;
  /** Description: openlist. */
  @Basic
  @Column(name = "openlist")
  private Integer openlist;
  /** Description: openform. */
  @Basic
  @Column(name = "openform")
  private Integer openform;

  public Usrgroupperm() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public String getKodaction() {
    return this.kodaction;
  }

  public Integer getEditrec() {
    return this.editrec;
  }

  public Integer getAddrec() {
    return this.addrec;
  }

  public Integer getDelrec() {
    return this.delrec;
  }

  public Integer getOpenlist() {
    return this.openlist;
  }

  public Integer getOpenform() {
    return this.openform;
  }

  public void setKodaction(String kodaction) {
    this.kodaction = kodaction;
  }

  public void setEditrec(Integer editrec) {
    this.editrec = editrec;
  }

  public void setAddrec(Integer addrec) {
    this.addrec = addrec;
  }

  public void setDelrec(Integer delrec) {
    this.delrec = delrec;
  }

  public void setOpenlist(Integer openlist) {
    this.openlist = openlist;
  }

  public void setOpenform(Integer openform) {
    this.openform = openform;
  }
}
