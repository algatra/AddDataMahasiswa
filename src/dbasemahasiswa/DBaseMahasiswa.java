/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbasemahasiswa;

import java.text.ParseException;

/**
 *
 * @author alfarkhan._
 */
public class DBaseMahasiswa {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        CoreProgram al = new CoreProgram();
        int i = 1;
        while(true){
            int pilih = al.choice();
            System.out.println("----------------------------------------");
            switch(pilih){
                case 1:
                    al.addData();
                    break;
                case 2:
                    al.hapusData();
                    break;
                case 3:
                    al.findData();
                    break;
                case 4:
                    al.allData();
                    break;
                case 0:
                    break;
                default:
                    pilih = 0;
            }
            if (pilih == 0) {
                System.out.println("-------------[Terima Kasih]-------------");
                break;
            }
        }
        
    }
    
}
