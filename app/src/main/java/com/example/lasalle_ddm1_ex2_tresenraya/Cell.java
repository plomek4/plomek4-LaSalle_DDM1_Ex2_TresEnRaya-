package com.example.lasalle_ddm1_ex2_tresenraya;

import android.widget.ImageView;

public class Cell {
    private int id;
    private boolean isEmpty;
    private int player;
    private ImageView imageView;
    private int rowNumber;
    private int columnNumber;


    public Cell(int id, ImageView imageView, int rowNumber, int colNumber) {
        this.id = id;
        this.isEmpty = true;
        this.player = 0;
        this.imageView = imageView;
        this.rowNumber = rowNumber;
        this.columnNumber = colNumber;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getPlayer() {
        return player;
    }

    public ImageView getImage() {
        return imageView;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void fill() {
        isEmpty = false;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
