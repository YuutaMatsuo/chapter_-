package example_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) {
		// 練習問題 問１
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\work\\filetest.txt"))) {
			bw.write("abcdefg");
			bw.newLine();
			bw.write("1234567890");
			bw.newLine();
			bw.write("１２３４５６７８９０");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
