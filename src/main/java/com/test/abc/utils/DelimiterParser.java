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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.inject.Named;
import java.util.Collections;
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

@Stateless
@Named("DelimiterParser")
public class DelimiterParser {
  protected static final Logger LOGGER = Logger.getLogger(DelimiterParser.class.getName());
  /**
   * Parser a file into a list of list of string.
   *
   * @param inputPath The input file.
   * @param delimiter The delimiter token.
   * @return A list of list of string.
   */
  public List<List<String>> parse(final Path inputPath, final String delimiter) {
    Objects.requireNonNull(inputPath);
    if (Files.notExists(inputPath)) {
      throw new IllegalArgumentException(
          "Input file must be present " + inputPath.toAbsolutePath());
    }
    try {
      final List<String> lines = Files.readAllLines(inputPath, Charset.defaultCharset());
      return parse(lines, delimiter);
    } catch (IOException e) {
      LOGGER.log(
          Level.SEVERE, "Cannot parse %s due to {1}", new Object[] {inputPath.toString(), e});
    }
    return Collections.emptyList();
  }

  /**
   * Parser a file into a list of list of string.
   *
   * @param input The input stream.
   * @param delimiter The delimiter token.
   * @return A list of list of string.
   */
  public List<List<String>> parse(final InputStream input, final String delimiter) {
    final List<String> lines =
        new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))
            .lines()
            .collect(Collectors.toList());
    return parse(lines, delimiter);
  }

  /**
   * Parse a list of lines to a list of list of string.
   *
   * @param lines The lines of string to be parsed.
   * @param delimiter The delimiter token.
   * @return The list of list of string.
   */
  public List<List<String>> parse(List<String> lines, String delimiter) {
    return lines.stream()
        .map(line -> Arrays.asList(line.split(delimiter)))
        .collect(Collectors.toList());
  }
}
