package com.example.ivany.moviemanager.models;

public class Movie {

    String id;
    String title;
    String overview;
    float voteAveragae;
    float voteCount;
    String posterPath;
    String backdropPath;

    public Movie(String id, String title, String overview, float voteAveragae, float voteCount, String posterPath, String backdropPath) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.voteAveragae = voteAveragae;
        this.voteCount = voteCount;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getVoteAveragae() {
        return voteAveragae;
    }

    public void setVoteAveragae(float voteAveragae) {
        this.voteAveragae = voteAveragae;
    }

    public float getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(float voteCount) {
        this.voteCount = voteCount;
    }

    public String getPosterPath() {
        return "https://image.tmdb.org/t/p/w342"+posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }



}
