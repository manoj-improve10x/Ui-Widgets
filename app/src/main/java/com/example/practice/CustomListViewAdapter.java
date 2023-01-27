package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<Name>{
    public CustomListViewAdapter(@NonNull Context context, int resource, ArrayList<Name> arrayList) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.listview_item,parent,false);
        Name names = getItem(position);
        TextView name = view.findViewById(R.id.name);
        name.setText(names.name);
        TextView message = view.findViewById(R.id.msg);
        message.setText(names.msg);
        ImageView img = view.findViewById(R.id.image);
        Picasso.get().load(names.imageUrl).into(img);
        return view;
    }
}
