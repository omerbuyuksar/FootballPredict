/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.footballpredict;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import java.io.IOException;

/**
 *
 * @author Ömer Faruk Büyükşar
 */
public class AppMain {
    public static void main(String[] args) {
        System.out.println("Starting HTTP server..");
        try {
            HttpServerFactory.create("http://0.0.0.0:9595/Predict").start();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
}
