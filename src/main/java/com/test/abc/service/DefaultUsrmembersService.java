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
import com.test.abc.dao.UsrmembersDao;
import com.test.abc.entity.Usrmembers;
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
@Named("DefaultUsrmembersService")
public class DefaultUsrmembersService implements UsrmembersService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UsrmembersDao dao;

  @Inject
  @Named("DefaultUsrmembersDao")
  public DefaultUsrmembersService(final UsrmembersDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Usrmembers find(java.lang.Float id) {
    final Usrmembers result = dao.find(id);
    logger.info("find(Usrmembers) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Usrmembers> select(int maxResult) {
    final List<Usrmembers> result = dao.select(maxResult);
    logger.info("select(Usrmembers) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Usrmembers> selectAll() {
    final List<Usrmembers> results = dao.selectAll();
    logger.info("selectAll(Usrmembers) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Usrmembers create(Usrmembers bean) {
    requireNonNull(bean);
    logger.info("create(Usrmembers={}) - entered bean ");

    final Usrmembers result = dao.create(bean);

    logger.info("create(Usrmembers) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Usrmembers update(Usrmembers bean) {
    requireNonNull(bean);
    logger.info("update(Usrmembers={}) - entered bean ");

    final Usrmembers result = dao.update(bean);

    logger.info("update(Usrmembers) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Float id) {
    logger.info("delete(Usrmembers={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Usrmembers) - exited - return value={} result ");
  }
}
