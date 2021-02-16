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
import com.test.abc.entity.MisthZpkrat;
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
@Named("MisthZpkratHandler")
public class MisthZpkratHandler extends DelimiterFileHandler<MisthZpkrat> {

  @Inject
  @Named("DefaultJpaDao")
  public MisthZpkratHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MisthZpkrat parseLine(List<String> headers, List<String> tokens) {
    MisthZpkrat record = new MisthZpkrat();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "kodkrat":
          record.setKodkrat(new java.lang.String(tokens.get(i)));
          break;
        case "isautoforos":
          record.setIsautoforos(new java.lang.Integer(tokens.get(i)));
          break;
        case "desckrat":
          record.setDesckrat(tokens.get(i));
          break;
        case "kodxrisi":
          record.setKodxrisi(tokens.get(i));
          break;
        case "isasf":
          record.setIsasf(new java.lang.Integer(tokens.get(i)));
          break;
        case "isforos":
          record.setIsforos(new java.lang.Integer(tokens.get(i)));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}