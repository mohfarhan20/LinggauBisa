package com.example.linggaubisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go_menu(View view) {
//        setContentView(R.layout.menu_pilihan);
//        Intent pindah = new Intent(nama_view_awal.this, pindahkemno.class);
        Intent move = new Intent();
        startActivity(move);

    }
}