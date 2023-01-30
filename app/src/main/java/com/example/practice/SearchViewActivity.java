package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.practice.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySearchViewBinding binding;
    private ArrayList<String> fruitsList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupData();
        setupFruitsLv();
    }

    private void setupData() {
        fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("Orange");
        fruitsList.add("Greps");
        fruitsList.add("Mango");
        fruitsList.add("WaterMelon");
        fruitsList.add("Gavava");
        fruitsList.add("Papaya");
    }

    private void setupFruitsLv() {
        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,fruitsList);
        binding.fruitsLv.setAdapter(adapter);
        binding.searchBar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(fruitsList.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(SearchViewActivity.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }


            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}