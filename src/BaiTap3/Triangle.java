
package BaiTap3;


public class Triangle extends Shape{

    public Triangle() {
        System.out.println("\nĐây là hình tam giác!");
    }
  
     @Override
    public String draw() {
        brush ="\nVẽ bằng bút mực";
        paper ="\nVẽ giấy gỗ";
        frame ="\nVẽ trên khung giấy";
        
        return brush + paper + frame;
    }
    
}
