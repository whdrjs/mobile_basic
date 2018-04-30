package com.example.quiz;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mybutton;
    Button button2;
    Button button3;
    Button button4;
    TableLayout tableContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        tableContainer=(TableLayout) findViewById(R.id.tableLay);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.activity_table,tableContainer, true);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(inte);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            Intent inte=new Intent(Intent.ACTION_WEB_SEARCH);
            inte.putExtra(SearchManager.QUERY,"What is love?");
            startActivity(inte);
            Toast.makeText(getApplicationContext(),"search",Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent inte= new Intent(getApplicationContext(),ScrollActivity.class);
                startActivity(inte);
            }
        });
    }
}
