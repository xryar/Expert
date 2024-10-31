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
-dontwarn java.lang.invoke.StringConcatFactory

-keep class com.example.core.data.source.local.** { *; }
-keepclassmembers class com.example.core.data.source.local.** { *; }

-keep class com.example.core.data.source.remote.response.** { *; }
-keepclassmembers class com.example.core.data.source.remote.response.** { *; }

-keep class com.example.core.di.** { *; }
-keepclassmembers class com.example.core.di.** { *; }

-keep class com.example.core.domain.usecase.** { *; }
-keepclassmembers class com.example.core.domain.usecase.** { *; }

-keep class com.example.core.ui.** { *; }
-keepclassmembers class com.example.core.ui.** { *; }

-keep class com.example.core.data.Resource$* { *; }

-keepattributes Signature

-keepclassmembers class com.example.core.data.Resource$* {
    <init>(...);
    java.lang.Object getData();
}

-keepclassmembers class ** {
    *** get*(...);
    *** set*(...);
}

-keepclassmembers class ** {
    public <init>(...);
}

-keep class com.google.gson.** { *; }

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile