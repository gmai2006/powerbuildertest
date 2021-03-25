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
import com.test.abc.dao.MisthReportYpalDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultMisthReportYpalDtoService")
public class DefaultMisthReportYpalDtoService implements MisthReportYpalDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private MisthReportYpalDtoDao dao;

  @Inject
  @Named("DefaultMisthReportYpalDtoService")
  public DefaultMisthReportYpalDtoService(final MisthReportYpalDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultMisthReportYpalDtoService() {}

  public List<SprnReport2Dto> sprnReport2(
      java.lang.String arg_kodreport, java.lang.String arg_kodxrisi) {
    return dao.sprnReport2(arg_kodreport, arg_kodxrisi);
  }

  public List<SprnReportDto> sprnReport(
      java.lang.String arg_kodreport, java.lang.String arg_kodxrisi) {
    return dao.sprnReport(arg_kodreport, arg_kodxrisi);
  }

  public List<PickMisthReportYpalDto> pickMisthReportYpal(
      java.lang.String arg_kodreport, java.lang.String arg_kodxrisi) {
    return dao.pickMisthReportYpal(arg_kodreport, arg_kodxrisi);
  }
}
