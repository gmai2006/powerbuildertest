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
import com.test.abc.dao.MisthFinalYpalEpidomDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultMisthFinalYpalEpidomDtoService")
public class DefaultMisthFinalYpalEpidomDtoService implements MisthFinalYpalEpidomDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private MisthFinalYpalEpidomDtoDao dao;

  @Inject
  @Named("DefaultMisthFinalYpalEpidomDtoService")
  public DefaultMisthFinalYpalEpidomDtoService(final MisthFinalYpalEpidomDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultMisthFinalYpalEpidomDtoService() {}

  public List<SprnYpalPeriodEpidomDto> sprnYpalPeriodEpidom(
      java.lang.String arg_kodxrisi,
      java.lang.Integer arg_kodypal,
      java.util.Date arg_fromdate,
      java.util.Date arg_todate) {
    return dao.sprnYpalPeriodEpidom(arg_kodxrisi, arg_kodypal, arg_fromdate, arg_todate);
  }

  public List<SprnAnalisiEpidomAsfDto> sprnAnalisiEpidomAsf(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    return dao.sprnAnalisiEpidomAsf(arg_kodxrisi, arg_kodypal);
  }

  public List<SprnFinalEpidomYpalDto> sprnFinalEpidomYpal(
      java.lang.Integer arg_kodfinal,
      java.lang.Integer arg_kodypal,
      java.lang.String arg_kodxrisi) {
    return dao.sprnFinalEpidomYpal(arg_kodfinal, arg_kodypal, arg_kodxrisi);
  }

  public List<DwMisthFinalYpalEpidomListDto> dwMisthFinalYpalEpidomList(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    return dao.dwMisthFinalYpalEpidomList(arg_kodfinal, arg_kodxrisi);
  }

  public List<SprnFinalEpidomMisthDto> sprnFinalEpidomMisth(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    return dao.sprnFinalEpidomMisth(arg_kodfinal, arg_kodxrisi);
  }

  public List<SprnAnalisiEpidomNoforosDto> sprnAnalisiEpidomNoforos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    return dao.sprnAnalisiEpidomNoforos(arg_kodxrisi, arg_kodypal);
  }

  public List<SprnAnalisiEpidomForosDto> sprnAnalisiEpidomForos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    return dao.sprnAnalisiEpidomForos(arg_kodxrisi, arg_kodypal);
  }

  public List<SprnAnalisiEpidomAutoforosDto> sprnAnalisiEpidomAutoforos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal) {
    return dao.sprnAnalisiEpidomAutoforos(arg_kodxrisi, arg_kodypal);
  }
}
