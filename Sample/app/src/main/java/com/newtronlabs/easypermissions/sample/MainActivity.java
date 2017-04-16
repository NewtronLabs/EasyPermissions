package com.newtronlabs.easypermissions.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Launch a service to show that even from a Service we can request permissions.
        Intent intent = new Intent(this, ExampleService.class);
        startService(intent);
    }
}
