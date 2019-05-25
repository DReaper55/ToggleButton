package com.example.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton hidemehn;
    private TextView peekaboo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peekaboo = findViewById(R.id.peekaboo);

        hidemehn = findViewById(R.id.toggleID);
        hidemehn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    peekaboo.setVisibility(View.VISIBLE);
                }else{
                    peekaboo.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
