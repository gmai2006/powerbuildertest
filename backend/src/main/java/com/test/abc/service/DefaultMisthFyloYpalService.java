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
import com.test.abc.dao.MisthFyloYpalDao;
import com.test.abc.entity.MisthFyloYpal;
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
@Named("DefaultMisthFyloYpalService")
public class DefaultMisthFyloYpalService implements MisthFyloYpalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFyloYpalDao dao;

  @Inject
  @Named("DefaultMisthFyloYpalDao")
  public DefaultMisthFyloYpalService(final MisthFyloYpalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloYpal find(java.lang.Integer id) {
    final MisthFyloYpal result = dao.find(id);
    logger.info("find(MisthFyloYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFyloYpal> select(int maxResult) {
    final List<MisthFyloYpal> result = dao.select(maxResult);
    logger.info("select(MisthFyloYpal) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthFyloYpal> selectAll() {
    final List<MisthFyloYpal> results = dao.selectAll();
    logger.info("selectAll(MisthFyloYpal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloYpal create(MisthFyloYpal bean) {
    requireNonNull(bean);
    logger.info("create(MisthFyloYpal={}) - entered bean ");

    final MisthFyloYpal result = dao.create(bean);

    logger.info("create(MisthFyloYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloYpal update(MisthFyloYpal bean) {
    requireNonNull(bean);
    logger.info("update(MisthFyloYpal={}) - entered bean ");

    final MisthFyloYpal result = dao.update(bean);

    logger.info("update(MisthFyloYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Integer id) {
    logger.info("delete(MisthFyloYpal={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthFyloYpal) - exited - return value={} result ");
  }
}
