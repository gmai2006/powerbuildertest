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
@Named("DefaultMisthFinalYpalEpidomDtoDao")
public class DefaultMisthFinalYpalEpidomDtoDao implements MisthFinalYpalEpidomDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthFinalYpalEpidomDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthFinalYpalEpidomDtoDao() {}

  public List<SprnYpalPeriodEpidomDto> sprnYpalPeriodEpidom(
      java.lang.String arg_kodxrisi,
      java.lang.Integer arg_kodypal,
      java.util.Date arg_fromdate,
      java.util.Date arg_todate) {
    final TypedQuery<SprnYpalPeriodEpidomDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnYpalPeriodEpidomMapping", SprnYpalPeriodEpidomDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_fromdate", arg_fromdate);
    query.setParameter("arg_todate", arg_todate);
    return query.getResultList();
  }

  public List<SprnAnalisiEpidomAsfDto> sprnAnalisiEpidomAsf(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    final TypedQuery<SprnAnalisiEpidomAsfDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnAnalisiEpidomAsfMapping", SprnAnalisiEpidomAsfDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_kodypal", arg_kodypal);
    return query.getResultList();
  }

  public List<SprnFinalEpidomYpalDto> sprnFinalEpidomYpal(
      java.lang.Integer arg_kodfinal,
      java.lang.Integer arg_kodypal,
      java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnFinalEpidomYpalDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnFinalEpidomYpalMapping", SprnFinalEpidomYpalDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthFinalYpalEpidomListDto> dwMisthFinalYpalEpidomList(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthFinalYpalEpidomListDto> query =
        dao.getEntityManager()
            .createNamedQuery(
                "dwMisthFinalYpalEpidomListMapping", DwMisthFinalYpalEpidomListDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnFinalEpidomMisthDto> sprnFinalEpidomMisth(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnFinalEpidomMisthDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnFinalEpidomMisthMapping", SprnFinalEpidomMisthDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnAnalisiEpidomNoforosDto> sprnAnalisiEpidomNoforos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    final TypedQuery<SprnAnalisiEpidomNoforosDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnAnalisiEpidomNoforosMapping", SprnAnalisiEpidomNoforosDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_kodypal", arg_kodypal);
    return query.getResultList();
  }

  public List<SprnAnalisiEpidomForosDto> sprnAnalisiEpidomForos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    final TypedQuery<SprnAnalisiEpidomForosDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnAnalisiEpidomForosMapping", SprnAnalisiEpidomForosDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_kodypal", arg_kodypal);
    return query.getResultList();
  }

  public List<SprnAnalisiEpidomAutoforosDto> sprnAnalisiEpidomAutoforos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    final TypedQuery<SprnAnalisiEpidomAutoforosDto> query =
        dao.getEntityManager()
            .createNamedQuery(
                "sprnAnalisiEpidomAutoforosMapping", SprnAnalisiEpidomAutoforosDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_kodypal", arg_kodypal);
    return query.getResultList();
  }
}
