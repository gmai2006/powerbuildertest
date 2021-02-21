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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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

public class FileUtils {

  private static Logger logger = Logger.getLogger(FileUtils.class.getName());

  /**
   * Write data from a string to a file.
   *
   * @param path The target file.
   * @param s The input string.
   * @throws IOException if file not found or an issue while reading the file.
   */
  public static void writeStringToFile(Path path, String s) throws IOException {

    if (null == path) {
      throw new IllegalArgumentException("Input file required!");
    }

    BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
    writer.write(s);
    writer.flush();
    writer.close();
  }

  /**
   * Write a list of string to a file.
   *
   * @param filename the target file name.
   * @param list list of string.
   * @throws IOException throw an exception when an error occurs.
   */
  public static void writeListOfStringToFile(File filename, List<String> list) throws IOException {
    if (null == filename) {
      throw new IllegalArgumentException("Input file required!");
    }
    if (!filename.exists()) {
      filename.getParentFile().mkdirs();
    }
    BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
    for (String s : list) {
      writer.write(s);
      writer.newLine();
    }
    writer.flush();
    writer.close();
  }

  /**
   * Read data from a file to a list of string.
   *
   * @param path The source file path.
   * @param encoding language encoding.
   * @return A list of string.
   * @throws IOException throws an exception file reading data from a file.
   */
  public static List<String> readFiletoListOfString(String path, Charset encoding)
      throws IOException {
    return Files.readAllLines(Paths.get(path), encoding);
  }

  /**
   * Read data from a file to a string.
   *
   * @param path The source file path.
   * @param encoding language encoding.
   * @return A list of string.
   * @throws IOException throws an exception file reading data from a file.
   */
  public static String readFile2String(String path, Charset encoding) throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, encoding);
  }

  /**
   * Read inputstream to a string.
   *
   * @param resourceName input path.
   * @param encoding charset encoding.
   * @return a String.
   * @throws IOException - throw an exception when the given path does not exist.
   */
  public static String readFileFromResource2String(String resourceName, Charset encoding)
      throws IOException {
    byte[] encoded = null;
    try {
      encoded = Files.readAllBytes(Paths.get(ClassLoader.getSystemResource(resourceName).toURI()));
    } catch (URISyntaxException e) {
      logger.severe("Unable to read file from resource:" + e.getMessage());
    }
    return new String(encoded, encoding);
  }
}
