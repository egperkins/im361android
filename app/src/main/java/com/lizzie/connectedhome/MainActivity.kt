package com.lizzie.connectedhome

import android.content.Intent
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



        val button: Button = findViewById(R.id.button)


        button.setOnClickListener{
            val intent = Intent(this, TaskAssign::class.java)
            startActivity(intent)
        }



    }

//    override fun onMapReady(map: GoogleMap?){
//        val morton = LatLng(40.6091693, -89.5392298)
//        map?.addMarker(MarkerOptions().position(morton).title("Pumpkin Capital"))
//        val moveCamera = map?.moveCamera(CameraUpdateFactory.new.LatLng(morton))
//    }



}
