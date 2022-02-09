package com.capstone.coding_assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        value.setText("" + num)

        plusBtn.setOnClickListener {
            value.setText("" + ++num)
        }

        minusBtn.setOnClickListener {
            value.setText("" + --num)
        }
    }
}