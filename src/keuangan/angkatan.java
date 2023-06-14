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
public class angkatan {
    private ArrayList <Integer> tahun_angkatan;
    private ArrayList <String> status;
    
    public angkatan (){
        tahun_angkatan = new ArrayList<Integer>();
        status = new ArrayList<String>();
    } //constructor 
    
    //METHOD SET tahun_angkatan
    public void insertTahun_angkatan(int isi){
    this.tahun_angkatan.add(isi);
    }
    
    //METHOD GET tahun_angkatan
    public ArrayList <Integer> getTahun_angkatan(){
    return this.tahun_angkatan;
    }
    
    //METHOD SET status
    public void insertStatus(String isi){
    this.status.add(isi);
    }
    
    //METHOD GET status
    public ArrayList <String> getStatus(){
    return this.status;
    }
} //end class angkatan
