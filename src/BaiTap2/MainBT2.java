/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class MainBT2 {

    public static void main(String[] args){   
        MyStringBuilder str = new MyStringBuilder.Builder()
                                .addString("Khai báo số:  ")
                                .addFloat((float)9.9)
                                .addString(" ; Thêm biểu thức: ")
                                .addBool(Boolean.TRUE)
                                .Builder();
        
        System.out.println( str.toString());
    }
    
}
