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
import com.test.abc.entity.MisthYpal;

public interface MisthYpalService {
  public MisthYpal find(java.lang.Float id);
  /**
   * Select a list of MisthYpal based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthYpal records.
   */
  public List<MisthYpal> select(int maxResult);
  /**
   * Select all MisthYpal.
   *
   * @return all MisthYpal records.
   */
  public List<MisthYpal> selectAll();
  /**
   * Create MisthYpal.
   *
   * @param bean The MisthYpal.
   * @return The MisthYpal.
   */
  public MisthYpal create(MisthYpal bean);
  /**
   * Update a MisthYpal.
   *
   * @param bean The MisthYpal.
   * @return MisthYpal.
   */
  public MisthYpal update(MisthYpal bean);
  /**
   * Delete the MisthYpal.
   *
   * @param id The MisthYpal Id.
   */
  public void delete(java.lang.Float id);
}
