package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practice.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    private ActivityCustomListViewBinding binding;
    private ArrayList<Name> arrayList;
    private CustomListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        handleListView();
    }

    private void setData() {
        arrayList = new ArrayList<>();
        Name name = new Name();
        name.name = "java";
        name.msg = "hi";
        name.imageUrl = "https://www.shutterstock.com/image-photo/portrait-smiling-red-haired-millennial-260nw-1194497251.jpg";
        arrayList.add(name);
        arrayList.add(name);
        arrayList.add(name);
        arrayList.add(name);
        arrayList.add(name);
        arrayList.add(name);
        arrayList.add(name);
    }

    private void handleListView() {
        adapter = new CustomListViewAdapter(this,R.layout.listview_item,arrayList);
        binding.listView.setAdapter(adapter);
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
    }
}