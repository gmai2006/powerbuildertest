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
import com.test.abc.dao.MisthFyloEpidomDao;
import com.test.abc.entity.MisthFyloEpidom;

@Stateless
@Named("DefaultMisthFyloEpidomService")
public class DefaultMisthFyloEpidomService implements MisthFyloEpidomService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFyloEpidomDao dao;

  @Inject
  @Named("DefaultMisthFyloEpidomDao")
  public DefaultMisthFyloEpidomService(final MisthFyloEpidomDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloEpidom find(java.lang.String id) {
    final MisthFyloEpidom result = dao.find(id);
    logger.info("find(MisthFyloEpidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFyloEpidom> select(int maxResult) {
    final List<MisthFyloEpidom> result = dao.select(maxResult);
    logger.info("select(MisthFyloEpidom) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthFyloEpidom> selectAll() {
    final List<MisthFyloEpidom> results = dao.selectAll();
    logger.info("selectAll(MisthFyloEpidom) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloEpidom create(MisthFyloEpidom bean) {
    requireNonNull(bean);
    logger.info("create(MisthFyloEpidom={}) - entered bean ");

    final MisthFyloEpidom result = dao.create(bean);

    logger.info("create(MisthFyloEpidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloEpidom update(MisthFyloEpidom bean) {
    requireNonNull(bean);
    logger.info("update(MisthFyloEpidom={}) - entered bean ");

    final MisthFyloEpidom result = dao.update(bean);

    logger.info("update(MisthFyloEpidom) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.String id) {
    logger.info("delete(MisthFyloEpidom={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthFyloEpidom) - exited - return value={} result ");
  }
}
