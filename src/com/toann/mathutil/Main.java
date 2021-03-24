    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toann.mathutil;

/**
 *
 * @author toann
 */
public class Main {

    // ta sẽ tạo các hàm trong class này fake y chang class math của JDK 
    // các hàm sẽ sài chung ở nhiều nơi 
    // làm tiện ích dùng chung 
    // Phàm cái gì dùng chung thfi ta suy nghĩ đến static 
    // 
    public static final double PI = 3.1415;

    // Y chang Math.Pi
    //Lát hồi MATHUtility .pI
    // hàm tính n! = 1*2..... *n 
    // quy ước  : 0! = 1! = 1 ;
    // kko có giai thừa amam 
    // vì vậy ta sẽ khống chế n đầu vào của hàm tư f 0..20\
    // kiểu long : 10618 , 18 con số 0 
    public static long getFactorial(int n) throws IllegalArgumentException {
        // đệ quy 
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument ."
                    + " n must be between 0..20");  
        }
        if (n == 0 || n == 1) {
            return 1;
        
        } 
        else {
            return n * getFactorial((n - 1));
        }
//        long result = 1;// cố tình hen , lát tính tiếp 
//        for (int i = 2; i < n; i++) {
//            result *= i;
//        }
//        return result ;
//        
////
    }
}
