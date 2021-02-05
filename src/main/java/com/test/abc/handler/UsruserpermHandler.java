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
import com.test.abc.entity.Usruserperm;
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
@Named("UsruserpermHandler")
public class UsruserpermHandler extends DelimiterFileHandler<Usruserperm> {

  @Inject
  @Named("DefaultJpaDao")
  public UsruserpermHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Usruserperm parseLine(List<String> headers, List<String> tokens) {
    Usruserperm record = new Usruserperm();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "koduser":
          record.setKoduser(new java.lang.Integer(tokens.get(i)));
          break;
        case "enable":
          record.setEnable(new java.lang.Integer(tokens.get(i)));
          break;
        case "kodapp":
          record.setKodapp(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
