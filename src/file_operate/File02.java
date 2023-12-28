package file_operate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File02 {
	public static void main(String[] args) {
		// ■ファイル操作（読み取り編）
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\test\\test_01.txt");

			while (true) {
				int c = fr.read(); // 1文字読み取る（戻り値はchar型ではなくint型）
				// ストリームの終わりに達したら-1を返す

				if (c == -1) break;

				System.out.print((char) c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
