package com.example.myapplication5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TextViewActivity extends AppCompatActivity {
    private Button mBt3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mBt3=(Button)findViewById(R.id.btn_3);
        mBt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               Toast.makeText(TextViewActivity.this,"已经点击3",Toast.LENGTH_LONG).show();
            }
        });
        tv1=(TextView)findViewById(R.id.tv_1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TextViewActivity.this,"文档被点击",Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void showToast(View view){
        Toast.makeText(this,"已经点击4",Toast.LENGTH_LONG).show();
    }

}