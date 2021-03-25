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
package com.test.abc.service;

import java.util.List;
import com.test.abc.dto.*;

public interface MisthZpidikotDtoService {
  List<PrnYpalTotalDatesDto> prnYpalTotalDates(java.lang.String arg_kodxrisi);

  List<DwMisthYpalListDto> dwMisthYpalList(java.lang.String arg_kodxrisi);

  List<PrnAnalisiYpalDto> prnAnalisiYpal(java.lang.String arg_kodxrisi);

  List<PickMisthZpidikotXrisiDto> pickMisthZpidikotXrisi(java.lang.String arg_kodxrisi);

  List<PrnFinalAtomikiMisthDto> prnFinalAtomikiMisth(
      java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi);

  List<PrnYpalFinalDto> prnYpalFinal(java.lang.String arg_kodxrisi);

  List<PrnFinalAtomikiMisthArgDto> prnFinalAtomikiMisthArg(
      java.lang.Integer arg_kodypal, java.lang.Integer arg_kodfinal, java.lang.String arg_kodxrisi);
}