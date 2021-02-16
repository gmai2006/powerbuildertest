/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
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

/*
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

@Stateless
@Named("DefaultMisthReportColsDtoDao")
public class DefaultMisthReportColsDtoDao implements MisthReportColsDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthReportColsDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthReportColsDtoDao() {}

  public List<DwMisthReportColsListDto> dwMisthReportColsList(
      java.lang.String arg_kodreport, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthReportColsListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthReportColsListMapping", DwMisthReportColsListDto.class);
    query.setParameter("arg_kodreport", arg_kodreport);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}