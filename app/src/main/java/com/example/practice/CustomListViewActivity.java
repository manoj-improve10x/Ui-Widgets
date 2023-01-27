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
        name.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/MS-Exec-Nadella-Satya-2017-08-31-22_%28cropped%29.jpg/1200px-MS-Exec-Nadella-Satya-2017-08-31-22_%28cropped%29.jpg";
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
    }
}