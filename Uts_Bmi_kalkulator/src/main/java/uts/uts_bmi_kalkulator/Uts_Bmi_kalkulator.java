package uts.uts_bmi_kalkulator;
//Naufal luthfianto
//nim 22083000015
//kelas 1 A
import java.util.Scanner;
public class Uts_Bmi_kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner go = new Scanner(System.in);
        int jenis_kelamin, hasil;
        float berat, tinggi, bmi, meter;
        double broca;
        
        System.out.println("hallo selamat datang di kalkulator berat badan");
        System.out.println("Pilih Jenis Kelamin Anda Di Bawah Ini: ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("-------------------------------------------");
 
        System.out.println("Masukan Jenis Kelamin: ");
        jenis_kelamin = go.nextInt();
        System.out.println("Masukan Berat Badan: ");
        berat = go.nextFloat();
        System.out.println("Masukan Tinggi Badan: ");
        tinggi = go.nextFloat();
        meter = tinggi / 100;
 
        bmi = (berat/(meter * meter));
 
   
        System.out.print("BMI: " + bmi + " ");
 
        if (bmi < 20){
            System.out.println("yang mendandakan anda Kurus");
        } else if (bmi <= 24){
            System.out.println("yang menandakan anda Normal");
        } else if (bmi < 26){
            System.out.println("yang menandakan anda kelebihan berat");
        } else {
            System.out.println("udah fix kamu Obesitas");
        }
 
        switch (jenis_kelamin)
        //rumus saya ambil contoh dari web
        {
            case 1 : broca = ((tinggi-100)-(0.10 * (tinggi-100))); break;
            case 2 : broca = ((tinggi-100)-(0.15 * (tinggi-100))); break;
            default : broca = 0;
        }
 
        hasil = (int) broca;
        System.out.println("Berat Badan anda yang seharusnya adalah " + hasil + " Kilogram");
    }
}