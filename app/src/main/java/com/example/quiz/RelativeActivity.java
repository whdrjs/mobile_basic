package com.example.quiz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Date;

import static android.content.Intent.ACTION_VIEW;

public class RelativeActivity extends AppCompatActivity {
    Button bf;
    ImageButton yb;
    EditText edit;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        bf=(Button)findViewById(R.id.btn69);
        yb=(ImageButton)findViewById(R.id.ytBtn);
        edit=(EditText)findViewById(R.id.edit18);

        context=getApplicationContext();
        yb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edit.getText().toString().equals("youtube")) {
                    Intent intent = new Intent(ACTION_VIEW, Uri.parse("www.youtube.com"));
                    startActivity(intent);
                }
                else{
                    Toast.makeText(context,"error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                bf.setText(new Date().toString());
            }
        });
/*
        edit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

            }

        });*/
    }
}
