package mypackage.jersey.resource;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/21
 * Time : 下午11:51
 * Version : 1.0
 * Description : desc
 */

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;


@Component
@Path("/demo")
@Produces({ "application/json" })
public class DemoRest {
    @GET
    public DemoResult getDemo(@Context HttpServletRequest req) {
        DemoResult dr = new DemoResult("test", 19);
        return dr;
    }

    @GET
    @Path("name/{name}")
    public DemoResult getDemo1(@PathParam("name") String name) {
        DemoResult dr = new DemoResult(name, 19);
        return dr;
    }
}
