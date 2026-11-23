# Archer EDC v1.5 — Android Studio project

**Status:** Android project source prepared; APK not compiled or device-tested in this environment.

## Changes
- High-contrast DAY (default) and NIGHT themes with manual toggle and saved preference
- Larger, clearer system typography, readable metadata and minimum 48dp controls
- Offline embedded 60-topic directory with 46 source guidance cards, search, categories, bookmarks
- Android WebView shell; emergency calling opens the system dialer, no CALL_PHONE permission

## Build
Open this folder in Android Studio (with Android SDK 35 and compatible JDK 17), sync Gradle, then Build > Build APK(s). Debug APK is typically app/build/outputs/apk/debug/app-debug.apk.

## Critical safety notice
The source guidance has not been medically validated; some topic coverage is partial. Do not deploy to field agents as a clinical reference without qualified medical review, functional testing, and accessibility/device testing. This is a new Android wrapper for the prototype, not a restoration of every native feature in v1.3.

## GitHub cloud APK build
Upload the project files (including the hidden `.github` folder) to a GitHub repository. Open **Actions > Build Archer Android APK > Run workflow**. After a successful run, download the `Archer-EDC-v1.5-debug-apk` artifact. This debug build is for testing only; it is not a production signed release.
