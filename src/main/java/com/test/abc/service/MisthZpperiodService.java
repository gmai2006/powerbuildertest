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
import com.test.abc.entity.MisthZpperiod;

public interface MisthZpperiodService {
  public MisthZpperiod find(String id);
  /**
   * Select a list of MisthZpperiod based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZpperiod records.
   */
  public List<MisthZpperiod> select(int maxResult);
  /**
   * Select all MisthZpperiod.
   *
   * @return all MisthZpperiod records.
   */
  public List<MisthZpperiod> selectAll();
  /**
   * Create MisthZpperiod.
   *
   * @param bean The MisthZpperiod.
   * @return The MisthZpperiod.
   */
  public MisthZpperiod create(MisthZpperiod bean);
  /**
   * Update a MisthZpperiod.
   *
   * @param bean The MisthZpperiod.
   * @return MisthZpperiod.
   */
  public MisthZpperiod update(MisthZpperiod bean);
  /**
   * Delete the MisthZpperiod.
   *
   * @param id The MisthZpperiod Id.
   */
  public void delete(String id);
}
