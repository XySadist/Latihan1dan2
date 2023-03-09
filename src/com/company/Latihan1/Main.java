package com.company.Latihan1;


public class Main {

    public static void main(String[] args) {
        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");

        System.out.println("Jumlah Kota Di Jawa Timur : " + jumlahkota.getElement() +" kota");
        System.out.println( "Salah Satu Kota Di Jawa Timur : Kota " + namakota.getElement());



    }
}
