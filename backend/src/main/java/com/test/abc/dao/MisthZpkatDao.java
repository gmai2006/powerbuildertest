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
import com.test.abc.entity.MisthZpkat;
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

public interface MisthZpkatDao {
  /**
   * Retrieve all records MisthZpkat.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthZpkat
   */
  public List<MisthZpkat> select(int maxResult);

  /**
   * Retrieve all records MisthZpkat.
   *
   * @return A list of MisthZpkat
   */
  public List<MisthZpkat> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthZpkat id.
   * @return The same MisthZpkat.
   */
  public MisthZpkat find(java.lang.String id);
  /**
   * Create an MisthZpkat.
   *
   * @param e the MisthZpkat.
   * @return The same MisthZpkat.
   */
  public MisthZpkat create(MisthZpkat e);

  /**
   * Update the MisthZpkat.
   *
   * @param e the MisthZpkat.
   * @return The same MisthZpkat.
   */
  public MisthZpkat update(MisthZpkat e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}