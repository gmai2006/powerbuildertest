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
import com.test.abc.entity.MisthZpidikot;

public interface MisthZpidikotService {
  public MisthZpidikot find(java.lang.String id);
  /**
   * Select a list of MisthZpidikot based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZpidikot records.
   */
  public List<MisthZpidikot> select(int maxResult);
  /**
   * Select all MisthZpidikot.
   *
   * @return all MisthZpidikot records.
   */
  public List<MisthZpidikot> selectAll();
  /**
   * Create MisthZpidikot.
   *
   * @param bean The MisthZpidikot.
   * @return The MisthZpidikot.
   */
  public MisthZpidikot create(MisthZpidikot bean);
  /**
   * Update a MisthZpidikot.
   *
   * @param bean The MisthZpidikot.
   * @return MisthZpidikot.
   */
  public MisthZpidikot update(MisthZpidikot bean);
  /**
   * Delete the MisthZpidikot.
   *
   * @param id The MisthZpidikot Id.
   */
  public void delete(java.lang.String id);
}