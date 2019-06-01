package edu.com.kotlinfirstprogram

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var id = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        value.setText("" + id)

        plusBtn.setOnClickListener {
            value.setText("" + ++id)

        }
        minusBtn.setOnClickListener {
            value.setText("" + --id)
        }


        nextbtn.setOnClickListener {

            val intent = Intent(this@MainActivity, NextActivity::class.java)
            var userName="Rishabh"
            var password="123456"
            intent.putExtra("USERNAME",userName)
            intent.putExtra("PASSWORD",password)
            startActivity(intent)
        }


    }
}

