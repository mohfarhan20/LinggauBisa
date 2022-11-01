package com.example.linggaubisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPilihan extends AppCompatActivity {

    private Button buttonmasjid_agung, buttonAirterjun, buttonBukitSulap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pilihan);


    }
    public void pindahAirTerjun(View view) {
        Intent pindah = new Intent(MenuPilihan.this, ListMenu.class);
        startActivity(pindah);
    }

    public void dataMasjidAgung() {
        buttonmasjid_agung = findViewById(R.id.masjid_agung);
        buttonmasjid_agung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//          Intent moveTransition = new Intent()
                String tempatWisata[] = {"Masjid Agung",
                        "Jl. Garuda, Ps. Permiri, Kec. Lubuk Linggau Bar. II, Kota Lubuklinggau, Sumatera Selatan 31613",
                        "Masjid Agung As-Salam begitu nama resminya. Masjid ini menjadi masjid agung kedua di Kota Lubuk Linggau. " +
                                "Sebelumnya telah ada masjid agung lainnya yaitu Masjid Agung Al Baari' yang terletak tidak terlalu jauh " +
                                "dari masjid Agung As-Salam.Masjid Agung As-Salam terletak di jantung Kota Lubuklinggau Provinsi " +
                                "Sumatera Selatan. Masjid ini tak hanya sekadar menjadi tempat ibadah bagi umat Islam namun telah " +
                                "menjadi salah satu objek wisata religi di provinsi Sumatra Selatan.", "081368692496", "4.9"};

            }
        });
    }

    public void dataAirTerjun() {
        buttonmasjid_agung = findViewById(R.id.air_terjun);
        buttonmasjid_agung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//          Intent moveTransition = new Intent()
                String tempatWisata[] = {"Air Terjun Temam",
                        "Air Teman, Kec. Lubuk Linggau Sel. I, Kota Lubuklinggau, Sumatera Selatan 31600",
                        "Air terjun Temam sama seperti air terjun Niagara yang berada di perbatasan Kanada dan Amerika Serikat." +
                                "Air terjun Temam memiliki ketinggian sekitar 12 meter dan lebar 26 meter, dengan dikelilingi bebatuan " +
                                "alam serta pepohonan yang hijau. Dengan kondisi alam yang masih alami. Di bawah bawah air terjun Temam " +
                                "terdapat kolam alami sedalam 4 meter, yang biasa digunakan anak-anak yang tinggal di sekitar " +
                                "air terjun untuk loncat dari atas jembatan. Air terjun ini pertama kali dikenalkan oleh orang Belanda " +
                                "pada tahun 1920, karena di areal tersebut dahulu merupakan lokasi orang-orang Belanda liburan." +
                                "Air terjun Temam yang menyerupai air terjun Niagara ini berada di aliran sungai Temam. " +
                                "Di atas air terjun terdapat jembatam gantung yang melintang sepanjang 100 meter. " +
                                "Sehingga para pengunjung dapat melihat air terjun Temam dari atas jembatan, hanya dengan " +
                                "jarak 50 meter.", "081368692496", "4.4"};

            }
        });
    }

    public void dataBukitSulap() {
        buttonmasjid_agung = findViewById(R.id.bukit_sulap);
        buttonmasjid_agung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//          Intent moveTransition = new Intent()
                String tempatWisata[] = {"Bukit Sulap",
                        "Jl. Bengawan Solo No.RT 10, Ulak Surung, Kec. Lubuk Linggau Utara II, Kota Lubuklinggau, Sumatera Selatan 31617",
                        "Air terjun Temam sama seperti air terjun Niagara yang berada di perbatasan Kanada dan Amerika Serikat." +
                                "Bukit Sulap menjadi tujuan favorit wisatawan di Lubuklinggau, karena letaknya sangat " +
                                "mudah untuk diakses, yakni berada di dalam kota. Nuansa alam dan hutan yang asri seakan " +
                                "menjadi paru-paru bagi warga Lubuklinggau.Tak hanya itu, Bukit Sulap juga menjadi ikon " +
                                "wisata alam di Sumatera Selatan, mengingat letaknya yang berada di kawasan Hutan Nasional. " +
                                "Dari puncak Bukit Sulap di ketinggian 700 mdpl, kita bisa melihat pemandangan Lubuklinggau." +
                                "Untuk ke puncak bukit, wisatawan bisa naik menggunakan kereta miring dengan rel sepanjang " +
                                "400 meter. Trek sepanjang 260 meter miringnya 22 derajat dan trek 140 meter miringnya 35 derajat." +
                                "Untuk menuju puncak menggunakan jalur kereta miring, wisatawan cukup memarkirkan kendaraan di " +
                                "shelter A, atau dapat juga melalui jalur sepeda dan berjalan kaki. Saat libur tiba seperti " +
                                "long weekend Hari Buruh mendatang, Bukit Sulap akan ramai dikunjungi wisatawan dari Kota Lubuklinggau" +
                                "maupun Bengkulu yang merupakan provinsi tetangga.", "-", "4.2"};

            }
        });
    }

    public void dataWaterfang() {
        buttonmasjid_agung = findViewById(R.id.waterfang);
        buttonmasjid_agung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//          Intent moveTransition = new Intent()
                String tempatWisata[] = {"Waterfang",
                        "Jalan Yos Sudarso, Batu Urip, Lubuk Linggau Utara II, Kota Lubuklinggau, Sumatera Selatan 31625",
                        "Watervang merupakan nama dari bendungan di Kota Lubuklinggau, Sumatera Selatan. " +
                                "Watervang juga menjadi tempat pariwisata yang tentu jauh lebih tua dari usia Kota Lubuklinggau," +
                                "karena terbentuk dan terpisah dari Kabupaten Musi Rawas pada 2001.\n" +
                                "Watervang membendung dan meninggikan permukaan Sungai Kelingi untuk dilalirkan ke sistem irigasi, " +
                                "yang pada masa kolonial untuk pengembangan wilayah dan pertanian. Menurut sejarah dikutip dari berbagai sumber," +
                                "yang salah satunya karya Titet Fauzi Rachmawan dari Balai Arkeologi Sumatera Selatan, pada awal abad 20, " +
                                "Belanda mulai mencanangkan kebijakan yang diumumkan Ratu Wilhemina di depan parlemen saat itu, dalam upaya " +
                                "membangun Hindia Belanda untuk memperbaiki kesejahteraan masyarakat pribumi. Prinsip sederhana dari pidato " +
                                "Ratu Wilhemnia ini adalah Hindia Belanda harus dibangun. Sekaligus mengubah anggapan saat itu bahwa daerah " +
                                "ini yang tidak lagi menguntungkan, harus dibangun agar berkembang.", "-", "4.2"};

            }
        });
    }

}