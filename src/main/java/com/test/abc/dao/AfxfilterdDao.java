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
import com.test.abc.entity.Afxfilterd;
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

public interface AfxfilterdDao {
  /**
   * Retrieve all records Afxfilterd.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Afxfilterd
   */
  public List<Afxfilterd> select(int maxResult);

  /**
   * Retrieve all records Afxfilterd.
   *
   * @return A list of Afxfilterd
   */
  public List<Afxfilterd> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Afxfilterd id.
   * @return The same Afxfilterd.
   */
  public Afxfilterd find(java.lang.Float id);
  /**
   * Create an Afxfilterd.
   *
   * @param e the Afxfilterd.
   * @return The same Afxfilterd.
   */
  public Afxfilterd create(Afxfilterd e);

  /**
   * Update the Afxfilterd.
   *
   * @param e the Afxfilterd.
   * @return The same Afxfilterd.
   */
  public Afxfilterd update(Afxfilterd e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.Float id);
}
