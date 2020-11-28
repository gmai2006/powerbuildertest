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
import com.test.abc.entity.MisthFinalYpalKrat;

public interface MisthFinalYpalKratService {
  public MisthFinalYpalKrat find(String id);
  /**
   * Select a list of MisthFinalYpalKrat based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthFinalYpalKrat records.
   */
  public List<MisthFinalYpalKrat> select(int maxResult);
  /**
   * Select all MisthFinalYpalKrat.
   *
   * @return all MisthFinalYpalKrat records.
   */
  public List<MisthFinalYpalKrat> selectAll();
  /**
   * Create MisthFinalYpalKrat.
   *
   * @param bean The MisthFinalYpalKrat.
   * @return The MisthFinalYpalKrat.
   */
  public MisthFinalYpalKrat create(MisthFinalYpalKrat bean);
  /**
   * Update a MisthFinalYpalKrat.
   *
   * @param bean The MisthFinalYpalKrat.
   * @return MisthFinalYpalKrat.
   */
  public MisthFinalYpalKrat update(MisthFinalYpalKrat bean);
  /**
   * Delete the MisthFinalYpalKrat.
   *
   * @param id The MisthFinalYpalKrat Id.
   */
  public void delete(String id);
}
