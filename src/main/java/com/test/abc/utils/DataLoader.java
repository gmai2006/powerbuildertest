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

import com.test.abc.dao.DefaultJpaDao;
import com.test.abc.dao.JpaDao;
import com.test.abc.handler.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.*;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

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

public class DataLoader {

  public static void main(String[] args) {
    String inputDir = "./data/";
    Path inputPath = Paths.get(inputDir);
    if (!Files.exists(inputPath)) {
      System.err.println("Not found " + inputDir);
      System.exit(0);
    }

    loadData(inputPath);
    System.exit(0);
  }

  private static void loadData(Path inputPath) {
    EntityManager manager = null;
    try {

      EntityManagerFactory entityManagerFactory =
          Persistence.createEntityManagerFactory("localpersistence");

      manager = entityManagerFactory.createEntityManager();
      final JpaDao jpa = new DefaultJpaDao(manager);

      Stream<Path> stream = Files.walk(inputPath, 1, FileVisitOption.FOLLOW_LINKS);
      stream.filter(path -> path.toString().endsWith(".csv")).forEach(path -> process(path, jpa));

    } catch (IOException e) {
      System.err.println("Cannot load data:" + e.getLocalizedMessage());
    } finally {
      manager.close();
    }
  }

  private static void process(Path inputPath, JpaDao jpa) {
    DelimiterFileHandler handler = null;
    String handlerName = getFileNameWithoutExtension(inputPath.getFileName().toString());
    InputStream inputStream = null;

    try {
      inputStream = new BufferedInputStream(new FileInputStream(inputPath.toFile()));

      switch (handlerName) {
        case "MisthKratapod":
          handler = new MisthKratapodHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpstath":
          handler = new MisthZpstathHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthYpalYvar":
          handler = new MisthYpalYvarHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZptmima":
          handler = new MisthZptmimaHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthYpal":
          handler = new MisthYpalHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFyloYpal":
          handler = new MisthFyloYpalHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthReportCols":
          handler = new MisthReportColsHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthReport":
          handler = new MisthReportHandler(jpa);
          handler.process(inputStream);
          break;
        case "Usrgroupperm":
          handler = new UsrgrouppermHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpoikog":
          handler = new MisthZpoikogHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpyvar":
          handler = new MisthZpyvarHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthReportYpal":
          handler = new MisthReportYpalHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpepidom":
          handler = new MisthZpepidomHandler(jpa);
          handler.process(inputStream);
          break;
        case "Usrgroups":
          handler = new UsrgroupsHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpkat":
          handler = new MisthZpkatHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpkrat":
          handler = new MisthZpkratHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFyloEpidom":
          handler = new MisthFyloEpidomHandler(jpa);
          handler.process(inputStream);
          break;
        case "Usrmembers":
          handler = new UsrmembersHandler(jpa);
          handler.process(inputStream);
          break;
        case "Usruserperm":
          handler = new UsruserpermHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpperiod":
          handler = new MisthZpperiodHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFinalYpal":
          handler = new MisthFinalYpalHandler(jpa);
          handler.process(inputStream);
          break;
        case "Afxfilterd":
          handler = new AfxfilterdHandler(jpa);
          handler.process(inputStream);
          break;
        case "Usrapps":
          handler = new UsrappsHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpthesi":
          handler = new MisthZpthesiHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFinalYpalKrat":
          handler = new MisthFinalYpalKratHandler(jpa);
          handler.process(inputStream);
          break;
        case "Afxfilter":
          handler = new AfxfilterHandler(jpa);
          handler.process(inputStream);
          break;
        case "Usrusers":
          handler = new UsrusersHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpidikot":
          handler = new MisthZpidikotHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZptamio":
          handler = new MisthZptamioHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZptitlos":
          handler = new MisthZptitlosHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFinalYpalEpidom":
          handler = new MisthFinalYpalEpidomHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthZpxrisi":
          handler = new MisthZpxrisiHandler(jpa);
          handler.process(inputStream);
          break;
        case "Afxptoseis":
          handler = new AfxptoseisHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFylo":
          handler = new MisthFyloHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFinal":
          handler = new MisthFinalHandler(jpa);
          handler.process(inputStream);
          break;
        case "MisthFyloKrat":
          handler = new MisthFyloKratHandler(jpa);
          handler.process(inputStream);
          break;
        case "Usractions":
          handler = new UsractionsHandler(jpa);
          handler.process(inputStream);
          break;

        default:
          System.out.println("Not found " + handlerName);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (null != inputStream) {
        try {
          inputStream.close();
        } catch (IOException ignored) {
        }
      }
    }
  }

  private static String getFileNameWithoutExtension(String fileName) {
    int lastIndex = fileName.lastIndexOf(".");
    if (lastIndex > 0) return fileName.substring(0, lastIndex);
    return fileName;
  }
}
