package com.win16.hookdemo;

import android.app.Application;

/**
 * Created by REXZOU on 11/17/2015.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            HookHelper.installHook();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
