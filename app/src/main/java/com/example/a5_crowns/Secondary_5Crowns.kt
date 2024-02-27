package com.example.a5_crowns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_secondary5_crowns.*

class Secondary_5Crowns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary5_crowns)
        title = "Five Crowns"
        val OPENHOME = findViewById<Button>(R.id.openHome)
        OPENHOME.setOnClickListener{
            val intent = Intent(this@Secondary_5Crowns, MainActivity::class.java)
            startActivity(intent)
        }

        var x =intent.getStringExtra("RoundNum")
        //textView3.text = x.toString()

        /*
        I could not successfully send the dictionary from MainActivity with player names and
        their respective scores, to the Secondary Activity (Standings). As a result, although
        I have the Standings UI completed, with text in the EditText widgets that shows what it
        SHOULD hold, the actual data from MainActivity is not implemented.
         */

    }
}