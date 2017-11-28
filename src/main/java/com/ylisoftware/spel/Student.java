package com.ylisoftware.spel;

/**
 * author:liyangli
 * date: 2017/11/29 上午12:34.
 */
public class Student {
    private String name;
    private School school;
    private Integer classes;
    private String address;
    private String location;
    private Boolean state;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                ", classes=" + classes +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", state=" + state +
                '}';
    }
}
