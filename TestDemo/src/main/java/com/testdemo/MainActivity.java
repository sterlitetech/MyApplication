package com.testdemo;

import android.app.Activity;
import android.os.Bundle;

import com.github.sterlitetech.testlib.TestApi;
import com.github.sterlitetech.testlib.TestListener;

public class MainActivity extends Activity implements TestListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TestApi mTestApi = new TestApi(MainActivity.this);
        mTestApi.helloCall();
    }
}
