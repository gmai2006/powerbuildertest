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
import com.test.abc.dao.MisthFinalYpalEpidomDao;
import com.test.abc.entity.MisthFinalYpalEpidom;
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
@Named("DefaultMisthFinalYpalEpidomService")
public class DefaultMisthFinalYpalEpidomService implements MisthFinalYpalEpidomService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFinalYpalEpidomDao dao;

  @Inject
  @Named("DefaultMisthFinalYpalEpidomDao")
  public DefaultMisthFinalYpalEpidomService(final MisthFinalYpalEpidomDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpalEpidom find(java.lang.String id) {
    final MisthFinalYpalEpidom result = dao.find(id);
    logger.info("find(MisthFinalYpalEpidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFinalYpalEpidom> select(int maxResult) {
    final List<MisthFinalYpalEpidom> result = dao.select(maxResult);
    logger.info("select(MisthFinalYpalEpidom) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthFinalYpalEpidom> selectAll() {
    final List<MisthFinalYpalEpidom> results = dao.selectAll();
    logger.info("selectAll(MisthFinalYpalEpidom) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpalEpidom create(MisthFinalYpalEpidom bean) {
    requireNonNull(bean);
    logger.info("create(MisthFinalYpalEpidom={}) - entered bean ");

    final MisthFinalYpalEpidom result = dao.create(bean);

    logger.info("create(MisthFinalYpalEpidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpalEpidom update(MisthFinalYpalEpidom bean) {
    requireNonNull(bean);
    logger.info("update(MisthFinalYpalEpidom={}) - entered bean ");

    final MisthFinalYpalEpidom result = dao.update(bean);

    logger.info("update(MisthFinalYpalEpidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthFinalYpalEpidom={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthFinalYpalEpidom) - exited - return value={} result ");
  }
}
