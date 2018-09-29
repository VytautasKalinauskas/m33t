package com.example.vytkal.m33t;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements IChange_Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button signUp = findViewById(R.id.buttonSignUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = newIntent(MainActivity.this, SignUpActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    @Override
    public Intent newIntent(Context context, Class cl) {
        Intent intent = new Intent(context, cl);

        return intent;
    }
}
