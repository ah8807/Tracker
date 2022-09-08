package com.example.tracker;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tracker tr = new Tracker();
        Button btnAddH= findViewById(R.id.btnAddH);
        btnAddH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tv=findViewById(R.id.textView);
                tr.incStudy();
                tv.setText(tr.getStudy()+"");
            }
        });
        Button btnDecH= findViewById(R.id.btnDecH);
        btnDecH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tv=findViewById(R.id.textView);
                tr.decStudy();
                tv.setText(tr.getStudy()+"");
            }
        });
    }
}