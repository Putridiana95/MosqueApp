package com.diana.mosqueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class DataDoa extends AppCompatActivity {
    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getarti = findViewById(R.id.getarti);
        Getbaca = findViewById(R.id.getbaca);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        String doa = getIntent().getExtras().getString("MyName");

        switch (doa){
            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar");
                Getarti.setText("Artinya : “Yaa Allah, berkatilah rezeki yang engkau berikan kepada kami, dan peliharalah kami dari siksa api neraka”.");
                break;
            case "Doa Sesudah Makan":
                Getdoa.setText("Doa Sesudah Makan");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ");
                Getbaca.setText("Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin");
                Getarti.setText("Artinya: \"Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam");
                break;
            case "Doa Sebelum Tidur":
                Getdoa.setText("Doa Sebelum Tidur");
                Getarab.setText("بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ");
                Getbaca.setText("Bismikallohumma ahya wa amuutu");
                Getarti.setText("Artinya: “Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati”.");
                break;
            case "Doa Bangun Tidur":
                Getdoa.setText("Doa Bangun Tidur");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر");
                Getbaca.setText("Alhamdu lillahil ladzii ahyaanaa ba’da maa amaa tanaa wa ilahin nusyuuru");
                Getarti.setText("Artinya : “Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan.");
                break;
            case "Doa Sebelum Belajar":
                Getdoa.setText("Doa Sebelum Belajar");
                Getarab.setText("رَبِّ زِدْنِي عِلْمًا، وَارْزُقْنِيْ فَهْمًا وَاجْعَلْنِيْ مِنَ الصَّالِحِيْنَ");
                Getbaca.setText("Robbii Zidnii ‘Ilmaa, Warzuqnii Fahmaa, Waj’alnii Minash-Shoolihiin Amiin Ya Robbal ‘Aalamiin");
                Getarti.setText("Artinya : “Ya Alloh Tambahkanlah aku ilmu, Dan berilah aku karunia untuk dapat memahaminya, Dan jadikanlah aku termasuk golongannya orang-orang yang shoolih. Ya Alloh kabulkanlah do’aku ini");
                break;
            case "Doa Setelah Belajar":
                Getdoa.setText("Doa Setelah Belajar");
                Getarab.setText("اَللَّهُمَّ أَرِنَا الْحَقَّ حَقًّا وَارْزُقْنَا اتِّـبَاعَه وَأَرِنَا الْبَاطِلَ بَاطِلاً وَارْزُقْنَااجْتِنَابَهُ");
                Getbaca.setText("Alloohumma Arinal Haqqo Haqqon Warzuqnattibaa’ahu. Wa Arinalbaathila Baa-Thilan Warzuqnajtinaabahu");
                Getarti.setText("Artinya : “Ya Alloh, tunjukkanlah kepada kami kebenaran sehinggga kami dapat mengikutinya. Dan tunjukkanlah kepada kami kejelekan sehingga kami dapat menjauhinya");
                break;
            case "Doa Kepada Kedua Orangtua":
                Getdoa.setText("Doa Kedapa Kedua Orangtua");
                Getarab.setText("اللَّهُمَّ اغْفِرْ لِى وَلِوَ الِدَىَّ وَارْ حَمْهُمَا كَمَا رَبَّيَا نِى صَغِيْرًا");
                Getbaca.setText("Allahumma fighfirlii wa liwaa lidhayya warham humaa kamaa rabbayaa nii shokhiroon");
                Getarti.setText("Artinya : Ya Allah, ampunilah aku dan kedua orang tuaku, baik ibu dan bapakku, kasihanilah keduanya seperti mereka menyayangiku di waktu kecil.");

        }
    }
}
