package com.example.lasalle_ddm1_ex2_tresenraya;

import android.widget.ImageView;

import java.util.ArrayList;

public class Board {
    private final ArrayList<Cell> tablero = new ArrayList<>();

    public Board(ImageView r1c1, ImageView r1c2, ImageView r1c3, ImageView r2c1, ImageView r2c2, ImageView r2c3,
                 ImageView r3c1, ImageView r3c2, ImageView r3c3) {
        tablero.add(new Cell(1, r1c1, 1, 1));
        tablero.add(new Cell(2, r1c2, 1, 2));
        tablero.add(new Cell(3, r1c3, 1, 3));
        tablero.add(new Cell(4, r2c1, 2, 1));
        tablero.add(new Cell(5, r2c2, 2, 2));
        tablero.add(new Cell(6, r2c3, 2, 3));
        tablero.add(new Cell(7, r3c1, 3, 1));
        tablero.add(new Cell(8, r3c2, 3, 2));
        tablero.add(new Cell(9, r3c3, 3, 3));
    }

    public Cell getCasillaById(int id) {
        return tablero.get(id-1);
    }

    private boolean checkRows(int player) {
        int row1 = 0, row2 = 0, row3 = 0;

        for (int i = 0; i < tablero.size(); i++) {
            Cell c = tablero.get(i);

            if (c.getRowNumber() == 1 && c.getPlayer() == player) {
                row1++;
            }
            if (c.getRowNumber() == 2 && c.getPlayer() == player) {
                row2++;
            }
            if (c.getRowNumber() == 3 && c.getPlayer() == player) {
                row3++;
            }
        }

        return row1 == 3 || row2 == 3 || row3 == 3;
    }

    private boolean checkColumns(int player) {
        int col1 = 0, col2 = 0, col3 = 0;

        for (int i = 0; i < tablero.size(); i++) {
            Cell c = tablero.get(i);

            if (c.getColumnNumber() == 1 && c.getPlayer() == player) {
                col1++;
            }
            if (c.getColumnNumber() == 2 && c.getPlayer() == player) {
                col2++;
            }
            if (c.getColumnNumber() == 3 && c.getPlayer() == player) {
                col3++;
            }
        }

        return col1 == 3 || col2 == 3 || col3 == 3;
    }

    private boolean checkDiagonal(int player) {
        int diag = 0;

        for (int i = 0; i < tablero.size(); i++) {
            Cell c = tablero.get(i);

            if (c.getRowNumber() == 1 && c.getColumnNumber() == 1 && c.getPlayer() == player) diag++;
            if (c.getRowNumber() == 2 && c.getColumnNumber() == 2 && c.getPlayer() == player) diag++;
            if (c.getRowNumber() == 3 && c.getColumnNumber() == 3 && c.getPlayer() == player) diag++;
        }

        return diag == 3;
    }

    private boolean checkAntiDiagonal(int player) {
        int antiDiag = 0;

        for (int i = 0; i < tablero.size(); i++) {
            Cell c = tablero.get(i);

            if (c.getRowNumber() == 1 && c.getColumnNumber() == 3 && c.getPlayer() == player) antiDiag++;
            if (c.getRowNumber() == 2 && c.getColumnNumber() == 2 && c.getPlayer() == player) antiDiag++;
            if (c.getRowNumber() == 3 && c.getColumnNumber() == 1 && c.getPlayer() == player) antiDiag++;
        }

        return antiDiag == 3;
    }

    public boolean checkGameWon(int p) {
        return checkRows(p) || checkColumns(p) || checkDiagonal(p) || checkAntiDiagonal(p);
    }
}
