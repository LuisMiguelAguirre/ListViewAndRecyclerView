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

import java.util.List;

/**
 * Created by Luis Aguirre on 9/6/2017.
 */

public class CustomVHListAdapter extends ArrayAdapter<Person> {

    public CustomVHListAdapter(@NonNull Context context,
                               @LayoutRes int resource,
                               @NonNull List<Person> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            view = LayoutInflater.
                    from(parent.getContext())
                    .inflate(R.layout.custom_listview_item, null);
        }

        ViewHolder holder = new ViewHolder();

        holder.mTvPersonName = view.findViewById(R.id.tvPersonName);
        holder.mTvPersonAge = view.findViewById(R.id.tvPersonAge);
        holder.mTvPersonGender = view.findViewById(R.id.tvPersonGender);
        holder.mTvPersonHeight = view.findViewById(R.id.tvPersonHeight);

        Person person = getItem(position);
        if (person != null) {
            holder.mTvPersonName.setText(person.getName());
            holder.mTvPersonAge.setText(String.valueOf(person.getAge()));
            holder.mTvPersonGender.setText(person.getGender());
            holder.mTvPersonHeight.setText(String.valueOf(person.getHeight()));
            view.setTag(holder);
        }


        return view;
    }

    public class ViewHolder {

        private TextView mTvPersonName;
        private TextView mTvPersonAge;
        private TextView mTvPersonGender;
        private TextView mTvPersonHeight;
    }
}
