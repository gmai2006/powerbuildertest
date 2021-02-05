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

public interface MisthFinalYpalEpidomDtoDao {
  List<SprnYpalPeriodEpidomDto> sprnYpalPeriodEpidom(
      java.lang.String arg_kodxrisi,
      java.lang.Integer arg_kodypal,
      java.util.Date arg_fromdate,
      java.util.Date arg_todate);

  List<SprnAnalisiEpidomAsfDto> sprnAnalisiEpidomAsf(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal);

  List<SprnFinalEpidomYpalDto> sprnFinalEpidomYpal(
      java.lang.Integer arg_kodfinal, java.lang.Integer arg_kodypal, java.lang.String arg_kodxrisi);

  List<DwMisthFinalYpalEpidomListDto> dwMisthFinalYpalEpidomList(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi);

  List<SprnFinalEpidomMisthDto> sprnFinalEpidomMisth(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi);

  List<SprnAnalisiEpidomNoforosDto> sprnAnalisiEpidomNoforos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal);

  List<SprnAnalisiEpidomForosDto> sprnAnalisiEpidomForos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal);

  List<SprnAnalisiEpidomAutoforosDto> sprnAnalisiEpidomAutoforos(
      java.lang.String arg_kodxrisi, java.lang.Integer arg_kodypal);
}
