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
@Named("DefaultUsrusersDtoDao")
public class DefaultUsrusersDtoDao implements UsrusersDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultUsrusersDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultUsrusersDtoDao() {}

  public List<PickUsrusersDto> pickUsrusers() {
    final TypedQuery<PickUsrusersDto> query =
        dao.getEntityManager().createNamedQuery("pickUsrusersMapping", PickUsrusersDto.class);
    return query.getResultList();
  }

  public List<DwUsrusersFormDto> dwUsrusersForm(java.lang.Integer arg_koduser) {
    final TypedQuery<DwUsrusersFormDto> query =
        dao.getEntityManager().createNamedQuery("dwUsrusersFormMapping", DwUsrusersFormDto.class);
    query.setParameter("arg_koduser", arg_koduser);
    return query.getResultList();
  }

  public List<DwUsrmembersGroupListDto> dwUsrmembersGroupList(java.lang.Integer arg_kodgroup) {
    final TypedQuery<DwUsrmembersGroupListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwUsrmembersGroupListMapping", DwUsrmembersGroupListDto.class);
    query.setParameter("arg_kodgroup", arg_kodgroup);
    return query.getResultList();
  }

  public List<PickUsrusersWithadminDto> pickUsrusersWithadmin() {
    final TypedQuery<PickUsrusersWithadminDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickUsrusersWithadminMapping", PickUsrusersWithadminDto.class);
    return query.getResultList();
  }

  public List<DwUsrusersListDto> dwUsrusersList() {
    final TypedQuery<DwUsrusersListDto> query =
        dao.getEntityManager().createNamedQuery("dwUsrusersListMapping", DwUsrusersListDto.class);
    return query.getResultList();
  }

  public List<DwUsrusersAdminFormDto> dwUsrusersAdminForm() {
    final TypedQuery<DwUsrusersAdminFormDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwUsrusersAdminFormMapping", DwUsrusersAdminFormDto.class);
    return query.getResultList();
  }
}
