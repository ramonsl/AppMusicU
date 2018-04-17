package com.example.ramonsl.appmusicu;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PayActivity extends AppCompatActivity {

    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        Button btn = findViewById(R.id.btnPay);
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("Api de Pagamento");
        alertDialog.setMessage("\"Usaria uma api tipo essa https://developers.google.com/pay/api/\" é uma api propria da google  fácil para os clientes do aplicativo . Ela aceita qualquer cartão de crédito ou débito armazenado na conta do Google do seu cliente.");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alerta = alertDialog.create();
                alerta.show();
            }
        });

    }
}
