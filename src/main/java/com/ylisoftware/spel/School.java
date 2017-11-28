package com.ylisoftware.spel;

/**
 * author:liyangli
 * date: 2017/11/29 上午12:21.
 */
public class School {

    private String name;
    private String location;
    private Integer build;
    private String desc;
    private Float price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getBuild() {
        return build;
    }

    public void setBuild(Integer build) {
        this.build = build;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String findName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", build=" + build +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
