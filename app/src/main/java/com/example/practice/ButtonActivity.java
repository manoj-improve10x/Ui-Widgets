package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice.databinding.ActivityButtonBinding;

public class ButtonActivity extends AppCompatActivity {

    private ActivityButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Add Numbers");
        handleAdd();
    }

    private void handleAdd() {
        binding.addBtn.setOnClickListener(view -> {
            String valueOne = binding.valueOne.getText().toString();
            String valueTwo = binding.valueTwo.getText().toString();
            int a = Integer.parseInt(valueOne);
            int b = Integer.parseInt(valueTwo);
            int sum = a + b;
            Toast.makeText(this,String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }
}