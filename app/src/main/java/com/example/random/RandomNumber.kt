package com.example.random

import android.os.Bundle
import android.text.Editable
import android.text.Layout.Alignment
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class RandomNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number)

        val genButton = findViewById<Button>(R.id.generate)
        val limiteInferior = findViewById<EditText>(R.id.limiteInferior)
        val limiteSuperior = findViewById<EditText>(R.id.limiteSuperior)
        val result         = findViewById<TextView>(R.id.resultado)


        genButton.setOnClickListener {
            if (TextUtils.isEmpty(limiteInferior.text))
                limiteInferior.error = "Tenes que poner algo aca"
            if (TextUtils.isEmpty(limiteSuperior.text))
                limiteSuperior.error = "Tenes que poner algo aca"
            if(!TextUtils.isEmpty(limiteInferior.text) && !TextUtils.isEmpty(limiteSuperior.text))
                result.text = calculateRandom(limiteInferior.text, limiteSuperior.text)
        }
    }


    fun calculateRandom(inf : Editable, sup : Editable) : CharSequence{
        val numInf = Integer.parseInt(inf.toString())
        val numSup = Integer.parseInt(sup.toString())

        return Random.nextInt(numInf, numSup+1).toString()
    }
}
