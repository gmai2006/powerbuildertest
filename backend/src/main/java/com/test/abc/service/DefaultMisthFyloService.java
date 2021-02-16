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
import com.test.abc.dao.MisthFyloDao;
import com.test.abc.entity.MisthFylo;
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
@Named("DefaultMisthFyloService")
public class DefaultMisthFyloService implements MisthFyloService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFyloDao dao;

  @Inject
  @Named("DefaultMisthFyloDao")
  public DefaultMisthFyloService(final MisthFyloDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFylo find(java.lang.String id) {
    final MisthFylo result = dao.find(id);
    logger.info("find(MisthFylo) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFylo> select(int maxResult) {
    final List<MisthFylo> result = dao.select(maxResult);
    logger.info("select(MisthFylo) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthFylo> selectAll() {
    final List<MisthFylo> results = dao.selectAll();
    logger.info("selectAll(MisthFylo) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFylo create(MisthFylo bean) {
    requireNonNull(bean);
    logger.info("create(MisthFylo={}) - entered bean ");

    final MisthFylo result = dao.create(bean);

    logger.info("create(MisthFylo) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFylo update(MisthFylo bean) {
    requireNonNull(bean);
    logger.info("update(MisthFylo={}) - entered bean ");

    final MisthFylo result = dao.update(bean);

    logger.info("update(MisthFylo) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthFylo={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthFylo) - exited - return value={} result ");
  }
}
