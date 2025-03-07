package com.example.college_notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PythonActivity extends AppCompatActivity {

    //----------Variables---------------------------//
    ListView listView2;
    String[] arr1 = {
            "Unit 1",
            "Unit 2",
            "Unit 3",
            "Unit 4",
            "Unit 5"
    };

    String[] pdfFiles = {"python_unit_1.pdf"}; // Stored in assets
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_python);
        //--------------Hooks--------------------//
        listView2 = findViewById(R.id.listViewPython);


        ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arr1);
        listView2.setAdapter(arrayAdapter);

        listView2.setOnItemClickListener((adapterView, view, position, l) -> {
            Intent intent = new Intent(PythonActivity.this, pdfactivity.class);
            intent.putExtra("pdfFileName", pdfFiles[position]);
            startActivity(intent);

        });

    }
}