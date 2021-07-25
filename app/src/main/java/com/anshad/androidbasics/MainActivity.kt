package com.anshad.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.anshad.androidbasics.birthday.BirthdayActivity
import com.anshad.androidbasics.diceroller.DiceActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val birthdayButton = findViewById<Button>(R.id.birthdayButton)
        birthdayButton.setOnClickListener{
            val intent = Intent(this, BirthdayActivity::class.java)
            startActivity(intent)
        }

        val diceButton: Button = findViewById(R.id.dicebutton)
        diceButton.setOnClickListener{
            val intent = Intent(this, DiceActivity::class.java)
            startActivity(intent)
        }

    }

}