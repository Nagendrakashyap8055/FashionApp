package com.example.fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class list extends AppCompatActivity {
    View ngo_old,ngo_edu,ngo_env,ngo_med,ngo_orp,ngo_wom,ngo_ski,ngo_men,ngo_phy,ngo_bli,ngo_blo;
    String old,edu,env,med,orp,wom,ski,men,phy,bli,blo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
//        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_list);
        ngo_old=findViewById(R.id.old);
        ngo_edu=findViewById(R.id.edu);
        ngo_env=findViewById(R.id.env);
        ngo_med=findViewById(R.id.med);
        ngo_orp=findViewById(R.id.orp);
        ngo_wom=findViewById(R.id.wom);
        ngo_ski=findViewById(R.id.ski);
        ngo_men=findViewById(R.id.men);
        ngo_phy=findViewById(R.id.phy);
        ngo_bli=findViewById(R.id.bli);
        ngo_blo=findViewById(R.id.blo);
        ngo_edu.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        edu= ngo_edu.toString();
                        Intent intent=new Intent (list.this,edu.class);

                        startActivity(intent);
                    }
                });

        ngo_env.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        env= ngo_env.toString();
                        Intent intent=new Intent (list.this,env.class);

                        startActivity(intent);
                    }
                });
        ngo_med.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        med= ngo_med.toString();
                        Intent intent=new Intent (list.this,med.class);

                        startActivity(intent);
                    }
                });
        ngo_orp.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        orp= ngo_orp.toString();
                        Intent intent=new Intent (list.this,orp.class);
                        startActivity(intent);

                    }
                });
        ngo_wom.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        wom= ngo_wom.toString();
                        Intent intent=new Intent (list.this,wom.class);

                        startActivity(intent);
                    }
                });
        ngo_ski.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        ski= ngo_ski.toString();
                        Intent intent=new Intent (list.this,ski.class);

                        startActivity(intent);
                    }
                });
        ngo_men.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        men= ngo_men.toString();
                        Intent intent=new Intent (list.this,men.class);

                        startActivity(intent);
                    }
                });
        ngo_phy.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        phy= ngo_phy.toString();
                        Intent intent;
                        intent = new Intent (list.this,phy.class);

                        startActivity(intent);
                    }
                });
        ngo_bli.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        bli= ngo_bli.toString();
                        Intent intent=new Intent (list.this,bli.class);

                        startActivity(intent);
                    }
                });
        ngo_blo.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        blo= ngo_blo.toString();
                        Intent intent=new Intent (list.this,blo.class);

                        startActivity(intent);
                    }
                });

        ngo_old.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        old= ngo_old.toString();
                        Intent intent=new Intent (list.this,old.class);

                        startActivity(intent);
                    }
                });


    }
}