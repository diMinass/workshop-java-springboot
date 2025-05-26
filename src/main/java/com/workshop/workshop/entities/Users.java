package com.workshop.workshop.entities;

import java.io.Serializable;
import java.util.Objects;

public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String email;
    private String phone;
    private String name;
    private String password;

    public Users() {
    }

    public Users(Long id, String email, String phone, String name, String password) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Users users)) return false;
        return Objects.equals(id, users.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
