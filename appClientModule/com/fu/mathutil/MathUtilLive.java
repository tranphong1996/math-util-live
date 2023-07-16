package com.fu.mathutil;

public class MathUtilLive {
	public static void main(String[] args) {
		long result = MathUtil.getFactorial(5);
		System.out.println("5! = 120: actual:  "+ result);
		//kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
		//expected value: 5! = 120
		//mày/hàm ai đó viết khi chạy thực tế là mấy -actual, giả sử 120
		//if expected == actual, hàm ngon trong tình huống này
	}

}
