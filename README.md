# Easy Permissions

Request permissions from anywhere as long as you have context. Android requires that you use an `Activity` to request permissions, with this library that restriction is no longer an issue.

----

## How to Use 

### Setup

Include the below dependencies in your `build.gradle` project.

```gradle
allprojects {
    repositories {
        jcenter()
        maven { url "http://code.newtronlabs.com:8081/artifactory/libs-release-local" }
    }
}
```

In the `build.gradle` for your app.

```gradle
compile 'com.newtronlabs.easypermissions:easypermissions:1.0.0'
```

### Request Permission
As long as you have context you can request a permission from anywhere. Make sure you implement `IPermissionsListener` to receive information about what is happening with your permission request.

This example uses a Service to request the permission, something native Android does not allow.

```java
public class MyService extends Service implements IPermissionsListener
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        // Pass as many permissions as you like. 
        // You may even pass an array or seperate values by comma.
        EasyPermissions.getInstance().requestPermissions(this, this,
                android.Manifest.permission.CAMERA);
    }

    @Override
    public void onRequestSent(Set<String> permissionsRequested)
    {

    }

    @Override
    public void onFailure()
    {

    }
}
```

### Always add the permission to your AndroidManifest.xml

As a rule you must add the desired permission to your Manifest.

```xml
 <uses-permission android:name="android.permission.CAMERA" />
 ```

### Additional Sample
More detailed exmaples can be found in this repo's samples folders: **EpSample**.

---
## License

Easy Permissions binaries and source code can only be used in accordance with Freeware license. That is, freeware may be used without payment, but may not be modified. The developer of Easy Permissions retains all rights to change, alter, adapt, and/or distribute the software. Easy Permissions is not liable for any damages and/or losses incurred during the use of Easy Permissions.

Users may not decompile, reverse engineer, pull apart, or otherwise attempt to dissect the source code, algorithm, technique or other information from the binary code of Easy Permissions unless it is authorized by existing applicable law and only to the extent authorized by such law. In the event that such a law applies, user may only attempt the foregoing if: (1) user has contacted Newtron Labs to request such information and Newtron Labs has failed to respond in a reasonable time, or (2) reverse engineering is strictly necessary to obtain such information and Newtron Labs has failed to reply. Any information obtained by user from Newtron Labs may be used only in accordance to the terms agreed upon by Newtron Labs and in adherence to Newtron Labs confidentiality policy. Such information supplied by Newtron Labs and received by user shall not be disclosed to a third party or used to create a software substantially similar to the technique or expression of the Newtron Labs Easy Permissions software.

## Contact

contact@newtronlabs.com
