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
import com.test.abc.entity.MisthKratapod;
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

public interface MisthKratapodDao {
  /**
   * Retrieve all records MisthKratapod.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthKratapod
   */
  public List<MisthKratapod> select(int maxResult);

  /**
   * Retrieve all records MisthKratapod.
   *
   * @return A list of MisthKratapod
   */
  public List<MisthKratapod> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthKratapod id.
   * @return The same MisthKratapod.
   */
  public MisthKratapod find(java.lang.String id);
  /**
   * Create an MisthKratapod.
   *
   * @param e the MisthKratapod.
   * @return The same MisthKratapod.
   */
  public MisthKratapod create(MisthKratapod e);

  /**
   * Update the MisthKratapod.
   *
   * @param e the MisthKratapod.
   * @return The same MisthKratapod.
   */
  public MisthKratapod update(MisthKratapod e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}
