package com.amy.classwork.sd;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class StudentsUnion {
    private double capsPrice = 5.00;
    private double shirtsPrice = 10.00;
    private double hoodiesPrice = 20.00;

    private int capsNum;
    private int shitsNum;
    private int hoodiesNum;

    public StudentsUnion() {
    }

    public double calculate() {
        return capsPrice * capsNum + shirtsPrice * shitsNum + hoodiesPrice * hoodiesNum;
    }

    public StudentsUnion(double capsPrice, double shirtsPrice, int capsNum, double hoodiesPrice, int shitsNum, int hoodiesNum) {
        this.capsPrice = capsPrice;
        this.shirtsPrice = shirtsPrice;
        this.capsNum = capsNum;
        this.hoodiesPrice = hoodiesPrice;
        this.shitsNum = shitsNum;
        this.hoodiesNum = hoodiesNum;
    }

    public double getCapsPrice() {
        return capsPrice;
    }

    public void setCapsPrice(double capsPrice) {
        this.capsPrice = capsPrice;
    }

    public double getShirtsPrice() {
        return shirtsPrice;
    }

    public void setShirtsPrice(double shirtsPrice) {
        this.shirtsPrice = shirtsPrice;
    }

    public double getHoodiesPrice() {
        return hoodiesPrice;
    }

    public void setHoodiesPrice(double hoodiesPrice) {
        this.hoodiesPrice = hoodiesPrice;
    }

    public int getCapsNum() {
        return capsNum;
    }

    public void setCapsNum(int capsNum) {
        this.capsNum = capsNum;
    }

    public int getShitsNum() {
        return shitsNum;
    }

    public void setShitsNum(int shitsNum) {
        this.shitsNum = shitsNum;
    }

    public int getHoodiesNum() {
        return hoodiesNum;
    }

    public void setHoodiesNum(int hoodiesNum) {
        this.hoodiesNum = hoodiesNum;
    }

    @Override
    public String toString() {
        return "StudentsUnion{" +
                "capsPrice=" + capsPrice +
                ", shirtsPrice=" + shirtsPrice +
                ", hoodiesPrice=" + hoodiesPrice +
                ", capsNum=" + capsNum +
                ", shitsNum=" + shitsNum +
                ", hoodiesNum=" + hoodiesNum +
                '}';
    }
}
