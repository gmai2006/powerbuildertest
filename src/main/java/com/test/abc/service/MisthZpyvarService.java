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

package com.test.abc.service;

import java.util.List;
import com.test.abc.entity.MisthZpyvar;

public interface MisthZpyvarService {
  public MisthZpyvar find(String id);
  /**
   * Select a list of MisthZpyvar based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return MisthZpyvar records.
   */
  public List<MisthZpyvar> select(int maxResult);
  /**
   * Select all MisthZpyvar.
   *
   * @return all MisthZpyvar records.
   */
  public List<MisthZpyvar> selectAll();
  /**
   * Create MisthZpyvar.
   *
   * @param bean The MisthZpyvar.
   * @return The MisthZpyvar.
   */
  public MisthZpyvar create(MisthZpyvar bean);
  /**
   * Update a MisthZpyvar.
   *
   * @param bean The MisthZpyvar.
   * @return MisthZpyvar.
   */
  public MisthZpyvar update(MisthZpyvar bean);
  /**
   * Delete the MisthZpyvar.
   *
   * @param id The MisthZpyvar Id.
   */
  public void delete(String id);
}
