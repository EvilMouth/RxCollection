@file:Suppress("unused", "SpellCheckingInspection")

object Configs {
    const val compileSdkVersion = 27
    const val minSdkVersion = 16
}

object Versions {
    const val kotlin = "1.2.70"
    const val support = "27.1.1"
    const val rxjava = "2.1.13"
}

object Libs {
    const val junit = "junit:junit:4.12"
    const val runner = "com.android.support.test:runner:1.0.2"
    const val espresso_core = "com.android.support.test.espresso:espresso-core:3.0.2"

    const val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support}"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"

    const val constraint_layout = "com.android.support.constraint:constraint-layout:1.1.1"
}