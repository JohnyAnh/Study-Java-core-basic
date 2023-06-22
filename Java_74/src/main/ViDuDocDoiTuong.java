package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File(
					"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace/LearnITTV-IT/Java/Macos/Java_74/File.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			SinhVien st = (SinhVien) ois.readObject();
			System.out.println(st.getDiemTrungBinh());
			System.out.println(st);
			ois.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
