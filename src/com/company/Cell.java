package com.company;

public class Cell {
    private int number;
    private int cageNumber;
    private int cageIndex;

    public Cell(int number, int cageNumber, int cageIndex) {
        this.number = number;
        this.cageNumber = cageNumber;
        this.cageIndex = cageIndex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCageNumber() {
        return cageNumber;
    }

    public int getCageIndex() {
        return cageIndex;
    }


}
