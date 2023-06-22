package main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViDuDocText {
	public static void main(String[] args) {
		/*
		//Cách 1:
		File f = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace/LearnITTV-IT/Java/Macos/Java_72/File.txt ");//File("Link File")
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true) {
				line = br.readLine();
				if (line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		//Cách 2
		File f2 = new File("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace/LearnITTV-IT/Java/Macos/Java_72/File.txt ");//File("Link File")
		try {
			List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
