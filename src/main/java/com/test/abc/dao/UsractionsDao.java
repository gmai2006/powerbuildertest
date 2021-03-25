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
package com.test.abc.dao;

import java.util.List;
import com.test.abc.entity.Usractions;

public interface UsractionsDao {
  /**
   * Retrieve all records Usractions.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Usractions
   */
  public List<Usractions> select(int maxResult);

  /**
   * Retrieve all records Usractions.
   *
   * @return A list of Usractions
   */
  public List<Usractions> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Usractions id.
   * @return The same Usractions.
   */
  public Usractions find(java.lang.String id);
  /**
   * Create an Usractions.
   *
   * @param e the Usractions.
   * @return The same Usractions.
   */
  public Usractions create(Usractions e);

  /**
   * Update the Usractions.
   *
   * @param e the Usractions.
   * @return The same Usractions.
   */
  public Usractions update(Usractions e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}
