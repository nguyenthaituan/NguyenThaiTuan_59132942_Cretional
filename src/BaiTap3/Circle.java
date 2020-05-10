/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{

    public Circle() {
        System.out.println("\nđây là hình tròn");
    }
 
    @Override
    public String draw() {
        brush ="\nVẽ bằng bút chì";
        paper ="\nVẽ giấy kẽ ô";
        frame ="\nVẽ khung giấy";
        
        return brush + paper + frame;
    }
    
}
