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
import com.test.abc.dao.UsrgroupsDao;
import com.test.abc.entity.Usrgroups;
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
@Named("DefaultUsrgroupsService")
public class DefaultUsrgroupsService implements UsrgroupsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UsrgroupsDao dao;

  @Inject
  @Named("DefaultUsrgroupsDao")
  public DefaultUsrgroupsService(final UsrgroupsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Usrgroups find(java.lang.Float id) {
    final Usrgroups result = dao.find(id);
    logger.info("find(Usrgroups) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Usrgroups> select(int maxResult) {
    final List<Usrgroups> result = dao.select(maxResult);
    logger.info("select(Usrgroups) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Usrgroups> selectAll() {
    final List<Usrgroups> results = dao.selectAll();
    logger.info("selectAll(Usrgroups) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Usrgroups create(Usrgroups bean) {
    requireNonNull(bean);
    logger.info("create(Usrgroups={}) - entered bean ");

    final Usrgroups result = dao.create(bean);

    logger.info("create(Usrgroups) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Usrgroups update(Usrgroups bean) {
    requireNonNull(bean);
    logger.info("update(Usrgroups={}) - entered bean ");

    final Usrgroups result = dao.update(bean);

    logger.info("update(Usrgroups) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Float id) {
    logger.info("delete(Usrgroups={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Usrgroups) - exited - return value={} result ");
  }
}
