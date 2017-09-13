package com.example.admin.listviewandrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


/**
 * Created by Luis Aguirre on 9/6/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG1 = "TAG1";
    List<Person> personList=  new ArrayList<>();

    public RecyclerViewAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list_item, parent, false);
        Log.d(TAG1, "onCreateViewHolder: ");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.mTvPersonName.setText(person.getName());
        holder.mTvPersonAge.setText(String.valueOf(person.getAge()));
        holder.mTvPersonGender.setText(person.getGender());
        holder.mTvPersonHeight.setText(String.valueOf(person.getHeight()));
        Log.d(TAG1, "onBindViewHolder: " + position);

        //item touch helper
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTvPersonName;
        private final TextView mTvPersonAge;
        private final TextView mTvPersonGender;
        private final TextView mTvPersonHeight;

        public ViewHolder(View itemView) {
            super(itemView);

            mTvPersonName = itemView.findViewById(R.id.tvPersonName);
            mTvPersonAge = itemView.findViewById(R.id.tvPersonAge);
            mTvPersonGender = itemView.findViewById(R.id.tvPersonGender);
            mTvPersonHeight = itemView.findViewById(R.id.tvPersonHeight);
        }



    }
}
