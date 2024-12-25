package com.example.issue;

public class Movie {
    private String title;
    private int availableSeats;

    Movie(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getInfo() {
        return title + " (잔여 좌석: " + availableSeats + ")";
    }

    public boolean hasAvailableSeat() {
        return availableSeats > 0;
    }

    public void reserveAvailableSeats() {
        if (this.hasAvailableSeat()) {
            throw new IllegalStateException("좌석 부족");
        }
        availableSeats--;
    }
}
