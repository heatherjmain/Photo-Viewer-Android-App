package com.example.heather.photoviewer;

import java.util.ArrayList;

/**
 * Created by heather on 20/09/2017.
 */

public class PhotoAlbum {

    private ArrayList<Photo> album;

    public PhotoAlbum() {
        album = new ArrayList<Photo>();

    album.add(new Photo(1, R.drawable.sunset));
    album.add(new Photo(2, R.drawable.lighthouse));
    album.add(new Photo(3, R.drawable.harbour));
    }

    public ArrayList<Photo> getAlbum() {
        return new ArrayList<Photo>(album);
    }
}
