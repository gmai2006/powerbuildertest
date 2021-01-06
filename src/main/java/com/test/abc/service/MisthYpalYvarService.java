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
import com.test.abc.entity.MisthYpalYvar;

public interface MisthYpalYvarService {
  public MisthYpalYvar find(java.lang.Float id);
  /**
   * Select a list of MisthYpalYvar based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthYpalYvar records.
   */
  public List<MisthYpalYvar> select(int maxResult);
  /**
   * Select all MisthYpalYvar.
   *
   * @return all MisthYpalYvar records.
   */
  public List<MisthYpalYvar> selectAll();
  /**
   * Create MisthYpalYvar.
   *
   * @param bean The MisthYpalYvar.
   * @return The MisthYpalYvar.
   */
  public MisthYpalYvar create(MisthYpalYvar bean);
  /**
   * Update a MisthYpalYvar.
   *
   * @param bean The MisthYpalYvar.
   * @return MisthYpalYvar.
   */
  public MisthYpalYvar update(MisthYpalYvar bean);
  /**
   * Delete the MisthYpalYvar.
   *
   * @param id The MisthYpalYvar Id.
   */
  public void delete(java.lang.Float id);
}
