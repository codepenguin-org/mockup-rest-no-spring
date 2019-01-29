/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.codepenguin.mockup.rest.nospring;

import java.io.Serializable;

/**
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 01/28/2019
 */
public class LoginInput implements Serializable {

    private static final long serialVersionUID = 6943143711772198129L;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginInput{" + "username=" + username + ", password=" + password + '}';
    }

}
