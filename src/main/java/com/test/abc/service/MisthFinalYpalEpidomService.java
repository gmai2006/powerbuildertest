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
import com.test.abc.entity.MisthFinalYpalEpidom;

public interface MisthFinalYpalEpidomService {
  public MisthFinalYpalEpidom find(String id);
  /**
   * Select a list of MisthFinalYpalEpidom based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthFinalYpalEpidom records.
   */
  public List<MisthFinalYpalEpidom> select(int maxResult);
  /**
   * Select all MisthFinalYpalEpidom.
   *
   * @return all MisthFinalYpalEpidom records.
   */
  public List<MisthFinalYpalEpidom> selectAll();
  /**
   * Create MisthFinalYpalEpidom.
   *
   * @param bean The MisthFinalYpalEpidom.
   * @return The MisthFinalYpalEpidom.
   */
  public MisthFinalYpalEpidom create(MisthFinalYpalEpidom bean);
  /**
   * Update a MisthFinalYpalEpidom.
   *
   * @param bean The MisthFinalYpalEpidom.
   * @return MisthFinalYpalEpidom.
   */
  public MisthFinalYpalEpidom update(MisthFinalYpalEpidom bean);
  /**
   * Delete the MisthFinalYpalEpidom.
   *
   * @param id The MisthFinalYpalEpidom Id.
   */
  public void delete(String id);
}
