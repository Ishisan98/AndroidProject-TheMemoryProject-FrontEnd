package com.example.memory_game_ca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = (Button) findViewById(R.id.start_button);
        startBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick (View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2 () {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity (intent);
    }



}