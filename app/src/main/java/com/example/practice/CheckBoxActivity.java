package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice.databinding.ActivityButtonBinding;
import com.example.practice.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleCheckBox();
    }

    private void handleCheckBox() {
        binding.submit.setOnClickListener(v -> {
            boolean cb = binding.checkBox4.isChecked();
            boolean cb2 = binding.checkBox5.isChecked();
            boolean cb3 = binding.checkBox6.isChecked();
            boolean cb4 = binding.checkBox7.isChecked();
            if(cb == true && cb2 == false && cb3 == true && cb4 == false) {
                Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}