package com.example.yvtc.yvtc071202;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = new Button(MainActivity.this);
        btn.setText("Click Me");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click Me!!", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn2 = new Button(MainActivity.this);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "2222", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setText("Click Me 222");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        btn2.setLayoutParams(params);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        layout.addView(btn);
        layout.addView(btn2);
    }
}
