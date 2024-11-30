package com.example.screen;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Screening {
    private final Movie movie;
    private final int sequence;
    private final LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public LocalTime getStartTime() {
        return whenScreened.toLocalTime();
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }


}
