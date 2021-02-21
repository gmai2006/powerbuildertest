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
@Named("DefaultUsrappsDtoDao")
public class DefaultUsrappsDtoDao implements UsrappsDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultUsrappsDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultUsrappsDtoDao() {}

  public List<DwUsrappsListDto> dwUsrappsList() {
    final TypedQuery<DwUsrappsListDto> query =
        dao.getEntityManager().createNamedQuery("dwUsrappsListMapping", DwUsrappsListDto.class);
    return query.getResultList();
  }

  public List<DwUsractionsListDto> dwUsractionsList() {
    final TypedQuery<DwUsractionsListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwUsractionsListMapping", DwUsractionsListDto.class);
    return query.getResultList();
  }

  public List<PickUsrappsDto> pickUsrapps() {
    final TypedQuery<PickUsrappsDto> query =
        dao.getEntityManager().createNamedQuery("pickUsrappsMapping", PickUsrappsDto.class);
    return query.getResultList();
  }
}
