plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "nl.koenvh.historictime"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "nl.koenvh.historictime"
        minSdk = 33
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
}