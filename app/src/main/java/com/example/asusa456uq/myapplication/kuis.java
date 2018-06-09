package com.example.asusa456uq.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kuis extends AppCompatActivity implements View.OnClickListener {
    private Button button2,button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.button2:i=new Intent(this,MulaiKuis.class);startActivity(i);break;
            case R.id.button:i=new Intent(this,Materi.class);startActivity(i);break;
            default:break;
        }
    }
}
