package com.company;

public class SudokuSolver {

    public static void main(String[] args) {
        Sudoku s = new Sudoku(GRID_TO_SOLVE);
        s.displaySudoku();

        if(s.solveSudoku())
        {
            s.displaySudoku();
        }
        else
        {
            System.out.println("Unsuccessful");
        }
    }

    public static Cell[][] GRID_TO_SOLVE = {
            {new Cell(0, 3, 1),  new Cell(0, 0, 1),  new Cell(0, 15, 2), new Cell(0, 0, 2),  new Cell(0, 0, 2),  new Cell(0, 22, 3), new Cell(0, 4, 4),  new Cell(0, 16, 5), new Cell(0, 15, 6)},
            {new Cell(0, 25, 7), new Cell(0, 0, 7),  new Cell(0, 17, 8), new Cell(0, 0, 8),  new Cell(0, 0, 3),  new Cell(0, 0, 3),  new Cell(0, 0, 4),  new Cell(0, 0, 5),  new Cell(0, 0, 6)},
            {new Cell(0, 0, 7),  new Cell(0, 0, 7),  new Cell(0, 9, 9),  new Cell(0, 0, 9),  new Cell(0, 0, 3),  new Cell(0, 8, 10), new Cell(0, 20, 11),new Cell(0, 0, 11), new Cell(0, 0, 6)},
            {new Cell(0, 6, 13), new Cell(0, 14, 14),new Cell(0, 0, 14), new Cell(0, 0, 9),  new Cell(0, 17, 17),new Cell(0, 0, 10), new Cell(0, 0, 11), new Cell(0, 17, 12),new Cell(0, 0, 6)},
            {new Cell(0, 0, 13), new Cell(0, 13, 15),new Cell(0, 0, 15), new Cell(0, 20, 16),new Cell(0, 0, 17), new Cell(0, 0, 10), new Cell(0, 0, 12), new Cell(0, 0, 12), new Cell(0, 12, 19)},
            {new Cell(0, 27, 20),new Cell(0, 0, 15), new Cell(0, 6, 21), new Cell(0, 0, 16), new Cell(0, 0, 17), new Cell(0, 20, 23),new Cell(0, 6, 18), new Cell(0, 0, 18), new Cell(0, 0, 19)},
            {new Cell(0, 0, 20), new Cell(0, 0, 21), new Cell(0, 0, 21), new Cell(0, 0, 16), new Cell(0, 10, 22),new Cell(0, 0, 23), new Cell(0, 0, 23), new Cell(0, 14, 24),new Cell(0, 0, 24)},
            {new Cell(0, 0, 20), new Cell(0, 8, 25), new Cell(0, 16, 26),new Cell(0, 0, 22), new Cell(0, 0, 22), new Cell(0, 15, 27),new Cell(0, 0, 27), new Cell(0, 0, 24), new Cell(0, 0, 24)},
            {new Cell(0, 0, 20), new Cell(0, 0, 25), new Cell(0, 0, 26), new Cell(0, 0, 22), new Cell(0, 13, 28),new Cell(0, 0, 28), new Cell(0, 0, 28), new Cell(0, 17, 29),new Cell(0, 0, 29)},
    };
}
