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
import com.test.abc.entity.MisthZpthesi;
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

public interface MisthZpthesiDao {
  /**
   * Retrieve all records MisthZpthesi.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthZpthesi
   */
  public List<MisthZpthesi> select(int maxResult);

  /**
   * Retrieve all records MisthZpthesi.
   *
   * @return A list of MisthZpthesi
   */
  public List<MisthZpthesi> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthZpthesi id.
   * @return The same MisthZpthesi.
   */
  public MisthZpthesi find(String id);
  /**
   * Create an MisthZpthesi.
   *
   * @param e the MisthZpthesi.
   * @return The same MisthZpthesi.
   */
  public MisthZpthesi create(MisthZpthesi e);

  /**
   * Update the MisthZpthesi.
   *
   * @param e the MisthZpthesi.
   * @return The same MisthZpthesi.
   */
  public MisthZpthesi update(MisthZpthesi e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(String id);
}
