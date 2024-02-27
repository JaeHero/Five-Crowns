package com.example.a5_crowns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Range
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferences5_crowns.*
import java.lang.IllegalStateException
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Five Crowns"
        var mapHolder = mutableMapOf<String, Int>()
        val OPENSTAND = findViewById<Button>(R.id.openStandings)

        OPENSTAND.setOnClickListener {
            var intention = Intent(this@MainActivity, Secondary_5Crowns::class.java)
            var roundNum = RoundNum.text
            var intentround = intent.putExtra("RoundNum",roundNum.toString())
            var names = arrayOf(mapHolder.keys)
            var values = arrayOf(mapHolder.values.toString())
            //intention = intent.putExtra("names", names.toString())
            //intention = intent.putExtra("scores", values.toString())
            startActivity(intention)

        }

        val OPENPREF = findViewById<Button>(R.id.openPreferences)
        OPENPREF.setOnClickListener {
            val q = Intent(this@MainActivity, Preferences_5Crowns::class.java)
            startActivity(q)
        }

        val OPENHELP = findViewById<Button>(R.id.openHelp)
        OPENHELP.setOnClickListener {
            val v = Intent(this@MainActivity, Help_5Crowns::class.java)
            startActivity(v)
        }

        var playerAmt  = intent.getIntExtra("playerNum", 0)

        for(x in 1..playerAmt)
        {
            var y = intent.getStringExtra(x.toString()).toString()
            mapHolder.put(y, 0)
            //CurrentPlayerScore.text = "$y's Score"
        }
        var currentPlayer = 1
        var playerScore = 0
        var cardNum = 3
        var facesum : Int = 0


        Joker.setOnClickListener{
            playerScore += 50
        }
        Wild_Card.setOnClickListener{
            playerScore += 20
        }
        King.setOnClickListener{
            playerScore += 13
        }
        Queen.setOnClickListener{
            playerScore += 12
        }
        Jacks.setOnClickListener{
            playerScore += 11
        }
        playeroundscore.setOnClickListener {
            facesum = Integer.parseInt(FaceValueSum.text.toString())
            try {
                checkNotNull(facesum)
            }
            catch (e:IllegalStateException){
                facesum = 0
            }
            playerScore += facesum
            var y = intent.getStringExtra(currentPlayer.toString()).toString()
            mapHolder[y] = playerScore
            if (currentPlayer < playerAmt){
                currentPlayer++
            }
            else{
                currentPlayer = 1
                cardNum++
                RoundNum.text = "Cards : ${cardNum.toString()}"
            }
            CurrentPlayerScore.text = "$y's Score : $playerScore"
            playerScore = 0
            facesum = 0

        }

        //for(x in 1.. mapHolder.size + 1) {
           // var y = intent.getStringExtra(x.toString()).toString()
            //CurrentPlayerScore.text = mapHolder[y.toString()].toString()
        //fun calculateSum(view: View){
           // while (cardNum <= 13) {
                //for (x in 1..playerAmt) {
                  //  var hasSubmit = false
                    //while (!roundOver) {
                  //  var y = intent.getStringExtra(x.toString()).toString()
                  //  RoundNum.text = "Cards : " + cardNum
                   // CurrentPlayerScore.text = "$y's Score"
                    //playeroundscore.setOnClickListener {
                       // CurrentPlayerScore.text = "Thanks!"
                        //hasSubmit = true
                        //}

                    //if (hasSubmit == false){
                        //break


        }



}

