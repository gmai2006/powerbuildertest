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
import com.test.abc.entity.MisthFyloYpal;
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

public interface MisthFyloYpalDao {
  /**
   * Retrieve all records MisthFyloYpal.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthFyloYpal
   */
  public List<MisthFyloYpal> select(int maxResult);

  /**
   * Retrieve all records MisthFyloYpal.
   *
   * @return A list of MisthFyloYpal
   */
  public List<MisthFyloYpal> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthFyloYpal id.
   * @return The same MisthFyloYpal.
   */
  public MisthFyloYpal find(java.lang.Integer id);
  /**
   * Create an MisthFyloYpal.
   *
   * @param e the MisthFyloYpal.
   * @return The same MisthFyloYpal.
   */
  public MisthFyloYpal create(MisthFyloYpal e);

  /**
   * Update the MisthFyloYpal.
   *
   * @param e the MisthFyloYpal.
   * @return The same MisthFyloYpal.
   */
  public MisthFyloYpal update(MisthFyloYpal e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.Integer id);
}
