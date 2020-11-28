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
import com.test.abc.dao.MisthZpoikogDao;
import com.test.abc.entity.MisthZpoikog;
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
@Named("DefaultMisthZpoikogService")
public class DefaultMisthZpoikogService implements MisthZpoikogService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpoikogDao dao;

  @Inject
  @Named("DefaultMisthZpoikogDao")
  public DefaultMisthZpoikogService(final MisthZpoikogDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpoikog find(String id) {
    final MisthZpoikog result = dao.find(id);
    logger.info("find(MisthZpoikog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpoikog> select(int maxResult) {
    final List<MisthZpoikog> result = dao.select(maxResult);
    logger.info("select(MisthZpoikog) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpoikog> selectAll() {
    final List<MisthZpoikog> results = dao.selectAll();
    logger.info("selectAll(MisthZpoikog) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpoikog create(MisthZpoikog bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpoikog={}) - entered bean ");

    final MisthZpoikog result = dao.create(bean);

    logger.info("create(MisthZpoikog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpoikog update(MisthZpoikog bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpoikog={}) - entered bean ");

    final MisthZpoikog result = dao.update(bean);

    logger.info("update(MisthZpoikog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(MisthZpoikog={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpoikog) - exited - return value={} result ");
  }
}
