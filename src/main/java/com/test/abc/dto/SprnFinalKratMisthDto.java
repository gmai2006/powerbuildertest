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

public class SprnFinalKratMisthDto implements Serializable {
  private static final long serialVersionUID = 161371648922797418L;

  /** Description: desckrat. */
  private java.lang.String desckrat;

  /** Description: sum. */
  private java.lang.Integer sum;

  public SprnFinalKratMisthDto() {}

  public SprnFinalKratMisthDto(java.lang.String desckrat, java.lang.Integer sum) {
    this.desckrat = desckrat;
    this.sum = sum;
  }

  public java.lang.String getDesckrat() {
    return this.desckrat;
  }

  public java.lang.Integer getSum() {
    return this.sum;
  }

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
  }

  public void setSum(java.lang.Integer sum) {
    this.sum = sum;
  }
}
