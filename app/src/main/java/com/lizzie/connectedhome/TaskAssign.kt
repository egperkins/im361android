package com.lizzie.connectedhome

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class TaskAssign : AppCompatActivity(){
    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_taskassign)


        val button: Button = findViewById(R.id.submitbutton)

        button.setOnClickListener{
            val intent = Intent(this, TaskSubmitted::class.java)
            startActivity(intent)
        }


    }










}