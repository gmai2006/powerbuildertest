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
package com.test.abc.dao;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import com.test.abc.entity.MisthReportYpal;

@Stateless
@Named("DefaultMisthReportYpalDao")
public class DefaultMisthReportYpalDao implements MisthReportYpalDao {
  private static final int BATCH_SIZE = 50;
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthReportYpalDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthReportYpalDao() {}

  /** {@inheritDoc} */
  @Override
  public MisthReportYpal find(java.lang.Integer id) {
    final EntityManager em = dao.getEntityManager();
    MisthReportYpal model = em.find(MisthReportYpal.class, id);
    if (null == model) {
      return null;
    }
    return model;
  }

  /** {@inheritDoc} */
  @Override
  public List<MisthReportYpal> select(int max) {
    return dao.select("select a from MisthReportYpal a", MisthReportYpal.class, max);
  }

  /** {@inheritDoc} */
  @Override
  public List<MisthReportYpal> selectAll() {
    return dao.selectAll("select a from MisthReportYpal a", MisthReportYpal.class);
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportYpal create(MisthReportYpal e) {
    return dao.create(e);
  }

  /** {@inheritDoc} */
  @Override
  public MisthReportYpal update(MisthReportYpal e) {
    return dao.update(e);
  }

  /** {@inheritDoc} */
  @Override
  @Transactional
  public void delete(java.lang.Integer id) {
    final EntityManager em = dao.getEntityManager();
    final MisthReportYpal removed = em.find(MisthReportYpal.class, id);
    if (null != removed) {
      em.remove(removed);
    }
  }
}
