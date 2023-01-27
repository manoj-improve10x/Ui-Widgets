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
            boolean rB1 = binding.radioButton.isChecked();
            boolean rb2 = binding.radioButton2.isChecked();
            boolean rb3 = binding.radioButton3.isChecked();
            boolean rb4 = binding.radioButton4.isChecked();
            String result = getCountryName(rB1, rb2,rb3,rb4);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }
    private String getCountryName(boolean a, boolean b, boolean c, boolean d) {
        String result = "Country Name :";
        if(a) {
            result += "France";
        } if(b) {
            result += "U.K";
        } if(c) {
            result += "India";
        } if(d) {
            result += "U.S.A";
        }
        return result;
    }
}
