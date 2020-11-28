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

package com.test.abc.service;

import java.util.List;
import com.test.abc.entity.Afxfilterd;

public interface AfxfilterdService {
  public Afxfilterd find(Float id);
  /**
   * Select a list of Afxfilterd based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Afxfilterd records.
   */
  public List<Afxfilterd> select(int maxResult);
  /**
   * Select all Afxfilterd.
   *
   * @return all Afxfilterd records.
   */
  public List<Afxfilterd> selectAll();
  /**
   * Create Afxfilterd.
   *
   * @param bean The Afxfilterd.
   * @return The Afxfilterd.
   */
  public Afxfilterd create(Afxfilterd bean);
  /**
   * Update a Afxfilterd.
   *
   * @param bean The Afxfilterd.
   * @return Afxfilterd.
   */
  public Afxfilterd update(Afxfilterd bean);
  /**
   * Delete the Afxfilterd.
   *
   * @param id The Afxfilterd Id.
   */
  public void delete(Float id);
}
