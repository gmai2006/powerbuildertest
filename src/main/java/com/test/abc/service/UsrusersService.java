/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.test.abc.service;

import java.util.List;
import com.test.abc.entity.Usrusers;

public interface UsrusersService {
  public Usrusers find(java.lang.Integer id);
  /**
   * Select a list of Usrusers based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Usrusers records.
   */
  public List<Usrusers> select(int maxResult);
  /**
   * Select all Usrusers.
   *
   * @return all Usrusers records.
   */
  public List<Usrusers> selectAll();
  /**
   * Create Usrusers.
   *
   * @param bean The Usrusers.
   * @return The Usrusers.
   */
  public Usrusers create(Usrusers bean);
  /**
   * Update a Usrusers.
   *
   * @param bean The Usrusers.
   * @return Usrusers.
   */
  public Usrusers update(Usrusers bean);
  /**
   * Delete the Usrusers.
   *
   * @param id The Usrusers Id.
   */
  public void delete(java.lang.Integer id);
}
