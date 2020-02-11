package com.example.android.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.news.listviews.NewsCulture;
import com.example.android.news.listviews.NewsLifestyle;
import com.example.android.news.listviews.NewsOpinion;
import com.example.android.news.listviews.NewsPolitic;
import com.example.android.news.listviews.NewsScience;
import com.example.android.news.listviews.NewsSports;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView sportsView = (TextView) findViewById(R.id.sports_view);

        sportsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NewsSports.class);
                startActivity(numbersIntent);
            }
        });

        TextView politicsView = (TextView) findViewById(R.id.politics_view);
        politicsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NewsPolitic.class);
                startActivity(numbersIntent);
            }
        });

        TextView scienceView = (TextView) findViewById(R.id.science_view);
        scienceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NewsScience.class);
                startActivity(numbersIntent);
            }
        });

        TextView lifestyleView = (TextView) findViewById(R.id.lifestyle_view);
        lifestyleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NewsLifestyle.class);
                startActivity(numbersIntent);
            }
        });

        TextView opinionView = (TextView) findViewById(R.id.opinion_view);
        opinionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NewsOpinion.class);
                startActivity(numbersIntent);
            }
        });

        TextView cultureView = (TextView) findViewById(R.id.culture_view);
        cultureView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NewsCulture.class);
                startActivity(numbersIntent);
            }
        });
    }
}
