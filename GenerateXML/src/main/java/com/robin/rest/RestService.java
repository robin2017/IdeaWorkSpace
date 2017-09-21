package com.robin.rest;

import com.robin.bean.ResourceData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/21
 * Time : 下午11:14
 * Version : 1.0
 * Description : desc
 */
@Path("/test")
public class RestService {

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,"application/x-protobuf"})
    public ResourceData query(@PathParam("serviceFlag") String serviceFlag){
        ResourceData resourceData = new ResourceData();
        return resourceData;
    }
}
