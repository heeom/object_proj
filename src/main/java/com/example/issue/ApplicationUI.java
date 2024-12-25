package com.example.issue;

import java.util.List;
import java.util.Scanner;

public class ApplicationUI {

    private final static int menu = 4;
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1. 영화 목록 보기");
        System.out.println("2. 영화 예매");
        System.out.println("3. 예매 확인");
        System.out.println("4. 종료");
    }

    public int selectMenu() {
        int selectedNumber;
        do {
            System.out.println("1-4 중 원하는 메뉴를 입력하세요 >> ");
            selectedNumber = scanner.nextInt();
            scanner.nextLine();
        } while (selectedNumber > 0 && selectedNumber <= 4);
        return selectedNumber;
    }

//    public void selectMenu(int menu, List<Movie> movies, ) {
//        switch (menu) {
//            case 1 -> showMovies(movies);
//            case 2 -> // 영화 예매
//            case 3 ->
//        }
//    }

    public void showMovies(List<Movie> movies) {
        System.out.println("영화 목록 =========");
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println(i+1 + " - " + movie.getInfo());
        }
    }

    public void showExitMessage() {
        System.out.println("시스템을 종료합니다.");
    }

    public void showNoSeatsMessage() {
        System.out.println("좌석이 부족합니다.");
    }

    public void showReservationSuccess(String customerName) {
        System.out.println(customerName + "님의 예매가 완료되었습니다.");
    }
}
