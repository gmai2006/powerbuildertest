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

import com.test.abc.service.MisthFyloDtoService;
import com.test.abc.dto.*;

@Path("/misthfyloDto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class MisthFyloDtoResource {

  @Inject private MisthFyloDtoService service;

  public MisthFyloDtoResource() {}

  public MisthFyloDtoResource(final MisthFyloDtoService service) {
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
   * Select MisthFylo.
   *
   * @return a list MisthFylo.
   */
  @GET
  @Path("dwMisthFyloForm/{arg_kodfylo}/{arg_kodxrisi}")
  public Response dwMisthFyloForm(
      @PathParam("arg_kodfylo") java.lang.String arg_kodfylo,
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthFyloFormDto> result = service.dwMisthFyloForm(arg_kodfylo, arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFylo.
   *
   * @return a list MisthFylo.
   */
  @GET
  @Path("pickMisthFyloXrisi/{arg_kodxrisi}")
  public Response pickMisthFyloXrisi(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PickMisthFyloXrisiDto> result = service.pickMisthFyloXrisi(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFylo.
   *
   * @return a list MisthFylo.
   */
  @GET
  @Path("dwMisthFyloList/{arg_kodxrisi}")
  public Response dwMisthFyloList(@PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<DwMisthFyloListDto> result = service.dwMisthFyloList(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select MisthFylo.
   *
   * @return a list MisthFylo.
   */
  @GET
  @Path("pickMisthFyloXrisiCheck/{arg_kodxrisi}")
  public Response pickMisthFyloXrisiCheck(
      @PathParam("arg_kodxrisi") java.lang.String arg_kodxrisi) {
    final List<PickMisthFyloXrisiCheckDto> result = service.pickMisthFyloXrisiCheck(arg_kodxrisi);
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }
}
