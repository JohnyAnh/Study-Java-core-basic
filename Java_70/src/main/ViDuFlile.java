package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFlile {
	public static void coppyAll(File f1, File f2) {
		//coppy ban than no 
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (f1.isDirectory()) {
			//coppy cac thu muc con
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile()+"/"+ file.getName());
				coppyAll(file, file_new);
			}
		}
	}
	public static void main(String[] args) {
		File f0 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/File_1.txt");
		File f1 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/File_2.txt");
		File f2 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/File_2xyz.txt");

//		//1. Thay doi ten tap tin hoac thu muc
//		f0.renameTo(f1);
//		//Su dung Files de thay doi tep tin
//		//Tieu chuan StandardCopyOption.REPLACE_EXISTING khi chuyen thu muc neu da co thi de len luon
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 2. Di chuyen chuyen file
//		File f_2new = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/F0/File_2xyz.txt");
//		
//			try {
//				Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		File folder_1 = new File(
//				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/F1");
//		File folder_1new = new File(
//				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/F0/F1");
//
//		try {
//			Files.move(folder_1.toPath(), folder_1new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 3, Copy file
		File f_0 = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/F0");
		File f_0_Copy = new File(
				"/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_70/F0_copy");
//		try {
//			Files.copy(f_0.toPath(), f_0_Copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ViDuFlile.coppyAll(f_0, f_0_Copy);
	}
}
