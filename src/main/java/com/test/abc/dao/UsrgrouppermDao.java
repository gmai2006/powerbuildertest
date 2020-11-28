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
import com.test.abc.entity.Usrgroupperm;
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

public interface UsrgrouppermDao {
  /**
   * Retrieve all records Usrgroupperm.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Usrgroupperm
   */
  public List<Usrgroupperm> select(int maxResult);

  /**
   * Retrieve all records Usrgroupperm.
   *
   * @return A list of Usrgroupperm
   */
  public List<Usrgroupperm> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Usrgroupperm id.
   * @return The same Usrgroupperm.
   */
  public Usrgroupperm find(Float id);
  /**
   * Create an Usrgroupperm.
   *
   * @param e the Usrgroupperm.
   * @return The same Usrgroupperm.
   */
  public Usrgroupperm create(Usrgroupperm e);

  /**
   * Update the Usrgroupperm.
   *
   * @param e the Usrgroupperm.
   * @return The same Usrgroupperm.
   */
  public Usrgroupperm update(Usrgroupperm e);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   */
  public void delete(Float id);
}
