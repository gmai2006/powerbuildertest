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
import com.test.abc.dao.MisthKratapodDao;
import com.test.abc.entity.MisthKratapod;

@Stateless
@Named("DefaultMisthKratapodService")
public class DefaultMisthKratapodService implements MisthKratapodService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthKratapodDao dao;

  @Inject
  @Named("DefaultMisthKratapodDao")
  public DefaultMisthKratapodService(final MisthKratapodDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthKratapod find(java.lang.String id) {
    final MisthKratapod result = dao.find(id);
    logger.info("find(MisthKratapod) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthKratapod> select(int maxResult) {
    final List<MisthKratapod> result = dao.select(maxResult);
    logger.info("select(MisthKratapod) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthKratapod> selectAll() {
    final List<MisthKratapod> results = dao.selectAll();
    logger.info("selectAll(MisthKratapod) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthKratapod create(MisthKratapod bean) {
    requireNonNull(bean);
    logger.info("create(MisthKratapod={}) - entered bean ");

    final MisthKratapod result = dao.create(bean);

    logger.info("create(MisthKratapod) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthKratapod update(MisthKratapod bean) {
    requireNonNull(bean);
    logger.info("update(MisthKratapod={}) - entered bean ");

    final MisthKratapod result = dao.update(bean);

    logger.info("update(MisthKratapod) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthKratapod={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthKratapod) - exited - return value={} result ");
  }
}
