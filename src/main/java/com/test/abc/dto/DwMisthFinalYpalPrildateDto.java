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

public class DwMisthFinalYpalPrildateDto implements Serializable {
  private static final long serialVersionUID = 160992137677254445L;

  /** Description: kodfinal. */
  private java.lang.Float kodfinal;

  /** Description: kodypal. */
  private java.lang.Float kodypal;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: plirdate. */
  private java.util.Date plirdate;

  public DwMisthFinalYpalPrildateDto() {}

  public DwMisthFinalYpalPrildateDto(
      java.lang.Float kodfinal,
      java.lang.Float kodypal,
      java.lang.String kodxrisi,
      java.util.Date plirdate) {
    this.kodfinal = kodfinal;
    this.kodypal = kodypal;
    this.kodxrisi = kodxrisi;
    this.plirdate = plirdate;
  }

  public java.lang.Float getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.Float getKodypal() {
    return this.kodypal;
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

  public void setKodypal(java.lang.Float kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setPlirdate(java.util.Date plirdate) {
    this.plirdate = plirdate;
  }
}
