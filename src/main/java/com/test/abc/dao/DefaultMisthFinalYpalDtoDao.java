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
@Named("DefaultMisthFinalYpalDtoDao")
public class DefaultMisthFinalYpalDtoDao implements MisthFinalYpalDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthFinalYpalDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthFinalYpalDtoDao() {}

  public List<SprnReport3Dto> sprnReport3(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnReport3Dto> query =
        dao.getEntityManager().createNamedQuery("sprnReport3Mapping", SprnReport3Dto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthFinalYpalPrildateDto> dwMisthFinalYpalPrildate(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthFinalYpalPrildateDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthFinalYpalPrildateMapping", DwMisthFinalYpalPrildateDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnFinalYpalListDto> prnFinalYpalList(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnFinalYpalListDto> query =
        dao.getEntityManager()
            .createNamedQuery("prnFinalYpalListMapping", PrnFinalYpalListDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthFinalYpalPlirdateListDto> dwMisthFinalYpalPlirdateList(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthFinalYpalPlirdateListDto> query =
        dao.getEntityManager()
            .createNamedQuery(
                "dwMisthFinalYpalPlirdateListMapping", DwMisthFinalYpalPlirdateListDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthFinalYpalListDto> dwMisthFinalYpalList(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthFinalYpalListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthFinalYpalListMapping", DwMisthFinalYpalListDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PickMisthFinalYpalDto> pickMisthFinalYpal(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthFinalYpalDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthFinalYpalMapping", PickMisthFinalYpalDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
