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
import com.test.abc.entity.Usrusers;
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

public interface UsrusersDao {
  /**
   * Retrieve all records Usrusers.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Usrusers
   */
  public List<Usrusers> select(int maxResult);

  /**
   * Retrieve all records Usrusers.
   *
   * @return A list of Usrusers
   */
  public List<Usrusers> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Usrusers id.
   * @return The same Usrusers.
   */
  public Usrusers find(java.lang.Float id);
  /**
   * Create an Usrusers.
   *
   * @param e the Usrusers.
   * @return The same Usrusers.
   */
  public Usrusers create(Usrusers e);

  /**
   * Update the Usrusers.
   *
   * @param e the Usrusers.
   * @return The same Usrusers.
   */
  public Usrusers update(Usrusers e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.Float id);
}
