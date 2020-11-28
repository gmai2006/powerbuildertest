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
import com.test.abc.dao.UsractionsDao;
import com.test.abc.entity.Usractions;
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
@Named("DefaultUsractionsService")
public class DefaultUsractionsService implements UsractionsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UsractionsDao dao;

  @Inject
  @Named("DefaultUsractionsDao")
  public DefaultUsractionsService(final UsractionsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Usractions find(String id) {
    final Usractions result = dao.find(id);
    logger.info("find(Usractions) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Usractions> select(int maxResult) {
    final List<Usractions> result = dao.select(maxResult);
    logger.info("select(Usractions) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Usractions> selectAll() {
    final List<Usractions> results = dao.selectAll();
    logger.info("selectAll(Usractions) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Usractions create(Usractions bean) {
    requireNonNull(bean);
    logger.info("create(Usractions={}) - entered bean ");

    final Usractions result = dao.create(bean);

    logger.info("create(Usractions) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Usractions update(Usractions bean) {
    requireNonNull(bean);
    logger.info("update(Usractions={}) - entered bean ");

    final Usractions result = dao.update(bean);

    logger.info("update(Usractions) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(Usractions={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Usractions) - exited - return value={} result ");
  }
}
