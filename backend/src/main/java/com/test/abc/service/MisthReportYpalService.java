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
import com.test.abc.entity.MisthReportYpal;

public interface MisthReportYpalService {
  public MisthReportYpal find(java.lang.Integer id);
  /**
   * Select a list of MisthReportYpal based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthReportYpal records.
   */
  public List<MisthReportYpal> select(int maxResult);
  /**
   * Select all MisthReportYpal.
   *
   * @return all MisthReportYpal records.
   */
  public List<MisthReportYpal> selectAll();
  /**
   * Create MisthReportYpal.
   *
   * @param bean The MisthReportYpal.
   * @return The MisthReportYpal.
   */
  public MisthReportYpal create(MisthReportYpal bean);
  /**
   * Update a MisthReportYpal.
   *
   * @param bean The MisthReportYpal.
   * @return MisthReportYpal.
   */
  public MisthReportYpal update(MisthReportYpal bean);
  /**
   * Delete the MisthReportYpal.
   *
   * @param id The MisthReportYpal Id.
   */
  public void delete(java.lang.Integer id);
}
