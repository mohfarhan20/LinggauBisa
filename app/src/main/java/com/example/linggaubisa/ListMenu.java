package com.example.linggaubisa;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.content.pm.PackageManager;

public class ListMenu extends AppCompatActivity {
    private TextView nama_tempat,alamat,isi,noHp,rate;
//    private TextView call,route,share;
//    String Hp =noHp.getText().toString();
    private ImageView gambarTempat;
    private ImageView gambarRoute,gambar_call;
    private Button button_home;
    static int PERMISSION_CODE= 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        // String penampung
        String nama_wisata,lokasi_wisata,deskripsi_wisata,noHp_wisata,rate_wisata;
        String lokasi_maps;

        int gambar;

        ImageView maps= findViewById(R.id.gambar_route);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Masjid+Agung+As-Salam+Lubuklinggau/@-3.2968828,102.8579762,17z/data=!3m1!4b1!4m5!3m4!1s0x2e30e0fd6c08b753:0xc7177f94b120330d!8m2!3d-3.2968882!4d102.8601649");
            }
        });

        nama_tempat = findViewById(R.id.nama_tempat);
        alamat = findViewById(R.id.alamat);
        isi = findViewById(R.id.isi);
        noHp = findViewById(R.id.noHp);
        rate = findViewById(R.id.rate);
        gambarTempat = findViewById(R.id.gambarTempat);
        gambarRoute = findViewById(R.id.gambar_route);

        button_home = findViewById(R.id.button_home);
        gambar_call = findViewById(R.id.gambar_call);


        Bundle bundle = getIntent().getExtras();
        nama_wisata = bundle.getString("nama_wisata");
        lokasi_wisata = bundle.getString("lokasi_wisata");
        deskripsi_wisata = bundle.getString("deskripsi_wisata");
        noHp_wisata = bundle.getString("noHp_wisata");
        rate_wisata = bundle.getString("rate_wisata");
        gambar = bundle.getInt("gambarTempat");
        lokasi_maps = bundle.getString("lokasi_maps");

        nama_tempat.setText(nama_wisata);
        alamat.setText(lokasi_wisata);
        isi.setText(deskripsi_wisata);
        noHp.setText(noHp_wisata);
        rate.setText(rate_wisata);
        gambarTempat.setImageResource(gambar);

        if (ContextCompat.checkSelfPermission(ListMenu.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(ListMenu.this,new String[]{Manifest.permission.CALL_PHONE},PERMISSION_CODE);

        }

        gambar_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+noHp_wisata)));
            }
        });

        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ListMenu.this,MenuPilihan.class);
                startActivity(home);
            }
        });

        gambarRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl(lokasi_maps);
            }
        });
    }

//   private void makecall(View view){
//        String phoneno = noHp_;
//        Intent call = new Intent(Intent.ACTION_CALL);
//        call.setData(Uri.parse("tel"+phoneno));
//        startActivity(call);
//    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void go_maps(View maps) {
        Intent home = new Intent(ListMenu.this,Maps.class);
        startActivity(home);
    }





}