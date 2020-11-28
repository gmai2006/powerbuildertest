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
import com.test.abc.entity.MisthZpthesi;

public interface MisthZpthesiService {
  public MisthZpthesi find(String id);
  /**
   * Select a list of MisthZpthesi based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZpthesi records.
   */
  public List<MisthZpthesi> select(int maxResult);
  /**
   * Select all MisthZpthesi.
   *
   * @return all MisthZpthesi records.
   */
  public List<MisthZpthesi> selectAll();
  /**
   * Create MisthZpthesi.
   *
   * @param bean The MisthZpthesi.
   * @return The MisthZpthesi.
   */
  public MisthZpthesi create(MisthZpthesi bean);
  /**
   * Update a MisthZpthesi.
   *
   * @param bean The MisthZpthesi.
   * @return MisthZpthesi.
   */
  public MisthZpthesi update(MisthZpthesi bean);
  /**
   * Delete the MisthZpthesi.
   *
   * @param id The MisthZpthesi Id.
   */
  public void delete(String id);
}