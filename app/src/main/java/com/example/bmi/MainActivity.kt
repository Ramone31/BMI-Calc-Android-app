package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


           

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val weight:Float =weight.text.toString().toFloat()
            val height:Float=height.text.toString().toFloat()/100
            var res:Float=weight/(height*height)
            result.text="%.2f".format(res)

        }


    }

}