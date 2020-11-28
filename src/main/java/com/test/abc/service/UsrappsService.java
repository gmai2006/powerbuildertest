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
import com.test.abc.entity.Usrapps;

public interface UsrappsService {
  public Usrapps find(String id);
  /**
   * Select a list of Usrapps based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Usrapps records.
   */
  public List<Usrapps> select(int maxResult);
  /**
   * Select all Usrapps.
   *
   * @return all Usrapps records.
   */
  public List<Usrapps> selectAll();
  /**
   * Create Usrapps.
   *
   * @param bean The Usrapps.
   * @return The Usrapps.
   */
  public Usrapps create(Usrapps bean);
  /**
   * Update a Usrapps.
   *
   * @param bean The Usrapps.
   * @return Usrapps.
   */
  public Usrapps update(Usrapps bean);
  /**
   * Delete the Usrapps.
   *
   * @param id The Usrapps Id.
   */
  public void delete(String id);
}
