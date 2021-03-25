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
@Named("DefaultMisthReportDtoDao")
public class DefaultMisthReportDtoDao implements MisthReportDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthReportDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthReportDtoDao() {}

  public List<DwMisthReportFormNotesDto> dwMisthReportFormNotes(
      java.lang.String arg_kodreport, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthReportFormNotesDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthReportFormNotesMapping", DwMisthReportFormNotesDto.class);
    query.setParameter("arg_kodreport", arg_kodreport);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthReportListDto> dwMisthReportList(java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthReportListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthReportListMapping", DwMisthReportListDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<DwMisthReportFormDto> dwMisthReportForm(
      java.lang.String arg_kodreport, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthReportFormDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthReportFormMapping", DwMisthReportFormDto.class);
    query.setParameter("arg_kodreport", arg_kodreport);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }

  public List<PickMisthReportXrisiDto> pickMisthReportXrisi(java.lang.String arg_kodxrisi) {
    final TypedQuery<PickMisthReportXrisiDto> query =
        dao.getEntityManager()
            .createNamedQuery("pickMisthReportXrisiMapping", PickMisthReportXrisiDto.class);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
