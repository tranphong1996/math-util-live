package com.fu.mathutil;

//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {

	// n! = 1.2.3.4.5.6...n
	// Quy ước: 0! = 1! = 1
	// Ko tính giai thừa cho số âm
	// 20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
	//21! lố kiểu long
	//nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm
	//một cái ngoại lệ, chửi éo tính đc
	
	public static long getFactorial(int n) {
		if(n < 0 || n > 20)
			throw new IllegalArgumentException("Invalid argument n must be bet");
		//hàm dùng liền éo cần return
		
		//xuống đây là n = 0..20 òi
		if(n == 0 || n == 1)
			 return 1; //dừng ngay khi n đặc biệt
		
		//xuống đến đây, n = 2..20 òi
		//chơi for hoặc đệ quy recursion
		//kĩ thuật nhồi con heo đất, ốc bu dồ thịt
		//i = 2, i = 3, i = 4, i = 5, i = n nhồi liên tục 2 3 4 5 6 7 8...n
		long product = 1; //tính khởi đầu
		for(int i = 2; i <= n; i++)
			 product *= i; // product = product đang có nhân con i, đạp ngược trở
		    return product;  
            
	}
}
