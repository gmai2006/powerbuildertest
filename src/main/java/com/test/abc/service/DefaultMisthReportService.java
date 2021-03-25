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
import com.test.abc.dao.MisthReportDao;
import com.test.abc.entity.MisthReport;

@Stateless
@Named("DefaultMisthReportService")
public class DefaultMisthReportService implements MisthReportService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthReportDao dao;

  @Inject
  @Named("DefaultMisthReportDao")
  public DefaultMisthReportService(final MisthReportDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReport find(java.lang.String id) {
    final MisthReport result = dao.find(id);
    logger.info("find(MisthReport) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthReport> select(int maxResult) {
    final List<MisthReport> result = dao.select(maxResult);
    logger.info("select(MisthReport) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthReport> selectAll() {
    final List<MisthReport> results = dao.selectAll();
    logger.info("selectAll(MisthReport) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReport create(MisthReport bean) {
    requireNonNull(bean);
    logger.info("create(MisthReport={}) - entered bean ");

    final MisthReport result = dao.create(bean);

    logger.info("create(MisthReport) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReport update(MisthReport bean) {
    requireNonNull(bean);
    logger.info("update(MisthReport={}) - entered bean ");

    final MisthReport result = dao.update(bean);

    logger.info("update(MisthReport) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthReport={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthReport) - exited - return value={} result ");
  }
}
