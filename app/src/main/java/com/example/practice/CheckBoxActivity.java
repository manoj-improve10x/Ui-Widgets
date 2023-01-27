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
            String orderDetails = placeOrder(cb,cb2,cb3,cb4);
            Toast.makeText(this,orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    private String placeOrder( boolean a, boolean b, boolean c, boolean d){
        int totalAmount = 0;
        String result= ("Select Items:");
        if (a) {
            result +="\nPizza 100Rs";
            totalAmount += 100;
        }
        if (b) {
            result +="\nCoffee 50Rs";
            totalAmount += 50;
        }
        if (c) {
            result +="\nBurger 120Rs";
            totalAmount += 120;
        }
        if(d) {
            result += "\n boost 150Rs";
            totalAmount += 70;
        }
        result += "\nTotal: " + totalAmount + "Rs";
        return result;
    }
}