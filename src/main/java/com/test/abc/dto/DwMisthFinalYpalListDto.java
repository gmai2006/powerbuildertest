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

public class DwMisthFinalYpalListDto implements Serializable {
  private static final long serialVersionUID = 161096104232680566L;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: kodypal. */
  private java.lang.Integer kodypal;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  /** Description: cm_paid. */
  private java.lang.Integer cmPaid;

  public DwMisthFinalYpalListDto() {}

  public DwMisthFinalYpalListDto(
      java.util.Date datefinal,
      java.lang.String descfinal,
      java.lang.Integer kodfinal,
      java.lang.Integer kodypal,
      java.util.Date plirdate,
      java.lang.Integer cmPaid) {
    this.datefinal = datefinal;
    this.descfinal = descfinal;
    this.kodfinal = kodfinal;
    this.kodypal = kodypal;
    this.plirdate = plirdate;
    this.cmPaid = cmPaid;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.Integer getKodypal() {
    return this.kodypal;
  }

  public java.util.Date getPlirdate() {
    return this.plirdate;
  }

  public java.lang.Integer getCmPaid() {
    return this.cmPaid;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodypal(java.lang.Integer kodypal) {
    this.kodypal = kodypal;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }

  public void setCmPaid(java.lang.Integer cmPaid) {
    this.cmPaid = cmPaid;
  }
}
