public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';
		
		//Hàm indexOf tìm kiếm được chuỗi hoặc ký tự
		System.out.println("Vị trí của s2 trong s1 là: "+ s1.indexOf(s2));//=> Vị trí S2 có namwftrong s1 tại vị trí thứ 0
		System.out.println("Vị trí của s3 trong s1 là: "+ s1.indexOf(s3));//=> không tìm thấy s3 trong s1 thì trả về một số âm -1
	
		// Sử dụng một vị trí bắt đầu
		System.out.println("Vị trí của s2 trong s1 là: "+ s1.indexOf(s2, 2));//=> Vị trí bắt đầu tìm từ vị trí thứ 2 tức chữ n đến vị trí 35 thì xuất hiện
	
		// Tìm kiếm char
		System.out.println("Vị trí của c1 trong s1 là: "+ s1.indexOf(c1));//=>Vị trí tim thấy lqf 10
		System.out.println("Vị trí của c1 trong s2 là: "+ s2.indexOf(c1));//=> không tìm thấy trả về gtri âm
	
		// Hàm lastIndexOf => tìm kiếm từ phải sang trái
		System.out.println("Vị trí của s2 trong s1 (Từ phải sang trái) là: "+ s1.indexOf(s2));//=> Vị trí S2 có namwftrong s1 tại vị trí thứ 0
		System.out.println("Vị trí của s3 trong s1 là: "+ s1.indexOf(s3));//=> không tìm thấy s3 trong s1 thì trả về một số âm -1
	}
	
}
