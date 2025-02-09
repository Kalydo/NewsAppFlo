package com.example.android.news.listbuild;

import android.content.AsyncTaskLoader;
import android.content.Context;


import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static final String LOG = NewsLoader.class.getName();
    private String url;

    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if(url == null){
            return null;
        }

        List<News> news = NewsQueryUtils.fetchNewsData(url);
        return news;
    }
}
