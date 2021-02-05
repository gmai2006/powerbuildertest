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
@Named("DefaultMisthZpperiodDtoDao")
public class DefaultMisthZpperiodDtoDao implements MisthZpperiodDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthZpperiodDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthZpperiodDtoDao() {}

  public List<DwMisthZpperiodListDto> dwMisthZpperiodList(java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthZpperiodListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthZpperiodListMapping", DwMisthZpperiodListDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SelMisthZpperiodXrisiDto> selMisthZpperiodXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<SelMisthZpperiodXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("selMisthZpperiodXrisiMapping", SelMisthZpperiodXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PickMisthZpperiodXrisiDto> pickMisthZpperiodXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthZpperiodXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthZpperiodXrisiMapping", PickMisthZpperiodXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnFinalNopaidAnaKatastDto> prnFinalNopaidAnaKatast(java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnFinalNopaidAnaKatastDto> query =
        dao.getEntityManager()
            .createNamedQuery("prnFinalNopaidAnaKatastMapping", PrnFinalNopaidAnaKatastDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnFinalNopaidAnaYpalDto> prnFinalNopaidAnaYpal(java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnFinalNopaidAnaYpalDto> query =
        dao.getEntityManager()
            .createNamedQuery("prnFinalNopaidAnaYpalMapping", PrnFinalNopaidAnaYpalDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnYpalFinalDto> sprnYpalFinal(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnYpalFinalDto> query =
        dao.getEntityManager().createNamedQuery("sprnYpalFinalMapping", SprnYpalFinalDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
