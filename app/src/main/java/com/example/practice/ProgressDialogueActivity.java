package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import com.example.practice.databinding.ActivityProgressDialogueBinding;

public class ProgressDialogueActivity extends AppCompatActivity {

    private ActivityProgressDialogueBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressDialogueBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleProgressDialogueBtn();
    }

    private void handleProgressDialogueBtn() {
        binding.closeBtn.setOnClickListener(v -> {
           ProgressDialog  builder =new ProgressDialog(this);
            builder.setTitle("ProgressDialogue");
            builder.setMessage("Do You Want close app");
            builder.show();
        });
    }
}