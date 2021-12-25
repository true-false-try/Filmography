package com.project.filmography.model;

public class Film {
    private static int id;
    private String title;
    private Integer year;
    private String genre;
    private boolean watched;

    public static Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Film.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public Film() {

    }

    public Film(String title, Integer year, String genre, boolean watched) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.watched = watched;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", watched=" + watched +
                '}' + "\n";
    }


}
