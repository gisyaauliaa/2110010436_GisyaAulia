/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;
import java.util.ArrayList;

/**
 *
 * @author Cahyono
 */
public class biaya {
    private ArrayList <String> nama_biaya;
    private ArrayList <Integer> nominal_biaya;
    private ArrayList <String> keterangan_biaya;
    private ArrayList <String> tanggal_biaya;
    
    public biaya(){
        nama_biaya = new ArrayList<String>();
        nominal_biaya = new ArrayList<Integer>();
        keterangan_biaya = new ArrayList<String>();
        tanggal_biaya = new ArrayList<String>();
    } //constructor
    
    //METHOD SET GET nama_biaya
    public void insertNama_biaya(String isi){
    this.nama_biaya.add(isi);
    }
    
    public ArrayList <String> getNama_biaya(){
    return this.nama_biaya;
    }
    
    //METHOD SET GET nominal_biaya
    public void insertNominal_biaya(int isi){
    this.nominal_biaya.add(isi);
    }
    
    public ArrayList <Integer> getNominal_biaya(){
    return this.nominal_biaya;
    }
    
    //METHOD SET GET keterangan_biaya
    public void insertKeterangan_biaya(String isi){
    this.keterangan_biaya.add(isi);
    }
    
    public ArrayList <String> getKeterangan_biaya(){
    return this.keterangan_biaya;
    }
    
    //METHOD SET GET tanggal_biaya
    public void insertTanggal_biaya(String isi){
    this.tanggal_biaya.add(isi);
    }
    
    public ArrayList <String> getTanggal_biaya(){
    return this.tanggal_biaya;
    }
}// end class biaya
