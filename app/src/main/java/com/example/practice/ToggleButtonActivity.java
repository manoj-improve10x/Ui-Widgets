package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleToggleButton();
    }

    private void handleToggleButton() {
        binding.submit.setOnClickListener(v -> {
            String button1 =  binding.toggleBtn.getText().toString();
            String button2 = binding.toggleBtn2.getText().toString();
            Toast.makeText(this, "toggle1:" + button1 + "\ntoggle2:" + button2 , Toast.LENGTH_SHORT).show();
        });
    }
}