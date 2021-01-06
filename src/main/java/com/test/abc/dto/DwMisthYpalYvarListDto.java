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

public class DwMisthYpalYvarListDto implements Serializable {
  private static final long serialVersionUID = 160992137685322393L;

  /** Description: kodypal. */
  private java.lang.Float kodypal;

  /** Description: kodyvar. */
  private java.lang.String kodyvar;

  /** Description: kodxrisi. */
  private java.lang.String kodxrisi;

  /** Description: aa. */
  private java.lang.Integer aa;

  /** Description: expr. */
  private java.lang.String expr;

  public DwMisthYpalYvarListDto() {}

  public DwMisthYpalYvarListDto(
      java.lang.Float kodypal,
      java.lang.String kodyvar,
      java.lang.String kodxrisi,
      java.lang.Integer aa,
      java.lang.String expr) {
    this.kodypal = kodypal;
    this.kodyvar = kodyvar;
    this.kodxrisi = kodxrisi;
    this.aa = aa;
    this.expr = expr;
  }

  public java.lang.Float getKodypal() {
    return this.kodypal;
  }

  public java.lang.String getKodyvar() {
    return this.kodyvar;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Integer getAa() {
    return this.aa;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public void setKodypal(java.lang.Float kodypal) {
    this.kodypal = kodypal;
  }

  public void setKodyvar(java.lang.String kodyvar) {
    this.kodyvar = kodyvar;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setAa(java.lang.Integer aa) {
    this.aa = aa;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }
}
