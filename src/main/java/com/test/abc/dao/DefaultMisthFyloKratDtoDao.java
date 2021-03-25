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
@Named("DefaultMisthFyloKratDtoDao")
public class DefaultMisthFyloKratDtoDao implements MisthFyloKratDtoDao {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultMisthFyloKratDtoDao(JpaDao dao) {
    this.dao = dao;
  }

  public DefaultMisthFyloKratDtoDao() {}

  public List<DwMisthFyloKratListDto> dwMisthFyloKratList(
      java.lang.String arg_kodfylo, java.lang.String arg_kodxrisi) {
    final TypedQuery<DwMisthFyloKratListDto> query =
        dao.getEntityManager()
            .createNamedQuery("dwMisthFyloKratListMapping", DwMisthFyloKratListDto.class);
    query.setParameter("arg_kodfylo", arg_kodfylo);
    query.setParameter("arg_kodxrisi", arg_kodxrisi);
    return query.getResultList();
  }
}
