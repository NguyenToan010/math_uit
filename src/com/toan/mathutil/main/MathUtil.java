/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toan.mathutil.main;

import com.toann.mathutil.Main;

/**
 *
 * @author toann
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("git chào cả nhà " );
        // tui muốn test 5! có bằng 120 hay ko 
        int n = 5 ; 
        long expected = 120 ; 
        long actual = Main.getFactorial(n);
        System.out.println("5! expected : " + expected
                             + "; actual " + actual);
        int n_v1 = 0 ; 
        long expected_v1 = 1 ; 
        long actual_v1 = Main.getFactorial(n_v1);
        System.out.println("1! expected : " + expected_v1
                             + "; actual " + actual_v1);
        
        
    }
   // TRONG QUY TRÌNH LÀM PM , DÂN DEV PHẢI CÓ TRAVHS NHIỆM TEST TỪNG HÀM 
    // TỪNG CLASS MÀ MÌNH VIẾT RA TRƯỚC KHI ĐỐNG GỐI GỬI ĐI CHO BÊN QA / QC TEST 
    // ĐỘC LẬP , TỪNG HÀM , TỪNG CLASS PHẢI ĐƯỢC TEST CẨN THẬN TRƯỚC KHI CHỮNG 
    // ĐƯỢC DÙNG ĐỂ PHỐI HỢP VỚI CÁC CLASS KHÁC . TEST NAGY MỨC HÀM , MỨC CLASS 
    // VỪA HOÀNG THIỆN , CHƯA THÈM BÀN TỚI UI , THÌ MỨC ĐỘ TÉT SỚM NÀY GỌI LÀ 
    // UNIT TEST LEVEL - TEST TỪNG ĐƠN THỂ , ĐƠN VỊ CODE 
    
    // VẬY LÀM SAO ĐỂ TEST TỪNG HÀM , TỪNG CLASS ????
    // CÓ NHIỀU CÁCH ĐỂ TEST TỪNG HÀM TỪNG CLASS 
    //-- JAVA OOP : SOUT
    // -- JAVA DESTOP " JOTIONPANE 
    //-- LOG FILE 
    
    
    // DÙ là cách nào thì ta cũng phải in ra 1 giá trị đã xủ lí 
    // gọi hàm ACTUAL VALUE 
    // rồi ta đi so sách các giá trị trả về của hàm có giống như ta tính toán 
    // trước đó hay ko , cái ta hy vọng hàm sẽ trả về - gọi là EXPECTED VALUE 
    
    // nếu là ACTUAL VALUE == EXPECTED VALUE => gọi hàm chạy ngon 
                            // khác => sai 
    // nguyên tác của việc test : so sánh ACTUAL vs EXPECTED
    // 3 cách này đều cung f1 nguyên tác 
    // gọi hàm để xem hàm nãy xử lý ra keeys qỉa mấy 
    // sau đó dùng mắt để so sánh Actual và EXpected rồi ta tưu kết luận 
    /// cách này tiềm ẩn sai sót khi ta phải xem xét Quá nhiều cặp value 
    // ví dụ Hàm Gthua() phải test trường hợp < 0 , = 0 , = 1 , 18 , 19 , 20 ( biên ) \
    // 21 , 30  , 1 triệu 
    // mỗi N để TEst Ta gọi là 1 tình huốn xài hàm , 1 tình huốn test / TEST CASE
    
    // cách 4 ko thèm nhìn bằng mắt từng trường hợp Expected vs actual 
    // nhờ máy tình luôn , vì máy dư sức biết cách so sánh 
    // máy quét qua tất cả các cặp expected vs actual 
    // nếu tất cả đều khớp báo tao màu xanh - duownfhd thông code tốt 
    // nếu xuất hiện ít nhất 1 thằng ko khớp actual vs expected 
    // báo tao màu đỏ  , đường kẹt , do code có trực trặc tính toán 
    // muốn làm dc điều này ta cần thư viện phụ trwoj 
    // java : JUnit , TestNG 
    // C# : NUnit , MSTest , xUnit 
    // PHP : PHPUnit 
    // ... mọi ngôn ngử đều có thư viện Xanh ĐỎ giúp cảnh báo hàm tốt hay ko ?? 
    
}
