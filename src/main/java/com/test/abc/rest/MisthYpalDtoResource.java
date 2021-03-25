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

import com.test.abc.service.MisthYpalDtoService;
import com.test.abc.dto.*;

@Path("/misthypalDto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class MisthYpalDtoResource {

  @Inject private MisthYpalDtoService service;

  public MisthYpalDtoResource() {}

  public MisthYpalDtoResource(final MisthYpalDtoService service) {
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
   * Select MisthYpal.
   *
   * @return a list MisthYpal.
   */
  @GET
  @Path("pickMisthYpalXrisi/{arg_kodxrisi}")
  public Response pickMisthYpalXrisi(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PickMisthYpalXrisiDto> result = service.pickMisthYpalXrisi(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthYpal.
   *
   * @return a list MisthYpal.
   */
  @GET
  @Path("dwMisthYpalFormJob/{arg_kodypal}/{arg_kodxrisi}")
  public Response dwMisthYpalFormJob(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthYpalFormJobDto> result =
        service.dwMisthYpalFormJob(arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthYpal.
   *
   * @return a list MisthYpal.
   */
  @GET
  @Path("dwMisthFyloYpalList/{arg_kodfylo}/{arg_kodxrisi}")
  public Response dwMisthFyloYpalList(
      @PathParam("arg_kodfylo") java.lang.String arg_kodfylo,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthFyloYpalListDto> result =
        service.dwMisthFyloYpalList(arg_kodfylo, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthYpal.
   *
   * @return a list MisthYpal.
   */
  @GET
  @Path("dwMisthYpalFormPersonal/{arg_kodypal}/{arg_kodxrisi}")
  public Response dwMisthYpalFormPersonal(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthYpalFormPersonalDto> result =
        service.dwMisthYpalFormPersonal(arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthYpal.
   *
   * @return a list MisthYpal.
   */
  @GET
  @Path("dwMisthYpalFormGeneral/{arg_kodypal}/{arg_kodxrisi}")
  public Response dwMisthYpalFormGeneral(
      @PathParam("arg_kodypal") java.lang.Integer arg_kodypal,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthYpalFormGeneralDto> result =
        service.dwMisthYpalFormGeneral(arg_kodypal, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthYpal.
   *
   * @return a list MisthYpal.
   */
  @GET
  @Path("prnYpalNewklimakio/{arg_kodxrisi}/{arg_date}")
  public Response prnYpalNewklimakio(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_date") java.util.Date arg_date) {
    final List<PrnYpalNewklimakioDto> result = service.prnYpalNewklimakio(arg_kodxrisi, arg_date);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthYpal.
   *
   * @return a list MisthYpal.
   */
  @GET
  @Path("dwMisthYpalNewklimakio/{arg_kodxrisi}/{arg_date}")
  public Response dwMisthYpalNewklimakio(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi,
      @PathParam("arg_date") java.util.Date arg_date) {
    final List<DwMisthYpalNewklimakioDto> result =
        service.dwMisthYpalNewklimakio(arg_kodxrisi, arg_date);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }
}
