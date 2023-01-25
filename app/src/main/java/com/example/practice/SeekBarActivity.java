package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity {

    private ActivitySeekBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSeekBar();
    }

    private void handleSeekBar() {
        binding.submit.setOnClickListener(v -> {
       int progress =  binding.seekBar.getProgress();
        Toast.makeText(this, String.valueOf(progress), Toast.LENGTH_SHORT).show();
        });
    }
}