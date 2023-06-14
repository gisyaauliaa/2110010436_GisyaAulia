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
public class kelas {
    private ArrayList <String> nama_kelas;
    private ArrayList <Integer> daya_tampung;
    
    public kelas (){
    nama_kelas = new ArrayList<String>();
    daya_tampung = new ArrayList<Integer>();
    }//constructor
    
    //METHOD SET GET nama_kelas
    public void insertNama_kelas(String isi){
    this.nama_kelas.add(isi);
    }
    
    public ArrayList <String> getNama_kelas(){
    return this.nama_kelas;
    }
    
    //METHOD SET GET daya_tampung
    public void insertDaya_tampung(int isi){
    this.daya_tampung.add(isi);
    }
    
    public ArrayList <Integer> getDaya_tampung(){
    return this.daya_tampung;
    }
}//end class kelas
