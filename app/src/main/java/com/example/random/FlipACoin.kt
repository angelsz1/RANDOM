package com.example.random

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class FlipACoin : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flip_a_coin)

        val iv_coin = findViewById<ImageView>(R.id.iv_coin)

        onCoinTap(iv_coin)
    }

    private fun onCoinTap(coin : ImageView){
        coin.setOnClickListener {

            val random = Random.nextInt(1,101)

            if(random <= 50){
                flipTheCoin(coin, R.drawable.ic_baseline_currency_bitcoin_24, "Bitcoin")
            } else {
                flipTheCoin(coin, R.drawable.ic_baseline_coronavirus_24, "Corona")
            }


        }


    }
    private fun flipTheCoin(iv_coin : ImageView, imageId : Int, coinSide : String){

        iv_coin.animate().apply {
            duration = 1000
            rotationYBy(1800f)
            iv_coin.isClickable = false

        }.withEndAction{
            iv_coin.setImageResource(imageId)
            Toast.makeText(this, coinSide, Toast.LENGTH_SHORT).show()
            iv_coin.isClickable = true
        }.start()

    }
}