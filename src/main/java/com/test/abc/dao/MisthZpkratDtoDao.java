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

public interface MisthZpkratDtoDao {
  List<PickMisthZpkratXrisiDto> pickMisthZpkratXrisi(java.lang.String arg_kodxrisi);

  List<SelMisthZpkratXrisiDto> selMisthZpkratXrisi(java.lang.String arg_kodxrisi);

  List<SprnYpalPeriodKratDto> sprnYpalPeriodKrat(
      java.lang.String arg_kodxrisi,
      java.lang.Float arg_kodypal,
      java.util.Date arg_fromdate,
      java.util.Date arg_todate);

  List<SprnAnalisiKratForosDto> sprnAnalisiKratForos(
      java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi);

  List<SprnFinalKratMisthDto> sprnFinalKratMisth(
      java.lang.Float arg_kodfinal, java.lang.String arg_kodxrisi);

  List<SprnAnalisiKratAutoforosDto> sprnAnalisiKratAutoforos(
      java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi);

  List<DwStepKratapodMisthselectDto> dwStepKratapodMisthselect(java.lang.String arg_kodxrisi);

  List<PrnKratapodDto> prnKratapod(java.lang.String arg_kodxrisi, java.lang.Float arg_kodkratapod);

  List<SprnAnalisiKratLoipaDto> sprnAnalisiKratLoipa(
      java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi);

  List<SprnAnalisiKratAsfDto> sprnAnalisiKratAsf(
      java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi);

  List<PrnKratNoapodDto> prnKratNoapod(java.lang.String arg_kodxrisi);

  List<PrnKratTotalDto> prnKratTotal(java.lang.String arg_kodxrisi);

  List<SprnFinalKratYpalDto> sprnFinalKratYpal(
      java.lang.Float arg_kodfinal, java.lang.Float arg_kodypal, java.lang.String arg_kodxrisi);
}
