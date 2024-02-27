package com.example.a5_crowns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_help5_crowns.*

class Help_5Crowns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help5_crowns)
        title = "Five Crowns"
        val GOHOME = findViewById<Button>(R.id.HelptoHome)
        GOHOME.setOnClickListener{
            val y = Intent(this@Help_5Crowns, MainActivity::class.java)
            startActivity(y)
        }
        val instruct1 = findViewById<TextView>(R.id.textView7)
        instruct1.setMovementMethod(ScrollingMovementMethod())
        val instruct2 = findViewById<TextView>(R.id.textView8)
        instruct2.setMovementMethod(ScrollingMovementMethod())
    }
}