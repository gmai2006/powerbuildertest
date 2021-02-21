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

public class SprnYpalPeriodKratDto implements Serializable {
  private static final long serialVersionUID = 161371648905039187L;

  /** Description: desckrat. */
  private java.lang.String desckrat;

  /** Description: poso. */
  private java.lang.Integer poso;

  /** Description: notes. */
  private java.lang.String notes;

  /** Description: sum. */
  private java.lang.Integer sum;

  public SprnYpalPeriodKratDto() {}

  public SprnYpalPeriodKratDto(
      java.lang.String desckrat,
      java.lang.Integer poso,
      java.lang.String notes,
      java.lang.Integer sum) {
    this.desckrat = desckrat;
    this.poso = poso;
    this.notes = notes;
    this.sum = sum;
  }

  public java.lang.String getDesckrat() {
    return this.desckrat;
  }

  public java.lang.Integer getPoso() {
    return this.poso;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public java.lang.Integer getSum() {
    return this.sum;
  }

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
  }

  public void setPoso(java.lang.Integer poso) {
    this.poso = poso;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }

  public void setSum(java.lang.Integer sum) {
    this.sum = sum;
  }
}