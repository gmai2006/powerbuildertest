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
import com.test.abc.dao.MisthZpkratDao;
import com.test.abc.entity.MisthZpkrat;
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
@Named("DefaultMisthZpkratService")
public class DefaultMisthZpkratService implements MisthZpkratService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpkratDao dao;

  @Inject
  @Named("DefaultMisthZpkratDao")
  public DefaultMisthZpkratService(final MisthZpkratDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpkrat find(java.lang.String id) {
    final MisthZpkrat result = dao.find(id);
    logger.info("find(MisthZpkrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpkrat> select(int maxResult) {
    final List<MisthZpkrat> result = dao.select(maxResult);
    logger.info("select(MisthZpkrat) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpkrat> selectAll() {
    final List<MisthZpkrat> results = dao.selectAll();
    logger.info("selectAll(MisthZpkrat) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpkrat create(MisthZpkrat bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpkrat={}) - entered bean ");

    final MisthZpkrat result = dao.create(bean);

    logger.info("create(MisthZpkrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpkrat update(MisthZpkrat bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpkrat={}) - entered bean ");

    final MisthZpkrat result = dao.update(bean);

    logger.info("update(MisthZpkrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthZpkrat={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpkrat) - exited - return value={} result ");
  }
}
