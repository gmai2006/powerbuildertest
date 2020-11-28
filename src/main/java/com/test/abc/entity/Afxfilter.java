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
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
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

//@SqlResultSetMapping(
//    name="afxfiltertest",
//    classes={
//        @ConstructorResult(
//            targetClass=com.test.abc.dto.TestDto.class,
//            columns={
//                @ColumnResult(name="descfilter", type=String.class),
//                @ColumnResult(name="tablename", type=String.class),
//            })})

//@NamedNativeQuery(name = "test",
//    query = "SELECT descfilter, tablename FROM afxfilter",
//    resultSetMapping = "afxfiltertest")

@Entity
@Table(name = "afxfilter")
public class Afxfilter implements Serializable {
  private static final long serialVersionUID = 160532722819255619L;
  /** Description: kodfilter. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodfilter\"")
  private Float id;
  /** Description: descfilter. */
  @Basic
  @Column(name = "descfilter")
  private String descfilter;
  /** Description: tablename. */
  @Basic
  @Column(name = "tablename")
  private String tablename;

  public Afxfilter() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public String getDescfilter() {
    return this.descfilter;
  }

  public String getTablename() {
    return this.tablename;
  }

  public void setDescfilter(String descfilter) {
    this.descfilter = descfilter;
  }

  public void setTablename(String tablename) {
    this.tablename = tablename;
  }
}
