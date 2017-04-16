package com.newtronlabs.easypermissions.sample;


import android.Manifest;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.newtronlabs.easypermissions.EasyPermissions;
import com.newtronlabs.easypermissions.listener.IPermissionsListener;

import java.util.Set;

public class ExampleService extends Service implements IPermissionsListener
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        // Request as many permissions as you like.
        // Make sure that these permissions are in your Manifest as well.
        EasyPermissions.getInstance().requestPermissions(this, this,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA,
                Manifest.permission.CALL_PHONE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onRequestSent(Set<String> set)
    {

    }

    @Override
    public void onFailure()
    {

    }
}
