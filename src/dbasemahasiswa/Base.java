/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbasemahasiswa;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat; 
/**
 *
 * @author alfarkhan._
 */
public class Base {
    String nim,nama;
    Date tglLahir;
    int gender;
    
    Base(String a, String b, String c, int d) throws ParseException{
        this.nim = a;
        this.nama = b;
        this.tglLahir = new SimpleDateFormat("dd-MM-yyyy").parse(c);
        this.gender = d;
    }
    
    void sout(){
        String genders = (this.gender==1)?"Perempuan":"Laki-Laki";
        System.out.println("\n------------[Data Mahasiswa]------------");
        System.out.println("NIM           : "+nim);
        System.out.println("Nama          : "+nama);
        System.out.println("Tanggal Lahir : "+tglLahir);
        System.out.println("Gender        : "+genders);
        System.out.println("----------------------------------------");

    }
}
