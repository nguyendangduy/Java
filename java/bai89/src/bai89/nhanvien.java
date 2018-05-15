/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai89;

/**
 *
 * @author nguye
 */
public class nhanvien {
    private String maNV;
    private String PhanXuong;
    private int soSP;
public void setMANV(String MNV){
    this.maNV = MNV;
}
public String getMANV(){
    return maNV;
}
public void setphanxuong(String PX){
    this.PhanXuong = PX;
}
public String getphanxuong(){
    return PhanXuong;
}
public void setsanpham(int SP){
    this.soSP = SP;
}
public int getsanpham(){
    return soSP;
}
public int getChuan(String Pxuong){
    if("A".equals(Pxuong))
        return 300;
    else return 500;
}
public boolean VuotChuan(){
    if(soSP <= getChuan(PhanXuong))
        return true;
    else return false;
}
public int TinhLuong(){
    if(VuotChuan()!=true)
        return soSP * 30000;
    else return soSP * 20000;
}
}
