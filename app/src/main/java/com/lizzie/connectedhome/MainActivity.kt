package com.lizzie.connectedhome

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onMapReady(map: GoogleMap?) {
        Log.i("ConnectedHome", "Map is Ready")

    }

    var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myText: TextView = findViewById(R.id.textView)
        val myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener {

            val mapFragment = supportFragmentManager.findFragmentById(R.id.my_map_view) as SupportMapFragment
            mapFragment.getMapAsync(this)

            counter++

            myText.text = resources.getQuantityString(R.plurals.has_been_clicked, counter, counter)
        }
    }
}
