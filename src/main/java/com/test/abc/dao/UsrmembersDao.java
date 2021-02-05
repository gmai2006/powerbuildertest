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
import com.test.abc.entity.Usrmembers;
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

public interface UsrmembersDao {
  /**
   * Retrieve all records Usrmembers.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Usrmembers
   */
  public List<Usrmembers> select(int maxResult);

  /**
   * Retrieve all records Usrmembers.
   *
   * @return A list of Usrmembers
   */
  public List<Usrmembers> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Usrmembers id.
   * @return The same Usrmembers.
   */
  public Usrmembers find(java.lang.Integer id);
  /**
   * Create an Usrmembers.
   *
   * @param e the Usrmembers.
   * @return The same Usrmembers.
   */
  public Usrmembers create(Usrmembers e);

  /**
   * Update the Usrmembers.
   *
   * @param e the Usrmembers.
   * @return The same Usrmembers.
   */
  public Usrmembers update(Usrmembers e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.Integer id);
}
