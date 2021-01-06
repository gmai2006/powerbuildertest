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
import com.test.abc.entity.Usruserperm;

public interface UsruserpermService {
  public Usruserperm find(java.lang.String id);
  /**
   * Select a list of Usruserperm based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Usruserperm records.
   */
  public List<Usruserperm> select(int maxResult);
  /**
   * Select all Usruserperm.
   *
   * @return all Usruserperm records.
   */
  public List<Usruserperm> selectAll();
  /**
   * Create Usruserperm.
   *
   * @param bean The Usruserperm.
   * @return The Usruserperm.
   */
  public Usruserperm create(Usruserperm bean);
  /**
   * Update a Usruserperm.
   *
   * @param bean The Usruserperm.
   * @return Usruserperm.
   */
  public Usruserperm update(Usruserperm bean);
  /**
   * Delete the Usruserperm.
   *
   * @param id The Usruserperm Id.
   */
  public void delete(java.lang.String id);
}
