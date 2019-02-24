package com.nantian.ws;

import javax.jws.WebService;
/**
 * Created by mxn on 2019/2/24.
 */
@WebService
public class Hello {
    public String sayHello(String saysth){
        System.out.println("This is to say something.");
        return  "Hello World!" + saysth;

    }
}
