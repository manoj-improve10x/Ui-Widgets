package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {

    private ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setRatingBar();
    }

    private void setRatingBar() {
        binding.button.setOnClickListener(v -> {
            float rating = binding.ratingBar.getRating();
            Toast.makeText(this,String.valueOf(rating), Toast.LENGTH_SHORT).show();
        });
    }
}