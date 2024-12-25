package com.example.issue;

public class Reservation {
    private Movie movie;
    private String customerName;

    Reservation(Movie movie, String customerName) {
        this.movie = movie;
        this.customerName = customerName;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getInfo() {
        return "영화: " + movie.getTitle() + ", 예약자: " + customerName;
    }
}
