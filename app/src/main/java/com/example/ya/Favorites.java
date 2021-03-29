package com.example.ya;

import android.media.Image;
import android.os.Bundle;

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
    private Image []listImage;
    private String []nameCompanies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        numberList = findViewById(R.id.rv_numbers);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numberList.setLayoutManager(layoutManager);
        parse_bcs("https://bcs-express.ru/kotirovki-i-grafiki");
        numberAdaper = new Adapteer(15, nameCompanies);
        numberList.setAdapter(numberAdaper);


    }

    protected void get_new_img() throws MalformedURLException {
        listImage = new Image[0];
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
        nameCompanies = new String[]{"GAzprom", "Ufa", "Google", "Apple", "Tesla", "GAzprom", "Ufa", "Google", "Apple", "Tesla", "GAzprom", "Ufa", "Google", "Apple", "Tesla"};
    }

}