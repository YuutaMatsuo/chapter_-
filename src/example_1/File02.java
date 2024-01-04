package example_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File02 {
	public static void main(String[] args) {
		// 練習問題 問２
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\work\\filetest.txt"))) {
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
