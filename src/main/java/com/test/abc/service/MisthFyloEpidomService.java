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
import com.test.abc.entity.MisthFyloEpidom;

public interface MisthFyloEpidomService {
  public MisthFyloEpidom find(java.lang.String id);
  /**
   * Select a list of MisthFyloEpidom based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthFyloEpidom records.
   */
  public List<MisthFyloEpidom> select(int maxResult);
  /**
   * Select all MisthFyloEpidom.
   *
   * @return all MisthFyloEpidom records.
   */
  public List<MisthFyloEpidom> selectAll();
  /**
   * Create MisthFyloEpidom.
   *
   * @param bean The MisthFyloEpidom.
   * @return The MisthFyloEpidom.
   */
  public MisthFyloEpidom create(MisthFyloEpidom bean);
  /**
   * Update a MisthFyloEpidom.
   *
   * @param bean The MisthFyloEpidom.
   * @return MisthFyloEpidom.
   */
  public MisthFyloEpidom update(MisthFyloEpidom bean);
  /**
   * Delete the MisthFyloEpidom.
   *
   * @param id The MisthFyloEpidom Id.
   */
  public void delete(java.lang.String id);
}
