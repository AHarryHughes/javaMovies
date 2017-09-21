package com.aharryhughes.movies.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    public String title;
    public String poster_path;
    public String overview;
    public double popularity;

}
