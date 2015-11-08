/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.attendenceapp.org.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Swartt
 */
@Entity
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    private String username;
    
    private String userPrivilege;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPrivilege() {
        return userPrivilege;
    }

    public void setUserPrivilege(String userPrivilege) {
        this.userPrivilege = userPrivilege;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", userPrivilege=" + userPrivilege + '}';
    }
    

    
}
