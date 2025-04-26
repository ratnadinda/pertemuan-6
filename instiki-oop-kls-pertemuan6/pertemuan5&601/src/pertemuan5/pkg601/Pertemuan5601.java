/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.pkg601;

/**
 *
 * @author INSTIKI
 * TGL :26-04-2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application log here
        manusia johan = new manusia("L");
        johan.warnakulit="brown";
        johan.SetWarnaRambut("hitam");
        
        manusia yani = new manusia ("P");
        yani.warnakulit="white";
        yani.SetWarnaRambut("Pink");
        
        
    }    
}

class manusia{
    public String warnakulit="";
    private String warnarambut="";
    private String jeniskelamin="";
    
    
    public manusia(String jkel){
        this.jeniskelamin = jkel;    
    }
    
    
    public void SetWarnaRambut(String warna){
        //menambahkan kode identitas
        this.warnarambut = warna;
    }
}

