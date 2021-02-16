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

package com.test.abc.dao;

import java.util.List;
import com.test.abc.entity.MisthReportYpal;
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

public interface MisthReportYpalDao {
  /**
   * Retrieve all records MisthReportYpal.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthReportYpal
   */
  public List<MisthReportYpal> select(int maxResult);

  /**
   * Retrieve all records MisthReportYpal.
   *
   * @return A list of MisthReportYpal
   */
  public List<MisthReportYpal> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthReportYpal id.
   * @return The same MisthReportYpal.
   */
  public MisthReportYpal find(java.lang.Integer id);
  /**
   * Create an MisthReportYpal.
   *
   * @param e the MisthReportYpal.
   * @return The same MisthReportYpal.
   */
  public MisthReportYpal create(MisthReportYpal e);

  /**
   * Update the MisthReportYpal.
   *
   * @param e the MisthReportYpal.
   * @return The same MisthReportYpal.
   */
  public MisthReportYpal update(MisthReportYpal e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.Integer id);
}