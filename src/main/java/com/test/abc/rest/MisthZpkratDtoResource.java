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

import com.test.abc.service.MisthZpkratDtoService;
import com.test.abc.dto.*;

@Path("/misthzpkratDto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class MisthZpkratDtoResource {

  @Inject private MisthZpkratDtoService service;

  public MisthZpkratDtoResource() {}

  public MisthZpkratDtoResource(final MisthZpkratDtoService service) {
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
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("pickMisthZpkratXrisi/{arg_kodxrisi}")
  public Response pickMisthZpkratXrisi(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PickMisthZpkratXrisiDto> result = service.pickMisthZpkratXrisi(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("selMisthZpkratXrisi/{arg_kodxrisi}")
  public Response selMisthZpkratXrisi(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SelMisthZpkratXrisiDto> result = service.selMisthZpkratXrisi(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("sprnYpalPeriodKrat/{arg_kodxrisi}/{arg_kodypal}/{arg_fromdate}/{arg_todate}")
  public Response sprnYpalPeriodKrat(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_fromdate") java.util.Date arg_fromdate,
      @PathParam("arg_todate") java.util.Date arg_todate) {
    final List<SprnYpalPeriodKratDto> result =
        service.sprnYpalPeriodKrat(arg_kodxrisi, arg_kodypal, arg_fromdate, arg_todate);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("sprnAnalisiKratForos/{arg_kodypal}/{arg_kodxrisi}")
  public Response sprnAnalisiKratForos(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnAnalisiKratForosDto> result =
        service.sprnAnalisiKratForos(arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("sprnFinalKratMisth/{arg_kodfinal}/{arg_kodxrisi}")
  public Response sprnFinalKratMisth(
      @PathParam("arg_kodfinal") java.lang.Integer arg_kodfinal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnFinalKratMisthDto> result =
        service.sprnFinalKratMisth(arg_kodfinal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("sprnAnalisiKratAutoforos/{arg_kodypal}/{arg_kodxrisi}")
  public Response sprnAnalisiKratAutoforos(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnAnalisiKratAutoforosDto> result =
        service.sprnAnalisiKratAutoforos(arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("dwStepKratapodMisthselect/{arg_kodxrisi}")
  public Response dwStepKratapodMisthselect(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwStepKratapodMisthselectDto> result =
        service.dwStepKratapodMisthselect(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("prnKratapod/{arg_kodxrisi}/{arg_kodkratapod}")
  public Response prnKratapod(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_kodkratapod") java.lang.Float arg_kodkratapod) {
    final List<PrnKratapodDto> result = service.prnKratapod(arg_kodxrisi, arg_kodkratapod);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("sprnAnalisiKratLoipa/{arg_kodypal}/{arg_kodxrisi}")
  public Response sprnAnalisiKratLoipa(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnAnalisiKratLoipaDto> result =
        service.sprnAnalisiKratLoipa(arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("sprnAnalisiKratAsf/{arg_kodypal}/{arg_kodxrisi}")
  public Response sprnAnalisiKratAsf(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnAnalisiKratAsfDto> result =
        service.sprnAnalisiKratAsf(arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("prnKratNoapod/{arg_kodxrisi}")
  public Response prnKratNoapod(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PrnKratNoapodDto> result = service.prnKratNoapod(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("prnKratTotal/{arg_kodxrisi}")
  public Response prnKratTotal(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PrnKratTotalDto> result = service.prnKratTotal(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpkrat.
   *
   * @return a list MisthZpkrat.
   */
  @GET
  @Path("sprnFinalKratYpal/{arg_kodfinal}/{arg_kodypal}/{arg_kodxrisi}")
  public Response sprnFinalKratYpal(
      @PathParam("arg_kodfinal") java.lang.Integer arg_kodfinal,
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<SprnFinalKratYpalDto> result =
        service.sprnFinalKratYpal(arg_kodfinal, arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }
}
