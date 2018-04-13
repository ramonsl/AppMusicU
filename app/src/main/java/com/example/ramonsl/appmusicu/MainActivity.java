package com.example.ramonsl.appmusicu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnPlay = findViewById(R.id.btnPLay);
        ImageButton btnFind = findViewById(R.id.btnFind);
        ImageButton btnStore = findViewById(R.id.btnLoja);
        ImageButton btnBiblio = findViewById(R.id.btnBiblio);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Essa é a tela inicial onde vc escuta suas musicas. Queria usar um navigation bar :(",Toast.LENGTH_LONG).show();
            }
        });


        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),FindActivity.class);
                startActivity(it);
                   }
        });

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),StoreActivity.class);
                startActivity(it);
            }
        });



        btnBiblio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),BibliotecaActivity.class);
                startActivity(it);
            }
        });
    }

}
