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
import com.test.abc.entity.MisthFinalYpal;

public interface MisthFinalYpalService {
  public MisthFinalYpal find(Float id);
  /**
   * Select a list of MisthFinalYpal based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthFinalYpal records.
   */
  public List<MisthFinalYpal> select(int maxResult);
  /**
   * Select all MisthFinalYpal.
   *
   * @return all MisthFinalYpal records.
   */
  public List<MisthFinalYpal> selectAll();
  /**
   * Create MisthFinalYpal.
   *
   * @param bean The MisthFinalYpal.
   * @return The MisthFinalYpal.
   */
  public MisthFinalYpal create(MisthFinalYpal bean);
  /**
   * Update a MisthFinalYpal.
   *
   * @param bean The MisthFinalYpal.
   * @return MisthFinalYpal.
   */
  public MisthFinalYpal update(MisthFinalYpal bean);
  /**
   * Delete the MisthFinalYpal.
   *
   * @param id The MisthFinalYpal Id.
   */
  public void delete(Float id);
}
