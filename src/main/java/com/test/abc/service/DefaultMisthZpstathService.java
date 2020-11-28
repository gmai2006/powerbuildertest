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
import com.test.abc.dao.MisthZpstathDao;
import com.test.abc.entity.MisthZpstath;
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
@Named("DefaultMisthZpstathService")
public class DefaultMisthZpstathService implements MisthZpstathService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpstathDao dao;

  @Inject
  @Named("DefaultMisthZpstathDao")
  public DefaultMisthZpstathService(final MisthZpstathDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpstath find(String id) {
    final MisthZpstath result = dao.find(id);
    logger.info("find(MisthZpstath) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpstath> select(int maxResult) {
    final List<MisthZpstath> result = dao.select(maxResult);
    logger.info("select(MisthZpstath) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpstath> selectAll() {
    final List<MisthZpstath> results = dao.selectAll();
    logger.info("selectAll(MisthZpstath) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpstath create(MisthZpstath bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpstath={}) - entered bean ");

    final MisthZpstath result = dao.create(bean);

    logger.info("create(MisthZpstath) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpstath update(MisthZpstath bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpstath={}) - entered bean ");

    final MisthZpstath result = dao.update(bean);

    logger.info("update(MisthZpstath) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(MisthZpstath={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpstath) - exited - return value={} result ");
  }
}