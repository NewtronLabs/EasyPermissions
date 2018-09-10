package com.newtronlabs.easypermissions.sample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.newtronlabs.easypermissions.EasyPermissions;
import com.newtronlabs.easypermissions.listener.IError;
import com.newtronlabs.easypermissions.listener.IPermissionsListener;

import java.util.Set;

public class ExampleService extends Service implements IPermissionsListener
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        // Will request all permissions from the Manifest automatically.
        EasyPermissions.getInstance().requestPermissions(this, this);
    }

    @Override
    public void onRequestSent(Set<String> set)
    {
    }

    @Override
    public void onFailure(IError error)
    {
    }

    @Override
    public void onCompleted(Set<String> grantedPermissions, Set<String> deniedPermissions)
    {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        return START_NOT_STICKY;
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
