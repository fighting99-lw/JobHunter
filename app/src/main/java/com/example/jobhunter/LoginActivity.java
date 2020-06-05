package com.example.jobhunter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void onLoginClick(View View){
        startActivity(new Intent(this,RegisterForm.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }

}
