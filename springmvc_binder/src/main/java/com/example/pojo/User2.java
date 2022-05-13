package com.example.pojo;

import java.util.List;

public class User2 {
    private int id;
    private String username;
    private List<Order> orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", orders=" + orders +
                '}';
    }
}
