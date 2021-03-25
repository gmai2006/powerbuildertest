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
@Named("DefaultMisthZpkratDtoDao")
public class DefaultMisthZpkratDtoDao implements MisthZpkratDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthZpkratDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthZpkratDtoDao() {}

  public List<PickMisthZpkratXrisiDto> pickMisthZpkratXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthZpkratXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthZpkratXrisiMapping", PickMisthZpkratXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SelMisthZpkratXrisiDto> selMisthZpkratXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<SelMisthZpkratXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("selMisthZpkratXrisiMapping", SelMisthZpkratXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnYpalPeriodKratDto> sprnYpalPeriodKrat(
      java.lang.String arg_kodxrisi,
      java.lang.Integer arg_kodypal,
      java.util.Date arg_fromdate,
      java.util.Date arg_todate) {
    final TypedQuery<SprnYpalPeriodKratDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnYpalPeriodKratMapping", SprnYpalPeriodKratDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_fromdate", arg_fromdate);
    query.setParameter("arg_todate", arg_todate);
    return query.getResultList();
  }

  public List<SprnAnalisiKratForosDto> sprnAnalisiKratForos(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnAnalisiKratForosDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnAnalisiKratForosMapping", SprnAnalisiKratForosDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnFinalKratMisthDto> sprnFinalKratMisth(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnFinalKratMisthDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnFinalKratMisthMapping", SprnFinalKratMisthDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnAnalisiKratAutoforosDto> sprnAnalisiKratAutoforos(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnAnalisiKratAutoforosDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnAnalisiKratAutoforosMapping", SprnAnalisiKratAutoforosDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwStepKratapodMisthselectDto> dwStepKratapodMisthselect(
      java.lang.String arg_kodxrisi) {
    final TypedQuery<DwStepKratapodMisthselectDto> query =
        dao.getEntityManager()
            .createNamedQuery(
                "dwStepKratapodMisthselectMapping", DwStepKratapodMisthselectDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnKratapodDto> prnKratapod(
      java.lang.String arg_kodxrisi, java.lang.Float arg_kodkratapod) {
    final TypedQuery<PrnKratapodDto> query =
        dao.getEntityManager().createNamedQuery("prnKratapodMapping", PrnKratapodDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    query.setParameter("arg_kodkratapod", arg_kodkratapod);
    return query.getResultList();
  }

  public List<SprnAnalisiKratLoipaDto> sprnAnalisiKratLoipa(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnAnalisiKratLoipaDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnAnalisiKratLoipaMapping", SprnAnalisiKratLoipaDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnAnalisiKratAsfDto> sprnAnalisiKratAsf(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnAnalisiKratAsfDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnAnalisiKratAsfMapping", SprnAnalisiKratAsfDto.class);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnKratNoapodDto> prnKratNoapod(java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnKratNoapodDto> query =
        dao.getEntityManager().createNamedQuery("prnKratNoapodMapping", PrnKratNoapodDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PrnKratTotalDto> prnKratTotal(java.lang.String arg_kodxrisi) {
    final TypedQuery<PrnKratTotalDto> query =
        dao.getEntityManager().createNamedQuery("prnKratTotalMapping", PrnKratTotalDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<SprnFinalKratYpalDto> sprnFinalKratYpal(
      java.lang.Integer arg_kodfinal,
      java.lang.Integer arg_kodypal,
      java.lang.String arg_kodxrisi) {
    final TypedQuery<SprnFinalKratYpalDto> query =
        dao.getEntityManager()
            .createNamedQuery("sprnFinalKratYpalMapping", SprnFinalKratYpalDto.class);
    query.setParameter("arg_kodfinal", arg_kodfinal);
    query.setParameter("arg_kodypal", arg_kodypal);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
