package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.example.practice.databinding.ActivityCustomAlertDialogueBinding;
import com.example.practice.databinding.ActivityCustomListViewBinding;
import com.example.practice.databinding.CustomItemBinding;

public class CustomAlertDialogueActivity extends AppCompatActivity {

    private ActivityCustomAlertDialogueBinding binding;
    private Dialog dialog;
    private CustomItemBinding customItemBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogueBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CustomAlertDialog");
        handleCustomAlertDialog();
    }

    private void handleCustomAlertDialog() {
        binding.button19.setOnClickListener(view -> {
            dialog = new Dialog(this);
            customItemBinding = CustomItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customItemBinding.getRoot());
            customItemBinding.dismissBtn.setOnClickListener(view1 -> {
                finish();
            });
            customItemBinding.closeBtn.setOnClickListener(view1 -> {
                dialog.dismiss();
            });
            customItemBinding.dialougText.setText("Alert...!!!!!");
            dialog.show();
        });
    }
}