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
import com.test.abc.entity.MisthZptmima;
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

public interface MisthZptmimaDao {
  /**
   * Retrieve all records MisthZptmima.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthZptmima
   */
  public List<MisthZptmima> select(int maxResult);

  /**
   * Retrieve all records MisthZptmima.
   *
   * @return A list of MisthZptmima
   */
  public List<MisthZptmima> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthZptmima id.
   * @return The same MisthZptmima.
   */
  public MisthZptmima find(java.lang.String id);
  /**
   * Create an MisthZptmima.
   *
   * @param e the MisthZptmima.
   * @return The same MisthZptmima.
   */
  public MisthZptmima create(MisthZptmima e);

  /**
   * Update the MisthZptmima.
   *
   * @param e the MisthZptmima.
   * @return The same MisthZptmima.
   */
  public MisthZptmima update(MisthZptmima e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}
