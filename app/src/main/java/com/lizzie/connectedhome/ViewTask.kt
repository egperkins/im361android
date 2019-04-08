package com.lizzie.connectedhome

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class ViewTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewtask)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, ViewTask::class.java)
            startActivity(intent)
        }
    }
}
