package com.example.diceroller

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

/**
 * MainActivity class that handles the main logic for the Dice Roller app.
 */
class MainActivity : AppCompatActivity() {

    // ImageView to display the dice image
    private lateinit var imageView : ImageView
    // Button to trigger the dice roll
    private lateinit var rollButton : Button
    // MediaPlayer to play the dice roll sound
    private lateinit var mediaPlayer : MediaPlayer

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle).
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize UI components
        imageView = findViewById(R.id.imageview)
        rollButton = findViewById(R.id.roll_button)

        // Set up the button click listener
        rollButton.setOnClickListener {

            // Create and start dice roller sound
            mediaPlayer = MediaPlayer.create(this, R.raw.dice_scroll_sound)
            mediaPlayer.start()

            // Generate random number from 1 to 6
            val randomNum = Random.nextInt(1, 7)
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()

            // Show different random dice images based on the generated number
            when(randomNum) {
                1 -> imageView.setImageResource(R.drawable.dice_1)
                2 -> imageView.setImageResource(R.drawable.dice_2)
                3 -> imageView.setImageResource(R.drawable.dice_3)
                4 -> imageView.setImageResource(R.drawable.dice_4)
                5 -> imageView.setImageResource(R.drawable.dice_5)
                else -> imageView.setImageResource(R.drawable.dice_6)
            }
        }

        // Apply window insets to handle system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}