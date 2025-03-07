package com.example.college_notes;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;



import androidx.appcompat.app.AppCompatActivity;


public class SyllabusActivity extends AppCompatActivity {
    ListView listView;
    String[] arr = {
            "Java",
            "Python",
            "Dsa",
            "Mobile Computing",
            "Advanced Csa"
    };

    String[] pdfFiles = {"java.pdf", "python.pdf", "Dsa.pdf","MC.pdf","AdvanceCSA.pdf"}; // Stored in assets

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<>(SyllabusActivity.this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, arr);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            Intent intent = new Intent(SyllabusActivity.this, pdfactivity.class);
            intent.putExtra("pdfFileName", pdfFiles[position]);
            startActivity(intent);

        });

    }
}