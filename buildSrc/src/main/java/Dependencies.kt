@file:Suppress("unused")

object Configs {
    val compileSdkVersion = 27
    val minSdkVersion = 16
    val targetSdkVersion = 27
}

object Versions {
    val kotlin = "1.2.41"
    val support = "27.1.1"
    val rxjava = "2.1.13"
}

object Libs {
    val junit = "junit:junit:4.12"
    val runner = "com.android.support.test:runner:1.0.2"
    val espresso_core = "com.android.support.test.espresso:espresso-core:3.0.2"

    val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support}"

    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

    val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"

    val constraint_layout = "com.android.support.constraint:constraint-layout:1.1.1"
}