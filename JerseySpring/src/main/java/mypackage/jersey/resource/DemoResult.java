package mypackage.jersey.resource;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/21
 * Time : 下午11:52
 * Version : 1.0
 * Description : desc
 */

public class DemoResult {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DemoResult(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
