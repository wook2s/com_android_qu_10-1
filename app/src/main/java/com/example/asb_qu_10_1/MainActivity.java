package com.example.asb_qu_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton rbtn2 = (RadioButton)findViewById(R.id.rdoSecond);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;

                if(rbtn2.isChecked()){
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                }else{
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                }
                startActivity(intent);
            }
        });



    }
}