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
import com.test.abc.entity.Usrgroups;

public interface UsrgroupsService {
  public Usrgroups find(Float id);
  /**
   * Select a list of Usrgroups based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Usrgroups records.
   */
  public List<Usrgroups> select(int maxResult);
  /**
   * Select all Usrgroups.
   *
   * @return all Usrgroups records.
   */
  public List<Usrgroups> selectAll();
  /**
   * Create Usrgroups.
   *
   * @param bean The Usrgroups.
   * @return The Usrgroups.
   */
  public Usrgroups create(Usrgroups bean);
  /**
   * Update a Usrgroups.
   *
   * @param bean The Usrgroups.
   * @return Usrgroups.
   */
  public Usrgroups update(Usrgroups bean);
  /**
   * Delete the Usrgroups.
   *
   * @param id The Usrgroups Id.
   */
  public void delete(Float id);
}
