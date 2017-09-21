package com.robin.rest;

import com.github.pagehelper.Page;
import com.robin.bean.DataSet;
import com.robin.bean.ResourceData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

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

        Page page = new Page(1,10);
//        Student stu1 = new Student("robin",1);
//        Student stu2 = new Student("jack",2);
//        page.add(stu1);
//        page.add(stu2);
        List<Page> list = new ArrayList<Page>();

//        list.add(page);  //添加就失败了

        DataSet<Page> dataSet = new DataSet<Page>();
        dataSet.setDatalist(list);

        resourceData.setDataset(dataSet);
        resourceData.setId(1);
        return resourceData;
    }
}
