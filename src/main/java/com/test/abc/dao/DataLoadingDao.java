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

import com.test.abc.entity.DataLoadingStatus;

public interface DataLoadingDao {

  /**
   * Create Entity.
   *
   * @param <E> The entity type.
   * @param e The DataLoadingStatus.
   * @return The DataLoadingStatus.
   */
  public <E> E create(E e);

  /**
   * Update a Entity.
   *
   * @param e The DataLoadingStatus.
   * @return DataLoadingStatus.
   */
  public DataLoadingStatus update(DataLoadingStatus e);

  /**
   * Get data loading status.
   *
   * @param type The DataLoadingStatus type.
   * @return DataLoadingStatus.
   */
  public DataLoadingStatus getLoadingStatus(String type);

  /**
   * Delete the DataLoadingStatus.
   *
   * @param id The DataLoadingStatus Id.
   */
  public void delete(String id);

  /** Delete all air load tables. */
  public void deleteAll();
}
