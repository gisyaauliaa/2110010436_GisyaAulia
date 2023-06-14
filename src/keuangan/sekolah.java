/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class sekolah {
    private ArrayList <String> namaSekolah;
    private ArrayList <String> namaKepsek;
    private ArrayList <String> alamatSekolah;
    private ArrayList <Integer> kodePos;
    private ArrayList <Integer> telponSekolah;
    private ArrayList <Integer> faxSekolah;
    private ArrayList <String> emailSekolah;
    private ArrayList <String> websiteSekolah;
    
    public sekolah(){
        namaSekolah = new ArrayList<String>();
        namaKepsek = new ArrayList<String>();
        alamatSekolah = new ArrayList<String>();
        kodePos = new ArrayList<Integer>();
        telponSekolah = new ArrayList<Integer>();
        faxSekolah = new ArrayList<Integer>();
        emailSekolah = new ArrayList<String>();
        websiteSekolah = new ArrayList<String>();
    }//constructor
    
    //METHOD SET GET namaSekolah
    public void insertNamaSekolah(String isi){
    this.namaSekolah.add(isi);
    }
    
    public ArrayList <String> getNamaSekolah(){
    return this.namaSekolah;
    }
            
    //METHOD SET GET namaKepsek
    public void insertNamaKepsek(String isi){
    this.namaKepsek.add(isi);
    }
    
    public ArrayList <String> getNamaKepsek(){
    return this.namaKepsek;
    }
    
    //METHOD SET GET alamatSekolah
    public void insertAlamatSekolah(String isi){
    this.alamatSekolah.add(isi);
    }
    
    public ArrayList <String> getAlamatSekolah(){
    return this.alamatSekolah;
    }
    
    //METHOD SET GET kodePos
    public void insertKodePos(int isi){
    this.kodePos.add(isi);
    }
    
    public ArrayList <Integer> getKodePos(){
    return this.kodePos;
    }
    
    //METHOD SET GET telponSekolah
    public void insertTelponSekolah(int isi){
    this.telponSekolah.add(isi);
    }
    
    public ArrayList <Integer> getTelponSekolah(){
    return this.telponSekolah;
    }
    
    //METHOD SET GET faxSekolah
    public void insertFaxSekolah(int isi){
    this.faxSekolah.add(isi);
    }
    
    public ArrayList <Integer> getFaxSekolah(){
    return this.faxSekolah;
    }
    
    //METHOD SET GET emailSekolah
    public void insertEmailSekolah(String isi){
    this.emailSekolah.add(isi);
    }
    
    public ArrayList <String> getEmailSekolah(){
    return this.emailSekolah;
    }
    
    //METHOD SET GET websiteSekolah
    public void insertWebsite(String isi){
    this.websiteSekolah.add(isi);
    }
    
    public ArrayList <String> getWebsite(){
    return this.websiteSekolah;
    }
    
}//end class sekolah
