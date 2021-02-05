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

package com.test.abc.dao;

import java.util.List;
import com.test.abc.dto.*;

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

public interface MisthYpalDtoDao {
  List<PickMisthYpalXrisiDto> pickMisthYpalXrisi(java.lang.String arg_kodxrisi);

  List<DwMisthYpalFormJobDto> dwMisthYpalFormJob(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi);

  List<DwMisthFyloYpalListDto> dwMisthFyloYpalList(
      java.lang.String arg_kodfylo, java.lang.String arg_kodxrisi);

  List<DwMisthYpalFormPersonalDto> dwMisthYpalFormPersonal(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi);

  List<DwMisthYpalFormGeneralDto> dwMisthYpalFormGeneral(
      java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi);

  List<PrnYpalNewklimakioDto> prnYpalNewklimakio(
      java.lang.String arg_kodxrisi, java.util.Date arg_date);

  List<DwMisthYpalNewklimakioDto> dwMisthYpalNewklimakio(
      java.lang.String arg_kodxrisi, java.util.Date arg_date);
}
