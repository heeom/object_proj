package com.example.capsulation;

public class Rectangle {

    private int left;
    private int right;
    private int top;
    private int bottom;

    public Rectangle(int left, int right, int top, int bottom) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }

    public void enlarge(int multiple) {
        this.right *= multiple;
        this.left *= multiple;
    }
}
