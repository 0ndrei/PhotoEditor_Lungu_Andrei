package com.mianasad.LA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mianasad.LA.databinding.ActivityResultBinding;


public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;
    int IMAGE_REQUEST_CODE = 45;
    int CAMERA_REQUEST_CODE = 14;
    int RESULT_CODE = 200;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.image.setImageURI(getIntent().getData());

        ImageView imageView = (ImageView) findViewById(R.id.homeBtn);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homePage();
            }

            private void homePage() {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
          }
        });
    }
}