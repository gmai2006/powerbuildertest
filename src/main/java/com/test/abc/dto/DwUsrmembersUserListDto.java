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

public class DwUsrmembersUserListDto implements Serializable {
  private static final long serialVersionUID = 160992137719573000L;

  /** Description: kodgroup. */
  private java.lang.Float kodgroup;

  /** Description: koduser. */
  private java.lang.Float koduser;

  /** Description: descgroup. */
  private java.lang.String descgroup;

  public DwUsrmembersUserListDto() {}

  public DwUsrmembersUserListDto(
      java.lang.Float kodgroup, java.lang.Float koduser, java.lang.String descgroup) {
    this.kodgroup = kodgroup;
    this.koduser = koduser;
    this.descgroup = descgroup;
  }

  public java.lang.Float getKodgroup() {
    return this.kodgroup;
  }

  public java.lang.Float getKoduser() {
    return this.koduser;
  }

  public java.lang.String getDescgroup() {
    return this.descgroup;
  }

  public void setKodgroup(java.lang.Float kodgroup) {
    this.kodgroup = kodgroup;
  }

  public void setKoduser(java.lang.Float koduser) {
    this.koduser = koduser;
  }

  public void setDescgroup(java.lang.String descgroup) {
    this.descgroup = descgroup;
  }
}
