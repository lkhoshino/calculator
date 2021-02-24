package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // editTexts
        val editTN = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTN2 = findViewById<EditText>(R.id.editTextNumberDecimal2)

        // buttons
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonMin = findViewById<Button>(R.id.buttonMin)
        val buttonMul = findViewById<Button>(R.id.buttonMul)
        val buttonDiv = findViewById<Button>(R.id.buttonDiv)

        var textN = findViewById<TextView>(R.id.valueText)
        //var n1:Float? = 0.toFloat()
        //var n2:Float? = 0.toFloat()
        var result:Float?
        var floatC1:String
        var floatC2:String






        buttonAdd.setOnClickListener {
            if(editTN.text== null || editTN.text == null || editTN.text.isBlank() || editTN2.text.isBlank()){
                textN.text = ("Null error")
            }else {
                floatC1 = editTN.text.toString()
                floatC2 = editTN2.text.toString()
                var n1 = floatC1.toFloat()
                var n2 = floatC2.toFloat()
                result = n1 + n2
                textN.text = result.toString()
            }
        }

        buttonMin.setOnClickListener {
            if(editTN.text== null || editTN.text == null || editTN.text.isBlank() || editTN2.text.isBlank()){
                textN.text = ("Null error")
            }else {
                floatC1 = editTN.text.toString()
                floatC2 = editTN2.text.toString()
                var n1 = floatC1.toFloat()
                var n2 = floatC2.toFloat()
                result = n1 - n2
                textN.text = result.toString()
            }
        }

        buttonMul.setOnClickListener {
            if(editTN.text== null || editTN.text == null || editTN.text.isBlank() || editTN2.text.isBlank()){
                textN.text = ("Null error")
            }else {
                floatC1 = editTN.text.toString()
                floatC2 = editTN2.text.toString()
                var n1 = floatC1.toFloat()
                var n2 = floatC2.toFloat()
                result = n1 * n2
                textN.text = result.toString()
            }
        }

        buttonDiv.setOnClickListener {
            if(editTN.text== null || editTN.text == null || editTN.text.isBlank() || editTN2.text.isBlank()){
                textN.text = ("Null error")
            }else {
                floatC1 = editTN.text.toString()
                floatC2 = editTN2.text.toString()
                var n1 = floatC1.toFloat()
                var n2 = floatC2.toFloat()
                result = n1 / n2
                textN.text = result.toString()
            }
        }



    }

}