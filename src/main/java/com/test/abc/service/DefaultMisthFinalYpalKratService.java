/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.test.abc.service;

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.test.abc.dao.MisthFinalYpalKratDao;
import com.test.abc.entity.MisthFinalYpalKrat;

@Stateless
@Named("DefaultMisthFinalYpalKratService")
public class DefaultMisthFinalYpalKratService implements MisthFinalYpalKratService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFinalYpalKratDao dao;

  @Inject
  @Named("DefaultMisthFinalYpalKratDao")
  public DefaultMisthFinalYpalKratService(final MisthFinalYpalKratDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpalKrat find(java.lang.String id) {
    final MisthFinalYpalKrat result = dao.find(id);
    logger.info("find(MisthFinalYpalKrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFinalYpalKrat> select(int maxResult) {
    final List<MisthFinalYpalKrat> result = dao.select(maxResult);
    logger.info("select(MisthFinalYpalKrat) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthFinalYpalKrat> selectAll() {
    final List<MisthFinalYpalKrat> results = dao.selectAll();
    logger.info("selectAll(MisthFinalYpalKrat) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpalKrat create(MisthFinalYpalKrat bean) {
    requireNonNull(bean);
    logger.info("create(MisthFinalYpalKrat={}) - entered bean ");

    final MisthFinalYpalKrat result = dao.create(bean);

    logger.info("create(MisthFinalYpalKrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpalKrat update(MisthFinalYpalKrat bean) {
    requireNonNull(bean);
    logger.info("update(MisthFinalYpalKrat={}) - entered bean ");

    final MisthFinalYpalKrat result = dao.update(bean);

    logger.info("update(MisthFinalYpalKrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthFinalYpalKrat={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthFinalYpalKrat) - exited - return value={} result ");
  }
}
