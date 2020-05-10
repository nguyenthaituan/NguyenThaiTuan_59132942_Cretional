
package BaiTap3;

public class Rectangle extends Shape{

    public Rectangle() {
        System.out.println("\nĐây là hình chữ nhật");
    }

    @Override
    public String draw() {
        
        brush ="\nVẽ bằng bút lông";
        paper ="\nVẽ giấy cứng";
        frame ="\nVẽ trên khung nhôm";
        
        return brush + paper + frame;
    }
    
    
}
