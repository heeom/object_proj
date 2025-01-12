//package com.example.issue;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class MovieReservationSystem {
//
//    private ApplicationUI applicationUI;
//
//    static List<Movie> movies = new ArrayList<>();
//    static List<Reservation> reservations = new ArrayList<>();
//
//    public void run() {
//        applicationUI.showMenu();
//        applicationUI.selectMenu();
//    }
//
//    public static void main(String[] args) {
//        movies.add(new Movie("Avengers", 5));
//        movies.add(new Movie("Inception", 3));
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (true) {
//            System.out.println("1. 영화 목록 보기");
//            System.out.println("2. 영화 예매");
//            System.out.println("3. 예매 확인");
//            System.out.println("4. 종료");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            if (choice == 1) {
//                listMovies();
//            } else if (choice == 2) {
//                reserveMovie(scanner);
//            } else if (choice == 3) {
//                listReservations();
//            } else if (choice == 4) {
//                System.out.println("시스템을 종료합니다.");
//                break;
//            }
//        }
//    }
//
//    static void listMovies() {
//        System.out.println("영화 목록:");
//        for (int i = 0; i < movies.size(); i++) {
//            Movie movie = movies.get(i);
//            System.out.println(i + 1 + ". " + movie.title + " (잔여 좌석: " + movie.availableSeats + ")");
//        }
//    }
//
//    static void reserveMovie(Scanner scanner) {
//        listMovies();
//        System.out.print("예매할 영화 번호를 선택하세요: ");
//        int movieIndex = scanner.nextInt() - 1;
//        scanner.nextLine(); // Consume newline
//
//        if (movieIndex < 0 || movieIndex >= movies.size()) {
//            System.out.println("잘못된 영화 번호입니다.");
//            return;
//        }
//
//        Movie selectedMovie = movies.get(movieIndex);
//
//        if (selectedMovie.availableSeats <= 0) {
//            System.out.println("좌석이 부족합니다.");
//            return;
//        }
//
//        System.out.print("예약자 이름을 입력하세요: ");
//        String customerName = scanner.nextLine();
//
//        selectedMovie.availableSeats--;
//        reservations.add(new Reservation(selectedMovie, customerName));
//        System.out.println(customerName + "님의 예매가 완료되었습니다.");
//    }
//
//    static void listReservations() {
//        System.out.println("예매 목록:");
//        for (Reservation reservation : reservations) {
//            System.out.println("영화: " + reservation.movie.title + ", 예약자: " + reservation.customerName);
//        }
//    }
//}
