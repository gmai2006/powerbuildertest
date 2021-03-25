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
import com.test.abc.dao.MisthZpperiodDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultMisthZpperiodDtoService")
public class DefaultMisthZpperiodDtoService implements MisthZpperiodDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private MisthZpperiodDtoDao dao;

  @Inject
  @Named("DefaultMisthZpperiodDtoService")
  public DefaultMisthZpperiodDtoService(final MisthZpperiodDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultMisthZpperiodDtoService() {}

  public List<DwMisthZpperiodListDto> dwMisthZpperiodList(java.lang.String arg_kodxrisi) {
    return dao.dwMisthZpperiodList(arg_kodxrisi);
  }

  public List<SelMisthZpperiodXrisiDto> selMisthZpperiodXrisi(java.lang.String arg_kodxrisi) {
    return dao.selMisthZpperiodXrisi(arg_kodxrisi);
  }

  public List<PickMisthZpperiodXrisiDto> pickMisthZpperiodXrisi(java.lang.String arg_kodxrisi) {
    return dao.pickMisthZpperiodXrisi(arg_kodxrisi);
  }

  public List<PrnFinalNopaidAnaKatastDto> prnFinalNopaidAnaKatast(java.lang.String arg_kodxrisi) {
    return dao.prnFinalNopaidAnaKatast(arg_kodxrisi);
  }

  public List<PrnFinalNopaidAnaYpalDto> prnFinalNopaidAnaYpal(java.lang.String arg_kodxrisi) {
    return dao.prnFinalNopaidAnaYpal(arg_kodxrisi);
  }

  public List<SprnYpalFinalDto> sprnYpalFinal(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.sprnYpalFinal(arg_kodypal, arg_kodxrisi);
  }
}
