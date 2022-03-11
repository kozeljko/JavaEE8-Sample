package org.test.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created 11. 03. 22
 * @author Aljaž Koželj
 */
@Path("/test")
public class RestResource {

    @POST
    @Path("/post")
    public Response post() {
        return Response.ok().build();
    }

}
