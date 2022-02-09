package com.capstone.coding_assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        value.text = "" + num

        plusBtn.setOnClickListener {
            value.text = "" + ++num
        }

        minusBtn.setOnClickListener {
            value.text = "" + --num
        }
    }
}