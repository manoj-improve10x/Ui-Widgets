package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.practice.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    private ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showTime();
    }

    @SuppressLint("NewApi")
    private void showTime() {
        binding.submit.setOnClickListener(v -> {
            binding.timePicker.setIs24HourView(false);
            int time = binding.timePicker.getHour();
            int minute = binding.timePicker.getMinute();
            String result = getTimeData(time,minute);
            binding.time.setText(result);
        });
    }

    private String getTimeData(int time, int minute) {
        String currentTime = String.valueOf(time);
        String currentMinute = String.valueOf(minute);
        String currentTimeData = "Current Time :" + currentTime + " :" + currentMinute;
        return currentTimeData;
    }
}