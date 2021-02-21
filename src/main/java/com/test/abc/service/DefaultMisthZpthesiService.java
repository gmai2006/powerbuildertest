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
import com.test.abc.dao.MisthZpthesiDao;
import com.test.abc.entity.MisthZpthesi;
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
@Named("DefaultMisthZpthesiService")
public class DefaultMisthZpthesiService implements MisthZpthesiService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpthesiDao dao;

  @Inject
  @Named("DefaultMisthZpthesiDao")
  public DefaultMisthZpthesiService(final MisthZpthesiDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpthesi find(java.lang.String id) {
    final MisthZpthesi result = dao.find(id);
    logger.info("find(MisthZpthesi) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpthesi> select(int maxResult) {
    final List<MisthZpthesi> result = dao.select(maxResult);
    logger.info("select(MisthZpthesi) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpthesi> selectAll() {
    final List<MisthZpthesi> results = dao.selectAll();
    logger.info("selectAll(MisthZpthesi) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpthesi create(MisthZpthesi bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpthesi={}) - entered bean ");

    final MisthZpthesi result = dao.create(bean);

    logger.info("create(MisthZpthesi) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpthesi update(MisthZpthesi bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpthesi={}) - entered bean ");

    final MisthZpthesi result = dao.update(bean);

    logger.info("update(MisthZpthesi) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthZpthesi={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpthesi) - exited - return value={} result ");
  }
}
