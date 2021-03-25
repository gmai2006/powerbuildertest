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
import com.test.abc.entity.Afxptoseis;
import com.test.abc.dao.JpaDao;

import com.test.abc.utils.DelimiterParser;

// @Stateless
@Named("AfxptoseisHandler")
public class AfxptoseisHandler extends DelimiterFileHandler<Afxptoseis> {

  @Inject
  @Named("DefaultJpaDao")
  public AfxptoseisHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Afxptoseis parseLine(List<String> headers, List<String> tokens) {
    Afxptoseis record = new Afxptoseis();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "ait":
          record.setAit(new java.lang.String(tokens.get(i)));
          break;
        case "gen":
          record.setGen(tokens.get(i));
          break;
        case "onom":
          record.setOnom(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
