package fr.remy.baseApp.domain.entity;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    private long custId;
    private String name;
    private int age;

    public Customer(long custId, String name, int age)     {
        this.custId = custId;
        this.name = name;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer [age=" + age + ", custId=" + custId + ", name=" + name
                + "]";
    }
}