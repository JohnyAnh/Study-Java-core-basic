package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace/LearnITTV-IT/Java/Macos/Java_73/File.data");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			SinhVien st = new SinhVien("001", "Vu hoang Anh", 2003, 10);
			oos.writeObject(st);
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
