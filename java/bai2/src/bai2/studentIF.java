/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author nguye
 */
class studentIF {
    private String hoten;
    private String namsinh;
    private String gioitinh;

public void sethoten(String HT){
    this.hoten = HT;
}
public String gethoten(){
    return hoten;
}
public void setnamsinh(String NS)
{
    this.namsinh = NS;
}
public String getnamsinh()
{
    return namsinh;
}
public void setgioitinh(String GT)
{
    this.gioitinh = GT;
}
public String getgioitinh()
{
    return gioitinh;
}
}


