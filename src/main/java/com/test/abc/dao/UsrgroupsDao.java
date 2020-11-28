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
import com.test.abc.entity.Usrgroups;
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

public interface UsrgroupsDao {
  /**
   * Retrieve all records Usrgroups.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Usrgroups
   */
  public List<Usrgroups> select(int maxResult);

  /**
   * Retrieve all records Usrgroups.
   *
   * @return A list of Usrgroups
   */
  public List<Usrgroups> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Usrgroups id.
   * @return The same Usrgroups.
   */
  public Usrgroups find(Float id);
  /**
   * Create an Usrgroups.
   *
   * @param e the Usrgroups.
   * @return The same Usrgroups.
   */
  public Usrgroups create(Usrgroups e);

  /**
   * Update the Usrgroups.
   *
   * @param e the Usrgroups.
   * @return The same Usrgroups.
   */
  public Usrgroups update(Usrgroups e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(Float id);
}
