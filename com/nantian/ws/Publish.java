package com.nantian.ws;


import javax.xml.ws.Endpoint;
/**
 * Created by mxn on 2019/2/24.
 */
public class Publish {
    public static void main(String[] args){
        //String address = "http://localhost:12345/hello";
        String address2 = "http://localhost:12346/aservice";

        Endpoint.publish(address2, new AserviceImpl());
        //Endpoint.publish(address,new Hello());
        System.out.println("Publish finished.");

    }

}
