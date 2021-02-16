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
import com.test.abc.entity.Usractions;

public interface UsractionsService {
  public Usractions find(java.lang.String id);
  /**
   * Select a list of Usractions based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Usractions records.
   */
  public List<Usractions> select(int maxResult);
  /**
   * Select all Usractions.
   *
   * @return all Usractions records.
   */
  public List<Usractions> selectAll();
  /**
   * Create Usractions.
   *
   * @param bean The Usractions.
   * @return The Usractions.
   */
  public Usractions create(Usractions bean);
  /**
   * Update a Usractions.
   *
   * @param bean The Usractions.
   * @return Usractions.
   */
  public Usractions update(Usractions bean);
  /**
   * Delete the Usractions.
   *
   * @param id The Usractions Id.
   */
  public void delete(java.lang.String id);
}
