package com.solid.lsp;

public class Square extends Shape {

    Square(int side) {
        this.setSide(side);
    }

    @Override
    public void setWidth(int width) {
        this.setSide(width);
    }

    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
