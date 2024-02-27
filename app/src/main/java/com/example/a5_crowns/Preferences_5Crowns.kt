package com.example.a5_crowns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferences5_crowns.*

class Preferences_5Crowns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences5_crowns)
        title = "Five Crowns"
        var namesMapz = mutableMapOf<String, Int>()

        var clickCount = 0
        var playerAmt: Int = 0
        val Home = findViewById<Button>(R.id.Homebttn)
        val d = Intent(this@Preferences_5Crowns, MainActivity::class.java)
        var intent = Intent(this, MainActivity::class.java)



        Home.setOnClickListener{
            startActivity(d)
        }

        SubmitNumPlayers.setOnClickListener{
            playerAmt = Integer.parseInt(NumofPlayers.text.toString())
            intent.putExtra("playerNum", playerAmt)
            SubmitNumPlayers.isEnabled = false
            SubmitNumPlayers.isClickable = false
        }

        submitEachPlayer.setOnClickListener{

            clickCount++
            if(clickCount <= playerAmt ){
                //namesMapz.put(EachPlayerName.toString(), 0)
                var strClickcnt : String = clickCount.toString()
                intent.putExtra(strClickcnt, EachPlayerName.text.toString(),)
                if (clickCount == playerAmt){
                    submitEachPlayer.isEnabled = false
                    submitEachPlayer.isClickable = false
                    startActivity(intent)
                }
            }


        }
    }

}