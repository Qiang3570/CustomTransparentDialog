package com.johnny.customtransparentdialog;

import android.app.Activity;
import android.os.Bundle;

import com.johnny.customtransparentdialog.view.CustomDialog;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomDialog customDialog = new CustomDialog(this, "我是透明的");
        customDialog.show();
    }
}