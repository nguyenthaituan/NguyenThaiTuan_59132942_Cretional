
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MainBT1 {

    public static void main(String[] args) throws ParseException {
       HoaDonHeader hoadonHeader1 = new HoaDonHeader
        ("HD01","Nguyễn Thái Tuấn",new SimpleDateFormat("dd/mm/yy").parse("09/10/1999"));
      
       CTHD CT1 = new CTHD("CPU", 10, (float) 100000, (float) 1.5);
       CTHD CT2 = new CTHD("RAM", 20, (float) 200000, (float) 1.5);

       HoaDon hoaDon2 = new HoaDon.Builder()
               .addHoaDon(hoadonHeader1)
               .addChiTietHoaDon(CT1)
               .addChiTietHoaDon(CT2)
               .build();
        System.out.println(hoaDon2.hienThiHDH());
    }   
}
