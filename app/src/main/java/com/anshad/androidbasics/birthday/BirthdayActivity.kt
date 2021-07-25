package com.anshad.androidbasics.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.anshad.androidbasics.R

class BirthdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        val personName = findViewById<EditText>(R.id.PersonName)
        val submitButton = findViewById<Button>(R.id.submit)
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        submitButton.setOnClickListener {
            val text = personName.text
            val bundle = Bundle()
            val birthdayFragment = BirthdayFragment()
            bundle.putString("name", personName.text.toString())
            birthdayFragment.arguments = bundle
            fragmentTransaction.add(R.id.fragmentContainerView2, birthdayFragment).commit()
        }
    }

}