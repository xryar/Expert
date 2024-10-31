# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
-dontwarn com.example.core.data.Resource$Error
-dontwarn com.example.core.data.Resource$Loading
-dontwarn com.example.core.data.Resource$Success
-dontwarn com.example.core.data.Resource
-dontwarn com.example.core.di.CoreModuleKt
-dontwarn com.example.core.domain.model.Tourism
-dontwarn com.example.core.domain.repository.ITourismRepository
-dontwarn com.example.core.domain.usecase.TourismInteractor
-dontwarn com.example.core.domain.usecase.TourismUseCase
-dontwarn com.example.core.ui.TourismAdapter

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile