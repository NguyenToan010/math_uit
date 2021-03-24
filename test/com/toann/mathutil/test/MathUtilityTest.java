/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toann.mathutil.test;

import com.toann.mathutil.Main;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toann
 */
public class MathUtilityTest {
    
        // đặt tên hàm theo chuẩn của dân TEsting , QA/QC
    @Test// biến hàm này thành man  
    
       public  void testFactorialGivenRightArgumentReturnsGoodResult (){
           int n = 5 ;
           long expected = 120 ;
           long actual = Main.getFactorial(n);
           assertEquals(expected, actual);
           
           // khớp màu xanh , sai lệch màu đỏ
           // màu xanh xuất hiện khi tất cả các tình huonhos xaifhamf test case đều xanh    
           // màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ 
           //                               1 case sai , tất cả bỏ đi 
           // ẩn ý : hàm đã đúng thì phải đúng cho tất cả các case 
           // tình test 
           assertEquals(720, Main.getFactorial(6));// 6 ! cos dunsgd laf 720 
           //assertEquals(720,  Main.getFactorial(5));// 6 ! cos dunsgd laf 720 
           assertEquals(24, Main.getFactorial(4));// 6 ! cos dunsgd laf 720 
           assertEquals(6, Main.getFactorial(3));// 6 ! cos dunsgd laf 720 
           assertEquals(2, Main.getFactorial(2));// 6 ! cos dunsgd laf 720 
           assertEquals(1, Main.getFactorial(0));// 6 ! cos dunsgd laf 720 
           // ta sẽ đi test hàm có ném ra ngoại lệ nhue thiết kế hay ko 
           // hàm dc thiết kế rằng : đưa tham số n 0..20 => tính đúng n !
           //                       ném ra ngoại lệ cảnh báo sai tham số , ngoài 
           //                       miền giá trị tính !
           // chốt : đưa tham số cà chớn phải ném ngoại lệ 
           // khi đưa tham số cà chớn 
           // thì kết luận hàm đúng , xanh 
           // thấy ngoại lejekhi đưa n cà chớn , mừng rơi nước mắt 
           // vì hàm chạy đúng thiết kế mà 
           // ngoại lệ thì ko phải là giá trị để sp sánh kiểu assertEquanls()
          
       }//  
       @Test(expected = IllegalArgumentException.class)
       public  void getFactorialGivenWrongArgumentThrowsException(){
           
            Main.getFactorial(40);
            Main.getFactorial(-40);
           // cá luôn 2 thằng này phải ném ra ngoại lệ 
           
           
           
           
       }
}
