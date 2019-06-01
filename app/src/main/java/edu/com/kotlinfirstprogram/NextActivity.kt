package edu.com.kotlinfirstprogram

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {

    var username: String?=null
    var password: String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)


        if(intent.hasExtra("USERNAME")) {
           username = intent.getStringExtra("USERNAME")
            password = intent.getStringExtra("PASSWORD")

        }
        data.setText("${username} and ${password}")

        nextActivity.setOnClickListener {

            val intent= Intent(this@NextActivity,DataActivity::class.java)
            startActivity(intent)

        }

    }
}
