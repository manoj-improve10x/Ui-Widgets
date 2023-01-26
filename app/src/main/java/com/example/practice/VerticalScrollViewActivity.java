package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practice.databinding.ActivityVerticalScrollViewBinding;

public class VerticalScrollViewActivity extends AppCompatActivity {

    private ActivityVerticalScrollViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerticalScrollViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleVerticalScrollView();
    }

    private void handleVerticalScrollView() {

    }
}