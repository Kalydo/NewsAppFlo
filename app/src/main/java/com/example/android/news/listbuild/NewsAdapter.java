package com.example.android.news.listbuild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.news.R;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(Context context, List<News> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);
        TextView category = (TextView) listItemView.findViewById(R.id.category_view);
        category.setText(currentNews.getSectionName());


        TextView date = (TextView) listItemView.findViewById(R.id.date_view);
        date.setText(currentNews.getWebPublicationDate());

        TextView title = (TextView) listItemView.findViewById(R.id.title_view);
        title.setText(currentNews.getWebTitle());

        return listItemView;
    }
}
