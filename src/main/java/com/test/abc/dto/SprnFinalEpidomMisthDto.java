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

public class SprnFinalEpidomMisthDto implements Serializable {
  private static final long serialVersionUID = 160992137680192068L;

  /** Description: descepidom. */
  private java.lang.String descepidom;

  /** Description: sum_poso. */
  private java.lang.Integer sumPoso;

  public SprnFinalEpidomMisthDto() {}

  public SprnFinalEpidomMisthDto(java.lang.String descepidom, java.lang.Integer sumPoso) {
    this.descepidom = descepidom;
    this.sumPoso = sumPoso;
  }

  public java.lang.String getDescepidom() {
    return this.descepidom;
  }

  public java.lang.Integer getSumPoso() {
    return this.sumPoso;
  }

  public void setDescepidom(java.lang.String descepidom) {
    this.descepidom = descepidom;
  }

  public void setSumPoso(java.lang.Integer sumPoso) {
    this.sumPoso = sumPoso;
  }
}
