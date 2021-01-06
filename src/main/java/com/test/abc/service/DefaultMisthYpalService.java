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
import com.test.abc.dao.MisthYpalDao;
import com.test.abc.entity.MisthYpal;
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
@Named("DefaultMisthYpalService")
public class DefaultMisthYpalService implements MisthYpalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthYpalDao dao;

  @Inject
  @Named("DefaultMisthYpalDao")
  public DefaultMisthYpalService(final MisthYpalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthYpal find(java.lang.Float id) {
    final MisthYpal result = dao.find(id);
    logger.info("find(MisthYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthYpal> select(int maxResult) {
    final List<MisthYpal> result = dao.select(maxResult);
    logger.info("select(MisthYpal) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthYpal> selectAll() {
    final List<MisthYpal> results = dao.selectAll();
    logger.info("selectAll(MisthYpal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthYpal create(MisthYpal bean) {
    requireNonNull(bean);
    logger.info("create(MisthYpal={}) - entered bean ");

    final MisthYpal result = dao.create(bean);

    logger.info("create(MisthYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthYpal update(MisthYpal bean) {
    requireNonNull(bean);
    logger.info("update(MisthYpal={}) - entered bean ");

    final MisthYpal result = dao.update(bean);

    logger.info("update(MisthYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Float id) {
    logger.info("delete(MisthYpal={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthYpal) - exited - return value={} result ");
  }
}
