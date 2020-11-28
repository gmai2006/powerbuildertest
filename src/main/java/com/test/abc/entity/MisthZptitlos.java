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
@Table(name = "misth_zptitlos")
public class MisthZptitlos implements Serializable {
  private static final long serialVersionUID = 160532722822674708L;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodxrisi\"")
  private String id;
  /** Description: kodtitlos. */
  @Basic
  @Column(name = "kodtitlos")
  private String kodtitlos;
  /** Description: desctitlos. */
  @Basic
  @Column(name = "desctitlos")
  private String desctitlos;

  public MisthZptitlos() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKodtitlos() {
    return this.kodtitlos;
  }

  public String getDesctitlos() {
    return this.desctitlos;
  }

  public void setKodtitlos(String kodtitlos) {
    this.kodtitlos = kodtitlos;
  }

  public void setDesctitlos(String desctitlos) {
    this.desctitlos = desctitlos;
  }
}
