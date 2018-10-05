package com.example.fect.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Example extends AppCompatActivity {
    private EditText txt_nome;
    private EditText pwd_password;
    private EditText em_email;
    private Button btn_enviar;
    private Button btn_draw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        txt_nome = findViewById(R.id.txt_nome);
        pwd_password = findViewById(R.id.pwd_password);
        em_email = findViewById(R.id.em_email);
        btn_enviar = findViewById(R.id.btn_enviar);
        setContentView(R.layout.second_activity);
        btn_draw = findViewById(R.id.btn_draw);
     final   Player player1 = new Player();


        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.second_activity);
                Toast.makeText(getApplicationContext(), "Seus dados são: " + txt_nome.getText().toString() + "\n" + pwd_password.getText().toString(), Toast.LENGTH_LONG).show();

                //    txt_nome.setText("")
                //  pwd_password.setText("");
               // em_email.setText("");=

            }



        });

        btn_draw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               player1.drawCards();
            }

        });
    }
}
