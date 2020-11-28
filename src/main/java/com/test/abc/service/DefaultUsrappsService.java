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
import com.test.abc.dao.UsrappsDao;
import com.test.abc.entity.Usrapps;
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
@Named("DefaultUsrappsService")
public class DefaultUsrappsService implements UsrappsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UsrappsDao dao;

  @Inject
  @Named("DefaultUsrappsDao")
  public DefaultUsrappsService(final UsrappsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Usrapps find(String id) {
    final Usrapps result = dao.find(id);
    logger.info("find(Usrapps) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Usrapps> select(int maxResult) {
    final List<Usrapps> result = dao.select(maxResult);
    logger.info("select(Usrapps) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Usrapps> selectAll() {
    final List<Usrapps> results = dao.selectAll();
    logger.info("selectAll(Usrapps) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Usrapps create(Usrapps bean) {
    requireNonNull(bean);
    logger.info("create(Usrapps={}) - entered bean ");

    final Usrapps result = dao.create(bean);

    logger.info("create(Usrapps) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Usrapps update(Usrapps bean) {
    requireNonNull(bean);
    logger.info("update(Usrapps={}) - entered bean ");

    final Usrapps result = dao.update(bean);

    logger.info("update(Usrapps) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(Usrapps={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Usrapps) - exited - return value={} result ");
  }
}
