package com.capstone.coding_assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number = 0 // In such a simple app no one would likely confuse 'num' for anything else, but you may as well be clear and use 'number'
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number_text.text = number.toString() //The "" + trick to turn a number into a string is useful in JavaScript but is not very idiomatic in terms of Kotlin. Prefer the use of the toString() method

        plus_button.setOnClickListener {
            number_text.text = (++number).toString() //as above - in this case you must wrap the ++number in parentheses for the toString() to operate on the entire expression
        }

        minus_button.setOnClickListener {
            number_text.text = (--number).toString() //as above
        }
    }
}