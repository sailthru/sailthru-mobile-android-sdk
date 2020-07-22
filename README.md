Sailthru Mobile SDK for Android
==========================

Overview
-------

The Sailthru Mobile SDK for Android is a drop in library that allows the Sailthru Mobile platform to integrate with your Android apps.

The integration process usually only takes a few minutes.

This project contains the Sailthru Mobile library, as well as an example project that you can use to quickly see some of the features of the SDK.

Integration
------

Detailed integration steps can be found in the official [Sailthru Mobile documentation](http://docs.mobile.sailthru.com/docs/android-integration).

Javadoc for the latest version of the SDK can be found [here](http://carnivalmobile.github.io/carnival-android-sdk/javadoc/latest/).

Android Studio
-------

If you are using the Sailthru Mobile SDK in your Android Studio Project, the SDK can be simply imported with Gradle

```Groovy
repositories {
    maven {
        url "https://github.com/carnivalmobile/maven-repository/raw/master/"
    }
}

dependencies {
    ...
    compile 'com.carnival.sdk:sailthru-mobile:12.+'
}
```
