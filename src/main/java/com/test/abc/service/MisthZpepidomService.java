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
import com.test.abc.entity.MisthZpepidom;

public interface MisthZpepidomService {
  public MisthZpepidom find(java.lang.String id);
  /**
   * Select a list of MisthZpepidom based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZpepidom records.
   */
  public List<MisthZpepidom> select(int maxResult);
  /**
   * Select all MisthZpepidom.
   *
   * @return all MisthZpepidom records.
   */
  public List<MisthZpepidom> selectAll();
  /**
   * Create MisthZpepidom.
   *
   * @param bean The MisthZpepidom.
   * @return The MisthZpepidom.
   */
  public MisthZpepidom create(MisthZpepidom bean);
  /**
   * Update a MisthZpepidom.
   *
   * @param bean The MisthZpepidom.
   * @return MisthZpepidom.
   */
  public MisthZpepidom update(MisthZpepidom bean);
  /**
   * Delete the MisthZpepidom.
   *
   * @param id The MisthZpepidom Id.
   */
  public void delete(java.lang.String id);
}
