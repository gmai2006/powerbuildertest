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

import javax.ejb.Stateless;
import javax.inject.Named;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.persistence.TypedQuery;

import com.test.abc.dto.*;

@Stateless
@Named("DefaultMisthZpyvarDtoDao")
public class DefaultMisthZpyvarDtoDao implements MisthZpyvarDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthZpyvarDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthZpyvarDtoDao() {}

  public List<DwMisthZpyvarFormDto> dwMisthZpyvarForm(
      java.lang.String arg_kodyvar, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthZpyvarFormDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthZpyvarFormMapping", DwMisthZpyvarFormDto.class);
    query.setParameter("arg_kodyvar", arg_kodyvar);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PickMisthZpyvarXrisiDto> pickMisthZpyvarXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthZpyvarXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthZpyvarXrisiMapping", PickMisthZpyvarXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthZpyvarListDto> dwMisthZpyvarList(java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthZpyvarListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthZpyvarListMapping", DwMisthZpyvarListDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
