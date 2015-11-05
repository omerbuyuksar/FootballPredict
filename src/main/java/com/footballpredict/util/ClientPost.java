/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.footballpredict.util;

import javax.ws.rs.core.MediaType;

/**
 *
 * @author Ömer Faruk Büyükşar
 */
public class ClientPost {
    public static boolean postJsonString(String url, String jsonString) throws Exception {
//        try {
//            Client c = new Client();
//            WebResource resource = null;
//            resource = c.resource(url);
//            ClientResponse response = resource.type(MediaType.APPLICATION_JSON)
//                    .post(ClientResponse.class, jsonString);
//            //System.out.println(str);
//            if (response.getStatus() != 200) {
//                //System.out.println(response.getEntity(String.class));
//                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus() + "\n" + response.getEntity(String.class));
//            }
//            //String entity = response.getEntity(String.class);
//            response.close();
//        } catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//            throw new Exception(ex.getMessage());
//        }
        return true;
    }
    
}
