package com.example.ramonsl.appmusicu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        Button btn1 = findViewById(R.id.btnComprar);
        Button btn2 = findViewById(R.id.btnComprar1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Aqui iria para uma activiti onde seria feito o pagamento",Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Aqui iria para uma activiti onde seria feito o pagamento",Toast.LENGTH_LONG).show();
            }
        });
    }
}
