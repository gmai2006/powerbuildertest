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
import com.test.abc.entity.Usrgroupperm;

public interface UsrgrouppermService {
  public Usrgroupperm find(Float id);
  /**
   * Select a list of Usrgroupperm based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Usrgroupperm records.
   */
  public List<Usrgroupperm> select(int maxResult);
  /**
   * Select all Usrgroupperm.
   *
   * @return all Usrgroupperm records.
   */
  public List<Usrgroupperm> selectAll();
  /**
   * Create Usrgroupperm.
   *
   * @param bean The Usrgroupperm.
   * @return The Usrgroupperm.
   */
  public Usrgroupperm create(Usrgroupperm bean);
  /**
   * Update a Usrgroupperm.
   *
   * @param bean The Usrgroupperm.
   * @return Usrgroupperm.
   */
  public Usrgroupperm update(Usrgroupperm bean);
  /**
   * Delete the Usrgroupperm.
   *
   * @param id The Usrgroupperm Id.
   */
  public void delete(Float id);
}
