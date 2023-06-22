package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFlie {
public static void xoaFile(File fx) {
	if (fx.isFile()) {
		//Xoa neu la tep tin
		System.out.println("Da xoa: " + fx.getAbsolutePath());//Xoa tep tin nao thi se in no ra
		fx.delete();
	}else if (fx.isDirectory()) {
		//Lay cac file con
		File[] mangCon =  fx.listFiles();
		for (File f : mangCon) {
			//Xoa cac file con
			xoaFile(f);
		}
		//Xoa ban than thu muc khi da xoa cac thu muc con
		System.out.println("Da xoa: " + fx.getAbsolutePath());//Xoa tep tin nao thi se in no ra
		fx.delete();
		
	}
}

//Su dung Files.delete..
public static void xoaFile2(File fx) {

}
	
	public static void main(String[] args) {
		//Su dung class File xoa tep tin va thu muc
		File f0 = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_69/F0");
		File f0_1 = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_69/F0_1");
		File f = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace /LearnITTV-IT/Java/Macos/Java_69/Vidu.txt");
		/*
		f0.deleteOnExit();//Khong xoa dc vi thu muc khong rong
		f0_1.deleteOnExit();//Xoa dc vi thu muc rong
		f.deleteOnExit();//Xoa dc vi la tep tin
		System.out.println(f0.delete());
		
		ViDuXoaFlie.xoaFile(f0);
		*/
		// su dung class Files de xoa thu muc
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_ViDu = f.toPath();
		try {
//			Files.deleteIfExists(p0);//Co noi dung ben trong
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_ViDu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
