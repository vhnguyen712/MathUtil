/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import java.text.ParseException;
import static longnh.util.MathUtil.computeFactorial;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        //hy vọng hàm trả về 120 nếu tính 5!
        //hy vọng hàm trả về 1 nếu tính 1!
        System.out.println("5! = " + computeFactorial(5));
        //expected 1 if cF(1)
        System.out.println("1! = " + computeFactorial(1));
        //expected 1 if cF(0)
        System.out.println("0! = " + computeFactorial(0));
        //expected Exception ìf cF(-5)
        System.out.println("-5! = " + computeFactorial(-5));
//        Scanner giris = new Scanner(System.in);        
//        System.out.println("Month:");
//        int d = giris.nextInt();
//        System.out.println("Day:");
//        int m = giris.nextInt();
//        System.out.println("Year:");
//        int y = giris.nextInt();
//        String tarih;
//        tarih = Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(y);  
//        System.out.println("Tarih : " + tarih); 
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Date girilentarih = null;
//        girilentarih = dateFormat.parse(tarih);
//        System.out.println(dateFormat.format(girilentarih));      
    }
}
