package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.practice.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;
    private ArrayList<String> stringArrayList;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupData();
        displayListView();
    }

    private void setupData() {
       stringArrayList = new ArrayList<>();
       stringArrayList.add("name");
       stringArrayList.add("ramu");
       stringArrayList.add("renu");
       stringArrayList.add("raghu");
       stringArrayList.add("manu");
       stringArrayList.add("raju");
       stringArrayList.add("name");
       stringArrayList.add("ramu");
       stringArrayList.add("renu");
       stringArrayList.add("raghu");
       stringArrayList.add("manu");
       stringArrayList.add("raju");
    }

    private void displayListView() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stringArrayList);
        binding.listview.setAdapter(arrayAdapter);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, String.valueOf(stringArrayList), Toast.LENGTH_SHORT).show();
            }
        });
    }
}