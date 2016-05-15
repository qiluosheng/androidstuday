package com.example.mystady.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.btnJIEGOU);

        cb1= (CheckBox) findViewById(R.id.checkBox);
        cb2= (CheckBox) findViewById(R.id.checkBox2);
        cb3= (CheckBox) findViewById(R.id.checkBox3);
        cb4= (CheckBox) findViewById(R.id.checkBox4);
        cb5= (CheckBox) findViewById(R.id.checkBox5);
        cb6= (CheckBox) findViewById(R.id.checkBox6);


        //事件监听器，只要选择状态发生改变就纪录
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);
        cb5.setOnCheckedChangeListener(this);
        cb6.setOnCheckedChangeListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("归0");
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String str="你干哈？";

        if(cb1.isChecked()){
            str=str+cb1.getText()+",";
        }
        if(cb2.isChecked()){
            str=str+cb2.getText()+",";
        }
        if(cb3.isChecked()){
            str=str+cb3.getText()+",";
        }
        if(cb4.isChecked()){
            str=str+cb4.getText()+",";
        }
        if(cb5.isChecked()){
            str=str+cb5.getText()+",";
        }
        if(cb6.isChecked()){
            str=str+cb6.getText()+",";
        }

        button.setText(str);
    }
}
