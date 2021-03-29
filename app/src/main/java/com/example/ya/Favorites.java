package com.example.ya;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.IOException;
import java.net.MalformedURLException;

public class Favorites extends AppCompatActivity {

    private RecyclerView numberList;
    private Adapteer numberAdaper;
    private ImageView[]listImage;
    private String []nameCompanies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        numberList = findViewById(R.id.rv_numbers);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numberList.setLayoutManager(layoutManager);
        parse_bcs("https://bcs-express.ru/kotirovki-i-grafiki");
        try {
           get_new_img();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        numberAdaper = new Adapteer(15, nameCompanies, listImage);
        numberList.setAdapter(numberAdaper);


    }

    @SuppressLint("ResourceType")
    protected void get_new_img() throws MalformedURLException {
        listImage = new ImageView[15];
        listImage[0] = (ImageView) findViewById(R.drawable.apple_stocks);
        listImage[1] = (ImageView) findViewById(R.drawable.apple_stocks);
        listImage[2] =(ImageView) findViewById( R.drawable.apple_stocks);
        listImage[3] = (ImageView) findViewById(R.drawable.apple_stocks);
        listImage[4] = (ImageView) findViewById(R.drawable.apple_stocks);
        listImage[5] = (ImageView) findViewById(R.drawable.apple_stocks);
        listImage[6] = (ImageView) findViewById(R.drawable.rosneft);
        listImage[7] = (ImageView) findViewById(R.drawable.apple_stocks);
        listImage[8] = (ImageView) findViewById(R.drawable.apple);
        listImage[9] = (ImageView) findViewById(R.drawable.tesla);
        listImage[10] = (ImageView) findViewById(R.drawable.gazprom);
        listImage[11] = (ImageView) findViewById(R.drawable.magnit);
        listImage[12] = (ImageView) findViewById(R.drawable.apple_stocks);
        listImage[13] = (ImageView) findViewById(R.drawable.mos);
        listImage[14] = (ImageView) findViewById(R.drawable.yandex);
    }

    protected void parse_bcs(String URL) {
        /*
        Document doc = null;
        try {
            doc = (Document) Jsoup.connect(URL).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("We sucsesful open doc");
            System.out.println(doc);
            Element naming = doc.getElementById("div.quotes-list-item js-quotes-list-item js-quotes-portfolios-item _up");
            System.out.println(naming);
        //*/
                    //select("div.quotes-list-item js-quotes-list-item js-quotes-portfolios-item _up");
        nameCompanies = new String[]{"ИСКЧ", "РУСОЛОВО", "ДВМП", "ПИК", "РАСПАДСКАЯ", "ВТБ", "РОСНЕФТЬ", "Google", "Apple", "Tesla", "Gаzprom", "МАГНИТ", "СБЕРБАНК", "МОСБИРЖА", "ЯНДЕКС"};
    }

}