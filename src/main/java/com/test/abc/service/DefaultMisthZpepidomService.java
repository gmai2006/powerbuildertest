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

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.test.abc.dao.MisthZpepidomDao;
import com.test.abc.entity.MisthZpepidom;
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

@Stateless
@Named("DefaultMisthZpepidomService")
public class DefaultMisthZpepidomService implements MisthZpepidomService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpepidomDao dao;

  @Inject
  @Named("DefaultMisthZpepidomDao")
  public DefaultMisthZpepidomService(final MisthZpepidomDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpepidom find(String id) {
    final MisthZpepidom result = dao.find(id);
    logger.info("find(MisthZpepidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpepidom> select(int maxResult) {
    final List<MisthZpepidom> result = dao.select(maxResult);
    logger.info("select(MisthZpepidom) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpepidom> selectAll() {
    final List<MisthZpepidom> results = dao.selectAll();
    logger.info("selectAll(MisthZpepidom) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpepidom create(MisthZpepidom bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpepidom={}) - entered bean ");

    final MisthZpepidom result = dao.create(bean);

    logger.info("create(MisthZpepidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpepidom update(MisthZpepidom bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpepidom={}) - entered bean ");

    final MisthZpepidom result = dao.update(bean);

    logger.info("update(MisthZpepidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(MisthZpepidom={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpepidom) - exited - return value={} result ");
  }
}
