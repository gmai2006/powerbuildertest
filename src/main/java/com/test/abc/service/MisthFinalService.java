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
import com.test.abc.entity.MisthFinal;

public interface MisthFinalService {
  public MisthFinal find(java.lang.String id);
  /**
   * Select a list of MisthFinal based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthFinal records.
   */
  public List<MisthFinal> select(int maxResult);
  /**
   * Select all MisthFinal.
   *
   * @return all MisthFinal records.
   */
  public List<MisthFinal> selectAll();
  /**
   * Create MisthFinal.
   *
   * @param bean The MisthFinal.
   * @return The MisthFinal.
   */
  public MisthFinal create(MisthFinal bean);
  /**
   * Update a MisthFinal.
   *
   * @param bean The MisthFinal.
   * @return MisthFinal.
   */
  public MisthFinal update(MisthFinal bean);
  /**
   * Delete the MisthFinal.
   *
   * @param id The MisthFinal Id.
   */
  public void delete(java.lang.String id);
}
