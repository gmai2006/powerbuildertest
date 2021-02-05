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

import javax.ejb.Stateless;
import javax.inject.Named;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.persistence.TypedQuery;

import com.test.abc.dto.*;

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
@Named("DefaultUsrgroupsDtoDao")
public class DefaultUsrgroupsDtoDao implements UsrgroupsDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultUsrgroupsDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultUsrgroupsDtoDao() {}

  public List<DwUsrgroupsListDto> dwUsrgroupsList() {
    final TypedQuery<DwUsrgroupsListDto> query =
        dao.getEntityManager().createNamedQuery("dwUsrgroupsListMapping", DwUsrgroupsListDto.class);
    return query.getResultList();
  }

  public List<PickUsrgroupsDto> pickUsrgroups() {
    final TypedQuery<PickUsrgroupsDto> query =
        dao.getEntityManager().createNamedQuery("pickUsrgroupsMapping", PickUsrgroupsDto.class);
    return query.getResultList();
  }

  public List<DwUsrgroupsFormDto> dwUsrgroupsForm(java.lang.Integer arg_kodgroup) {
    final TypedQuery<DwUsrgroupsFormDto> query =
        dao.getEntityManager().createNamedQuery("dwUsrgroupsFormMapping", DwUsrgroupsFormDto.class);
    query.setParameter("arg_kodgroup", arg_kodgroup);
    return query.getResultList();
  }
}
