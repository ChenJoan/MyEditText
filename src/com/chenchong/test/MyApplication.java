package com.chenchong.test;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Application;

public class MyApplication extends Application {

    public static ArrayList<Activity> activities=new ArrayList<Activity>();
    public static void exit(){
        for (Activity activity :
                activities) {
            activity.finish();
        }
    }
}
