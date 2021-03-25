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
package com.test.abc.service;

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.test.abc.dao.MisthZpkratDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultMisthZpkratDtoService")
public class DefaultMisthZpkratDtoService implements MisthZpkratDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private MisthZpkratDtoDao dao;

  @Inject
  @Named("DefaultMisthZpkratDtoService")
  public DefaultMisthZpkratDtoService(final MisthZpkratDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultMisthZpkratDtoService() {}

  public List<PickMisthZpkratXrisiDto> pickMisthZpkratXrisi(java.lang.String arg_kodxrisi) {
    return dao.pickMisthZpkratXrisi(arg_kodxrisi);
  }

  public List<SelMisthZpkratXrisiDto> selMisthZpkratXrisi(java.lang.String arg_kodxrisi) {
    return dao.selMisthZpkratXrisi(arg_kodxrisi);
  }

  public List<SprnYpalPeriodKratDto> sprnYpalPeriodKrat(
      java.lang.String arg_kodxrisi,
      java.lang.Integer arg_kodypal,
      java.util.Date arg_fromdate,
      java.util.Date arg_todate) {
    return dao.sprnYpalPeriodKrat(arg_kodxrisi, arg_kodypal, arg_fromdate, arg_todate);
  }

  public List<SprnAnalisiKratForosDto> sprnAnalisiKratForos(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.sprnAnalisiKratForos(arg_kodypal, arg_kodxrisi);
  }

  public List<SprnFinalKratMisthDto> sprnFinalKratMisth(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    return dao.sprnFinalKratMisth(arg_kodfinal, arg_kodxrisi);
  }

  public List<SprnAnalisiKratAutoforosDto> sprnAnalisiKratAutoforos(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.sprnAnalisiKratAutoforos(arg_kodypal, arg_kodxrisi);
  }

  public List<DwStepKratapodMisthselectDto> dwStepKratapodMisthselect(
      java.lang.String arg_kodxrisi) {
    return dao.dwStepKratapodMisthselect(arg_kodxrisi);
  }

  public List<PrnKratapodDto> prnKratapod(
      java.lang.String arg_kodxrisi, java.lang.Float arg_kodkratapod) {
    return dao.prnKratapod(arg_kodxrisi, arg_kodkratapod);
  }

  public List<SprnAnalisiKratLoipaDto> sprnAnalisiKratLoipa(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.sprnAnalisiKratLoipa(arg_kodypal, arg_kodxrisi);
  }

  public List<SprnAnalisiKratAsfDto> sprnAnalisiKratAsf(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.sprnAnalisiKratAsf(arg_kodypal, arg_kodxrisi);
  }

  public List<PrnKratNoapodDto> prnKratNoapod(java.lang.String arg_kodxrisi) {
    return dao.prnKratNoapod(arg_kodxrisi);
  }

  public List<PrnKratTotalDto> prnKratTotal(java.lang.String arg_kodxrisi) {
    return dao.prnKratTotal(arg_kodxrisi);
  }

  public List<SprnFinalKratYpalDto> sprnFinalKratYpal(
      java.lang.Integer arg_kodfinal,
      java.lang.Integer arg_kodypal,
      java.lang.String arg_kodxrisi) {
    return dao.sprnFinalKratYpal(arg_kodfinal, arg_kodypal, arg_kodxrisi);
  }
}
