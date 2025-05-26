<div style="text-align: center">
  <h1>Language Card Android App</h1>
</div>

# Notes after testing the app: 

Functionality:
The app allows the user to flip flashcards by clicking on them, shows the translated text, reads the translation aloud using speech, and supports scrolling through the cards. No other features are implemented.

Code Quality:
The code is clean and readable, following Compose practices.

Instructions:
Library dependencies are not fully set up, so some package issues may prevent running the tests. Otherwise, instructions are straightforward.
Build gradle is not properly configured(Error: Cannot access 'org.gradle.api.internal.catalog.AbstractExternalDependencyFactory.PluginFactory' which is a supertype of 'org.gradle.accessors.dm.LibrariesForLibsInPluginsBlock.PluginAccessors'. Check your module classpath for missing or conflicting dependencies.).

##  How to Run UI Tests

1. **Open the project in Android Studio**  
   Open the root directory of the project (where `settings.gradle` is located).

2. **Connect an emulator or physical device**  
   Start an Android emulator, or connect your Android device with USB debugging enabled.

3. **Run the instrumented tests**

   - **From Android Studio:**
     - In the Project view, expand `app/src/androidTest/java/`
     - Right-click the `FlashCardTest` class (or the `androidTest` package)
     - Select **Run 'FlashCardTest'** or **Run Tests in 'androidTest'**

   - **From the Terminal:**
     - In the project root directory, run:
       ```
       ./gradlew connectedAndroidTest
       ```
       On Windows, use:
       ```
       gradlew connectedAndroidTest
       ```

4. **View the test results**

   - In Android Studio, results will appear in the "Run" or "Test Results" window.
   - From the terminal, you can open the HTML report at:
     ```
     app/build/reports/androidTests/connected/index.html
     ```

---

### Troubleshooting

- Make sure the test file is inside `app/src/androidTest/java/`.
- If you have issues, run **File > Sync Project with Gradle Files** and **Build > Clean Project**.
- All required dependencies must be installed and project synced.



# Requirements:

For this evaluation, the main requirements are:

1. **Single Screen:**
    - Display a card with a word and a sentence on the front.
    - When the card is tapped, it flips to show the translation on the back.
    - Audio plays automatically when the card appears.
    - Swiping left navigates to the next card.

2. **Content Loading:**
    - Card contents should be downloaded at the app start from the
      following [URL](https://pecto-content-f2egcwgbcvbkbye6.z03.azurefd.net/language-data/language-data/russian-finnish/cards/curated_platform_cards/sm1_new_kap1.json)
    - Audio files should be downloaded at the app start from the
      following [ZIP](https://pecto-content-f2egcwgbcvbkbye6.z03.azurefd.net/language-data/language-data/russian-finnish/audio/curated_platform_audios/sm1_new_kap1.zip)
3. **Deliverables:**
    - A GitHub repository containing the implementation
    - A README.md file with:
        - A brief description of the app.
        - Step-by-step instructions on how to launch the app using Android Studio
          on a simulator or a real device.

# Approach:

This app is built with **Jetpack Compose** and displays various cards containing a _word_ and a
_sentence_ in two
languages:
_russian_ and _finnish_.  
The first one is on the _front_ of card while the second one is on the _back_, by pressing the card
it flips and display the other side.

Also, once the card is displayed, two **audio tracks** are played one for the _word_ and the other
one for the
_sentence_.

# How to build:

A more detailed and update version is available on
this [site](https://developer.android.com/studio/run).

The easiest way to run this application is to:

- Install Android Studio: https://developer.android.com/studio/install
- Clone this repository. You have two options:
    - Use the `Project from version control` in Android Studio, or
    - Use the `git clone` command and import it into Android Studio
- Build and run the app directly in Android Studio by pressing the **Run** button.

Alternatively, it is possible to build the app directly from the **command line**; you will
first need to install the _command line_ tools from the official
[documentation](https://developer.android.com/studio#cmdline-tools).  
Then, go to the app’s root directory in the _command line_ tool of Android Studio and run:

```
./gradlew installDebug
```

Once this command completes, the application will be **installed** on the selected device ready to
be run.
