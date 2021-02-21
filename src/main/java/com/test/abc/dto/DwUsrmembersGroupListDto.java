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

public class DwUsrmembersGroupListDto implements Serializable {
  private static final long serialVersionUID = 161371648957965669L;

  /** Description: kodgroup. */
  private java.lang.Integer kodgroup;

  /** Description: koduser. */
  private java.lang.Integer koduser;

  /** Description: username. */
  private java.lang.String username;

  /** Description: fullname. */
  private java.lang.String fullname;

  /** Description: isactive. */
  private java.lang.Integer isactive;

  public DwUsrmembersGroupListDto() {}

  public DwUsrmembersGroupListDto(
      java.lang.Integer kodgroup,
      java.lang.Integer koduser,
      java.lang.String username,
      java.lang.String fullname,
      java.lang.Integer isactive) {
    this.kodgroup = kodgroup;
    this.koduser = koduser;
    this.username = username;
    this.fullname = fullname;
    this.isactive = isactive;
  }

  public java.lang.Integer getKodgroup() {
    return this.kodgroup;
  }

  public java.lang.Integer getKoduser() {
    return this.koduser;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public java.lang.String getFullname() {
    return this.fullname;
  }

  public java.lang.Integer getIsactive() {
    return this.isactive;
  }

  public void setKodgroup(java.lang.Integer kodgroup) {
    this.kodgroup = kodgroup;
  }

  public void setKoduser(java.lang.Integer koduser) {
    this.koduser = koduser;
  }

  public void setUsername(java.lang.String username) {
    this.username = username;
  }

  public void setFullname(java.lang.String fullname) {
    this.fullname = fullname;
  }

  public void setIsactive(java.lang.Integer isactive) {
    this.isactive = isactive;
  }
}
