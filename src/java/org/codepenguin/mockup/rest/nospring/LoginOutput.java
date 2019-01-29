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
public class LoginOutput implements Serializable {

    private static final long serialVersionUID = 6790164711671736206L;

    private String message;

    public LoginOutput(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
