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
import com.test.abc.entity.MisthFyloKrat;

public interface MisthFyloKratService {
  public MisthFyloKrat find(java.lang.String id);
  /**
   * Select a list of MisthFyloKrat based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthFyloKrat records.
   */
  public List<MisthFyloKrat> select(int maxResult);
  /**
   * Select all MisthFyloKrat.
   *
   * @return all MisthFyloKrat records.
   */
  public List<MisthFyloKrat> selectAll();
  /**
   * Create MisthFyloKrat.
   *
   * @param bean The MisthFyloKrat.
   * @return The MisthFyloKrat.
   */
  public MisthFyloKrat create(MisthFyloKrat bean);
  /**
   * Update a MisthFyloKrat.
   *
   * @param bean The MisthFyloKrat.
   * @return MisthFyloKrat.
   */
  public MisthFyloKrat update(MisthFyloKrat bean);
  /**
   * Delete the MisthFyloKrat.
   *
   * @param id The MisthFyloKrat Id.
   */
  public void delete(java.lang.String id);
}
