package com.company;

import java.util.ArrayList;

public class Items {

    private String itemName;
    private String itemID;
    private int stockLv;
    private double price;
    private String unit;

    public Items(String itemName, String itemID, int stockLv, String unit, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.stockLv = stockLv;
        this.unit = unit;
        this.price = price;
    }

    public Items() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public int getStockLv() {
        return stockLv;
    }

    public void setStockLv(int stockLv) {
        this.stockLv = stockLv;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
