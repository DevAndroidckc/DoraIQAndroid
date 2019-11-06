package com.cdth17pm.doraiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Forgot_Password(View view) {
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
    }

    public void Login(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void Register(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
