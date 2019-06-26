package com.example.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sum.setOnClickListener {
            if(num1.text.toString().isNotEmpty() && num2.text.toString().isNotEmpty()){
                    result.text=calculate(num1.text.toString().toInt(),num2.text.toString().toInt()).toString()
        }
        }
    }
          fun calculate(firstnum:Int,secondnum:Int):Int{
              return firstnum+secondnum
          }
}
