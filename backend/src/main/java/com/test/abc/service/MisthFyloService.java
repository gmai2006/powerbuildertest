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
import com.test.abc.entity.MisthFylo;

public interface MisthFyloService {
  public MisthFylo find(java.lang.String id);
  /**
   * Select a list of MisthFylo based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthFylo records.
   */
  public List<MisthFylo> select(int maxResult);
  /**
   * Select all MisthFylo.
   *
   * @return all MisthFylo records.
   */
  public List<MisthFylo> selectAll();
  /**
   * Create MisthFylo.
   *
   * @param bean The MisthFylo.
   * @return The MisthFylo.
   */
  public MisthFylo create(MisthFylo bean);
  /**
   * Update a MisthFylo.
   *
   * @param bean The MisthFylo.
   * @return MisthFylo.
   */
  public MisthFylo update(MisthFylo bean);
  /**
   * Delete the MisthFylo.
   *
   * @param id The MisthFylo Id.
   */
  public void delete(java.lang.String id);
}
