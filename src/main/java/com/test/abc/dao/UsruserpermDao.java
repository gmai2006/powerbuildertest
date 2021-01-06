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
import com.test.abc.entity.Usruserperm;
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

public interface UsruserpermDao {
  /**
   * Retrieve all records Usruserperm.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Usruserperm
   */
  public List<Usruserperm> select(int maxResult);

  /**
   * Retrieve all records Usruserperm.
   *
   * @return A list of Usruserperm
   */
  public List<Usruserperm> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Usruserperm id.
   * @return The same Usruserperm.
   */
  public Usruserperm find(java.lang.String id);
  /**
   * Create an Usruserperm.
   *
   * @param e the Usruserperm.
   * @return The same Usruserperm.
   */
  public Usruserperm create(Usruserperm e);

  /**
   * Update the Usruserperm.
   *
   * @param e the Usruserperm.
   * @return The same Usruserperm.
   */
  public Usruserperm update(Usruserperm e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}
