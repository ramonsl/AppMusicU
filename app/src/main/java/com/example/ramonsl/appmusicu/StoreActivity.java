package com.example.ramonsl.appmusicu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        final Button btn1 = findViewById(R.id.btnComprar);
        final Button btn2 = findViewById(R.id.btnComprar1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIntent(R.id.btnComprar, PayActivity.class);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIntent(R.id.btnComprar1, PayActivity.class);
            }
        });
    }

    private void openIntent(int id, final Class<? extends Activity> clazz) {
        Button btn = findViewById(id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), clazz);
                startActivity(intent);
            }
        });
    }


}
