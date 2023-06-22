import java.io.PrintWriter;

public class ViDuGhiText {
	public static void main(String[] args) {
		
		try {
			//Ghi dữ liệu xuống file dạng text
			PrintWriter pw = new PrintWriter("/Users/hoanganhvu/Library/Mobile Documents/com~apple~CloudDocs/Workspace/LearnITTV-IT/Java/Macos/Java_71/File.txt ","UTF-8");//PrintWriter("link tệp tin here ","UTF-8");
			pw.print("Xin chào tôi là Hoàng Anh");
			pw.println();
			Students st = new Students(100, "Vu Hoang Anh");
			pw.println(st);
			//Đẩy dữ liệu vào file
			pw.flush();
			//Đóng file
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();		}
	}
}
