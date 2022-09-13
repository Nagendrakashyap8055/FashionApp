package com.example.fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class med extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med);
        View soc_8 = findViewById(R.id.call_soc_8);
        soc_8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425053469"));
                        startActivity(intent);
                    }
                });
        View soc_15 = findViewById(R.id.call_soc_15);
        soc_15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425063283"));
                        startActivity(intent);
                    }
                });
        View soc_10 = findViewById(R.id.call_soc_15);

        soc_10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425348344"));
                        startActivity(intent);
                    }
                });
        View soc_16 = findViewById(R.id.call_soc_16);
        soc_16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425063283"));
                        startActivity(intent);
                    }
                });
        View soc_17 = findViewById(R.id.call_soc_17);
        soc_17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:7312341790"));
                        startActivity(intent);
                    }
                });

    }
}