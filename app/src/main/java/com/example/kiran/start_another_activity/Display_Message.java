package com.example.kiran.start_another_activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kiran on 02-11-2015.
 */
public class Display_Message extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv_name=new TextView(this);
        tv_name.setTextSize(40);
        tv_name.setText("hello another activity oncreate");
        setContentView(tv_name);
        Button bt=new Button(this);
        bt.setText("hello button");
        bt.setWidth(10);
        bt.setHeight(20);
       setContentView(bt);//display button

    }


}
