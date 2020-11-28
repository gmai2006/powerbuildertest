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
import com.test.abc.dao.MisthReportYpalDao;
import com.test.abc.entity.MisthReportYpal;
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
@Named("DefaultMisthReportYpalService")
public class DefaultMisthReportYpalService implements MisthReportYpalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthReportYpalDao dao;

  @Inject
  @Named("DefaultMisthReportYpalDao")
  public DefaultMisthReportYpalService(final MisthReportYpalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportYpal find(Float id) {
    final MisthReportYpal result = dao.find(id);
    logger.info("find(MisthReportYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthReportYpal> select(int maxResult) {
    final List<MisthReportYpal> result = dao.select(maxResult);
    logger.info("select(MisthReportYpal) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthReportYpal> selectAll() {
    final List<MisthReportYpal> results = dao.selectAll();
    logger.info("selectAll(MisthReportYpal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportYpal create(MisthReportYpal bean) {
    requireNonNull(bean);
    logger.info("create(MisthReportYpal={}) - entered bean ");

    final MisthReportYpal result = dao.create(bean);

    logger.info("create(MisthReportYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportYpal update(MisthReportYpal bean) {
    requireNonNull(bean);
    logger.info("update(MisthReportYpal={}) - entered bean ");

    final MisthReportYpal result = dao.update(bean);

    logger.info("update(MisthReportYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(Float id) {
    logger.info("delete(MisthReportYpal={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthReportYpal) - exited - return value={} result ");
  }
}
