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

public class DwUsrgrouppermListDto implements Serializable {
  private static final long serialVersionUID = 161371648933040352L;

  /** Description: kodgroup. */
  private java.lang.Integer kodgroup;

  /** Description: kodaction. */
  private java.lang.String kodaction;

  /** Description: editrec. */
  private java.lang.Integer editrec;

  /** Description: addrec. */
  private java.lang.Integer addrec;

  /** Description: delrec. */
  private java.lang.Integer delrec;

  /** Description: openlist. */
  private java.lang.Integer openlist;

  /** Description: openform. */
  private java.lang.Integer openform;

  /** Description: descapp. */
  private java.lang.String descapp;

  /** Description: descaction. */
  private java.lang.String descaction;

  public DwUsrgrouppermListDto() {}

  public DwUsrgrouppermListDto(
      java.lang.Integer kodgroup,
      java.lang.String kodaction,
      java.lang.Integer editrec,
      java.lang.Integer addrec,
      java.lang.Integer delrec,
      java.lang.Integer openlist,
      java.lang.Integer openform,
      java.lang.String descapp,
      java.lang.String descaction) {
    this.kodgroup = kodgroup;
    this.kodaction = kodaction;
    this.editrec = editrec;
    this.addrec = addrec;
    this.delrec = delrec;
    this.openlist = openlist;
    this.openform = openform;
    this.descapp = descapp;
    this.descaction = descaction;
  }

  public java.lang.Integer getKodgroup() {
    return this.kodgroup;
  }

  public java.lang.String getKodaction() {
    return this.kodaction;
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

  public java.lang.Integer getOpenlist() {
    return this.openlist;
  }

  public java.lang.Integer getOpenform() {
    return this.openform;
  }

  public java.lang.String getDescapp() {
    return this.descapp;
  }

  public java.lang.String getDescaction() {
    return this.descaction;
  }

  public void setKodgroup(java.lang.Integer kodgroup) {
    this.kodgroup = kodgroup;
  }

  public void setKodaction(java.lang.String kodaction) {
    this.kodaction = kodaction;
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

  public void setOpenlist(java.lang.Integer openlist) {
    this.openlist = openlist;
  }

  public void setOpenform(java.lang.Integer openform) {
    this.openform = openform;
  }

  public void setDescapp(java.lang.String descapp) {
    this.descapp = descapp;
  }

  public void setDescaction(java.lang.String descaction) {
    this.descaction = descaction;
  }
}
