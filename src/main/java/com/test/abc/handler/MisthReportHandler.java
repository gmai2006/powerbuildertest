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
import com.test.abc.entity.MisthReport;
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
@Named("MisthReportHandler")
public class MisthReportHandler extends DelimiterFileHandler<MisthReport> {

  @Inject
  @Named("DefaultJpaDao")
  public MisthReportHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MisthReport parseLine(List<String> headers, List<String> tokens) {
    MisthReport record = new MisthReport();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(new String(tokens.get(i)));
          break;
        case "kodxrisi":
          record.setKodxrisi(tokens.get(i));
          break;
        case "descreport":
          record.setDescreport(tokens.get(i));
          break;
        case "printMarginTop":
          record.setPrintMarginTop(new Integer(tokens.get(i)));
          break;
        case "printMarginBottom":
          record.setPrintMarginBottom(new Integer(tokens.get(i)));
          break;
        case "printMarginLeft":
          record.setPrintMarginLeft(new Integer(tokens.get(i)));
          break;
        case "printMarginRight":
          record.setPrintMarginRight(new Integer(tokens.get(i)));
          break;
        case "printOrientation":
          record.setPrintOrientation(new Integer(tokens.get(i)));
          break;
        case "printPaperSize":
          record.setPrintPaperSize(new Integer(tokens.get(i)));
          break;
        case "printScale":
          record.setPrintScale(new Integer(tokens.get(i)));
          break;
        case "subtitle":
          record.setSubtitle(tokens.get(i));
          break;
        case "prnNotes1":
          record.setPrnNotes1(tokens.get(i));
          break;
        case "prnNotes2":
          record.setPrnNotes2(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
