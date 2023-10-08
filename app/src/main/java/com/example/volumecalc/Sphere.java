package com.example.volumecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {
   Button btn;
   EditText edit;
   TextView text;
   TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        btn = findViewById(R.id.button);
        edit = findViewById(R.id.ed);
        text = findViewById(R.id.txt);
        text1 = findViewById(R.id.text1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = edit.getText().toString();

                int result = Integer.parseInt(radius);

                double vol = (4/3) * 3.14159 *result*result*result;
                  text1.setText("Volume = "+vol);

            }
        });
    }
}