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
import com.test.abc.entity.Afxfilter;

public interface AfxfilterService {
  public Afxfilter find(java.lang.String id);
  /**
   * Select a list of Afxfilter based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Afxfilter records.
   */
  public List<Afxfilter> select(int maxResult);
  /**
   * Select all Afxfilter.
   *
   * @return all Afxfilter records.
   */
  public List<Afxfilter> selectAll();
  /**
   * Create Afxfilter.
   *
   * @param bean The Afxfilter.
   * @return The Afxfilter.
   */
  public Afxfilter create(Afxfilter bean);
  /**
   * Update a Afxfilter.
   *
   * @param bean The Afxfilter.
   * @return Afxfilter.
   */
  public Afxfilter update(Afxfilter bean);
  /**
   * Delete the Afxfilter.
   *
   * @param id The Afxfilter Id.
   */
  public void delete(java.lang.String id);
}