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
import com.test.abc.dao.MisthFinalYpalDao;
import com.test.abc.entity.MisthFinalYpal;
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
@Named("DefaultMisthFinalYpalService")
public class DefaultMisthFinalYpalService implements MisthFinalYpalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFinalYpalDao dao;

  @Inject
  @Named("DefaultMisthFinalYpalDao")
  public DefaultMisthFinalYpalService(final MisthFinalYpalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpal find(java.lang.Float id) {
    final MisthFinalYpal result = dao.find(id);
    logger.info("find(MisthFinalYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFinalYpal> select(int maxResult) {
    final List<MisthFinalYpal> result = dao.select(maxResult);
    logger.info("select(MisthFinalYpal) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthFinalYpal> selectAll() {
    final List<MisthFinalYpal> results = dao.selectAll();
    logger.info("selectAll(MisthFinalYpal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpal create(MisthFinalYpal bean) {
    requireNonNull(bean);
    logger.info("create(MisthFinalYpal={}) - entered bean ");

    final MisthFinalYpal result = dao.create(bean);

    logger.info("create(MisthFinalYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpal update(MisthFinalYpal bean) {
    requireNonNull(bean);
    logger.info("update(MisthFinalYpal={}) - entered bean ");

    final MisthFinalYpal result = dao.update(bean);

    logger.info("update(MisthFinalYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Float id) {
    logger.info("delete(MisthFinalYpal={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthFinalYpal) - exited - return value={} result ");
  }
}
