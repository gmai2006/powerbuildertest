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
import com.test.abc.dao.AfxfilterdDao;
import com.test.abc.entity.Afxfilterd;
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
@Named("DefaultAfxfilterdService")
public class DefaultAfxfilterdService implements AfxfilterdService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AfxfilterdDao dao;

  @Inject
  @Named("DefaultAfxfilterdDao")
  public DefaultAfxfilterdService(final AfxfilterdDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Afxfilterd find(java.lang.Float id) {
    final Afxfilterd result = dao.find(id);
    logger.info("find(Afxfilterd) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Afxfilterd> select(int maxResult) {
    final List<Afxfilterd> result = dao.select(maxResult);
    logger.info("select(Afxfilterd) - exited - return value={} result ");

    return result;
  }
  /** {@inheritDoc} */
  public List<Afxfilterd> selectAll() {
    final List<Afxfilterd> results = dao.selectAll();
    logger.info("selectAll(Afxfilterd) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Afxfilterd create(Afxfilterd bean) {
    requireNonNull(bean);
    logger.info("create(Afxfilterd={}) - entered bean ");

    final Afxfilterd result = dao.create(bean);

    logger.info("create(Afxfilterd) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Afxfilterd update(Afxfilterd bean) {
    requireNonNull(bean);
    logger.info("update(Afxfilterd={}) - entered bean ");

    final Afxfilterd result = dao.update(bean);

    logger.info("update(Afxfilterd) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(java.lang.Float id) {
    logger.info("delete(Afxfilterd={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Afxfilterd) - exited - return value={} result ");
  }
}
