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
import com.test.abc.entity.Afxptoseis;

public interface AfxptoseisService {
  public Afxptoseis find(String id);
  /**
   * Select a list of Afxptoseis based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Afxptoseis records.
   */
  public List<Afxptoseis> select(int maxResult);
  /**
   * Select all Afxptoseis.
   *
   * @return all Afxptoseis records.
   */
  public List<Afxptoseis> selectAll();
  /**
   * Create Afxptoseis.
   *
   * @param bean The Afxptoseis.
   * @return The Afxptoseis.
   */
  public Afxptoseis create(Afxptoseis bean);
  /**
   * Update a Afxptoseis.
   *
   * @param bean The Afxptoseis.
   * @return Afxptoseis.
   */
  public Afxptoseis update(Afxptoseis bean);
  /**
   * Delete the Afxptoseis.
   *
   * @param id The Afxptoseis Id.
   */
  public void delete(String id);
}