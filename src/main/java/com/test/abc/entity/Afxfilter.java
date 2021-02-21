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
@Table(name = "afxfilter")
public class Afxfilter implements Serializable {
  private static final long serialVersionUID = 161371648631685276L;
  /** Description: descfilter. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "descfilter")
  private java.lang.String descfilter;
  /** Description: kodfilter. */
  @Basic
  @Column(name = "kodfilter")
  private java.lang.Float kodfilter;
  /** Description: tablename. */
  @Basic
  @Column(name = "tablename", length = 50)
  private java.lang.String tablename;

  public Afxfilter() {}

  public java.lang.String getDescfilter() {
    return this.descfilter;
  }

  public void setDescfilter(java.lang.String descfilter) {
    this.descfilter = descfilter;
  }

  public java.lang.Float getKodfilter() {
    return this.kodfilter;
  }

  public java.lang.String getTablename() {
    return this.tablename;
  }

  public void setKodfilter(java.lang.Float kodfilter) {
    this.kodfilter = kodfilter;
  }

  public void setTablename(java.lang.String tablename) {
    this.tablename = tablename;
  }
}
