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
@Table(name = "misth_fylo")
public class MisthFylo implements Serializable {
  private static final long serialVersionUID = 161371648635945756L;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: descfylo. */
  @Basic
  @Column(name = "descfylo", length = 50)
  private java.lang.String descfylo;
  /** Description: kodfylo. */
  @Basic
  @Column(name = "kodfylo", length = 4)
  private java.lang.String kodfylo;

  public MisthFylo() {}

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getDescfylo() {
    return this.descfylo;
  }

  public java.lang.String getKodfylo() {
    return this.kodfylo;
  }

  public void setDescfylo(java.lang.String descfylo) {
    this.descfylo = descfylo;
  }

  public void setKodfylo(java.lang.String kodfylo) {
    this.kodfylo = kodfylo;
  }
}