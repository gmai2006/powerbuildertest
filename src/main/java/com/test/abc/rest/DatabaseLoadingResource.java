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

package com.test.abc.rest;

import com.test.abc.dao.JpaDao;
import com.test.abc.handler.*;
import com.test.abc.utils.MetaDataEnum;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/admin")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})

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

public class DatabaseLoadingResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());

  public DatabaseLoadingResource() {}

  @Inject
  @Named("DefaultJpaDao")
  JpaDao jpa;

  /**
   * hello.
   *
   * @return a hello.
   */
  @GET
  @Path("")
  public Response hello() {
    return Response.status(Response.Status.OK).entity(this.getClass().getName()).build();
  }

  @GET
  @Path("loaddata")
  public Response loadData() {

    Arrays.stream(MetaDataEnum.values())
        .forEach(
            item -> {
              logger.info("processing " + item.name());
              InputStream in =
                  DatabaseLoadingResource.class.getResourceAsStream("/" + item.name() + ".csv");
              process(item.name(), in, jpa);
            });

    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .build();
  }

  private static void process(String handlerName, InputStream inputStream, JpaDao jpa) {
    DelimiterFileHandler handler = null;

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

      case "Usrgroups":
        handler = new UsrgroupsHandler(jpa);
        handler.process(inputStream);
        break;

      case "MisthZpepidom":
        handler = new MisthZpepidomHandler(jpa);
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

      case "Usrapps":
        handler = new UsrappsHandler(jpa);
        handler.process(inputStream);
        break;

      case "MisthZpthesi":
        handler = new MisthZpthesiHandler(jpa);
        handler.process(inputStream);
        break;

      case "Afxfilterd":
        handler = new AfxfilterdHandler(jpa);
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

      case "MisthZptamio":
        handler = new MisthZptamioHandler(jpa);
        handler.process(inputStream);
        break;

      case "MisthZpidikot":
        handler = new MisthZpidikotHandler(jpa);
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

      case "Usractions":
        handler = new UsractionsHandler(jpa);
        handler.process(inputStream);
        break;

      case "MisthFyloKrat":
        handler = new MisthFyloKratHandler(jpa);
        handler.process(inputStream);
        break;

      default:
        System.out.println("Not found " + handlerName);
    }
  }
}
