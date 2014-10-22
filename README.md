Carnival Mobile SDK for Android
==========================

Overview
-------

The Carnival Mobile SDK for Android is a drop in library that allows the Carnival Mobile Marketing platform to integrate with your Android apps.

The integration process usually only takes a few minutes.

This project contains the Carnival library, as well as an example project that you can use to quickly see some of the features of the SDK.

Integration
------

Detailed integration steps can be found in the official [Carnival Mobile documentation](http://docs.carnivalmobile.com/sdk/android/).

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
    compile 'com.carnival.sdk:carnival:2.+'
    compile 'com.android.support:appcompat-v7:19.+'
    compile 'com.google.android.gms:play-services:4.+'
}
```

Required Libraries
-------

The Carnival Mobile SDK requires the following libaries to be linked in your Eclipse project.

- [Google Play Services](https://developer.android.com/google/play-services/setup.html)
- [v7-appcompat Support Library](https://developer.android.com/tools/support-library/features.html#v7-appcompat)
