package com.example.fashion;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fashion.R;


public class MainActivity extends AppCompatActivity {
    String list,f_b;
    View listOfNgos,facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        facebook=findViewById(R.id.fb);
        facebook.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        f_b= facebook.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vsws.org"));

                        startActivity(intent);
                    }
                });
        View twitter = findViewById(R.id.tr);
        twitter.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String t_r = twitter.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/mmoyde"));

                        startActivity(intent);
                    }
                });
        View linked_in = findViewById(R.id.in);
        linked_in.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = linked_in.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/vijay-social-welfare-society"));

                        startActivity(intent);
                    }
                });
        View download = findViewById(R.id.download);
        download.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = download.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://secureservercdn.net/45.40.148.147/t0p.57a.myftpupload.com/wp-content/uploads/2021/09/VSWS-Organ-Domation-Form-English.pdf"));

                        startActivity(intent);
                    }
                });
//        View register = findViewById(R.id.register);
//        register.setOnClickListener(
//                new View.OnClickListener()
//                {
//                    @Override
//                    public void onClick(View view)
//                    {
//                        String l_n = register.toString();
//                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/donate-us/"));
//
//                        startActivity(intent);
//                    }
//                });
        View rm1 = findViewById(R.id.rm1);
        rm1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm1.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/09/vsws-organ-donation-form/"));

                        startActivity(intent);
                    }
                });
        View rm2 = findViewById(R.id.rm2);
        rm2.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm2.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/09/international-literacy-day/"));

                        startActivity(intent);
                    }
                });
        View rm3 = findViewById(R.id.rm3);
        rm3.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm3.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/08/children-made-eco-friendly-ganesh-in-online-class/"));

                        startActivity(intent);
                    }
                });
        View rm4 = findViewById(R.id.rm4);
        rm4.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm4.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/08/vijay-social-welfare-society-and-choitharam-hospital-conducted-online-session-on-world-organ-donation-day-save-a-life-afterlife/"));

                        startActivity(intent);
                    }
                });
        View rm5 = findViewById(R.id.rm5);
        rm5.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm5.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/08/vijay-social-welfare-society-conducting-online-session-on-womens-health-in-adolescence/"));

                        startActivity(intent);
                    }
                });
        View rm6 = findViewById(R.id.rm6);
        rm6.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm6.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/08/on-the-occasion-of-national-handloom-day-vijay-social-welfare-society-conducting-online-workshop-on-threads-needles/"));

                        startActivity(intent);
                    }
                });

        View rm7 = findViewById(R.id.rm7);
        rm7.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm7.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/08/free-make-up-session-for-girls-by-rinki-chopramakeup-artist-influencer-beauty-creator/"));

                        startActivity(intent);
                    }
                });

        View rm8 = findViewById(R.id.rm8);
        rm8.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm8.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/07/an-interactive-session-on-nutritional-diet-by-ms-vandana-bagadiyanutriton-consultant/"));

                        startActivity(intent);
                    }
                });

        View rm9= findViewById(R.id.rm9);
        rm9.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm9.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/07/education-is-the-key-of-success/"));

                        startActivity(intent);
                    }
                });

        View rm10 = findViewById(R.id.rm10);
        rm10.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm10.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.vsws.org/2021/07/%e0%a4%b5%e0%a4%bf%e0%a4%9c%e0%a4%af-%e0%a4%b8%e0%a5%8b%e0%a4%b6%e0%a4%b2-%e0%a4%b5%e0%a5%87%e0%a4%b2%e0%a4%ab%e0%a5%87%e0%a4%af%e0%a4%b0-%e0%a4%b8%e0%a5%8b%e0%a4%b8%e0%a4%be%e0%a4%af%e0%a4%9f-2/"));

                        startActivity(intent);
                    }
                });


       // View c6 = findViewById(R.id.call);

//        c6.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(Intent.ACTION_DIAL);
//                        intent.setData(Uri.parse("tel:9300774806"));
//                        startActivity(intent);
//                    }
//                });
        listOfNgos=findViewById(R.id.list);
        listOfNgos.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        list= listOfNgos.toString();
                        Intent intent=new Intent (MainActivity.this,list.class);

                        startActivity(intent);
                    }
                });
    }
}