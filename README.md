# Easy Permissions

Android requires that these request come from an `Activity`. With Easy Permissions this is no longer an issue, you may request permission from anywhere as long as you provide `Context`. In addition, if you request a permission that is already granted the user will not be prompted.

<p align="center">
  <img src="https://github.com/NewtronLabs/EasyPermissions/blob/master/Diagram.png" width="56%" height="56%" >
</p>

----

## How to Use 

### Setup

Include the below dependencies in your `build.gradle` project.

```gradle
buildscript {
    repositories {
        jcenter()
        maven { url "http://code.newtronlabs.com:8081/artifactory/libs-release-local" }
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.3.3'
        classpath "com.newtronlabs.android:plugin:1.0.0"
    }
}

allprojects {
    repositories {
        jcenter()
        maven { url "http://code.newtronlabs.com:8081/artifactory/libs-release-local" }
    }
}
```

In the `build.gradle` for your app.

```gradle
apply plugin: 'com.newtronlabs.android'

dependencies {
    provided 'com.newtronlabs.easypermissions:easypermissions:2.0.0'
}
```

### Request Permission
As long as you have context you can request a permission from anywhere. Make sure you implement `IPermissionsListener` to receive information about what is happening with your permission request.

This example uses a `Service` to request the permission, something native Android does not allow.

```java
public class ExampleService extends Service implements IPermissionsListener
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        // Request as many permissions as you like. You may seperate them by commas or pass an array.
        // Make sure that these permissions are in your Manifest as well.
        EasyPermissions.getInstance().requestPermissions(this, this,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA,
                Manifest.permission.CALL_PHONE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);
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
```

### Always add the permission to your AndroidManifest.xml

As a requirement permissions must be in the Manifest.

```xml
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
<uses-permission android:name="android.permission.CAMERA"/>
<uses-permission android:name="android.permission.CALL_PHONE"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
 ```

### Additional Sample
More detailed exmaples can be found in this repo's samples folders: **EpSample**.

---
## License

Easy Permissions binaries and source code can only be used in accordance with Freeware license. That is, freeware may be used without payment, but may not be modified. The developer of Easy Permissions retains all rights to change, alter, adapt, and/or distribute the software. Easy Permissions is not liable for any damages and/or losses incurred during the use of Easy Permissions.

You may not decompile, reverse engineer, pull apart, or otherwise attempt to dissect the source code, algorithm, technique or other information from the binary code of Easy Permissions unless it is authorized by existing applicable law and only to the extent authorized by such law. In the event that such a law applies, user may only attempt the foregoing if: (1) user has contacted Newtron Labs to request such information and Newtron Labs has failed to respond in a reasonable time, or (2) reverse engineering is strictly necessary to obtain such information and Newtron Labs has failed to reply. Any information obtained by user from Newtron Labs may be used only in accordance to the terms agreed upon by Newtron Labs and in adherence to Newtron Labs confidentiality policy. Such information supplied by Newtron Labs and received by user shall not be disclosed to a third party or used to create a software substantially similar to the technique or expression of the Newtron Labs Easy Permissions software.

You are solely responsible for determining the appropriateness of using Easy Permissions and assume any risks associated with Your use of Easy Permissions. In no event and under no legal theory, whether in tort (including negligence), contract, or otherwise, unless required by applicable law (such as deliberate and grossly negligent acts) or agreed to in writing, shall Newtron Labs be liable to You for damages, including any direct, indirect, special, incidental, or consequential damages of any character arising as a result of this License or out of the use or inability to use the Easy Permissions (including but not limited to damages for loss of goodwill, work stoppage, computer failure or malfunction, or any and all other commercial damages or losses), even if Newtron Labs has been advised of the possibility of such damages. 

## Contact

contact@newtronlabs.com
