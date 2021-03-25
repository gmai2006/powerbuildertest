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
@Named("DefaultAfxptoseisDtoDao")
public class DefaultAfxptoseisDtoDao implements AfxptoseisDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultAfxptoseisDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultAfxptoseisDtoDao() {}

  public List<DwAfxptoseisFormDto> dwAfxptoseisForm(java.lang.String as_onom) {
    final TypedQuery<DwAfxptoseisFormDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwAfxptoseisFormMapping", DwAfxptoseisFormDto.class);
    query.setParameter("as_onom", as_onom);
    return query.getResultList();
  }

  public List<DwAfxptoseisListDto> dwAfxptoseisList() {
    final TypedQuery<DwAfxptoseisListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwAfxptoseisListMapping", DwAfxptoseisListDto.class);
    return query.getResultList();
  }
}
