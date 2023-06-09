package com.example.apptaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                {
                    try {
                        sleep(3000);
                    }
                    catch (Exception e)
                    {
                       e.printStackTrace();
                    }
                    finally {
                        Intent AuthIntent = new Intent(MainActivity.this, AuthActivity.class);
                        startActivity(AuthIntent);
                    }
                }
            }
        };
        thread.start();


    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}