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

public class DwAfxfilterListDto implements Serializable {
  private static final long serialVersionUID = 161371648903422875L;

  /** Description: kodfilter. */
  private java.lang.Float kodfilter;

  /** Description: descfilter. */
  private java.lang.String descfilter;

  /** Description: tablename. */
  private java.lang.String tablename;

  public DwAfxfilterListDto() {}

  public DwAfxfilterListDto(
      java.lang.Float kodfilter, java.lang.String descfilter, java.lang.String tablename) {
    this.kodfilter = kodfilter;
    this.descfilter = descfilter;
    this.tablename = tablename;
  }

  public java.lang.Float getKodfilter() {
    return this.kodfilter;
  }

  public java.lang.String getDescfilter() {
    return this.descfilter;
  }

  public java.lang.String getTablename() {
    return this.tablename;
  }

  public void setKodfilter(java.lang.Float kodfilter) {
    this.kodfilter = kodfilter;
  }

  public void setDescfilter(java.lang.String descfilter) {
    this.descfilter = descfilter;
  }

  public void setTablename(java.lang.String tablename) {
    this.tablename = tablename;
  }
}
