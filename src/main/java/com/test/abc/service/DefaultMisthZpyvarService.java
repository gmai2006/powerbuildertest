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
import com.test.abc.dao.MisthZpyvarDao;
import com.test.abc.entity.MisthZpyvar;
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
@Named("DefaultMisthZpyvarService")
public class DefaultMisthZpyvarService implements MisthZpyvarService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpyvarDao dao;

  @Inject
  @Named("DefaultMisthZpyvarDao")
  public DefaultMisthZpyvarService(final MisthZpyvarDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpyvar find(String id) {
    final MisthZpyvar result = dao.find(id);
    logger.info("find(MisthZpyvar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpyvar> select(int maxResult) {
    final List<MisthZpyvar> result = dao.select(maxResult);
    logger.info("select(MisthZpyvar) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<MisthZpyvar> selectAll() {
    final List<MisthZpyvar> results = dao.selectAll();
    logger.info("selectAll(MisthZpyvar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpyvar create(MisthZpyvar bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpyvar={}) - entered bean ");

    final MisthZpyvar result = dao.create(bean);

    logger.info("create(MisthZpyvar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpyvar update(MisthZpyvar bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpyvar={}) - entered bean ");

    final MisthZpyvar result = dao.update(bean);

    logger.info("update(MisthZpyvar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    logger.info("delete(MisthZpyvar={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MisthZpyvar) - exited - return value={} result ");
  }
}
