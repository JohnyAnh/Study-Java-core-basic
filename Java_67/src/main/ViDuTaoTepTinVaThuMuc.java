package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTepTinVaThuMuc {
	public static void main(String[] args) {
		// Lưu ý:
		// MS Windows: \ => \\ | Ví dụ: "C:\\Thu muc 1\\Thuc muc\\Ten tap tin.xxx";
		// Linux, MacOS: / | Ví dụ: /Thu muc 1/Thuc muc 2 /Ten tap tin.xxx"

		// Kiểm tra thư mục có tồn tại hay không
		File forlder1 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_67");
		System.out.println("Kiểm tra file có tồn tại hay không: " + forlder1.exists());
		File forlder2 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_6777");
		System.out.println("Kiểm tra file có tồn tại hay không: " + forlder2.exists());

		// Tạo thư mục
		// Phương thức mkdir()
		File f1 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_67/Directory_1");
		f1.mkdir();

		// Tạo nhiều thư mục
		// Phương thức mkdirs()
		File f2 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_67/Directory_1/Directory_2/Directory_3");
		f2.mkdirs();
		
		//Tạo tệp tin(có phần mở rộng: .exe; .doc...)
		File file1 = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_67/Directory_1/file.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// Không có quyền tạo tệp tin
			//Ổ cứng bị đầy
			//Đường dẫn sai
			e.printStackTrace();
		}
	}
}
