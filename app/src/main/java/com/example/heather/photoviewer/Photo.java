package com.example.heather.photoviewer;

/**
 * Created by heather on 20/09/2017.
 */

public class Photo {
    private int ranking;
    private int url;

    public Photo(int ranking, int url) {
        this.ranking = ranking;
        this.url = url;
    }

    public Integer getRanking() {
        return ranking;
    }

    public int getUrl() {
        return url;
    }

}
