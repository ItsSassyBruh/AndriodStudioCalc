package com.example.icetask01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.pow
import kotlin.math.sqrt
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.btnAdd)

        val subtract = findViewById<Button>(R.id.btnSubtract)

        val division = findViewById<Button>(R.id.btnDivide)

        val multiply = findViewById<Button>(R.id.btnMultiply)

        val sqaureRoot = findViewById<Button>(R.id.btnSqaureRoot)

        val power = findViewById<Button>(R.id.btnPowerOff)

        val powerOf = findViewById<Button>(R.id.btnPowerOf)

        var numOne = findViewById<EditText>(R.id.numOne)

        var numTwo = findViewById<EditText>(R.id.numTwo)

        var txtDisplay = findViewById<TextView>(R.id.txtDisplay)


        add?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()

            val val1 = numOne.text.toString().toInt()
            val val2 = numTwo.text.toString().toInt()

            val result = val1 + val2
            txtDisplay.text = "${val1.toString()} + ${val2.toString()} = ${result.toString()}"
        }

        subtract?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()

            val val1 = numOne.text.toString().toInt()
            val val2 = numTwo.text.toString().toInt()

            val result = val1 - val2
            txtDisplay.text = "${val1.toString()} - ${val2.toString()} = ${result.toString()}"
        }

        division?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()

            val val1 = numOne.text.toString().toInt()
            val val2 = numTwo.text.toString().toInt()

            if(val1 == 0 || val2 == 0){
                txtDisplay.text = "You cannot divide by zero/0! Please try again"

            }
            else{
                val result = val1 / val2
                txtDisplay.text = "${val1.toString()} / ${val2.toString()} = ${result.toString()}"
            }

        }

        multiply?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()

            val val1 = numOne.text.toString().toInt()
            val val2 = numTwo.text.toString().toInt()

            val result = val1 * val2
            txtDisplay.text = "${val1.toString()} x ${val2.toString()} = ${result.toString()}"
        }

        sqaureRoot?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()
            if( numTwo == null || numOne != null){
             try {
                 if(numOne == null || numTwo == null){
                     txtDisplay.text = "Please enter a value!"
                 }
                 else{
                     val sqaure1 = numOne.text.toString().toDouble()
                     val result = sqrt(sqaure1)
                     txtDisplay.text = "The sqaure root of ${sqaure1.toString()} is  ${result.toString()}"
                 }

             }
             catch (e: NumberFormatException){
                 txtDisplay.text = "Oops! Something went wrong!"
             }
            }

        }

        power?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()

            //finish()
            System.exit(0)
        }

        powerOf?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()


            try{
                val val1 = numOne.text.toString().toInt()
                val val2 = numTwo.text.toString().toInt()
                val pow = Math.pow(val1.toDouble(), val2.toDouble())
                txtDisplay.text = "The power of ${val1.toString()} ^ ${val2.toString()} = ${pow.toString()}"
            }
            catch(e: NumberFormatException){
                txtDisplay.text = "Please enter a value!"
            }
        }
    }
}