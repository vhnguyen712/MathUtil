/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longnh.util;

/**
 *
 * @author Admin
 */
//day la class chua cac ham toan hoc tinh toan voi muc tieu se sai chung cho cac noi khac
//pham cai gi mang tinh chat sai chung, ta se dung static
public class MathUtil {

    //tinh n! = 1.2.3...n. vi n! tang gia tri rat nhanh, som tran mien int
    //int chi toi da 2 ty 1, nen ta sai long moi an toan
    //thuc ra 15! la to lam r, nen ta chi tinh tu 15! tro lai
    public static long computeFactorial(int n) {
        if (n < 0 || n > 15) throw new IllegalArgumentException("Invalid input. n must be >= 0");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
