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
import com.test.abc.entity.MisthZpperiod;
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

public interface MisthZpperiodDao {
  /**
   * Retrieve all records MisthZpperiod.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthZpperiod
   */
  public List<MisthZpperiod> select(int maxResult);

  /**
   * Retrieve all records MisthZpperiod.
   *
   * @return A list of MisthZpperiod
   */
  public List<MisthZpperiod> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthZpperiod id.
   * @return The same MisthZpperiod.
   */
  public MisthZpperiod find(String id);
  /**
   * Create an MisthZpperiod.
   *
   * @param e the MisthZpperiod.
   * @return The same MisthZpperiod.
   */
  public MisthZpperiod create(MisthZpperiod e);

  /**
   * Update the MisthZpperiod.
   *
   * @param e the MisthZpperiod.
   * @return The same MisthZpperiod.
   */
  public MisthZpperiod update(MisthZpperiod e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(String id);
}
