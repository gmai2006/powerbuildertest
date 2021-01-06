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
@Named("DefaultMisthYpalDtoDao")
public class DefaultMisthYpalDtoDao implements MisthYpalDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthYpalDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthYpalDtoDao() {}

  public List<PickMisthYpalXrisiDto> pickMisthYpalXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthYpalXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthYpalXrisiMapping", PickMisthYpalXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthYpalFormJobDto> dwMisthYpalFormJob(
      java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthYpalFormJobDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthYpalFormJobMapping", DwMisthYpalFormJobDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthFyloYpalListDto> dwMisthFyloYpalList(
      java.lang.String arg_kodfylo, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthFyloYpalListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthFyloYpalListMapping", DwMisthFyloYpalListDto.class);
    query.setParameter("arg_kodfylo", arg_kodfylo);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthYpalFormPersonalDto> dwMisthYpalFormPersonal(
      java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthYpalFormPersonalDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthYpalFormPersonalMapping", DwMisthYpalFormPersonalDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthYpalFormGeneralDto> dwMisthYpalFormGeneral(
      java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthYpalFormGeneralDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthYpalFormGeneralMapping", DwMisthYpalFormGeneralDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnYpalNewklimakioDto> prnYpalNewklimakio(
      java.lang.String arg_kodxrisi, java.util.Date arg_date) {
    final TypedQuery<PrnYpalNewklimakioDto> query =
        dao.getEntityManager()
            .createNamedQuery("prnYpalNewklimakioMapping", PrnYpalNewklimakioDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_date", arg_date);
    return query.getResultList();
  }

  public List<DwMisthYpalNewklimakioDto> dwMisthYpalNewklimakio(
      java.lang.String arg_kodxrisi, java.util.Date arg_date) {
    final TypedQuery<DwMisthYpalNewklimakioDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthYpalNewklimakioMapping", DwMisthYpalNewklimakioDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_date", arg_date);
    return query.getResultList();
  }
}
