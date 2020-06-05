package com.example.jobhunter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterForm extends AppCompatActivity {


    private CardView employer , seeker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        employer = findViewById(R.id.employer);
        seeker = findViewById(R.id.worker);

        employer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterForm.this,RegisterEmployer.class);
                startActivity(intent);
                finish();
            }
        });

        seeker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterForm.this,RegisterSeeker.class);
                startActivity(intent);
                finish();
            }
        });


    }




    public void onLoginClick(View view){
        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);

    }
}
