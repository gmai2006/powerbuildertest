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
import com.test.abc.entity.MisthZpxrisi;

public interface MisthZpxrisiService {
  public MisthZpxrisi find(java.lang.String id);
  /**
   * Select a list of MisthZpxrisi based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZpxrisi records.
   */
  public List<MisthZpxrisi> select(int maxResult);
  /**
   * Select all MisthZpxrisi.
   *
   * @return all MisthZpxrisi records.
   */
  public List<MisthZpxrisi> selectAll();
  /**
   * Create MisthZpxrisi.
   *
   * @param bean The MisthZpxrisi.
   * @return The MisthZpxrisi.
   */
  public MisthZpxrisi create(MisthZpxrisi bean);
  /**
   * Update a MisthZpxrisi.
   *
   * @param bean The MisthZpxrisi.
   * @return MisthZpxrisi.
   */
  public MisthZpxrisi update(MisthZpxrisi bean);
  /**
   * Delete the MisthZpxrisi.
   *
   * @param id The MisthZpxrisi Id.
   */
  public void delete(java.lang.String id);
}
