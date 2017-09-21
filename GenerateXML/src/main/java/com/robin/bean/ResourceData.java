package com.robin.bean;

import javax.xml.bind.annotation.*;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/21
 * Time : 下午10:57
 * Version : 1.0
 * Description : desc
 */
@XmlRootElement(name = "resource")
@XmlAccessorType(XmlAccessType.NONE)
@SuppressWarnings("rawtypes")
public class ResourceData {
    @XmlAttribute(name = "id")
    private int id;

    @XmlElement(name = "dataset")
    private DataSet dataset;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DataSet getDataset() {
        return dataset;
    }

    public void setDataset(DataSet dataset) {
        this.dataset = dataset;
    }
}
