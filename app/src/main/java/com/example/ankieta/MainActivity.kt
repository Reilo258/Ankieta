package com.example.ankieta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var sport: CheckBox;
    lateinit var muzyka: CheckBox;
    lateinit var turystyka: CheckBox;
    lateinit var gry: CheckBox;
    lateinit var startbtn: Button;
    lateinit var edytujbtn: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sport = findViewById(R.id.sprBox);
        muzyka = findViewById(R.id.muzBox);
        turystyka = findViewById(R.id.turBox);
        gry = findViewById(R.id.gryBox);
        startbtn = findViewById(R.id.wysbtn);
        edytujbtn = findViewById(R.id.edbtn);


        startbtn.setOnClickListener {
            val result = StringBuilder();
            result.append("Wiek: ", findViewById<EditText>(R.id.wiekInput))
            result.append("Zainteresowania: ")

            if(sport.isChecked) {
                result.append("\nsport")
            }
            if(muzyka.isChecked) {
                result.append("\nmuzyka")
            }
            if(turystyka.isChecked) {
                result.append("\nturystyka")
            }
            if(gry.isChecked) {
                result.append("\ngry")
            }

            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}