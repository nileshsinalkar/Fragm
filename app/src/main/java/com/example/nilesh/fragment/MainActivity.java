package com.example.nilesh.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frag1 =(Button)findViewById(R.id.button);
        Button frag2 =(Button)findViewById(R.id.button2);
        Button frag3 =(Button)findViewById(R.id.button3);
try{
        frag1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            android.app.FragmentManager fm = getFragmentManager();
            android.app.FragmentTransaction ft=fm.beginTransaction();
            Fragment1 f1=new Fragment1();
            ft.add(R.id.fragment,f1);
            ft.commit();

        }
        });
        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.app.FragmentManager fm = getFragmentManager();
                android.app.FragmentTransaction ft=fm.beginTransaction();
                Fragment2 f2=new Fragment2();

                ft.add(R.id.fragment,f2);

                ft.commit();

            }
        });
        frag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.app.FragmentManager fm = getFragmentManager();
                android.app.FragmentTransaction ft=fm.beginTransaction();
                Fragment3 f3=new Fragment3();

                ft.add(R.id.fragment,f3);

                ft.commit();
            }
        });}catch (RuntimeException ex) {

}

    }

}
