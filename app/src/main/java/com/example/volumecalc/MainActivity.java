package com.example.volumecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 GridView gridView;
 ArrayList<Model> shapeArrayList;

 // Adpater
    MyCustomAdapter ad;

    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid);

        shapeArrayList = new ArrayList<>();

        Model m1 = new Model(R.drawable.cube , "Cube");
        Model m2 = new Model(R.drawable.cyl2 , "Cylinder");
        Model m3 = new Model(R.drawable.prism , "Prism");
        Model m4 = new Model(R.drawable.sphere , "Sphere");

        shapeArrayList.add(m1);
        shapeArrayList.add(m2);
        shapeArrayList.add(m3);
        shapeArrayList.add(m4);

        ad = new MyCustomAdapter(shapeArrayList , getApplicationContext());

        gridView.setAdapter(ad);
        gridView.setNumColumns(2);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext() , Sphere.class);
                startActivity(intent);
            }
        });

    }



}