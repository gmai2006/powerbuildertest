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
import com.test.abc.dao.MisthZpidikotDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultMisthZpidikotDtoService")
public class DefaultMisthZpidikotDtoService implements MisthZpidikotDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private MisthZpidikotDtoDao dao;

  @Inject
  @Named("DefaultMisthZpidikotDtoService")
  public DefaultMisthZpidikotDtoService(final MisthZpidikotDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultMisthZpidikotDtoService() {}

  public List<PrnYpalTotalDatesDto> prnYpalTotalDates(java.lang.String arg_kodxrisi) {
    return dao.prnYpalTotalDates(arg_kodxrisi);
  }

  public List<DwMisthYpalListDto> dwMisthYpalList(java.lang.String arg_kodxrisi) {
    return dao.dwMisthYpalList(arg_kodxrisi);
  }

  public List<PrnAnalisiYpalDto> prnAnalisiYpal(java.lang.String arg_kodxrisi) {
    return dao.prnAnalisiYpal(arg_kodxrisi);
  }

  public List<PickMisthZpidikotXrisiDto> pickMisthZpidikotXrisi(java.lang.String arg_kodxrisi) {
    return dao.pickMisthZpidikotXrisi(arg_kodxrisi);
  }

  public List<PrnFinalAtomikiMisthDto> prnFinalAtomikiMisth(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi) {
    return dao.prnFinalAtomikiMisth(arg_kodfinal, arg_kodxrisi);
  }

  public List<PrnYpalFinalDto> prnYpalFinal(java.lang.String arg_kodxrisi) {
    return dao.prnYpalFinal(arg_kodxrisi);
  }

  public List<PrnFinalAtomikiMisthArgDto> prnFinalAtomikiMisthArg(
      java.lang.Integer arg_kodypal,
      java.lang.Integer arg_kodfinal,
      java.lang.String arg_kodxrisi) {
    return dao.prnFinalAtomikiMisthArg(arg_kodypal, arg_kodfinal, arg_kodxrisi);
  }
}
