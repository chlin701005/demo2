package com.uuu.demo.demo2;

public class SubCalculator implements Calculator{
    @Override
    public int calc(int a, int b) {
        return a - b;
    }
}