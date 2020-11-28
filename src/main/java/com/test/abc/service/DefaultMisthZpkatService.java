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
import com.test.abc.dao.MisthZpkatDao;
import com.test.abc.entity.MisthZpkat;
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
@Named("DefaultMisthZpkatService")
public class DefaultMisthZpkatService implements MisthZpkatService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpkatDao dao;

  @Inject
  @Named("DefaultMisthZpkatDao")
  public DefaultMisthZpkatService(final MisthZpkatDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpkat find(String id) {
    final MisthZpkat result = dao.find(id);
    logger.info("find(MisthZpkat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpkat> select(int maxResult) {
    final List<MisthZpkat> result = dao.select(maxResult);
    logger.info("select(MisthZpkat) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpkat> selectAll() {
    final List<MisthZpkat> results = dao.selectAll();
    logger.info("selectAll(MisthZpkat) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpkat create(MisthZpkat bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpkat={}) - entered bean ");

    final MisthZpkat result = dao.create(bean);

    logger.info("create(MisthZpkat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpkat update(MisthZpkat bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpkat={}) - entered bean ");

    final MisthZpkat result = dao.update(bean);

    logger.info("update(MisthZpkat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(MisthZpkat={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpkat) - exited - return value={} result ");
  }
}
