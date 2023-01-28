package com.example.practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.practice.databinding.ActivityAlertDialogueBoxBinding;

public class AlertDialogueBoxActivity extends AppCompatActivity {

    private ActivityAlertDialogueBoxBinding binding;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogueBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        builder = new AlertDialog.Builder(this);
        handleCloseBtn();
    }

    private void handleCloseBtn() {
        binding.closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("do you want close app");
                builder.setCancelable(false);
                builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Toast.makeText(AlertDialogueBoxActivity.this, "Close the app", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("open", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertDialogueBoxActivity.this, "open the app", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.setTitle("Alert Dialogue Example");
                dialog.show();
            }
        });
    }
}