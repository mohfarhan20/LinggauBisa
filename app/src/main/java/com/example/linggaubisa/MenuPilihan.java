package com.example.linggaubisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPilihan extends AppCompatActivity {

    private Button buttonmasjid_agung, buttonAirterjun, buttonBukitSulap,buttonWaterfang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu_pilihan);

        dataAirTerjun();
        dataBukitSulap();
        dataWaterfang();
        dataMasjidAgung();


    }


    public void dataMasjidAgung() {
        buttonmasjid_agung = findViewById(R.id.masjid_agung);
        buttonmasjid_agung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          Intent pindahListMenu = new Intent(MenuPilihan.this,ListMenu.class);
                String tempatWisata[] = {"Masjid Agung",
                        "Jl. Garuda, Ps. Permiri, Kec. Lubuk Linggau Bar. II, Kota Lubuklinggau, Sumatera Selatan 31613",
                        "Masjid Agung As-Salam begitu nama resminya. Masjid ini menjadi masjid agung kedua di Kota Lubuk Linggau. " +
                                "Sebelumnya telah ada masjid agung lainnya yaitu Masjid Agung Al Baari' yang terletak tidak terlalu jauh " +
                                "dari masjid Agung As-Salam.Masjid Agung As-Salam terletak di jantung Kota Lubuklinggau Provinsi " +
                                "Sumatera Selatan. Masjid ini tak hanya sekadar menjadi tempat ibadah bagi umat Islam namun telah " +
                                "menjadi salah satu objek wisata religi di provinsi Sumatra Selatan.",
                                "081368692496",
                                "4.9",
                                "https://www.google.com/maps/place/Masjid+Agung+As-Salam+Lubuklinggau/@-3.2968828,102.8579762,17z/data=!3m1!4b1!4m5!3m4!1s0x2e30e0fd6c08b753:0xc7177f94b120330d!8m2!3d-3.2968882!4d102.8601649"};

                int gambar = R.drawable.masjid_agung;
                pindahListMenu.putExtra("nama_wisata",tempatWisata[0]);
                pindahListMenu.putExtra("lokasi_wisata",tempatWisata[1]);
                pindahListMenu.putExtra("deskripsi_wisata",tempatWisata[2]);
                pindahListMenu.putExtra("noHp_wisata",tempatWisata[3]);
                pindahListMenu.putExtra("rate_wisata",tempatWisata[4]);
                pindahListMenu.putExtra("lokasi_maps",tempatWisata[5]);
                pindahListMenu.putExtra("gambarTempat",gambar);
                startActivity(pindahListMenu);

            }
        });
    }

    public void dataAirTerjun() {
        buttonAirterjun = findViewById(R.id.air_terjun);
        buttonAirterjun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahListMenu = new Intent(MenuPilihan.this,ListMenu.class);
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
                                "jarak 50 meter.", "081368692496", "4.4",
                                "https://www.google.com/maps/place/Air+Terjun+Temam/@-3.2968828,102.8579762,17z/data=!4m5!3m4!1s0x2e30e65155555555:0x24b5109c6d325f46!8m2!3d-3.2936245!4d102.9300533"};

                int gambar = R.drawable.air_terjun_temam;
                pindahListMenu.putExtra("nama_wisata",tempatWisata[0]);
                pindahListMenu.putExtra("lokasi_wisata",tempatWisata[1]);
                pindahListMenu.putExtra("deskripsi_wisata",tempatWisata[2]);
                pindahListMenu.putExtra("noHp_wisata",tempatWisata[3]);
                pindahListMenu.putExtra("rate_wisata",tempatWisata[4]);
                pindahListMenu.putExtra("lokasi_maps",tempatWisata[5]);
                pindahListMenu.putExtra("gambarTempat",gambar);
                startActivity(pindahListMenu);
            }
        });
    }

    public void dataBukitSulap() {
        buttonBukitSulap = findViewById(R.id.bukit_sulap);
        buttonBukitSulap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahListMenu = new Intent(MenuPilihan.this,ListMenu.class);
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
                                "maupun Bengkulu yang merupakan provinsi tetangga.", "-", "4.2",
                                "https://www.google.com/maps/search/bukit+sulap/@-3.2900223,102.8572275,16z/data=!3m1!4b1"};

                int gambar = R.drawable.bukit_sulap;
                pindahListMenu.putExtra("nama_wisata",tempatWisata[0]);
                pindahListMenu.putExtra("lokasi_wisata",tempatWisata[1]);
                pindahListMenu.putExtra("deskripsi_wisata",tempatWisata[2]);
                pindahListMenu.putExtra("noHp_wisata",tempatWisata[3]);
                pindahListMenu.putExtra("rate_wisata",tempatWisata[4]);
                pindahListMenu.putExtra("lokasi_maps",tempatWisata[5]);
                pindahListMenu.putExtra("gambarTempat",gambar);
                startActivity(pindahListMenu);

            }
        });
    }

    public void dataWaterfang() {
        buttonWaterfang = findViewById(R.id.waterfang);
        buttonWaterfang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahListMenu = new Intent(MenuPilihan.this,ListMenu.class);
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
                                "ini yang tidak lagi menguntungkan, harus dibangun agar berkembang.", "-", "4.2",
                                "https://www.google.com/maps/search/Watervang,+Kota+Lubuklinggau,+Sumatera+Selatan/@-3.2758817,102.8923571,16z"};

               int gambar = R.drawable.watervang;
                pindahListMenu.putExtra("nama_wisata",tempatWisata[0]);
                pindahListMenu.putExtra("lokasi_wisata",tempatWisata[1]);
                pindahListMenu.putExtra("deskripsi_wisata",tempatWisata[2]);
                pindahListMenu.putExtra("noHp_wisata",tempatWisata[3]);
                pindahListMenu.putExtra("rate_wisata",tempatWisata[4]);
                pindahListMenu.putExtra("lokasi_maps",tempatWisata[5]);
                pindahListMenu.putExtra("gambarTempat",gambar);
                startActivity(pindahListMenu);
            }
        });
    }

}