package com.example.college_notes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    //    Declaring variables
    TextView textView1, textView2, textView3, textView4;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------Hooks-----------------//
        textView1 = findViewById(R.id.java);
        textView2 = findViewById(R.id.python);
        textView3 = findViewById(R.id.dsa);
        textView4 = findViewById(R.id.mc);
        textView5 = findViewById(R.id.syllabus);
         //--------End Hooks------------//

        textView1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,JavaActivity.class);
            startActivity(intent);
        });

        textView2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,PythonActivity.class);
            startActivity(intent);
        });

        //Data Structure Text Clicker
        textView3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,DsaActivity.class);
            startActivity(intent);
        });

        /// Mobile Computing Text Clicker
        textView4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,MobileComputingActivity.class);
            startActivity(intent);
        });

        // Syllabus Clicker
        textView5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SyllabusActivity.class);
            startActivity(intent);
        });
    }
}