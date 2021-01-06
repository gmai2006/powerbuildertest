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
import com.test.abc.dao.MisthReportColsDao;
import com.test.abc.entity.MisthReportCols;
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
@Named("DefaultMisthReportColsService")
public class DefaultMisthReportColsService implements MisthReportColsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthReportColsDao dao;

  @Inject
  @Named("DefaultMisthReportColsDao")
  public DefaultMisthReportColsService(final MisthReportColsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportCols find(java.lang.String id) {
    final MisthReportCols result = dao.find(id);
    logger.info("find(MisthReportCols) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthReportCols> select(int maxResult) {
    final List<MisthReportCols> result = dao.select(maxResult);
    logger.info("select(MisthReportCols) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthReportCols> selectAll() {
    final List<MisthReportCols> results = dao.selectAll();
    logger.info("selectAll(MisthReportCols) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportCols create(MisthReportCols bean) {
    requireNonNull(bean);
    logger.info("create(MisthReportCols={}) - entered bean ");

    final MisthReportCols result = dao.create(bean);

    logger.info("create(MisthReportCols) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportCols update(MisthReportCols bean) {
    requireNonNull(bean);
    logger.info("update(MisthReportCols={}) - entered bean ");

    final MisthReportCols result = dao.update(bean);

    logger.info("update(MisthReportCols) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthReportCols={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthReportCols) - exited - return value={} result ");
  }
}
