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

import com.example.practice.databinding.ListviewItemBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<Name>{
    public CustomListViewAdapter(@NonNull Context context, int resource, ArrayList<Name> arrayList) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ListviewItemBinding binding = ListviewItemBinding.inflate(LayoutInflater.from(getContext()),parent,false);
        Name names = getItem(position);
        binding.name.setText(names.name);
        binding.msg.setText(names.msg);
        Picasso.get().load(names.imageUrl).into(binding.image);
        return binding.getRoot();
    }
}
