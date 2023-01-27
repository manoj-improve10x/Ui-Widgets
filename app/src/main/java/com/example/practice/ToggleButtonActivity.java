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
            String outPut = getButtonData(button1, button2);
            Toast.makeText(this, outPut, Toast.LENGTH_SHORT).show();
        });
    }

    private String getButtonData(String button1, String button2) {
        String button1Check = "button1 :" + button1 + "\n";
        String button2Check = "button2 :" + button2;
        String result  = button1Check += button2Check;
        return result;
    }
}