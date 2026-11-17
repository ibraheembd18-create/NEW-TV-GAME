# Build Robo Rush APK with GitHub Actions

This project includes a GitHub Actions workflow at `.github/workflows/android.yml`.

1. Create a GitHub repository and upload the **contents** of this `RoboRushTV` folder to its root (so `app/`, `build.gradle`, `settings.gradle`, and `.github/` are at repository root).
2. Open the repository on GitHub and select **Actions**.
3. Choose **Build Robo Rush Android APK** and click **Run workflow** (or push to `main` / `master`).
4. When the run finishes successfully, open the run and download the `RoboRushTV-debug-apk` artifact.
5. Extract the downloaded artifact; it contains `app-debug.apk`.

The workflow installs Java 17, Android SDK Platform 34, Build Tools 34.0.0, and Gradle 8.2. It deliberately uses a system-installed Gradle because the supplied ZIP does not contain the Gradle wrapper scripts or wrapper JAR.

This produces a **debug APK** for testing. A signed release APK requires a separate signing configuration.

## Updated pixel-art assets
The game now loads `app/src/main/assets/robo_assets.png` locally. It includes the robot hero pose frames, weapon/projectile effects, explosions, and three illustrated boss sprites (Forest Golem, Underwater Shark, Volcano Dragon). The HTML canvas draws these assets with pixelated rendering; no network download is needed at runtime.

Note: the remaining seven stage bosses still use the existing in-game emoji/shape fallback art. Build and test on the target Android TV to verify WebView rendering and PS5 gamepad input.
