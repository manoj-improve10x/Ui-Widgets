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
           String result = add(valueOne , valueTwo);
            Toast.makeText(this,String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String a, String b) {
        int add = Integer.parseInt(a);
        int add2 = Integer.parseInt(b);
        int sum = add+add2;
        return String.valueOf(sum);
    }
}