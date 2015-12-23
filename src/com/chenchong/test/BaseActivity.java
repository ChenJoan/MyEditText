package com.chenchong.test;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by worm on 2015/10/16.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.activities.add(this);
    }
}
