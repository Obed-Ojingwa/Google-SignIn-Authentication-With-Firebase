package com.obedhack.nerdpacedefihunting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn = findViewById<Button>(R.id.btnNav)
        btn.setOnClickListener{
            val intent = Intent(this@MainActivity,LogInActivity::class.java)
            startActivity(intent)
        }



    }
    // Activity last block

}