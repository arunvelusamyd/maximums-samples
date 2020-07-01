package com.flexy.service;

import com.flexy.model.Movie;
import com.flexy.model.OttPlatform;
import com.flexy.model.WebSeries;
import org.springframework.stereotype.Component;

@Component
public class OttServiceImpl implements IOttService {

    @Override
    public OttPlatform getOttPlatform(String applicationName) {
        OttPlatform ottPlatform = new OttPlatform();
        ottPlatform.setApplicationName("Netflix");
        ottPlatform.setAppVersion("10.1");
        ottPlatform.setOwnedBy("Netflix, Inc.");
        ottPlatform.setNewMovie(getNewMovie());
        ottPlatform.setNewSeries(getNewSeries());
        return ottPlatform;
    }

    private Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setMovieName("Petta");
        movie.setDirector("Karthik");
        movie.setLeadActor("Superstart Rajinikanth");
        movie.setLeadActress("Simran");
        movie.setProducedBy("Sun pictures");
        movie.setReleaseDate("10 Jan 2019");
        return movie;
    }

    private WebSeries getNewSeries() {
        WebSeries webSeries = new WebSeries();
        webSeries.setSeriesName("Break Bad");
        webSeries.setDirector("Vince Gilligan");
        webSeries.setLeadActor("Bryan Cranston");
        webSeries.setLeadActress("Anna Gunn");
        webSeries.setProducedBy("Vince Gilligan");
        webSeries.setSessionNo("Session 6");
        webSeries.setEpisodeNo("Episode 1");
        return webSeries;
    }

}
