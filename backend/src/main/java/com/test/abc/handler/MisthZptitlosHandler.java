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
import com.test.abc.entity.MisthZptitlos;
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
@Named("MisthZptitlosHandler")
public class MisthZptitlosHandler extends DelimiterFileHandler<MisthZptitlos> {

  @Inject
  @Named("DefaultJpaDao")
  public MisthZptitlosHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MisthZptitlos parseLine(List<String> headers, List<String> tokens) {
    MisthZptitlos record = new MisthZptitlos();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "kodxrisi":
          record.setKodxrisi(new java.lang.String(tokens.get(i)));
          break;
        case "kodtitlos":
          record.setKodtitlos(tokens.get(i));
          break;
        case "desctitlos":
          record.setDesctitlos(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
