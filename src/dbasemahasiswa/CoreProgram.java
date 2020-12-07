/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbasemahasiswa;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alfarkhan._
 */
public class CoreProgram {
    ArrayList<Base> Data = new ArrayList<Base>();
    Scanner input = new Scanner(System.in);
    
    void menu(){
        System.out.println("\n---------------[Main Menu]--------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("0. Exit");
//        System.out.println("----------------------------------------");
        System.out.print("   > Pilih : ");
    }
    
    int choice(){
        menu();
        int p = input.nextInt();
        input.nextLine();
        return p;
    }
    
    void addData() throws ParseException{
        String a,b,c;
        char k;
        int d;
        int i = 1;
        
        do{
            System.out.printf("-------------[Data Ke : %d]-------------\n",i);
            System.out.print("NIM                        : ");
                a = input.nextLine();
            System.out.print("Nama                       : ");
                b = input.nextLine();
            System.out.print("Tanggal Lahir (dd-mm-yyyy) : ");
                c = input.nextLine();
            System.out.print("Gender (0:LK,1:PR)         : ");
                d = input.nextInt();
            this.Data.add(new Base(a,b,c,d));
            
            System.out.print("input lagi?(y/n) > ");
            k = input.next().charAt(0);
            input.nextLine();
            i+=1;
        }while(k!='n');
    }
    
    void hapusData(){
        if(this.Data.size() <= 0){
            System.out.println("Tidak Ada Data ");
        }
        else {
            System.out.print("  > NIM : ");
            String x = input.nextLine();
            this.Data.removeIf(item -> item.nim.equals(x));
            System.out.printf("Hapus Data dengan NIM : %s Sukses\n",x);
        }
    }
    
    void findData(){
        System.out.println("1. Memakai NIM");
        System.out.println("2. Memakai Gender");
        System.out.print("   > Pilih : ");
        int i = input.nextInt();
        input.nextLine();
        if(i == 1){
            System.out.print("      NIM : ");
            String x = input.nextLine();
            this.Data.stream().filter((data) -> (data.nim == null ? x == null : data.nim.equals(x))).forEachOrdered((data) -> {
                data.sout();
            });
        } else if (i == 2){
            System.out.print("      Gender (0:Laki-Laki, 1:Perempuan) : ");
            int x = input.nextInt();
            this.Data.stream().filter((data) -> (data.gender == x)).forEachOrdered((data) -> {
                data.sout();
            });
        }

    }
    
    void allData(){
        if(this.Data.size() <= 0){
            System.out.println("Belum ada data yang terinput");
        }
        else {
            this.Data.forEach((i) -> {
            i.sout();
            });
        }
        
    }
    
}
