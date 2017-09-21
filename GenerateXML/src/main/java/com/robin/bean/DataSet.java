package com.robin.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/21
 * Time : 下午11:00
 * Version : 1.0
 * Description : desc
 */

@XmlAccessorType(XmlAccessType.NONE)
public class DataSet<T> {
    @XmlAttribute(name = "totalCount")
    private long totalCount = 0;

    @XmlElement(name = "data")
    private List<T> datalist = new ArrayList<T>();

    public void addData(T seat) {
        this.datalist.add(seat);
        totalCount++;
    }

    public void setDatalist(List<T> datalist) {
        this.datalist = datalist;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getDatalist() {
        return datalist;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "totalCount=" + totalCount +
                ", datalist=" + datalist +
                '}';
    }
}
