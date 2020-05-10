package BaiTap3;

public class MainBT3 {

    public static void main(String[] args) {
      ShapeFactory sf1 = ShapeFactory.createInstance();
      ShapeFactory sf2 = ShapeFactory.createInstance();
      ShapeFactory sf3 = ShapeFactory.createInstance();
      
      Shape Hinh1 = sf1.createShape(ShapeType.circle);
      System.out.println(Hinh1.draw());
      
      Shape Hinh2 = sf2.createShape(ShapeType.triangle);
      System.out.println(Hinh2.draw());
      
      Shape Hinh3 = sf3.createShape(ShapeType.retangle);
      System.out.println(Hinh3.draw());
    }
    
}
