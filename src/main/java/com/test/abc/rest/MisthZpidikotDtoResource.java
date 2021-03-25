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

import com.test.abc.service.MisthZpidikotDtoService;
import com.test.abc.dto.*;

@Path("/misthzpidikotDto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class MisthZpidikotDtoResource {

  @Inject private MisthZpidikotDtoService service;

  public MisthZpidikotDtoResource() {}

  public MisthZpidikotDtoResource(final MisthZpidikotDtoService service) {
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
   * Select MisthZpidikot.
   *
   * @return a list MisthZpidikot.
   */
  @GET
  @Path("prnYpalTotalDates/{arg_kodxrisi}")
  public Response prnYpalTotalDates(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PrnYpalTotalDatesDto> result = service.prnYpalTotalDates(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpidikot.
   *
   * @return a list MisthZpidikot.
   */
  @GET
  @Path("dwMisthYpalList/{arg_kodxrisi}")
  public Response dwMisthYpalList(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthYpalListDto> result = service.dwMisthYpalList(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpidikot.
   *
   * @return a list MisthZpidikot.
   */
  @GET
  @Path("prnAnalisiYpal/{arg_kodxrisi}")
  public Response prnAnalisiYpal(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PrnAnalisiYpalDto> result = service.prnAnalisiYpal(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpidikot.
   *
   * @return a list MisthZpidikot.
   */
  @GET
  @Path("pickMisthZpidikotXrisi/{arg_kodxrisi}")
  public Response pickMisthZpidikotXrisi(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PickMisthZpidikotXrisiDto> result = service.pickMisthZpidikotXrisi(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpidikot.
   *
   * @return a list MisthZpidikot.
   */
  @GET
  @Path("prnFinalAtomikiMisth/{arg_kodfinal}/{arg_kodxrisi}")
  public Response prnFinalAtomikiMisth(
      @PathParam("arg_kodfinal") java.lang.Integer arg_kodfinal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PrnFinalAtomikiMisthDto> result =
        service.prnFinalAtomikiMisth(arg_kodfinal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpidikot.
   *
   * @return a list MisthZpidikot.
   */
  @GET
  @Path("prnYpalFinal/{arg_kodxrisi}")
  public Response prnYpalFinal(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PrnYpalFinalDto> result = service.prnYpalFinal(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthZpidikot.
   *
   * @return a list MisthZpidikot.
   */
  @GET
  @Path("prnFinalAtomikiMisthArg/{arg_kodypal}/{arg_kodfinal}/{arg_kodxrisi}")
  public Response prnFinalAtomikiMisthArg(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodfinal") java.lang.Integer arg_kodfinal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PrnFinalAtomikiMisthArgDto> result =
        service.prnFinalAtomikiMisthArg(arg_kodypal, arg_kodfinal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }
}
