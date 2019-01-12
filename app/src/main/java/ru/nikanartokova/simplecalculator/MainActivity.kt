package ru.nikanartokova.simplecalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener { tvResult.text = "${number1.text.toString().toDouble() + number2.text.toString().toDouble()}"}
        minus.setOnClickListener { tvResult.text = "${number1.text.toString().toDouble() - number2.text.toString().toDouble()}"}
        mul.setOnClickListener { tvResult.text = "${number1.text.toString().toDouble() * number2.text.toString().toDouble()}"}
        div.setOnClickListener { tvResult.text = "${number1.text.toString().toDouble() / number2.text.toString().toDouble()}"}

        reset.setOnClickListener { tvResult.text = "" ; number1.text.clear(); number2.text.clear() }

        quit.setOnClickListener { finish() }
    }
}