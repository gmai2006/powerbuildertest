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
import com.test.abc.dao.UsruserpermDao;
import com.test.abc.entity.Usruserperm;

@Stateless
@Named("DefaultUsruserpermService")
public class DefaultUsruserpermService implements UsruserpermService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UsruserpermDao dao;

  @Inject
  @Named("DefaultUsruserpermDao")
  public DefaultUsruserpermService(final UsruserpermDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Usruserperm find(java.lang.Integer id) {
    final Usruserperm result = dao.find(id);
    logger.info("find(Usruserperm) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Usruserperm> select(int maxResult) {
    final List<Usruserperm> result = dao.select(maxResult);
    logger.info("select(Usruserperm) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Usruserperm> selectAll() {
    final List<Usruserperm> results = dao.selectAll();
    logger.info("selectAll(Usruserperm) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Usruserperm create(Usruserperm bean) {
    requireNonNull(bean);
    logger.info("create(Usruserperm={}) - entered bean ");

    final Usruserperm result = dao.create(bean);

    logger.info("create(Usruserperm) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Usruserperm update(Usruserperm bean) {
    requireNonNull(bean);
    logger.info("update(Usruserperm={}) - entered bean ");

    final Usruserperm result = dao.update(bean);

    logger.info("update(Usruserperm) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Integer id) {
    logger.info("delete(Usruserperm={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Usruserperm) - exited - return value={} result ");
  }
}
