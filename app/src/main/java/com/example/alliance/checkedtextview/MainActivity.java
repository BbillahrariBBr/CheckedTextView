package com.example.alliance.checkedtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tgb;
    CheckedTextView ctv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgb = (ToggleButton)findViewById(R.id.toggleButton);
        ctv = (CheckedTextView)findViewById(R.id.checkedTextView);

    }

    public void toggleClick(View v){
        if(v.getId()==R.id.toggleButton){
            if(tgb.isChecked()){
                ctv.setCheckMarkDrawable(R.drawable.ic_wifi);
            }
            else {
                ctv.setCheckMarkDrawable(R.drawable.ic_signal_wifi);
            }
        }
    }
}
