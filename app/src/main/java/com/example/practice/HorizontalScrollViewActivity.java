package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practice.databinding.ActivityHorizontalScrollViewBinding;

public class HorizontalScrollViewActivity extends AppCompatActivity {

    private ActivityHorizontalScrollViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHorizontalScrollViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}