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

package com.test.abc.handler;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.test.abc.entity.Afxfilter;
import com.test.abc.dao.JpaDao;

import com.test.abc.utils.DelimiterParser;

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

// @Stateless
@Named("AfxfilterHandler")
public class AfxfilterHandler extends DelimiterFileHandler<Afxfilter> {

  @Inject
  @Named("DefaultJpaDao")
  public AfxfilterHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Afxfilter parseLine(List<String> headers, List<String> tokens) {
    Afxfilter record = new Afxfilter();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "descfilter":
          record.setDescfilter(new java.lang.String(tokens.get(i)));
          break;
        case "kodfilter":
          record.setKodfilter(new java.lang.Float(tokens.get(i)));
          break;
        case "tablename":
          record.setTablename(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}