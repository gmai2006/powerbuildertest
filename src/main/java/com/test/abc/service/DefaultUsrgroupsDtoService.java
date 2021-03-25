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
import com.test.abc.dao.UsrgroupsDtoDao;
import com.test.abc.dto.*;

@Stateless
@Named("DefaultUsrgroupsDtoService")
public class DefaultUsrgroupsDtoService implements UsrgroupsDtoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private UsrgroupsDtoDao dao;

  @Inject
  @Named("DefaultUsrgroupsDtoService")
  public DefaultUsrgroupsDtoService(final UsrgroupsDtoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  public DefaultUsrgroupsDtoService() {}

  public List<DwUsrgroupsListDto> dwUsrgroupsList() {
    return dao.dwUsrgroupsList();
  }

  public List<PickUsrgroupsDto> pickUsrgroups() {
    return dao.pickUsrgroups();
  }

  public List<DwUsrgroupsFormDto> dwUsrgroupsForm(java.lang.Integer arg_kodgroup) {
    return dao.dwUsrgroupsForm(arg_kodgroup);
  }
}
