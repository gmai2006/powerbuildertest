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
import com.test.abc.entity.Usrmembers;

public interface UsrmembersService {
  public Usrmembers find(java.lang.Float id);
  /**
   * Select a list of Usrmembers based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Usrmembers records.
   */
  public List<Usrmembers> select(int maxResult);
  /**
   * Select all Usrmembers.
   *
   * @return all Usrmembers records.
   */
  public List<Usrmembers> selectAll();
  /**
   * Create Usrmembers.
   *
   * @param bean The Usrmembers.
   * @return The Usrmembers.
   */
  public Usrmembers create(Usrmembers bean);
  /**
   * Update a Usrmembers.
   *
   * @param bean The Usrmembers.
   * @return Usrmembers.
   */
  public Usrmembers update(Usrmembers bean);
  /**
   * Delete the Usrmembers.
   *
   * @param id The Usrmembers Id.
   */
  public void delete(java.lang.Float id);
}
