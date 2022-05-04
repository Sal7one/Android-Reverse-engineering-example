package com.sal7one.sal7reverseeng

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private val secretUserNum = Random().nextInt(100) + 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.actualPass).text = "Actual pass $secretUserNum  "

        findViewById<Button>(R.id.decryptBtn).setOnClickListener {
            val userEntry = findViewById<EditText>(R.id.passwordEt).text.toString().toInt()
            if (secretUserNum == userEntry)
                findViewById<TextView>(R.id.mainText).text = "Access Granted  "
            else
                Toast.makeText(this, "Bad Password!", Toast.LENGTH_LONG).show()
        }
    }
}

