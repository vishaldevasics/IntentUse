package com.maverickallies.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn,goolebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity();
            }
        });
        goolebtn = findViewById(R.id.googleBtnId);

        goolebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGoogle();
            }
        });

    }

    public void SecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void goToGoogle(){

        Uri webpage = Uri.parse("https://google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);

    }

}