# SplashThemeApp

### Android Splash Screen

https://blog.csdn.net/qq_45730283/article/details/134978133

https://developer.android.com/develop/ui/views/launch/splash-screen

https://developer.android.com/develop/ui/views/launch/splash-screen/migrate


### In app/build.gradle

Change the applicationId between your own package name and 【Idle Fish】 / 【QQ Music】 / 【AliPay】.

Then find out the different splash screen behavior.



### In AncroidManifest.xml

```xml

change
    android:theme="@style/FishAppTheme.InitScreen"
to 
    android:theme="@style/QQMusicTheme.InitScreen"

