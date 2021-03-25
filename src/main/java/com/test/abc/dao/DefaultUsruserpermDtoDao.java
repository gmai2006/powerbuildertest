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
@Named("DefaultUsruserpermDtoDao")
public class DefaultUsruserpermDtoDao implements UsruserpermDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultUsruserpermDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultUsruserpermDtoDao() {}

  public List<DwUsruserpermListDto> dwUsruserpermList(java.lang.Integer arg_koduser) {
    final TypedQuery<DwUsruserpermListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwUsruserpermListMapping", DwUsruserpermListDto.class);
    query.setParameter("arg_koduser", arg_koduser);
    return query.getResultList();
  }
}
