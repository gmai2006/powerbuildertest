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
@Named("DefaultMisthZpidikotDtoDao")
public class DefaultMisthZpidikotDtoDao implements MisthZpidikotDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthZpidikotDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthZpidikotDtoDao() {}

  public List<DwMisthYpalListDto> dwMisthYpalList(java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthYpalListDto> query =
        dao.getEntityManager().createNamedQuery("dwMisthYpalListMapping", DwMisthYpalListDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PickMisthZpidikotXrisiDto> pickMisthZpidikotXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthZpidikotXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthZpidikotXrisiMapping", PickMisthZpidikotXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnFinalAtomikiMisthDto> prnFinalAtomikiMisth(
      java.lang.Float arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnFinalAtomikiMisthDto> query =
        dao.getEntityManager()
            .createNamedQuery("prnFinalAtomikiMisthMapping", PrnFinalAtomikiMisthDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnFinalAtomikiMisthArgDto> prnFinalAtomikiMisthArg(
      java.lang.Float arg_kodypal, java.lang.Float arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnFinalAtomikiMisthArgDto> query =
        dao.getEntityManager()
            .createNamedQuery("prnFinalAtomikiMisthArgMapping", PrnFinalAtomikiMisthArgDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
