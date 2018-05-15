/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author nguye
 */
public class Xe {
    private String Soxe;
    private boolean TinhTrang;
    private String MaLoai;
    
    public String getsoxe(){
        return Soxe;
    }
    
    public boolean gettinhtrang(){
        return TinhTrang;
    }
    
    public String getmaloai(){
        return MaLoai;
    }
    
    public void setsoxe(String soxe){
        this.Soxe = soxe;
    }
    
    public void settinhtrang(boolean status){
        this.TinhTrang = status;
    }
    
    public void setmaloai(String maloai){
        this.MaLoai = maloai;
    }
}
