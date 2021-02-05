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

package com.test.abc.dao;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import com.test.abc.entity.Usrmembers;
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
@Named("DefaultUsrmembersDao")
public class DefaultUsrmembersDao implements UsrmembersDao {
  private static final int BATCH_SIZE = 50;
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultUsrmembersDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultUsrmembersDao() {}

  /** {@inheritDoc} */
  @Override
  public Usrmembers find(java.lang.Integer id) {
    final EntityManager em = dao.getEntityManager();
    Usrmembers model = em.find(Usrmembers.class, id);
    if (null == model) {
      return null;
    }
    return model;
  }

  /** {@inheritDoc} */
  @Override
  public List<Usrmembers> select(int max) {
    return dao.select("select a from Usrmembers a", Usrmembers.class, max);
  }

  /** {@inheritDoc} */
  @Override
  public List<Usrmembers> selectAll() {
    return dao.selectAll("select a from Usrmembers a", Usrmembers.class);
  }

  /** {@inheritDoc} */
  @Override
  public Usrmembers create(Usrmembers e) {
    return dao.create(e);
  }

  /** {@inheritDoc} */
  @Override
  public Usrmembers update(Usrmembers e) {
    return dao.update(e);
  }

  /** {@inheritDoc} */
  @Override
  @Transactional
  public void delete(java.lang.Integer id) {
    final EntityManager em = dao.getEntityManager();
    final Usrmembers removed = em.find(Usrmembers.class, id);
    if (null != removed) {
      em.remove(removed);
    }
  }
}
