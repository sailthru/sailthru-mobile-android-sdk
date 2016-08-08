Carnival Mobile SDK for Android
==========================

Overview
-------

The Carnival SDK for Android is a drop in library that allows the Carnival Marketing platform to integrate with your Android apps.

The integration process usually only takes a few minutes.

This project contains the Carnival library, as well as an example project that you can use to quickly see some of the features of the SDK.

Integration
------

Detailed integration steps can be found in the official [Carnival.io ocumentation](http://docs.carnival.io/docs/android-integration).

Javadoc for the latest version of the SDK can be found [here](http://carnivalmobile.github.io/carnival-android-sdk/javadoc/latest/reference/com/carnival/sdk/package-summary.html).

Android Studio
-------

If you are using the Carnival SDK in your Android Studio Project, the SDK can be simply imported with Gradle

```Groovy
repositories {
    maven {
        url "https://github.com/carnivalmobile/maven-repository/raw/master/"
    }
}

dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.carnival.sdk:carnival:3.+'
    compile 'com.android.support:appcompat-v7:19.+'
    compile 'com.google.android.gms:play-services:4.+'
}
```
