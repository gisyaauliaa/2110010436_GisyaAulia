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
public class siswa {
    private ArrayList <Integer> nis;
    private ArrayList <String> nama;
    private ArrayList <String> alamat;
    private ArrayList <String> tempat_lahir;
    private ArrayList <String> tanggal_lahir;
    private ArrayList <String> jenis_kelamin;
    private ArrayList <Integer> umur;
    private ArrayList <String> agama;
    
    public siswa(){
        nis = new ArrayList<Integer>();
        nama = new ArrayList<String>();
        alamat = new ArrayList<String>();
        tempat_lahir = new ArrayList<String>();
        tanggal_lahir = new ArrayList<String>();
        jenis_kelamin = new ArrayList<String>();
        umur = new ArrayList<Integer>();
        agama = new ArrayList<String>();
    }//constructor
    
    //METHOD SET GET nis
    public void insertNis(int isi){
    this.nis.add(isi);
    }
    
    public ArrayList <Integer> getNis(){
    return this.nis;
    }
    
    //METHOD SET GET nama
    public void insertNama(String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getNama(){
    return this.nama;
    }
    
    //METHOD SET GET alamat
    public void insertAlamat(String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getAlamat(){
    return this.alamat;
    }
    
    //METHOD SET GET tempat_lahir
    public void insertTempat_lahir(String isi){
    this.tempat_lahir.add(isi);
    }
    
    public ArrayList <String> getTempat_lahir(){
    return this.tempat_lahir;
    }
    
    //METHOD SET GET tanggal_lahir
    public void insertTanggal_lahir(String isi){
    this.tanggal_lahir.add(isi);
    }
    
    public ArrayList <String> getTanggal_lahir(){
    return this.tanggal_lahir;
    }
    
    //METHOD SET GET jenis_kelamin
    public void insertJenis_kelamin(String isi){
    this.jenis_kelamin.add(isi);
    }
    
    public ArrayList <String> getJenis_kelamin(){
    return this.jenis_kelamin;
    }
    
    //METHOD SET GET umur
    public void insertUmur(int isi){
    this.umur.add(isi);
    }
    
    public ArrayList <Integer> getUmur(){
    return this.umur;
    }
    
    //METHOD SET GET agama
    public void insertAgama(String isi){
    this.agama.add(isi);
    }
    
    public ArrayList <String> getAgama(){
    return this.agama;
    }
}// end class siswa
