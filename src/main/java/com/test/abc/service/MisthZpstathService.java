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
import com.test.abc.entity.MisthZpstath;

public interface MisthZpstathService {
  public MisthZpstath find(java.lang.String id);
  /**
   * Select a list of MisthZpstath based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZpstath records.
   */
  public List<MisthZpstath> select(int maxResult);
  /**
   * Select all MisthZpstath.
   *
   * @return all MisthZpstath records.
   */
  public List<MisthZpstath> selectAll();
  /**
   * Create MisthZpstath.
   *
   * @param bean The MisthZpstath.
   * @return The MisthZpstath.
   */
  public MisthZpstath create(MisthZpstath bean);
  /**
   * Update a MisthZpstath.
   *
   * @param bean The MisthZpstath.
   * @return MisthZpstath.
   */
  public MisthZpstath update(MisthZpstath bean);
  /**
   * Delete the MisthZpstath.
   *
   * @param id The MisthZpstath Id.
   */
  public void delete(java.lang.String id);
}
