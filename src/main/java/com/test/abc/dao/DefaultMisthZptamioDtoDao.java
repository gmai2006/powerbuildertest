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
@Named("DefaultMisthZptamioDtoDao")
public class DefaultMisthZptamioDtoDao implements MisthZptamioDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthZptamioDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthZptamioDtoDao() {}

  public List<PrnYpalTotalDatesDto> prnYpalTotalDates(java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnYpalTotalDatesDto> query =
        dao.getEntityManager()
            .createNamedQuery("prnYpalTotalDatesMapping", PrnYpalTotalDatesDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PickMisthZptamioXrisiDto> pickMisthZptamioXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthZptamioXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthZptamioXrisiMapping", PickMisthZptamioXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnAnalisiYpalDto> prnAnalisiYpal(java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnAnalisiYpalDto> query =
        dao.getEntityManager().createNamedQuery("prnAnalisiYpalMapping", PrnAnalisiYpalDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnYpalFinalDto> prnYpalFinal(java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnYpalFinalDto> query =
        dao.getEntityManager().createNamedQuery("prnYpalFinalMapping", PrnYpalFinalDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthZptamioListDto> dwMisthZptamioList(java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthZptamioListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthZptamioListMapping", DwMisthZptamioListDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
