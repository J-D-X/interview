package com.hfk;

import java.lang.reflect.Proxy;

/**
 * @author HFKKK
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }
}
