package com.tw.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Movies {
    private final String fileName;
    private final ArrayList<Movie> movieDetails;

    public Movies(String fileName) {
        this.fileName = fileName;
        this.movieDetails = extractMoviesDetails();
    }

    public String[] extract(int field) {
        String[] fieldData = new String[movieDetails.size()];

        for (int i = 0; i < movieDetails.size(); i++) {
//            fieldData[i] =
//            fieldData[i] = movieDetails.get(i)[field];
        }

        return fieldData;
    }

    private ArrayList<Movie> extractMoviesDetails() {
        ArrayList<Movie> arr = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] abc = line.split(",");
                Movie m = new Movie(abc[0], Integer.valueOf(abc[1]), abc[2], abc[3], abc[4]);
                arr.add(m);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arr;
    }

    public void display(String[] field) {
        System.out.printf("\nField : %s \n", field[0]);

        for (int i = 1; i < field.length; i++) {
            System.out.println(field[i]);
        }
    }
}
