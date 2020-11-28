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
@Table(name = "misth_fylo_ypal")
public class MisthFyloYpal implements Serializable {
  private static final long serialVersionUID = 160532722788927072L;
  /** Description: kodypal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodypal\"")
  private Float id;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private String kodxrisi;
  /** Description: kodfylo. */
  @Basic
  @Column(name = "kodfylo")
  private String kodfylo;

  public MisthFyloYpal() {}

  public Float getId() {
    return id;
  }

  public void setId(Float id) {
    this.id = id;
  }

  public String getKodxrisi() {
    return this.kodxrisi;
  }

  public String getKodfylo() {
    return this.kodfylo;
  }

  public void setKodxrisi(String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodfylo(String kodfylo) {
    this.kodfylo = kodfylo;
  }
}
