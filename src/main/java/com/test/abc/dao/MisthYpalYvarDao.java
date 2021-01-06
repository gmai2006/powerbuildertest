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
import com.test.abc.entity.MisthYpalYvar;
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

public interface MisthYpalYvarDao {
  /**
   * Retrieve all records MisthYpalYvar.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthYpalYvar
   */
  public List<MisthYpalYvar> select(int maxResult);

  /**
   * Retrieve all records MisthYpalYvar.
   *
   * @return A list of MisthYpalYvar
   */
  public List<MisthYpalYvar> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthYpalYvar id.
   * @return The same MisthYpalYvar.
   */
  public MisthYpalYvar find(java.lang.Float id);
  /**
   * Create an MisthYpalYvar.
   *
   * @param e the MisthYpalYvar.
   * @return The same MisthYpalYvar.
   */
  public MisthYpalYvar create(MisthYpalYvar e);

  /**
   * Update the MisthYpalYvar.
   *
   * @param e the MisthYpalYvar.
   * @return The same MisthYpalYvar.
   */
  public MisthYpalYvar update(MisthYpalYvar e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.Float id);
}
