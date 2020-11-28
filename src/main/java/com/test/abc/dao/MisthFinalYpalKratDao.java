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
import com.test.abc.entity.MisthFinalYpalKrat;
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

public interface MisthFinalYpalKratDao {
  /**
   * Retrieve all records MisthFinalYpalKrat.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MisthFinalYpalKrat
   */
  public List<MisthFinalYpalKrat> select(int maxResult);

  /**
   * Retrieve all records MisthFinalYpalKrat.
   *
   * @return A list of MisthFinalYpalKrat
   */
  public List<MisthFinalYpalKrat> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MisthFinalYpalKrat id.
   * @return The same MisthFinalYpalKrat.
   */
  public MisthFinalYpalKrat find(String id);
  /**
   * Create an MisthFinalYpalKrat.
   *
   * @param e the MisthFinalYpalKrat.
   * @return The same MisthFinalYpalKrat.
   */
  public MisthFinalYpalKrat create(MisthFinalYpalKrat e);

  /**
   * Update the MisthFinalYpalKrat.
   *
   * @param e the MisthFinalYpalKrat.
   * @return The same MisthFinalYpalKrat.
   */
  public MisthFinalYpalKrat update(MisthFinalYpalKrat e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(String id);
}
