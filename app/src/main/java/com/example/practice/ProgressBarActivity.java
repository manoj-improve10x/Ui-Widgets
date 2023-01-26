package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;

import com.example.practice.databinding.ActivityProgressBarBinding;

public class ProgressBarActivity extends AppCompatActivity {

    private ActivityProgressBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showProgressBar();
    }

    private void showProgressBar() {
        binding.downloadFileBtn.setOnClickListener(v -> {
            binding.progressGroup.setVisibility(View.VISIBLE);
            binding.progressBar.getProgress();
        });
        binding.progressGroup.setVisibility(View.GONE);
    }
}