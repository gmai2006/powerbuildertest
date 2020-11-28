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
import com.test.abc.entity.MisthZpstath;
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

public interface MisthZpstathDao {
  /**
   * Retrieve all records MisthZpstath.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthZpstath
   */
  public List<MisthZpstath> select(int maxResult);

  /**
   * Retrieve all records MisthZpstath.
   *
   * @return A list of MisthZpstath
   */
  public List<MisthZpstath> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthZpstath id.
   * @return The same MisthZpstath.
   */
  public MisthZpstath find(String id);
  /**
   * Create an MisthZpstath.
   *
   * @param e the MisthZpstath.
   * @return The same MisthZpstath.
   */
  public MisthZpstath create(MisthZpstath e);

  /**
   * Update the MisthZpstath.
   *
   * @param e the MisthZpstath.
   * @return The same MisthZpstath.
   */
  public MisthZpstath update(MisthZpstath e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(String id);
}
