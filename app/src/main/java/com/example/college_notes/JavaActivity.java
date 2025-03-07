package com.example.college_notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JavaActivity extends AppCompatActivity {

    //------------Variable Defining-----------------//
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    String[] arr = {
            "Java - The Complete Reference(Herbert Schildt)",
            "Unit 1",
            "Unit 2",
            "Unit 3",
            "Unit 4",
            "Unit 5"

    };
    String[] pdfFiles = {"javabook.pdf"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        //------------Hooks---------------------//
        listView = findViewById(R.id.listViewJava);
        arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arr);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(JavaActivity.this, pdfactivity.class);
                intent.putExtra("pdfFileName", pdfFiles[position]);

                startActivity(intent);
            }
        });


    }
}