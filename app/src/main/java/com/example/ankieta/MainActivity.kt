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
    lateinit var radioGroup: RadioGroup;
    lateinit var radioButton: RadioButton;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sport = findViewById(R.id.sprBox);
        muzyka = findViewById(R.id.muzBox);
        turystyka = findViewById(R.id.turBox);
        gry = findViewById(R.id.gryBox);
        startbtn = findViewById(R.id.wysbtn);
        edytujbtn = findViewById(R.id.edbtn);
        radioGroup = findViewById(R.id.rdGroup);


        startbtn.setOnClickListener {
            val result = StringBuilder();
            val intSelectedButton: Int = radioGroup!!.checkedRadioButtonId
            radioButton = findViewById(intSelectedButton);

            result.append("Płeć: ", radioButton.text);
            result.append("\nWiek: ", findViewById<EditText>(R.id.wiekInput).text)
            result.append("\nZainteresowania: ")

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
            findViewById<RadioButton>(R.id.rdbtn1).isEnabled = false;
            findViewById<RadioButton>(R.id.rdbtn2).isEnabled = false;
            findViewById<EditText>(R.id.wiekInput).isEnabled = false;
            sport.isEnabled = false;
            muzyka.isEnabled = false;
            turystyka.isEnabled = false;
            gry.isEnabled = false;
            startbtn.isEnabled = false;
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show();
        }
        edytujbtn.setOnClickListener {
            findViewById<RadioButton>(R.id.rdbtn1).isEnabled = true;
            findViewById<RadioButton>(R.id.rdbtn2).isEnabled = true;
            findViewById<EditText>(R.id.wiekInput).isEnabled = true;
            sport.isEnabled = true;
            muzyka.isEnabled = true;
            turystyka.isEnabled = true;
            gry.isEnabled = true;
            startbtn.isEnabled = true;
        }
    }
}