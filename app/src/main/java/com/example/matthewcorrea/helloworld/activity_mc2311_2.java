package com.example.matthewcorrea.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_mc2311_2 extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc2311_3);

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openActivity2 ();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, activity_mc2311_2.class);
        startActivity(intent);

    }
}
