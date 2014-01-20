package com.muzy.test;

import com.alibaba.dubbo.rpc.RpcContext;

/**
 * Created by xiaoxue on 14-1-20.
 */
public class UserImpl implements User {

    Person p ;
    @Override
    public String test(String a) {
//        RpcContext.getContext().clearAttachments();
        a =  p.test(a) ;
        return a + " hello!" ;
    }

    public void setP(Person p) {
        this.p = p;
    }
}
