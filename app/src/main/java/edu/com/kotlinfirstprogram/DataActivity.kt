package edu.com.kotlinfirstprogram

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {


    /*var gmail:String?=null
    var password:String?=null*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)



        addData.setOnClickListener {

            adduser()
            val gmail = findViewById<EditText>(R.id.gmail)
            val password = findViewById<EditText>(R.id.gmail)
            val intent= Intent(this@DataActivity,FourActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "${gmail.text} and ${password.text}", Toast.LENGTH_LONG).show()
        }
        /* btnShow?.setOnClickListener {
             showText()

         }*/


    }

    fun adduser() {
        Toast.makeText(this, "Successfully", Toast.LENGTH_LONG).show()

    }

}
