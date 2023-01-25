package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {

    private ActivityRadioButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Questions");
        handleRadioButton();
    }

    private void handleRadioButton() {
        binding.submit.setOnClickListener(v -> {
            if(binding.radioButton.isChecked()){
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show();
            } else if(binding.radioButton2.isChecked()) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            } else if(binding.radioButton3.isChecked()){
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            } else if(binding.radioButton4.isChecked()) {
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}