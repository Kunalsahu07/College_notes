package com.example.college_notes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfactivity extends AppCompatActivity {

    //-----------variable--------------------//
    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pdfactivity);

        //-----------------Hooks-------------------------//
        pdfView = findViewById(R.id.pdf1);


        String pdfFileName = getIntent().getStringExtra("pdfFileName");

        if (pdfFileName != null) {
            pdfView.fromAsset(pdfFileName).load();
        }

    }
}