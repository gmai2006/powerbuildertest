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
import com.test.abc.entity.MisthZpepidom;
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

public interface MisthZpepidomDao {
  /**
   * Retrieve all records MisthZpepidom.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthZpepidom
   */
  public List<MisthZpepidom> select(int maxResult);

  /**
   * Retrieve all records MisthZpepidom.
   *
   * @return A list of MisthZpepidom
   */
  public List<MisthZpepidom> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthZpepidom id.
   * @return The same MisthZpepidom.
   */
  public MisthZpepidom find(java.lang.String id);
  /**
   * Create an MisthZpepidom.
   *
   * @param e the MisthZpepidom.
   * @return The same MisthZpepidom.
   */
  public MisthZpepidom create(MisthZpepidom e);

  /**
   * Update the MisthZpepidom.
   *
   * @param e the MisthZpepidom.
   * @return The same MisthZpepidom.
   */
  public MisthZpepidom update(MisthZpepidom e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}
