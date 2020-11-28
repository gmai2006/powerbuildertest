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
@Table(name = "misth_kratapod")
public class MisthKratapod implements Serializable {
  private static final long serialVersionUID = 160532722764068631L;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "\"kodxrisi\"")
  private String id;
  /** Description: kodkratapod. */
  @Basic
  @Column(name = "kodkratapod")
  private Float kodkratapod;
  /** Description: desckratapod. */
  @Basic
  @Column(name = "desckratapod")
  private String desckratapod;
  /** Description: apoddate. */
  @Basic
  @Column(name = "apoddate")
  private java.util.Date apoddate;

  public MisthKratapod() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Float getKodkratapod() {
    return this.kodkratapod;
  }

  public String getDesckratapod() {
    return this.desckratapod;
  }

  public java.util.Date getApoddate() {
    return this.apoddate;
  }

  public void setKodkratapod(Float kodkratapod) {
    this.kodkratapod = kodkratapod;
  }

  public void setDesckratapod(String desckratapod) {
    this.desckratapod = desckratapod;
  }

  public void setApoddate(java.util.Date apoddate) {
    this.apoddate = apoddate;
  }
}
