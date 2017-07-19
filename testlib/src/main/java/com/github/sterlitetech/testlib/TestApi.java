package com.github.sterlitetech.testlib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by harshesh.soni on 6/24/2017.
 */

public class TestApi {
    private TestListener contextListener;
    private Context context;

    public TestApi(TestListener contextListener) {
        this.contextListener = contextListener;
        if (contextListener instanceof Context) {
            context = (Context) contextListener;
        }
    }

    public void helloCall() {
        Toast.makeText(context, "Hello call >>> " , Toast.LENGTH_LONG).show();
    }
}
