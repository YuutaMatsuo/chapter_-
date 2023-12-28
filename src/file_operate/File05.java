package file_operate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File05 {
	public static void main(String[] args) {
		// ■ファイル操作（バッファリングフィルタ読込み偏）
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:\\test\\test_02.txt");
			br = new BufferedReader(fr);

			String line = null; // 読み込んだ1行のデータを格納する
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					;
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					;
				}
			}
		}
	}
}
