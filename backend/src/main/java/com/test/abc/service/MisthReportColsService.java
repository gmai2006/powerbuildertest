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
import com.test.abc.entity.MisthReportCols;

public interface MisthReportColsService {
  public MisthReportCols find(java.lang.String id);
  /**
   * Select a list of MisthReportCols based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthReportCols records.
   */
  public List<MisthReportCols> select(int maxResult);
  /**
   * Select all MisthReportCols.
   *
   * @return all MisthReportCols records.
   */
  public List<MisthReportCols> selectAll();
  /**
   * Create MisthReportCols.
   *
   * @param bean The MisthReportCols.
   * @return The MisthReportCols.
   */
  public MisthReportCols create(MisthReportCols bean);
  /**
   * Update a MisthReportCols.
   *
   * @param bean The MisthReportCols.
   * @return MisthReportCols.
   */
  public MisthReportCols update(MisthReportCols bean);
  /**
   * Delete the MisthReportCols.
   *
   * @param id The MisthReportCols Id.
   */
  public void delete(java.lang.String id);
}
