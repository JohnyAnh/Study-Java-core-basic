public class ViDu {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";
		
		// Hàm nối chuỗi concat()
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		//=> có thể nói nối 2 chuỗi của s3 và s4 không khác gì nhau
		
		// Hàm replaceAll => thay thế
		String s5 = "123 đẹp zai";
		String s6 = s5.replaceAll("123", "Hoàng Anh");
		System.out.println("s6: " + s6);// như vậy  replaceAll("123", "Hoàng Anh"); thì 123 có trong s5 và hoàng anh sẽ thay thế 123
		
		// toLowerCase => chuyển về viết thường
		String s99 = "ĐÂY LÀ CHŨ IN HOA";
		String s100 = s99.toLowerCase();
		System.out.println(s100);// kết quả trả về chuỗi INHOA thành in thường
		
		// toUpperCase => chuyển về viết hoa
		String s7 = "đây là chữ in thường";
		String s8 = s7.toUpperCase();
		System.out.println(s8);// kết quả trả về chuỗi in thường  thành in hoa
		
		// trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
		String s9 = "    Xóa khoảng trắng đầu và đít chuỗi     ";
		String s10 = s9.trim();
		System.out.println("Trước khi xóa:" + s9);
		System.out.println("Sau khi dùng trim() xóa:"+s10);
		
		///*) subString => cắt chuỗi con
		String s11 = "Ví dụ về cắt chuỗi con tròng java";
		String s12 = s11.substring(10);// cắt từ vị trí 10 và sao chép hêt từ 11 đến hết chuỗi
		System.out.println("cắt từ vị trí 10 và sao chép hêt từ 11 đến hết chuỗi: " +s12);
		String s13 = s11.substring(10, 17);
		System.out.println("Cắt và sao chép từ vị trí 10 đến 17: " + s13);
	}
}
