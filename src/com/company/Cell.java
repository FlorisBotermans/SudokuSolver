package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cell {
    private int number;
    private int cageNumber;
    private int cageIndex;
    private List<Integer> possibleNumbers;

    public Cell(int number, int cageNumber, int cageIndex) {
        this.number = number;
        this.cageNumber = cageNumber;
        this.cageIndex = cageIndex;
        possibleNumbers = new ArrayList<>();
        possibleNumbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
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

    public List<Integer> getPossibleNumbers() {
        return possibleNumbers;
    }

    public void addPossibleNumber(int number) {
        possibleNumbers.add(number);
    }

    public void deletePossibleNumber(int number) {
        possibleNumbers.removeIf(s -> s.equals(number));
    }
}
