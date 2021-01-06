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

public class SprnYpalFinalDto implements Serializable {
  private static final long serialVersionUID = 16099213769501181L;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: kodfinal. */
  private java.lang.Float kodfinal;

  /** Description: kodypal. */
  private java.lang.Float kodypal;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  /** Description: descperiod. */
  private java.lang.String descperiod;

  /** Description: aa. */
  private java.lang.Float aa;

  public SprnYpalFinalDto() {}

  public SprnYpalFinalDto(
      java.util.Date datefinal,
      java.lang.String descfinal,
      java.lang.Float kodfinal,
      java.lang.Float kodypal,
      java.util.Date plirdate,
      java.lang.String descperiod,
      java.lang.Float aa) {
    this.datefinal = datefinal;
    this.descfinal = descfinal;
    this.kodfinal = kodfinal;
    this.kodypal = kodypal;
    this.plirdate = plirdate;
    this.descperiod = descperiod;
    this.aa = aa;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.lang.Float getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.Float getKodypal() {
    return this.kodypal;
  }

  public java.util.Date getPlirdate() {
    return this.plirdate;
  }

  public java.lang.String getDescperiod() {
    return this.descperiod;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setKodfinal(java.lang.Float kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodypal(java.lang.Float kodypal) {
    this.kodypal = kodypal;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }

  public void setDescperiod(java.lang.String descperiod) {
    this.descperiod = descperiod;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
