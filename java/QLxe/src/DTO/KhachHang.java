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
public class KhachHang {
    private String MaKH;
    private String HotenKH;
    private String DiaChi;
    private String SDT;
    

    
    public String getHotenKH(){
        return HotenKH;
    }
    
    public String getDiaChi(){
        return DiaChi;
    }
    
    public String getSDT(){
        return SDT;
    }
    
    public void setMa(String maKH){
        this.MaKH = maKH;
    }
    
    public void setHoten(String hoten){
        this.HotenKH = hoten;
    }
    
    public void setDiaChi(String diachi){
        this.DiaChi = diachi;
    }
    
    public void setSDT(String sdt){
        this.SDT = sdt;
    }

    /**
     * @return the MaKH
     */
    public String getMaKH() {
        return MaKH;
    }
}
    
