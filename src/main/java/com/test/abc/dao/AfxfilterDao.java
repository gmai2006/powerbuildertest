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
import com.test.abc.entity.Afxfilter;
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

public interface AfxfilterDao {
  /**
   * Retrieve all records Afxfilter.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Afxfilter
   */
  public List<Afxfilter> select(int maxResult);

  /**
   * Retrieve all records Afxfilter.
   *
   * @return A list of Afxfilter
   */
  public List<Afxfilter> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Afxfilter id.
   * @return The same Afxfilter.
   */
  public Afxfilter find(java.lang.String id);
  /**
   * Create an Afxfilter.
   *
   * @param e the Afxfilter.
   * @return The same Afxfilter.
   */
  public Afxfilter create(Afxfilter e);

  /**
   * Update the Afxfilter.
   *
   * @param e the Afxfilter.
   * @return The same Afxfilter.
   */
  public Afxfilter update(Afxfilter e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(java.lang.String id);
}
