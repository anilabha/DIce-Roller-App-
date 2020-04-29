package com.anilabha.diceloder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button b;
    public ImageView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.bottom);
       t=(ImageView)findViewById(R.id.imageView);
    }

    public void btnclick(View view) {

        Random random=new Random();
        int i= (int) (6.0*Math.random());
        //String s=Integer.toString(i);
//        t.setText(s);
        int[] cards={R.drawable.card1,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f};
        t.setImageResource(cards[i]);

    }
}
