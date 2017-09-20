package com.robin.helloworld;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/20
 * Time : 下午7:42
 * Version : 1.0
 * Description : desc
 */


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWorld {
    //GET注解设置接受请求类型为GET
    @GET
    //Produces表明发送出去的数据类型为text/plain
    // 与Produces对应的是@Consumes，表示接受的数据类型为text/plain
    @Produces("text/plain")
    public String getMessage() {
        return "Hello world!";
    }
}
