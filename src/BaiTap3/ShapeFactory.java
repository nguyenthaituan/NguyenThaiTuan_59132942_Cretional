
package BaiTap3;

import BaiTap3.Circle;
import BaiTap3.Rectangle;
import BaiTap3.Shape;
import BaiTap3.ShapeType;
import BaiTap3.Triangle;


public class ShapeFactory {
    
    public Shape createShape(ShapeType type)
    {
        switch(type)
        {
            case retangle : return new Rectangle();
            case triangle: return new Triangle();
            case circle: return new Circle();
                    
        }return null;
    }
    
    public static ShapeFactory instance;
        
        public static ShapeFactory createInstance()
        {
            if(instance == null)
                instance = new ShapeFactory();
                return instance;
        }
}
