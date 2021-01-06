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
import com.test.abc.dao.MisthZpidikotDao;
import com.test.abc.entity.MisthZpidikot;
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
@Named("DefaultMisthZpidikotService")
public class DefaultMisthZpidikotService implements MisthZpidikotService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpidikotDao dao;

  @Inject
  @Named("DefaultMisthZpidikotDao")
  public DefaultMisthZpidikotService(final MisthZpidikotDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpidikot find(java.lang.String id) {
    final MisthZpidikot result = dao.find(id);
    logger.info("find(MisthZpidikot) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpidikot> select(int maxResult) {
    final List<MisthZpidikot> result = dao.select(maxResult);
    logger.info("select(MisthZpidikot) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpidikot> selectAll() {
    final List<MisthZpidikot> results = dao.selectAll();
    logger.info("selectAll(MisthZpidikot) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpidikot create(MisthZpidikot bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpidikot={}) - entered bean ");

    final MisthZpidikot result = dao.create(bean);

    logger.info("create(MisthZpidikot) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpidikot update(MisthZpidikot bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpidikot={}) - entered bean ");

    final MisthZpidikot result = dao.update(bean);

    logger.info("update(MisthZpidikot) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthZpidikot={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpidikot) - exited - return value={} result ");
  }
}
