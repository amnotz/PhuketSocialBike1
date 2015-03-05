package com.socialbike.phuketsocialbike;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.widget.LoginButton;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphUser;


public class LoginActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //BTN Login to BikerBoard
        Button login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contractBtn = new Intent(LoginActivity.this,Biker_BoardActivity.class);
                startActivity(contractBtn);
            }
        });



        //liknlogin to regis
        TextView link_Regis = (TextView) findViewById(R.id.text5);
        link_Regis.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent general = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(general);

            }
        });


    }
}




