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
import com.test.abc.dao.UsrusersDao;
import com.test.abc.entity.Usrusers;
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
@Named("DefaultUsrusersService")
public class DefaultUsrusersService implements UsrusersService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UsrusersDao dao;

  @Inject
  @Named("DefaultUsrusersDao")
  public DefaultUsrusersService(final UsrusersDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Usrusers find(Float id) {
    final Usrusers result = dao.find(id);
    logger.info("find(Usrusers) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Usrusers> select(int maxResult) {
    final List<Usrusers> result = dao.select(maxResult);
    logger.info("select(Usrusers) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Usrusers> selectAll() {
    final List<Usrusers> results = dao.selectAll();
    logger.info("selectAll(Usrusers) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Usrusers create(Usrusers bean) {
    requireNonNull(bean);
    logger.info("create(Usrusers={}) - entered bean ");

    final Usrusers result = dao.create(bean);

    logger.info("create(Usrusers) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Usrusers update(Usrusers bean) {
    requireNonNull(bean);
    logger.info("update(Usrusers={}) - entered bean ");

    final Usrusers result = dao.update(bean);

    logger.info("update(Usrusers) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(Float id) {
    logger.info("delete(Usrusers={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Usrusers) - exited - return value={} result ");
  }
}
