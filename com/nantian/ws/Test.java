package com.nantian.ws;

/**
 * Created by mxn on 2019/2/24.
 */


import com.nantian.ws.Aservice;
import com.nantian.ws.AserviceImpl;

public class Test {

    public static void main(String[] args) {

        Aservice aservice = new AserviceImpl();
        //Aservice aservice = ais.getAserviceImplPort();
        int sum = aservice.add(1, 2);
        String msg = aservice.getMessage();
        System.out.println("sum is :"+sum);
        System.out.println("msg :"+msg);

    }
}
