package com.cdth17pm.doraiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Manager(View view) {
        Intent intent = new Intent(this, ManagerAccount.class);
        startActivity(intent);
    }

    public void Option(View view) {
        Intent intent = new Intent(this, Option.class);
        startActivity(intent);
    }

    public void Buy_Credit(View view) {
        Intent intent = new Intent(this, BuyCredit.class);
        startActivity(intent);
    }
}
