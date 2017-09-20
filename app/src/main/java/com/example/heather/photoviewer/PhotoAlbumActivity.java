package com.example.heather.photoviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class PhotoAlbumActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_album);

        PhotoAlbum photoAlbum = new PhotoAlbum();
        ArrayList<Photo> album = photoAlbum.getAlbum();

        PhotoAlbumAdapter photoAdapter = new PhotoAlbumAdapter(this, album);

        ListView listView = (ListView) findViewById(R.id.album);
        listView.setAdapter(photoAdapter);

    }

    public void getPhoto(View listItem) {
        Photo photo = (Photo) listItem.getTag();
        Log.d("Photo: " , photo.getUrl());
    }

}



//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.mylist, R.id.Itemname,itemname));
//    }
