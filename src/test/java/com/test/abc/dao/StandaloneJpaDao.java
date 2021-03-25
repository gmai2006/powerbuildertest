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
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class StandaloneJpaDao implements JpaDao {
  private static final int BATCH_SIZE = 50;
  protected EntityManager em;

  /**
   * This constructor is needed for unit test.
   *
   * @param em Entity manager.
   */
  public StandaloneJpaDao(EntityManager em) {
    this.em = em;
  }

  /**
   * Get Entity manager.
   *
   * @return Entity manager.
   */
  public EntityManager getEntityManager() {
    requireNonNull(em);
    return em;
  }

  /** {@inheritDoc} */
  public <E> List<E> select(String queryStr, Class<E> e, int maxResult) {
    final EntityManager em = getEntityManager();
    Query query = em.createQuery(queryStr, e).setMaxResults(maxResult);
    return query.getResultList();
  }

  /** {@inheritDoc} */
  @Override
  public <E> List<E> selectAll(String queryStr, Class<E> e) {
    final EntityManager em = getEntityManager();
    Query query = em.createQuery(queryStr, e);
    return query.getResultList();
  }

  /** {@inheritDoc} */
  @Override
  public <E> E find(Class<E> e, Object id) {
    final EntityManager em = getEntityManager();
    E model = em.find(e, id);
    if (null == model) {
      return null;
    }
    return model;
  }

  /** {@inheritDoc} */
  @Override
  public <E> int batchCreate(List<E> list) {

    try {
      em.getTransaction().begin();
      for (int i = 0; i < list.size(); i++) {
        if (i > 0 && i % BATCH_SIZE == 0) {
          em.flush();
          em.clear();
        }
        em.persist(list.get(i));
      }
      em.getTransaction().commit();

    } catch (RuntimeException e) {

      throw e;
    } finally {
      if (em.isOpen() && em.getTransaction().isActive()) {
        em.flush();
        em.clear();
        em.getTransaction().commit();
      }
    }
    return list.size();
  }

  /** {@inheritDoc} */
  @Override
  public <E> E create(E e) {
    em.getTransaction().begin();
    em.persist(e);
    em.getTransaction().commit();
    return e;
  }

  /** {@inheritDoc} */
  @Override
  public <E> void delete(Class<E> e, Object id) {
    final E removed = em.find(e, id);
    if (null != removed) {
      em.getTransaction().begin();
      em.remove(removed);
      em.getTransaction().commit();
    }
  }

  /** {@inheritDoc} */
  @Override
  public <E> E update(E e) {
    em.getTransaction().begin();
    E model = em.merge(e);
    em.getTransaction().commit();
    return model;
  }

  @Override
  public <E> void deleteAll(Class<E> e) {
    em.getTransaction().begin();
    Query query = em.createQuery("delete from " + e.getCanonicalName());
    query.executeUpdate();
    em.getTransaction().commit();
  }
}
