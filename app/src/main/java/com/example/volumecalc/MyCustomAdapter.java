package com.example.volumecalc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
 //This class mainly contains the Viewholder class which holds the views and the getview method essential for retrieving the data.
public class MyCustomAdapter extends ArrayAdapter<Model> {
    private ArrayList<Model> arrayShape;
    Context context;

    public MyCustomAdapter( ArrayList<Model> arrayShape, Context context) {
        super(context, R.layout.grid_item , arrayShape);
        this.arrayShape = arrayShape;
        this.context = context;
    }

    static class Viewholder{
        ImageView ShapeImg;
        TextView shapeName ;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Model m = getItem(position);
        Viewholder holder;
        //Hi


        if(convertView==null){
           holder = new Viewholder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item , parent , false
            );

            // finding the views in order to manipulate them
            holder.shapeName = (TextView) convertView.findViewById(R.id.textView2);
            holder.ShapeImg = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(holder);

        }else{

            holder = (Viewholder) convertView.getTag();  // Get Tag returns a view , so its cast into a ViewHolder .

        }
            //Getting the data from the model class with the help of getters .
        holder.ShapeImg.setImageResource(m.getShapeImg());  // Images are stored in integers in android.
        holder.shapeName.setText(m.getShapeName());

        //hello
         return convertView;

    }
}
