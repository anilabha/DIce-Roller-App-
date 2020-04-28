package com.anilabha.diceloder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button b;
    public TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.bottom);
        t=(TextView)findViewById(R.id.textView);
    }

    public void btnclick(View view) {
        Random random=new Random();
        int i= (int) (6.0*Math.random()+1);
        String s=Integer.toString(i);
        t.setText(s);

    }
}
