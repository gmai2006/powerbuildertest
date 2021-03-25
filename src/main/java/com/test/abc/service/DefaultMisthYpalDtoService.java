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
import com.test.abc.dao.MisthYpalDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultMisthYpalDtoService")
public class DefaultMisthYpalDtoService implements MisthYpalDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private MisthYpalDtoDao dao;

  @Inject
  @Named("DefaultMisthYpalDtoService")
  public DefaultMisthYpalDtoService(final MisthYpalDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultMisthYpalDtoService() {}

  public List<PickMisthYpalXrisiDto> pickMisthYpalXrisi(java.lang.String arg_kodxrisi) {
    return dao.pickMisthYpalXrisi(arg_kodxrisi);
  }

  public List<DwMisthYpalFormJobDto> dwMisthYpalFormJob(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.dwMisthYpalFormJob(arg_kodypal, arg_kodxrisi);
  }

  public List<DwMisthFyloYpalListDto> dwMisthFyloYpalList(
      java.lang.String arg_kodfylo, java.lang.String arg_kodxrisi) {
    return dao.dwMisthFyloYpalList(arg_kodfylo, arg_kodxrisi);
  }

  public List<DwMisthYpalFormPersonalDto> dwMisthYpalFormPersonal(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.dwMisthYpalFormPersonal(arg_kodypal, arg_kodxrisi);
  }

  public List<DwMisthYpalFormGeneralDto> dwMisthYpalFormGeneral(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi) {
    return dao.dwMisthYpalFormGeneral(arg_kodypal, arg_kodxrisi);
  }

  public List<PrnYpalNewklimakioDto> prnYpalNewklimakio(
      java.lang.String arg_kodxrisi, java.util.Date arg_date) {
    return dao.prnYpalNewklimakio(arg_kodxrisi, arg_date);
  }

  public List<DwMisthYpalNewklimakioDto> dwMisthYpalNewklimakio(
      java.lang.String arg_kodxrisi, java.util.Date arg_date) {
    return dao.dwMisthYpalNewklimakio(arg_kodxrisi, arg_date);
  }
}
