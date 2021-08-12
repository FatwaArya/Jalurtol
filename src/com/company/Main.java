package com.company;

import java.util.Scanner;

public class Main {
    static int golongan[] = {1,2,3};
    static String asal [] = {"Waru","Sidoarjo","Porong"};
    static String tujuan[] = {"Waru","Sidoarjo","Porong"};

    static void Biaya(int golonganKendraan, String asalKota, String tujuanKota){

        int index = golonganKendraan-1;
        golonganKendraan = golongan[index];
        asalKota = asal[index];

        switch (asalKota){
            case "Waru" :
                if (golonganKendraan == 1 &&tujuanKota == tujuan[1]){
                    System.out.println("Dikenakan tarif Rp. 6.000 ");
                }else if (golonganKendraan == 1&& tujuanKota == tujuan[2] ){
                    System.out.println("Dikenakan tarif Rp. 9.000 ");
                }else if((golonganKendraan == 2|| golonganKendraan == 3) && tujuanKota == tujuan[1] ){
                    System.out.println("Dikenakan tarif Rp. 14.000 ");
                }else if ((golonganKendraan == 2|| golonganKendraan == 3) && tujuanKota == tujuan[2] ){
                    System.out.println("Dikenakan tarif Rp. 14.000 ");
                }
                break;
            case "Sidoarjo" :
                if (golonganKendraan == 1 &&tujuanKota == tujuan[0]){
                    System.out.println("Dikenakan tarif Rp. 6.000 ");
                }else if (golonganKendraan == 1 && tujuanKota == tujuan[2] ){
                    System.out.println("Dikenakan tarif Rp. 5.500 ");
                }else if((golonganKendraan == 2|| golonganKendraan == 3) && tujuanKota == tujuan[0] ){
                    System.out.println("Dikenakan tarif Rp. 8.500 ");
                }else if ((golonganKendraan == 2|| golonganKendraan == 3) && tujuanKota == tujuan[2] ){
                    System.out.println("Dikenakan tarif Rp. 8.500 ");
                }
                break;
            case "Porong" :
                if (golonganKendraan == 1 &&tujuanKota == tujuan[1]){
                    System.out.println("Dikenakan tarif Rp. 5.500 ");
                }else if (golonganKendraan == 1 && tujuanKota == tujuan[0] ){
                    System.out.println("Dikenakan tarif Rp. 9.000 ");
                }else if((golonganKendraan == 2|| golonganKendraan == 3) && tujuanKota == tujuan[1] ){
                    System.out.println("Dikenakan tarif Rp. 8.500 ");
                }else if ((golonganKendraan == 2|| golonganKendraan == 3) && tujuanKota == tujuan[0] ){
                    System.out.println("Dikenakan tarif Rp. 14.000 ");
                }
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int golonganKendaraan = input.nextInt();
        String asal = input.next();

        String  tujuanKota = input.next();

        Biaya(1,"Waru","Porong");
    }}

