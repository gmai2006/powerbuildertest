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
import com.test.abc.entity.MisthZpidikot;
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

public interface MisthZpidikotDao {
  /**
   * Retrieve all records MisthZpidikot.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthZpidikot
   */
  public List<MisthZpidikot> select(int maxResult);

  /**
   * Retrieve all records MisthZpidikot.
   *
   * @return A list of MisthZpidikot
   */
  public List<MisthZpidikot> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthZpidikot id.
   * @return The same MisthZpidikot.
   */
  public MisthZpidikot find(java.lang.String id);
  /**
   * Create an MisthZpidikot.
   *
   * @param e the MisthZpidikot.
   * @return The same MisthZpidikot.
   */
  public MisthZpidikot create(MisthZpidikot e);

  /**
   * Update the MisthZpidikot.
   *
   * @param e the MisthZpidikot.
   * @return The same MisthZpidikot.
   */
  public MisthZpidikot update(MisthZpidikot e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}
