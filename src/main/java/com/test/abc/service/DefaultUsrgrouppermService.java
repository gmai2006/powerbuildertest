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
import com.test.abc.dao.UsrgrouppermDao;
import com.test.abc.entity.Usrgroupperm;

@Stateless
@Named("DefaultUsrgrouppermService")
public class DefaultUsrgrouppermService implements UsrgrouppermService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UsrgrouppermDao dao;

  @Inject
  @Named("DefaultUsrgrouppermDao")
  public DefaultUsrgrouppermService(final UsrgrouppermDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Usrgroupperm find(java.lang.Integer id) {
    final Usrgroupperm result = dao.find(id);
    logger.info("find(Usrgroupperm) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Usrgroupperm> select(int maxResult) {
    final List<Usrgroupperm> result = dao.select(maxResult);
    logger.info("select(Usrgroupperm) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Usrgroupperm> selectAll() {
    final List<Usrgroupperm> results = dao.selectAll();
    logger.info("selectAll(Usrgroupperm) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Usrgroupperm create(Usrgroupperm bean) {
    requireNonNull(bean);
    logger.info("create(Usrgroupperm={}) - entered bean ");

    final Usrgroupperm result = dao.create(bean);

    logger.info("create(Usrgroupperm) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Usrgroupperm update(Usrgroupperm bean) {
    requireNonNull(bean);
    logger.info("update(Usrgroupperm={}) - entered bean ");

    final Usrgroupperm result = dao.update(bean);

    logger.info("update(Usrgroupperm) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Integer id) {
    logger.info("delete(Usrgroupperm={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Usrgroupperm) - exited - return value={} result ");
  }
}
