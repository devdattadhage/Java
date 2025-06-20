package com.tw.java;

public class SrkMovies {
    private static final int TITLE = 0;
    private static final int YEAR = 1;
    private static final int CREDITED_AS = 2;
    private static final int ROLE = 3;

    public static void main(String[] args) {
        Movies srkMovies = new Movies("./data/srkMovies.csv");
        Movie movie = new Movie();

        String[] titles = srkMovies.extract(TITLE);
        String[] years = srkMovies.extract(YEAR);
        String[] creditedAs = srkMovies.extract(CREDITED_AS);
        String[] roles = srkMovies.extract(ROLE);

        srkMovies.display(titles);
        srkMovies.display(years);
        srkMovies.display(creditedAs);
        srkMovies.display(roles);
    }
}
