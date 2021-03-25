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
package com.test.abc.rest;

import static java.util.Objects.requireNonNull;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.abc.service.MisthFinalYpalEpidomDtoService;
import com.test.abc.dto.*;

@Path("/misthfinalypalepidomDto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class MisthFinalYpalEpidomDtoResource {

  @Inject private MisthFinalYpalEpidomDtoService service;

  public MisthFinalYpalEpidomDtoResource() {}

  public MisthFinalYpalEpidomDtoResource(final MisthFinalYpalEpidomDtoService service) {
    requireNonNull(service);
    this.service = service;
  }

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

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("sprnYpalPeriodEpidom/{arg_kodxrisi}/{arg_kodypal}/{arg_fromdate}/{arg_todate}")
  public Response sprnYpalPeriodEpidom(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_fromdate") java.util.Date arg_fromdate,
      @PathParam("arg_todate") java.util.Date arg_todate) {
    final List<SprnYpalPeriodEpidomDto> result =
        service.sprnYpalPeriodEpidom(arg_kodxrisi, arg_kodypal, arg_fromdate, arg_todate);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("sprnAnalisiEpidomAsf/{arg_kodxrisi}/{arg_kodypal}")
  public Response sprnAnalisiEpidomAsf(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal) {
    final List<SprnAnalisiEpidomAsfDto> result =
        service.sprnAnalisiEpidomAsf(arg_kodxrisi, arg_kodypal);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("sprnFinalEpidomYpal/{arg_kodfinal}/{arg_kodypal}/{arg_kodxrisi}")
  public Response sprnFinalEpidomYpal(
      @PathParam("arg_kodfinal") java.lang.Integer arg_kodfinal,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnFinalEpidomYpalDto> result =
        service.sprnFinalEpidomYpal(arg_kodfinal, arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("dwMisthFinalYpalEpidomList/{arg_kodfinal}/{arg_kodxrisi}")
  public Response dwMisthFinalYpalEpidomList(
      @PathParam("arg_kodfinal") java.lang.Integer arg_kodfinal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthFinalYpalEpidomListDto> result =
        service.dwMisthFinalYpalEpidomList(arg_kodfinal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("sprnFinalEpidomMisth/{arg_kodfinal}/{arg_kodxrisi}")
  public Response sprnFinalEpidomMisth(
      @PathParam("arg_kodfinal") java.lang.Integer arg_kodfinal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnFinalEpidomMisthDto> result =
        service.sprnFinalEpidomMisth(arg_kodfinal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("sprnAnalisiEpidomNoforos/{arg_kodxrisi}/{arg_kodypal}")
  public Response sprnAnalisiEpidomNoforos(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal) {
    final List<SprnAnalisiEpidomNoforosDto> result =
        service.sprnAnalisiEpidomNoforos(arg_kodxrisi, arg_kodypal);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("sprnAnalisiEpidomForos/{arg_kodxrisi}/{arg_kodypal}")
  public Response sprnAnalisiEpidomForos(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal) {
    final List<SprnAnalisiEpidomForosDto> result =
        service.sprnAnalisiEpidomForos(arg_kodxrisi, arg_kodypal);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFinalYpalEpidom.
   *
   * @return a list MisthFinalYpalEpidom.
   */
  @GET
  @Path("sprnAnalisiEpidomAutoforos/{arg_kodxrisi}/{arg_kodypal}")
  public Response sprnAnalisiEpidomAutoforos(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal) {
    final List<SprnAnalisiEpidomAutoforosDto> result =
        service.sprnAnalisiEpidomAutoforos(arg_kodxrisi, arg_kodypal);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }
}
