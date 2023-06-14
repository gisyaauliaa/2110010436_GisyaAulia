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
public class pembayaran {
    private ArrayList <String> tanggal_pembayaran;
    private ArrayList <String> keterangan_pembayaran;
    private ArrayList <String> jatuh_tempo;
    private ArrayList <String> bulan_spp;
    private ArrayList <Integer> denda;
    
    public pembayaran(){
        tanggal_pembayaran = new ArrayList<String>();
        keterangan_pembayaran = new ArrayList<String>();
        jatuh_tempo = new ArrayList<String>();
        bulan_spp = new ArrayList<String>();
        denda = new ArrayList<Integer>();
    }//constructor
    
    //METHOD SET GET tanggal_pembayaran
    public void insertTanggal_pembayaran(String isi){
    this.tanggal_pembayaran.add(isi);
    }
    
    public ArrayList <String> getTanggal_pembayaran(){
    return this.tanggal_pembayaran;
    }
    
    //METHOD SET GET keterangan_pembayaran
    public void insertKeterangan_pembayaran(String isi){
    this.keterangan_pembayaran.add(isi);
    }
    
    public ArrayList <String> getKeterangan_pembayaran(){
    return this.keterangan_pembayaran;
    }
    
    //METHOD SET GET jatuh_tempo
    public void insertJatuh_tempo(String isi){
    this.jatuh_tempo.add(isi);
    }
    
    public ArrayList <String> getJatuh_tempo(){
    return this.jatuh_tempo;
    }
    
    //METHOD SET GET bulan_spp
    public void insertBulan_spp(String isi){
    this.bulan_spp.add(isi);
    }
    
    public ArrayList <String> getBulan_spp(){
    return this.bulan_spp;
    }
    
    //METHOD SET GET denda
    public void insertDenda(int isi){
    this.denda.add(isi);
    }
    
    public ArrayList <Integer> getDenda(){
    return this.denda;
    }
}
