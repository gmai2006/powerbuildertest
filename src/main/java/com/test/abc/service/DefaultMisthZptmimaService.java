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
import com.test.abc.dao.MisthZptmimaDao;
import com.test.abc.entity.MisthZptmima;
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
@Named("DefaultMisthZptmimaService")
public class DefaultMisthZptmimaService implements MisthZptmimaService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZptmimaDao dao;

  @Inject
  @Named("DefaultMisthZptmimaDao")
  public DefaultMisthZptmimaService(final MisthZptmimaDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptmima find(String id) {
    final MisthZptmima result = dao.find(id);
    logger.info("find(MisthZptmima) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZptmima> select(int maxResult) {
    final List<MisthZptmima> result = dao.select(maxResult);
    logger.info("select(MisthZptmima) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZptmima> selectAll() {
    final List<MisthZptmima> results = dao.selectAll();
    logger.info("selectAll(MisthZptmima) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptmima create(MisthZptmima bean) {
    requireNonNull(bean);
    logger.info("create(MisthZptmima={}) - entered bean ");

    final MisthZptmima result = dao.create(bean);

    logger.info("create(MisthZptmima) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptmima update(MisthZptmima bean) {
    requireNonNull(bean);
    logger.info("update(MisthZptmima={}) - entered bean ");

    final MisthZptmima result = dao.update(bean);

    logger.info("update(MisthZptmima) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(MisthZptmima={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZptmima) - exited - return value={} result ");
  }
}
