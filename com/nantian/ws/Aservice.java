package com.nantian.ws;

/**
 * Created by mxn on 2019/2/24.
 */
/**import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebParam
 */
import javax.jws.*;

@WebService
public interface Aservice {

    @WebResult(name="sum")
    public int add(@WebParam(name="aa") int a,@WebParam int b);

    public String getMessage();

    @WebMethod(exclude=true)    //exclude为true表示不发布该方法
    public String getMessage2();

    public String getMessageWithParam(String arg);
}
