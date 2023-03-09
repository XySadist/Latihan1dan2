package com.company.Latihan2;

import com.company.Latihan2.Hidangan;

public class Minuman extends Hidangan {
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " diminum";
    }
}

