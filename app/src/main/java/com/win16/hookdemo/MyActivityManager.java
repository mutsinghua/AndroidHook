package com.win16.hookdemo;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by REXZOU on 11/17/2015.
 */
public class MyActivityManager  implements InvocationHandler{

    public static final String TAG = "MyActivityManager";
    public Object orignal ;

    public Class<?> getOrignalClass() throws ClassNotFoundException {
        return Class.forName("android.app.ActivityManagerNative");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Log.d(TAG, "before method called:" + method.getName());
        final Object obj =  method.invoke(orignal, args);
        Log.d(TAG, "after method called:" + method.getName());
        return obj;
    }
}
