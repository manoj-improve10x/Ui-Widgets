package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.practice.databinding.ActivityAutoCompleteTextViewBinding;

import java.util.ArrayList;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityAutoCompleteTextViewBinding binding;
    private ArrayAdapter<String> adapter;
    private String[] language ={"C","C++","Java",".NET","iPhone","Android","ASP.NET","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setAutoCompleteText();
        setMultiLineText();
    }

    private void setAutoCompleteText() {
        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,language);
        binding.TextViewTxt.setThreshold(1);
        binding.TextViewTxt.setAdapter(adapter);
        binding.TextViewTxt.setTextColor(Color.RED);
    }

    private void setMultiLineText() {
        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,language);
        binding.multiLine.setTextColor(Color.GREEN);
        binding.multiLine.setThreshold(1);
        binding.multiLine.setAdapter(adapter);
    }
}