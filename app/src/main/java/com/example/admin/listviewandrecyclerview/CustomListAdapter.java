package com.example.admin.listviewandrecyclerview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Luis Aguirre on 9/6/2017.
 */

public class CustomListAdapter extends ArrayAdapter<Person>{
    public CustomListAdapter(@NonNull Context context,
                             @LayoutRes int resource,
                             @NonNull List<Person> objects) {
        super(context, resource, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        Person person =  getItem(position);

        if (view == null){

            if (person.getGender() == "Female"){
                view = LayoutInflater.
                        from(parent.getContext())
                        .inflate(R.layout.custom_listview_item2, null);

            }else{
                view = LayoutInflater.
                        from(parent.getContext())
                        .inflate(R.layout.custom_listview_item, null);

            }


        }

        TextView tvPersonName = view.findViewById(R.id.tvPersonName);
        TextView tvPersonAge = view.findViewById(R.id.tvPersonAge);
        TextView tvPersonGender = view.findViewById(R.id.tvPersonGender);
        TextView tvPersonHeight = view.findViewById(R.id.tvPersonHeight);


        if (person != null){
            tvPersonName.setText(person.getName());
            tvPersonAge.setText(String.valueOf(person.getAge()));
            tvPersonGender.setText(person.getGender());
            tvPersonHeight.setText(String.valueOf(person.getHeight()));

        }


        return view;
    }
}
