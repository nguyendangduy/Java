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
public class LoaiXe {
    private String MaLoai;
    private String TenLoai;
    private float Dongia;
    
    public String getmaloai(){
        return MaLoai;
    }
    
    public String gettenloai(){
        return TenLoai;
    }
    
    public float getdongia(){
        return Dongia;
    }
    
    public void setmaloai(String maloai){
        this.MaLoai = maloai;
    }
    
    public void settenloai(String tenloai){
        this.TenLoai = tenloai;
    }
    
    public void setdongia(float dongia){
        this.Dongia = dongia;
    }
}
