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
import com.test.abc.dao.AfxfilterDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultAfxfilterDtoService")
public class DefaultAfxfilterDtoService implements AfxfilterDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private AfxfilterDtoDao dao;

  @Inject
  @Named("DefaultAfxfilterDtoService")
  public DefaultAfxfilterDtoService(final AfxfilterDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultAfxfilterDtoService() {}

  public List<DwAfxfilterListDto> dwAfxfilterList(java.lang.String argtrablename) {
    return dao.dwAfxfilterList(argtrablename);
  }
}
