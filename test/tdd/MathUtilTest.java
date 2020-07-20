/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static longnh.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    //báo cho JVM biết rằng đây là hàm main
    //trong hàm này chứa các lệnh để test code chính của mình
    //ở bên MathUtil
    //ta test các tình huống thành công ở đây,
    //thành công: cF(5) -> ói về 120 gọi là thành công
    @Test
    public void testSuccessfulCase() {
        //assertEquals(30, 50);
        //tao kì vọng có 30, xem mày đưa vào thực tế là bao nhiêu
        //                                      50
        //2 thứ khớp nhau, mày xử lí như dự kiến, đèn xanh, thông thường
        //                          không như dự kiến, đèn đỏ, toang code mày
        assertEquals(120, longnh.util.MathUtil.computeFactorial(5));
        assertEquals(720, longnh.util.MathUtil.computeFactorial(6));
        assertEquals(1, longnh.util.MathUtil.computeFactorial(0));
        assertEquals(1, longnh.util.MathUtil.computeFactorial(1));
        assertEquals(2, longnh.util.MathUtil.computeFactorial(2));
        //muốn xanh thì tất cả phải xanh, đúng hết mọi case
        //nếu tất cả xanh, có 1 thằng đỏ, coi như cả đám đỏ
        //vì hàm ý: code phải chảy đúng mọi tình huống
        //ta chỉ cần nhìn xanh đỏ, khỏi cần phải dò từng cháu bằng mắt
    }
    
    @Test(expected = IllegalArgumentException.class) //annotation, dấu hiệu báo cho JVM và thư viện jar liên quan
            //biết cần làm gì
    //hàm này chứa các tình huống cà chớn, ví dụ cF(-5), cF(16)
    public void testFailedCases() {
        //tao kì vọng ày ném ra ngoại lệ thì coi như code của
        //mày mới ngon
        //ngoại lệ không phải là 1 value để có thể so sánh được
        //vì hàm này cần 2 value expected và actual
        //trong khi đó ném ra ngoại lệ không phải là actual value để so sánh
        //ta phải dung chiêu khác khi bắt ngoại lệ coi có đúng là ngoại lệ mình
        //cần không?
        computeFactorial(-5);
        computeFactorial(16); //vì giai thừa tăng rất nhanh nên không chơi quá 16
    }
    //code có thể còn tiềm ẩn lỗi nhưng Clean & Build 
    //luôn ra file .jar nếu code không sai cú pháp
    //vậy thì nguy hiểm quá đi
    //mình phải DISABLE cái nút CLEAN & BUILD nếu code còn màu đỏ
    //nhớ 2 con số: 1005 với Netbeans 8, 1204 Netbeans 10 trở lên
    //khi chơi với Ant project
}
