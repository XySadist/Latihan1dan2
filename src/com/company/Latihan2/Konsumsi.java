package com.company.Latihan2;

public class Konsumsi<M, I> {
    private M m;
    private I i;

    public M getM() {
        return m;
    }

    public I getI() {
        return i;
    }

    public void setKonsumsi(M makan, I minum) {
        this.m = makan;
        this.i = minum;
    }
}


