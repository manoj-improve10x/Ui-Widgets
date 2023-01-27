package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practice.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {

    private ActivityDatePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        updateDate();
    }

    private void updateDate() {
        binding.changeDateBtn.setOnClickListener(v -> {
            int date = binding.datePicker.getDayOfMonth();
            int month = binding.datePicker.getMonth();
            int year = binding.datePicker.getYear();
            String result = getData(date,month, year);
            binding.date.setText(result);
        });
    }

    private String getData(int date, int month, int year) {
        String currentDate = String.valueOf(date);
        String currentMonth = String.valueOf(month);
        String currentYear = String.valueOf(year);
        String currentData = "current Date :" + currentDate + " - " + currentMonth + " - " + currentYear;
        return currentData;
    }
}