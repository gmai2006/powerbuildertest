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
@Table(name = "misth_report_ypal")
public class MisthReportYpal implements Serializable {
  private static final long serialVersionUID = 160992137247915240L;
  /** Description: kodreport. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodreport")
  private java.lang.Float kodreport;
  /** Description: kodypal. */
  @Basic
  @Column(name = "kodypal")
  private java.lang.Float kodypal;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  public MisthReportYpal() {}

  public java.lang.Float getKodreport() {
    return this.kodreport;
  }

  public void setKodreport(java.lang.Float kodreport) {
    this.kodreport = kodreport;
  }

  public java.lang.Float getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodypal(java.lang.Float kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }
}
