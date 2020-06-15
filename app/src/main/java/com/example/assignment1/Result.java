package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView result;
    Button setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.textDisplay);
        setting = findViewById(R.id.Change);

        final Intent intent = getIntent();
        if(intent!=null){
            result.setText(intent.getStringExtra("Language"));
        }

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Result.this,MainActivity.class);
                startActivity(intent1);

            }
        });



    }
}
