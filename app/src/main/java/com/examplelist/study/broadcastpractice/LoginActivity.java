package com.examplelist.study.broadcastpractice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseActivity{
    private EditText username;
    private EditText password;
    private TextView loginIn;
    private static final String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.loginbg);
        linearLayout.setOnClickListener(null);
        username = (EditText)findViewById(R.id.user_name);
        password = (EditText)findViewById(R.id.psd);
        loginIn = (TextView)findViewById(R.id.login);

        loginIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String psd = password.getText().toString();
                Log.d(TAG, "onClick: *************"+name+password);
                if (name.equals("杨静")&&psd.equals("123456")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,"invalid",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}