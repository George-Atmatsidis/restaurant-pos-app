package com.blibli.future.pos.restaurant.common.model;


import java.sql.Timestamp;

public class User {
    private int id;
    private Timestamp timestampCreated;
    private int restaurantId;
    private String email;
    private String name;
    private String role;
    private String href;
    private String href2;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTimestampCreated() {
        return timestampCreated;
    }

    public void setTimestampCreated(Timestamp timestampCreated) {
        this.timestampCreated = timestampCreated;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Must trigger after set all variable
     */
    public void autoSetHref(){
        this.href = "/users/" + id;
        this.href2 = "/restaurants/" + restaurantId + "/users/" + id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", timestampCreated=" + timestampCreated +
                ", restaurantId=" + restaurantId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
