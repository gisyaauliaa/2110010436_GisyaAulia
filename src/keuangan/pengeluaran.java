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
public class pengeluaran {
    private ArrayList <Integer> nominal_biaya;
    private ArrayList <String> keterangan_biaya;
    private ArrayList <String> tanggal_pembayaran;
    private ArrayList <String> jatuh_tempo;
    
    public pengeluaran(){
        nominal_biaya = new ArrayList<Integer>();
        keterangan_biaya = new ArrayList<String>();
        tanggal_pembayaran = new ArrayList<String>();
        jatuh_tempo = new ArrayList<String>();
    }//constructor
    
    //METHOD SET GET nominal_biaya
    public void insertNominal_biaya (int isi){
    this.nominal_biaya.add(isi);
    }
    
    public ArrayList <Integer> getNominal_biaya(){
    return this.nominal_biaya;
    }
    
    //METHOD SET GET keterangan_biaya
    public void insertKeterangan_biaya (String isi){
    this.keterangan_biaya.add(isi);
    }
    
    public ArrayList <String> getKeterangan_biaya(){
    return this.keterangan_biaya;
    }
    
    //METHOD SET GET tanggal_pembayaran
    public void insertTanggal_pembayaran (String isi){
    this.tanggal_pembayaran.add(isi);
    }
    
    public ArrayList <String> getTanggal_pembayaran(){
    return this.tanggal_pembayaran;
    }
    
    //METHOD SET GET jatuh_tempo
    public void insertJatuh_tempo (String isi){
    this.jatuh_tempo.add(isi);
    }
    
    public ArrayList <String> getJatuh_tempo(){
    return this.jatuh_tempo;
    }
}// end class pengeluaran
