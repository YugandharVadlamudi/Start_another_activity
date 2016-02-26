package com.example.kiran.start_another_activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.content.Context;
import com.example.kiran.start_another_activity.R;

/**
 * Created by Kiran on 02-11-2015.
 */
public class Call_another_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_another_activity);
        Log.d("Name","Android");
    }
    public void send_Message(View view)
    {
        EditText ed=(EditText)findViewById(R.id.ED_entername);

        if(ed.length()==0)
        {

            AlertDialog.Builder builder_alert=new AlertDialog.Builder(this);
            builder_alert.setTitle("hello alert");//alert dialog title
            builder_alert.setMessage("click yes to exit");//alert message
            builder_alert.show();//default it is not displayed
        }
        else
        {
            Intent Intent_call=new Intent(this,Display_Message.class);
            startActivity(Intent_call);
        }


    }
}
