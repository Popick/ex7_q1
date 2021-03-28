package com.example.ex7_q1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout vi;
    ToggleButton tb;
    Switch swDN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vi = (ConstraintLayout)findViewById(R.id.bground);
        tb = (ToggleButton) findViewById(R.id.toggle);
        swDN = (Switch) findViewById(R.id.switch1);
    }


    public void btnclick(View view) {

        if (tb.isChecked() && swDN.isChecked()){
            vi.setBackgroundResource(R.drawable.puff);
        }else if(tb.isChecked()==false && swDN.isChecked()){
            vi.setBackgroundResource(R.drawable.puff2);

        }else if(tb.isChecked() && swDN.isChecked()==false){
            vi.setBackgroundResource(R.drawable.puff3);

        }else{
            vi.setBackgroundResource(R.drawable.puff4);

        }



    }
}