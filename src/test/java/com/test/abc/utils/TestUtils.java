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

package com.test.abc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

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

public class TestUtils {
  private static final Logger LOGGER = Logger.getLogger(TestUtils.class.getName());
  /**
   * Get date object.
   *
   * @param d the date
   * @return a string value of a date object.
   */
  public static String getDateObject(java.util.Date d) {
    final SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    return formater.format(d);
  }

  /**
   * Get time object.
   *
   * @param d the timestamp
   * @return a string value of a timestamp object.
   */
  public static String getTimeObject(java.sql.Timestamp d) {
    final SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    return formater.format(d);
  }

  /**
   * Get date object.
   *
   * @param date the date string.
   * @return date object.
   */
  public static java.util.Date parseDateJson(final String date) {
    final SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    try {
      return formater.parse(date);
    } catch (ParseException e) {
      LOGGER.log(Level.SEVERE, "Cannot parse date %s", date);
      return new java.util.Date();
    }
  }

  /**
   * Get null object.
   *
   * @param o the object
   * @return an empty string if the object is null
   */
  public static Object getObject(Object o) {
    if (null == o) return "";
    return o;
  }
}
