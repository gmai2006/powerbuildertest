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
@Table(name = "misth_final_ypal")
public class MisthFinalYpal implements Serializable {
  private static final long serialVersionUID = 160992137252342551L;
  /** Description: kodypal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodypal")
  private java.lang.Float kodypal;
  /** Description: kodfinal. */
  @Basic
  @Column(name = "kodfinal")
  private java.lang.Float kodfinal;
  /** Description: kodxrisi. */
  @Basic
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: plirdate. */
  @Basic
  @Column(name = "plirdate")
  private java.util.Date plirdate;

  public MisthFinalYpal() {}

  public java.lang.Float getKodypal() {
    return this.kodypal;
  }

  public void setKodypal(java.lang.Float kodypal) {
    this.kodypal = kodypal;
  }

  public java.lang.Float getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.util.Date getPlirdate() {
    return this.plirdate;
  }

  public void setKodfinal(java.lang.Float kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }
}
