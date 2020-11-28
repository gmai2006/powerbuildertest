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

import static java.util.Objects.requireNonNull;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.abc.service.MisthFinalYpalService;
import com.test.abc.entity.MisthFinalYpal;

@Path("/misthfinalypal")
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

public class MisthFinalYpalResource {

  @Inject private MisthFinalYpalService service;

  public MisthFinalYpalResource() {}

  public MisthFinalYpalResource(final MisthFinalYpalService service) {
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
   * Idempotent method - create or update MisthFinalYpal.
   *
   * @param obj The MisthFinalYpal be be persisted.
   * @return The MisthFinalYpal entity.
   */
  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public MisthFinalYpal createOrUpdate(MisthFinalYpal obj) {
    if (this.service.find(obj.getId()) != null) {
      return this.service.update(obj);
    } else return this.service.create(obj);
  }

  /**
   * InIdempotent method. Update existing MisthFinalYpal.
   *
   * @param obj - instance of MisthFinalYpal.
   * @return MisthFinalYpal.
   */
  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public MisthFinalYpal update(MisthFinalYpal obj) {
    return this.service.update(obj);
  }

  /**
   * Delete existing MisthFinalYpal.
   *
   * @param id instance of MisthFinalYpal.
   * @return MisthFinalYpal.
   */

  /**
   * @Consumes(MediaType.APPLICATION_JSON) @DELETE public Response delete(@PathParam("id") Float id)
   * { this.service.delete(id); return Response.status(Response.Status.OK).entity("Successfully
   * delete object").build(); }
   */

  /**
   * Get MisthFinalYpal by its ID.
   *
   * @param id - instance of MisthFinalYpal.
   * @return MisthFinalYpal.
   */
  /**
   * @GET @Path("{id}") public Response find(@PathParam("id") Float id) { MisthFinalYpal result =
   * this.service.find(id); if (null == result) { return
   * Response.status(Response.Status.NOT_FOUND).build(); } return
   * Response.status(Response.Status.OK).entity(result).build(); }
   */
  /**
   * Select all MisthFinalYpal with limit of returned records.
   *
   * @param max - number of records.
   * @return a list MisthFinalYpal.
   */
  @GET
  @Path("select/{max}")
  public Response findWithLimit(@PathParam("max") String max) {
    Integer input = null;
    try {
      input = Integer.valueOf(max);
    } catch (NumberFormatException ex) {
      throw new WebApplicationException(Response.Status.BAD_REQUEST);
    }
    List<MisthFinalYpal> result = service.select(input);

    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  /**
   * Select all MisthFinalYpal records.
   *
   * @return a list MisthFinalYpal.
   */
  @GET
  @Path("selectAll")
  public Response selectAll() {
    List<MisthFinalYpal> result = service.selectAll();

    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }
}