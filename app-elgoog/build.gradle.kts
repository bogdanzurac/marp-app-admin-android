plugins {
    alias(libs.plugins.marp.app)
}

android {
    namespace = "dev.bogdanzurac.marp.app.admin.elgoog"

    defaultConfig {
        applicationId = "dev.bogdanzurac.marp.app.admin.elgoog"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.marp.feature.auth.ui)
    implementation(libs.marp.feature.dashboard.ui)
    implementation(libs.marp.feature.notes.data)
    implementation(libs.marp.feature.notes.domain)
    implementation(libs.marp.feature.notes.ui)
    implementation(libs.marp.lib.db.firebase)
    implementation(libs.marp.lib.flagging.firebase)
    implementation(libs.marp.lib.tracking.firebase)
}
