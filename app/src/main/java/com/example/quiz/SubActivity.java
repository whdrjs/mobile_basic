package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SubActivity extends AppCompatActivity {

    CheckBox cb;
    Button button;
    Button button2;
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        cb=(CheckBox)findViewById(R.id.check1);
        button=(Button)findViewById(R.id.btnCB);
        button2=(Button)findViewById(R.id.btnInRadio);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(cb.isChecked()){
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(intent,1);
            }
            else{
                Toast.makeText(getApplication(),"imhere",Toast.LENGTH_LONG).show();
            }
            }
        });

        rg=(RadioGroup)findViewById(R.id.radioG);
        rb1=(RadioButton)findViewById(R.id.radioB1);
        rb2=(RadioButton)findViewById(R.id.radioB2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(rg.getCheckedRadioButtonId()==rb1.getId())
                {
                    Toast.makeText(getApplication(),"Radio Button1",Toast.LENGTH_LONG);
                }
                if(rg.getCheckedRadioButtonId()==rb2.getId())
                {
                    Toast.makeText(getApplication(),"Radio Button2",Toast.LENGTH_LONG);
                }
            }
        });
        sw=(Switch)findViewById(R.id.nintendo);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){

                }
            }
        });

        sw.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                if(((ToggleButton)v).isChecked()){

                }
            }
        });

    }
}
