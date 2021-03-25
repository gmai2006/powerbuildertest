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
package com.test.abc.handler;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.test.abc.entity.MisthFyloKrat;
import com.test.abc.dao.JpaDao;

import com.test.abc.utils.DelimiterParser;

// @Stateless
@Named("MisthFyloKratHandler")
public class MisthFyloKratHandler extends DelimiterFileHandler<MisthFyloKrat> {

  @Inject
  @Named("DefaultJpaDao")
  public MisthFyloKratHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MisthFyloKrat parseLine(List<String> headers, List<String> tokens) {
    MisthFyloKrat record = new MisthFyloKrat();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "kodkrat":
          record.setKodkrat(new java.lang.String(tokens.get(i)));
          break;
        case "aa":
          record.setAa(new java.lang.Float(tokens.get(i)));
          break;
        case "kodfylo":
          record.setKodfylo(tokens.get(i));
          break;
        case "notes":
          record.setNotes(tokens.get(i));
          break;
        case "kodxrisi":
          record.setKodxrisi(tokens.get(i));
          break;
        case "expr":
          record.setExpr(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
