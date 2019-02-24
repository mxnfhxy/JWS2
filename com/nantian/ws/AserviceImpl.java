package com.nantian.ws;

/**
 * Created by mxn on 2019/2/24.
 */

import javax.jws.WebService;

@WebService(endpointInterface="com.nantian.ws.Aservice")
public class AserviceImpl implements Aservice{

    @Override
    public int add(int a,int b) {

        return a+b;
    }

    @Override
    public String getMessage() {
        return "hello";
    }

    @Override
    public String getMessageWithParam(String arg) {
        return "Your message is :"+arg;
    }

    @Override
    public String getMessage2() {
        return "这个不会被发布";
    }
}
