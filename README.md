### Project Documentation: Dice Roller App

#### Overview
The Dice Roller App is an Android application that simulates the rolling of a dice. When the user presses the "ROLL" button, a random number between 1 and 6 is generated, and the corresponding dice image is displayed. Additionally, a dice rolling sound is played.

#### Technologies Used
- **Programming Languages**: Kotlin, XML
- **Frameworks**: Android SDK
- **Build System**: Gradle

#### Project Structure
- `app/src/main/java/com/example/diceroller/MainActivity.kt`: Main activity handling the dice roll logic.
- `app/src/main/res/layout/activity_main.xml`: Layout file defining the UI components.
- `app/src/main/res/drawable/custom_roll_button.xml`: Custom drawable for the roll button.
- `app/src/main/res/values/colors.xml`: Color resources used in the app.

#### Main Components

##### MainActivity.kt
Handles the main logic for the dice roll, including:
- Initializing UI components (`ImageView`, `Button`).
- Setting up the button click listener to generate a random number and update the dice image.
- Playing a dice roll sound.

##### activity_main.xml
Defines the UI layout, including:
- A `LinearLayout` as the root container.
- An `ImageView` to display the dice image.
- A custom-styled `AppCompatButton` for rolling the dice.

##### custom_roll_button.xml
Defines the custom drawable for the roll button, including:
- Stroke width and color.
- Corner radius.
- Solid background color.

##### colors.xml
Defines color resources used in the app, including:
- Black, white, yellow, and light green colors.

#### How to Build and Run
1. **Clone the repository**:
    ```sh
    git clone <repository-url>
    ```
2. **Open the project in Android Studio**.
3. **Build the project** using the Gradle build system.
4. **Run the app** on an emulator or a physical device.

#### Dependencies
- AndroidX libraries for compatibility and UI components.
- MediaPlayer for playing sound effects.

#### Customization
- **Change Dice Images**: Replace the drawable resources (`dice_1`, `dice_2`, etc.) with your own images.
- **Modify Button Style**: Update `custom_roll_button.xml` to change the button appearance.
- **Update Colors**: Edit `colors.xml` to use different colors in the app.

#### License
Include the license information for your project here.

#### Contact
Provide contact information or links for further assistance or contributions.
