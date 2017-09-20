package com.example.heather.photoviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by heather on 20/09/2017.
 */

public class PhotoAlbumAdapter extends ArrayAdapter<Photo> {


    public PhotoAlbumAdapter(Context context, ArrayList<Photo> photos) {
        super(context, 0, photos);
    }




    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.photo_item, parent, false);
        }

        Photo currentPhoto = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentPhoto.getRanking().toString());

        TextView url = listItemView.findViewById(R.id.url);
        url.setText(currentPhoto.getUrl());

        listItemView.setTag(currentPhoto);

        return listItemView;

    }
}


















