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

public class PrnFinalTotalMisthDto implements Serializable {
  private static final long serialVersionUID = 161371648964853822L;

  /** Description: kodfinal. */
  private java.lang.Integer kodfinal;

  /** Description: descfinal. */
  private java.lang.String descfinal;

  /** Description: datefinal. */
  private java.util.Date datefinal;

  /** Description: title. */
  private java.lang.String title;

  /** Description: aa. */
  private java.lang.Float aa;

  public PrnFinalTotalMisthDto() {}

  public PrnFinalTotalMisthDto(
      java.lang.Integer kodfinal,
      java.lang.String descfinal,
      java.util.Date datefinal,
      java.lang.String title,
      java.lang.Float aa) {
    this.kodfinal = kodfinal;
    this.descfinal = descfinal;
    this.datefinal = datefinal;
    this.title = title;
    this.aa = aa;
  }

  public java.lang.Integer getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.Float getAa() {
    return this.aa;
  }

  public void setKodfinal(java.lang.Integer kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setAa(java.lang.Float aa) {
    this.aa = aa;
  }
}
