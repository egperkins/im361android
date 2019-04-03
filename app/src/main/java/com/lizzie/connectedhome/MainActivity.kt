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

    val childList = arrayListOf<Child>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button: Button = findViewById(R.id.button)


        button.setOnClickListener{
            val intent = Intent(this, TaskAssign::class.java)
            startActivity(intent)
        }




        val spinner: Spinner = findViewById(R.id.spinner)
        spinner.adapter = ArrayAdapter<ChildChosen>(this, android.R.layout.simple_spinner_item, ChildChosen.values())

        val addButton: Button = findViewById(R.id.addButton)
        addButton.setOnClickListener {

            val chosen = spinner.selectedItem as ChildChosen
            val child = child(index)
            childList.add(child)

            countText.text = getString(R.string.number_of_pokemon, pokemonList.size)
        }

    }





}
