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
import com.test.abc.entity.MisthZptmima;

public interface MisthZptmimaService {
  public MisthZptmima find(java.lang.String id);
  /**
   * Select a list of MisthZptmima based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZptmima records.
   */
  public List<MisthZptmima> select(int maxResult);
  /**
   * Select all MisthZptmima.
   *
   * @return all MisthZptmima records.
   */
  public List<MisthZptmima> selectAll();
  /**
   * Create MisthZptmima.
   *
   * @param bean The MisthZptmima.
   * @return The MisthZptmima.
   */
  public MisthZptmima create(MisthZptmima bean);
  /**
   * Update a MisthZptmima.
   *
   * @param bean The MisthZptmima.
   * @return MisthZptmima.
   */
  public MisthZptmima update(MisthZptmima bean);
  /**
   * Delete the MisthZptmima.
   *
   * @param id The MisthZptmima Id.
   */
  public void delete(java.lang.String id);
}
