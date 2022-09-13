package com.example.fashion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class soc extends AppCompatActivity {
    Button soc_1,soc_2,soc_3,soc_4,soc_5,soc_6,soc_7,soc_8,soc_9,soc_10,soc_11,soc_12,soc_13,soc_14,soc_15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_soc);

        soc_1 = findViewById(R.id.call_soc_1);

        soc_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9770486920"));
                        startActivity(intent);
                    }
                });
        soc_2 = findViewById(R.id.call_soc_2);

        soc_2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9770486920"));
                        startActivity(intent);
                    }
                });
        soc_3 = findViewById(R.id.call_soc_3);

        soc_3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:731242367"));
                        startActivity(intent);
                    }
                });
        soc_4 = findViewById(R.id.call_soc_4);

        soc_4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9826022000"));
                        startActivity(intent);
                    }
                });
        soc_5 = findViewById(R.id.call_soc_5);

        soc_5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425311447"));
                        startActivity(intent);
                    }
                });
        soc_6 = findViewById(R.id.call_soc_6);

        soc_6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:83499962002"));
                        startActivity(intent);
                    }
                });
        soc_7 = findViewById(R.id.call_soc_7);

        soc_7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:8819067866"));
                        startActivity(intent);
                    }
                });
        soc_8 = findViewById(R.id.call_soc_8);

        soc_8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425053469"));
                        startActivity(intent);
                    }
                });
        soc_9 = findViewById(R.id.call_soc_9);

        soc_9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425053469"));
                        startActivity(intent);
                    }
                });
        soc_10 = findViewById(R.id.call_soc_10);

        soc_10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9425053469"));
                        startActivity(intent);
                    }
                });

    }
}