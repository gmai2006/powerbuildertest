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
import com.test.abc.entity.Usrgroupperm;
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
@Named("UsrgrouppermHandler")
public class UsrgrouppermHandler extends DelimiterFileHandler<Usrgroupperm> {

  @Inject
  @Named("DefaultJpaDao")
  public UsrgrouppermHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Usrgroupperm parseLine(List<String> headers, List<String> tokens) {
    Usrgroupperm record = new Usrgroupperm();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setKodgroup(new java.lang.Float(tokens.get(i)));
          break;
        case "kodaction":
          record.setKodaction(tokens.get(i));
          break;
        case "editrec":
          record.setEditrec(new java.lang.Integer(tokens.get(i)));
          break;
        case "addrec":
          record.setAddrec(new java.lang.Integer(tokens.get(i)));
          break;
        case "delrec":
          record.setDelrec(new java.lang.Integer(tokens.get(i)));
          break;
        case "openlist":
          record.setOpenlist(new java.lang.Integer(tokens.get(i)));
          break;
        case "openform":
          record.setOpenform(new java.lang.Integer(tokens.get(i)));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
