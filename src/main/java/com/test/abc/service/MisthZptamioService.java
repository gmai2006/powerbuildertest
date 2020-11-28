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
import com.test.abc.entity.MisthZptamio;

public interface MisthZptamioService {
  public MisthZptamio find(String id);
  /**
   * Select a list of MisthZptamio based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZptamio records.
   */
  public List<MisthZptamio> select(int maxResult);
  /**
   * Select all MisthZptamio.
   *
   * @return all MisthZptamio records.
   */
  public List<MisthZptamio> selectAll();
  /**
   * Create MisthZptamio.
   *
   * @param bean The MisthZptamio.
   * @return The MisthZptamio.
   */
  public MisthZptamio create(MisthZptamio bean);
  /**
   * Update a MisthZptamio.
   *
   * @param bean The MisthZptamio.
   * @return MisthZptamio.
   */
  public MisthZptamio update(MisthZptamio bean);
  /**
   * Delete the MisthZptamio.
   *
   * @param id The MisthZptamio Id.
   */
  public void delete(String id);
}
