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
import com.test.abc.dao.MisthZptamioDao;
import com.test.abc.entity.MisthZptamio;

@Stateless
@Named("DefaultMisthZptamioService")
public class DefaultMisthZptamioService implements MisthZptamioService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZptamioDao dao;

  @Inject
  @Named("DefaultMisthZptamioDao")
  public DefaultMisthZptamioService(final MisthZptamioDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptamio find(java.lang.String id) {
    final MisthZptamio result = dao.find(id);
    logger.info("find(MisthZptamio) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZptamio> select(int maxResult) {
    final List<MisthZptamio> result = dao.select(maxResult);
    logger.info("select(MisthZptamio) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZptamio> selectAll() {
    final List<MisthZptamio> results = dao.selectAll();
    logger.info("selectAll(MisthZptamio) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptamio create(MisthZptamio bean) {
    requireNonNull(bean);
    logger.info("create(MisthZptamio={}) - entered bean ");

    final MisthZptamio result = dao.create(bean);

    logger.info("create(MisthZptamio) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptamio update(MisthZptamio bean) {
    requireNonNull(bean);
    logger.info("update(MisthZptamio={}) - entered bean ");

    final MisthZptamio result = dao.update(bean);

    logger.info("update(MisthZptamio) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthZptamio={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZptamio) - exited - return value={} result ");
  }
}
