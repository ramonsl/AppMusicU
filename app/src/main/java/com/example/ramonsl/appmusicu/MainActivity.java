package com.example.ramonsl.appmusicu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnPlay = findViewById(R.id.btnPLay);
        final ImageButton btnPlayPause = findViewById(R.id.btnPlayPause);

        btnPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ao pausar a Musica o Botao mudar", Toast.LENGTH_LONG).show();

            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Essa é a tela inicial onde vc escuta suas musicas. Queria usar um navigation bar :(", Toast.LENGTH_LONG).show();
            }
        });

        openIntent(R.id.btnLibrary, LibraryActivity.class);
        openIntent(R.id.btnFind, FindActivity.class);
        openIntent(R.id.btnLoja, StoreActivity.class);

    }

    private void openIntent(int id, final Class<? extends Activity> clazz) {

        ImageButton btn = findViewById(id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), clazz);
                startActivity(intent);
            }
        });
    }


}
