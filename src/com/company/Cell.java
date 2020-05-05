package com.company;

public class Cell {
    private int number;
    private int cageNumber;

    public Cell(int number, int cageNumber) {
        this.number = number;
        this.cageNumber = cageNumber;
    }

    public int getNumber() {
        return number;
    }

    public int getCage() {
        return cageNumber;
    }
}
