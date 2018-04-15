package com.example.ramonsl.appmusicu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);



        Button btn1 = findViewById(R.id.btnPlay);
        Button btn2 = findViewById(R.id.btnPlay1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Aqui iria para activity inicial para tocar as musicas ",Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Aqui iria para activity inicial para tocar as musicas",Toast.LENGTH_LONG).show();
            }
        });
    }
}
