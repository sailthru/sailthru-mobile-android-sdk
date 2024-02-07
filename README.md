Marigold SDK for Android
==========================

Overview
-------

The Marigold SDK for Android is a drop in library that allows the Marigold mobile platform to integrate with your Android apps.

The integration process usually only takes a few minutes.

This project contains the Marigold library, as well as an example project that you can use to quickly see some of the features of the SDK.

Integration
------

Detailed integration steps can be found in the official [documentation](http://docs.mobile.sailthru.com/docs/android-integration).

Javadoc for the latest version of the SDK can be found [here](http://sailthru.github.io/sailthru-mobile-android-sdk/javadoc/latest/).
KDoc for the latest version of the SDK can be found [here](http://sailthru.github.io/sailthru-mobile-android-sdk/kotlin/latest/).

Android Studio
-------

If you are using the Marigold SDK in your Android Studio Project, the SDK can be simply imported with Gradle

Gradle example:
```Gradle
repositories {
    maven {
        url "https://github.com/sailthru/maven-repository/raw/master/"
    }
}

dependencies {
    ...
    implementation 'com.marigold.sdk:marigold:20.+'
}
```

Kotlin DSL example:
```Gradle Kotlin DSL
repositories {
    maven {
        url = uri("https://github.com/sailthru/maven-repository/raw/master/")
    }
}

dependencies {
    implementation("com.marigold.sdk:marigold:20.+")
}
```
